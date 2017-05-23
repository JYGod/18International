package com.yb7001.web.myproject.money;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.gson.Gson;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.LoadDeposit;
import com.yb7001.web.myproject.PK10TwoSide;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Chongzhi extends AppCompatActivity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private Window window;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.money_1_home);
        ButterKnife.bind(this);
       // window = this.getWindow();
       // window.setStatusBarColor(getResources().getColor(R.color.blue_dark));
        init();
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        listenAction();
    }

    private void init() {
        mContext=this;
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext, PK10TwoSide.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public static class PlaceholderFragment extends Fragment {

        private static final String ARG_SECTION_NUMBER = "section_number";
        private View rootView;
        private EditText tvName;
        private EditText tvMail;
        private EditText tvQQ;
        private String userInfo;
        private String gonghang;
        private String tag;
        private TextView tv_gonghang_Account,tv_gonghang_name,tv_gonghang_card,tv_gonghang_message;
        private LoadDeposit loadDeposit;
        private TextView tv_zhifubao_type,tv_zhifubao_name,tv_zhifubao_zhanghao,tv_zhifubao_message;
        private TextView tv_caifutong_account,tv_caifutong_name,tv_caifutong_card,tv_caifutong_message;
        private TextView tv_weixin_type,tv_weixin_name,tv_weixin_account,tv_weixin_message;


        public PlaceholderFragment() {
        }

        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
                rootView = inflater.inflate(R.layout.gonghang_chongzhi, container, false);
                tv_gonghang_Account=(TextView)rootView.findViewById(R.id.tv_account);
                tv_gonghang_name=(TextView)rootView.findViewById(R.id.tv_name);
                tv_gonghang_card=(TextView)rootView.findViewById(R.id.tv_card);
                tv_gonghang_message=(TextView)rootView.findViewById(R.id.tv_message);
                new Thread(){
                    public void run(){
                        gonghang=new SoapServiceImpl().loadDepositService(MainGlobalData.TOKEN);
                        tag=new SoapServiceImpl().loadUserMessages(15,1,MainGlobalData.TOKEN);
                        Gson gson=new Gson();
                        loadDeposit=gson.fromJson(gonghang,LoadDeposit.class);
                        mHandler.sendEmptyMessage(1);
                    }
                }.start();

            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
                rootView = inflater.inflate(R.layout.zhifubao, container, false);
                tv_zhifubao_type=(TextView)rootView.findViewById(R.id.tv_type);
                tv_zhifubao_name=(TextView)rootView.findViewById(R.id.tv_name);
                tv_zhifubao_zhanghao=(TextView)rootView.findViewById(R.id.tv_zhanghao);
                tv_zhifubao_message=(TextView)rootView.findViewById(R.id.tv_message);
                new Thread(){
                    public void run(){
                        gonghang=new SoapServiceImpl().loadDepositService(MainGlobalData.TOKEN);
                        Log.e("TAG",gonghang);
                        Gson gson=new Gson();
                        loadDeposit=gson.fromJson(gonghang,LoadDeposit.class);
                        mHandler.sendEmptyMessage(2);
                    }
                }.start();
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 3) {
                rootView = inflater.inflate(R.layout.caifutong, container, false);
                tv_caifutong_account=(TextView)rootView.findViewById(R.id.tv_caifutong_account);
                tv_caifutong_name=(TextView)rootView.findViewById(R.id.tv_caifutong_name);
                tv_caifutong_card=(TextView)rootView.findViewById(R.id.tv_caifutong_card);
                tv_caifutong_message=(TextView)rootView.findViewById(R.id.tv_caifutong_message);
                new Thread(){
                    public void run(){
                        gonghang=new SoapServiceImpl().loadDepositService(MainGlobalData.TOKEN);
                        Log.e("TAG",gonghang);
                        Gson gson=new Gson();
                        loadDeposit=gson.fromJson(gonghang,LoadDeposit.class);
                        mHandler.sendEmptyMessage(3);
                    }
                }.start();
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 4) {
                rootView = inflater.inflate(R.layout.weixin_hongbao, container, false);
                tv_weixin_type=(TextView)rootView.findViewById(R.id.tv_weixin_type);
                tv_weixin_name=(TextView)rootView.findViewById(R.id.tv_weixin_name);
                tv_weixin_account=(TextView)rootView.findViewById(R.id.tv_weixin_account);
                tv_weixin_message=(TextView)rootView.findViewById(R.id.tv_weixin_message);
                new Thread(){
                    public void run(){
                        gonghang=new SoapServiceImpl().loadDepositService(MainGlobalData.TOKEN);
                        Log.e("TAG",gonghang);
                        Gson gson=new Gson();
                        loadDeposit=gson.fromJson(gonghang,LoadDeposit.class);
                        mHandler.sendEmptyMessage(4);
                    }
                }.start();
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 5) {
                rootView = inflater.inflate(R.layout.weixin_suchong, container, false);
            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 6) {
                rootView = inflater.inflate(R.layout.zhifubao_suchong, container, false);
            }

            return rootView;
        }

        Handler mHandler = new Handler() {

            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    Log.e("TAG",tag);
                    tv_gonghang_Account.setText(loadDeposit.getResult().get(3).getBankName());
                    tv_gonghang_name.setText(loadDeposit.getResult().get(3).getBankUser());
                    tv_gonghang_card.setText(loadDeposit.getResult().get(3).getBankNumber());
                    tv_gonghang_message.setText(loadDeposit.getResult().get(3).getUserNumber());
                }
               else if (msg.what == 2) {
                    tv_zhifubao_type.setText(loadDeposit.getResult().get(1).getBankName());
                    tv_zhifubao_name.setText(loadDeposit.getResult().get(1).getBankUser());
                    tv_zhifubao_zhanghao.setText(loadDeposit.getResult().get(1).getBankNumber());
                    tv_zhifubao_message.setText(loadDeposit.getResult().get(1).getUserNumber());
                }else if (msg.what==3){
                    tv_caifutong_account.setText(loadDeposit.getResult().get(2).getBankName());
                    tv_caifutong_name.setText(loadDeposit.getResult().get(2).getBankUser());
                    tv_caifutong_card.setText(loadDeposit.getResult().get(2).getBankNumber());
                    tv_caifutong_message.setText(loadDeposit.getResult().get(2).getUserNumber());
                }else if (msg.what==4){
                    tv_weixin_type.setText(loadDeposit.getResult().get(0).getBankName());
                    tv_weixin_name.setText(loadDeposit.getResult().get(0).getBankUser());
                    tv_weixin_account.setText(loadDeposit.getResult().get(0).getBankNumber());
                    tv_weixin_message.setText(loadDeposit.getResult().get(0).getUserNumber());
                }
            }
        };
    }

    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            return PlaceholderFragment.newInstance(position + 1);
        }

        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "工行充值";
                case 1:
                    return "支付宝";
                case 2:
                    return "财付通";
                case 3:
                    return "微信红包";
                case 4:
                    return "微信速充";
                case 5:
                    return "支付宝速充";
            }
            return null;
        }
    }
}
