package com.yb7001.web.myproject.personcenter;


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
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.LoadUserInfo;
import com.yb7001.web.myproject.PK10TwoSide;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import butterknife.Bind;
import butterknife.ButterKnife;


public class AActivity extends AppCompatActivity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private Window window;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_1_home);
        ButterKnife.bind(this);
        mContext=this;
        // window=this.getWindow();
        // window.setStatusBarColor(getResources().getColor(R.color.blue_dark));

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
        init();
        listenAction();

    }

    private void init() {
        mContext = this;
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(mContext, PK10TwoSide.class);
//                startActivity(intent);
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
        private Button btnSaveInfo;
        private EditText etOldPwd,etNewPwd,etNewPwdCheck;
        private Button btnSavePwd;


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
                rootView = inflater.inflate(R.layout.person_info, container, false);
                tvName = (EditText) rootView.findViewById(R.id.et_name);
                tvMail = (EditText) rootView.findViewById(R.id.et_mail);
                tvQQ = (EditText) rootView.findViewById(R.id.et_qq);
                btnSaveInfo = (Button) rootView.findViewById(R.id.btn_save_person_info);
                new Thread() {
                    public void run() {
                        userInfo = new SoapServiceImpl().loadUserInfoService(MainGlobalData.TOKEN);
                        mHandler.sendEmptyMessage(1);
                    }
                }.start();
                btnSaveInfo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!tvMail.getText().toString().equals("")&&!tvQQ.getText().toString().equals("")&&
                                !tvName.getText().toString().equals("")){
                            new Thread(){
                                public void run(){
                                    String  result=new SoapServiceImpl().bindUserInfoService(tvName.getText().toString(),tvQQ.getText().toString(),
                                            tvMail.getText().toString(),MainGlobalData.TOKEN);
                                    Log.e("返回",result);
                                    mHandler.sendEmptyMessage(2);
                                }
                            }.start();
                        }else {
                            mHandler.sendEmptyMessage(3);
                        }

                    }
                });

            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 2) {
                rootView = inflater.inflate(R.layout.person_update_userpwd, container, false);
                etOldPwd=(EditText)rootView.findViewById(R.id.et_old_pwd);
                etNewPwd=(EditText)rootView.findViewById(R.id.et_new_pwd);
                etNewPwdCheck=(EditText)rootView.findViewById(R.id.et_new_pwd_check);
                btnSavePwd=(Button)rootView.findViewById(R.id.btn_save_pwd);
                btnSavePwd.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!etNewPwd.getText().toString().equals("")&&!etNewPwdCheck.getText().toString().equals("")&&
                                !etOldPwd.getText().toString().equals("")){
                            if (etNewPwdCheck.getText().toString().equals(etNewPwd.getText().toString())){
                                new Thread(){
                                    public void run(){
                                        String result=new SoapServiceImpl().updateLoginPwdService(etOldPwd.getText().toString(),
                                                etNewPwd.getText().toString(),MainGlobalData.TOKEN);
                                        Log.e("密码返回",result);
                                    }
                                }.start();
                                mHandler.sendEmptyMessage(4);
                            }
                        }

                    }
                });

            } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 3) {
                rootView = inflater.inflate(R.layout.person_update_moneyrpwd, container, false);
                etOldPwd=(EditText)rootView.findViewById(R.id.et_pos_old_pwd);
                etNewPwd=(EditText)rootView.findViewById(R.id.et_pos_new_pwd);
                etNewPwdCheck=(EditText)rootView.findViewById(R.id.et_pos_check_pwd);
                btnSaveInfo=(Button)rootView.findViewById(R.id.btn_check3);
                btnSaveInfo.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (!etOldPwd.getText().toString().equals("")&&!etNewPwd.getText().toString().equals("")
                                &&!etNewPwdCheck.getText().toString().equals("")){
                            new Thread(){
                                public void run(){
                                    String result=new SoapServiceImpl().updateMoneyPwdService(etOldPwd.getText().toString(),etNewPwd.getText().toString(),
                                            MainGlobalData.TOKEN);
                                    Log.e("status",result);
                                    mHandler.sendEmptyMessage(4);
                                }
                            }.start();
                        }
                    }
                });
            }


            ButterKnife.bind(this, rootView);
            return rootView;
        }

        private Context mContext;
        Handler mHandler = new Handler() {

            @Override
            public void handleMessage(Message msg) {
                super.handleMessage(msg);
                if (msg.what == 1) {
                    // Log.e("userInfo",userInfo);
                    if (!userInfo.equals("请求数据失败！")){
                        Gson gson = new Gson();
                        LoadUserInfo loadUserInfo = gson.fromJson(userInfo, LoadUserInfo.class);
                        tvName.setText(loadUserInfo.getResult().getUserName());
                        tvMail.setText(loadUserInfo.getResult().getUserEmail());
                        tvQQ.setText(loadUserInfo.getResult().getUserQQ());
                    }else {
                        Toast.makeText(mContext,userInfo,Toast.LENGTH_SHORT).show();
                    }
                }else if (msg.what==2){
                    new Thread(){
                        public void run(){
                            userInfo = new SoapServiceImpl().loadUserInfoService(MainGlobalData.TOKEN);
                            mHandler.sendEmptyMessage(1);
                        }
                    }.start();
                }else if (msg.what==4){
                   Toast.makeText(getActivity(),"修改成功！",Toast.LENGTH_SHORT).show();
                }
            }
        };

        @Override
        public void onDestroyView() {
            super.onDestroyView();
            ButterKnife.unbind(this);
        }
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
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "个人资料";
                case 1:
                    return "修改密码";
                case 2:
                    return "修改提款密码";
            }
            return null;
        }
    }
}

