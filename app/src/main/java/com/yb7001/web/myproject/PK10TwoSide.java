package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.tencent.bugly.crashreport.CrashReport;
import com.yb7001.web.myproject.adapter.BetsAdapter;
import com.yb7001.web.myproject.global.CreatViews;
import com.yb7001.web.myproject.global.DataInit;
import com.yb7001.web.myproject.global.GenerateView;
import com.yb7001.web.myproject.global.LoadAllInfoService;
import com.yb7001.web.myproject.global.LoadLotteryInfos;
import com.yb7001.web.myproject.tools.CountDownTimerUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;

public class PK10TwoSide extends AppCompatActivity implements View.OnClickListener {
    private static View[] mBuys;
    @Bind(R.id.toolbar)
    Toolbar toolbar;
    @Bind(R.id.drawer_layout)
    DrawerLayout drawerLayout;
    @Bind(R.id.second)
    TextView second;
    @Bind(R.id.tv_time)
    TextView tvTime;
    @Bind(R.id.pnumber)
    TextView pnumber;
    @Bind(R.id.draw_number)
    TextView drawNumber;
    @Bind(R.id.et_default)
    EditText etDefault;
    @Bind(R.id.check_default)
    CheckBox checkDefault;
    @Bind(R.id.lv_bets)
    ListView lvBets;
    @Bind(R.id.tv_total_num)
    TextView tvTotalNum;
    @Bind(R.id.tv_total_money)
    TextView tvTotalMoney;
    @Bind(R.id.btn_check)
    Button btnCheck;
    @Bind(R.id.bet_window)
    RelativeLayout betWindow;
    @Bind(R.id.lottery_nums)
    LinearLayout lotteryNums;
    private static Context mContext;
    @Bind(R.id.layout_select_3)
    LinearLayout layoutSelect3;
    @Bind(R.id.top_peilv)
    TextView topPeilv;
    @Bind(R.id.lv_bets_result)
    ListView lvBetsResult;
    @Bind(R.id.btn_close)
    Button btnClose;
    @Bind(R.id.bet_result_window)
    RelativeLayout betResultWindow;
    private ArrayList<TextView> tvPeilvs;
    private static Activity mActivity;
    private static Intent intent;
    private static String[] tvGames, tvSubs, tvTitles, tvContents;
    private boolean isFengpan;
    private String[] peilvStrings;
    private ArrayList<Map<String, Object>> list;
    private BetsAdapter adapter;
    private static int[] counts;
    private String sec, pNumber, dNumber, time;
    private String[] nums;
    private ArrayList<String> titles, contens;
    private static CountDownTimerUtil timer_fp, timer_kj;
    private boolean isLoadFinish = false;
    private long nowTimeStamp, closeTimeStamp, openTimeStamp;
    private static int windowNum;
    private static LinearLayout select1;
    private static LinearLayout select2;
    private static LinearLayout select3;
    private static TextView tvSelect1, tvSelect2;
    private static LinearLayout extraAddLayout, lotteryNums2;
    private String[] singleTouch;
    private static TextView tvUseMoney, tvDongjieMoney, tvWinMoney;
    private static DrawerLayout drawer;
    private static NavigationView navView;
    private ImageView btnCancel;
    private static ProgressBar progressBar;

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(initActivityReciever);
    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            moveTaskToBack(true);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.beijing_home_0);
        ButterKnife.bind(this);
        singleTouch = new String[]{"k3_yxxtb"};
        findIds();
        mContext = this;
        mActivity = this;
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        View headerLayout = navView.inflateHeaderView(R.layout.nav_header_main);
        TextView userName = (TextView) headerLayout.findViewById(R.id.user_name);
        userName.setText(MainGlobalData.USER_NAME);
        toolbar.setTitle("主页");
        setSupportActionBar(toolbar);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        btnCancel.setOnClickListener(this);
        navView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawer.closeDrawer(GravityCompat.START);
                MainGlobalData.itemClickListener(mActivity, item.getItemId());
                return true;
            }
        });
        checkDefault.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    Log.e("isChecked", String.valueOf(isChecked));
                } else {
                    Log.e("isChecked", String.valueOf(isChecked));
                }
            }
        });
        reLoadActivity();
        reLoadTopTitle();
        //注册广播接收器
        registerMyReceiver();
    }

    private void findIds() {
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        btnCancel = (ImageView) findViewById(R.id.btn_cancel);
        extraAddLayout = (LinearLayout) findViewById(R.id.extra_add_layout);
        lotteryNums2 = (LinearLayout) findViewById(R.id.lottery_nums2);
        select1 = (LinearLayout) findViewById(R.id.select_1);
        select2 = (LinearLayout) findViewById(R.id.select_2);
        select3 = (LinearLayout) findViewById(R.id.select_3);
        tvSelect1 = (TextView) findViewById(R.id.tv_select_1);
        tvSelect2 = (TextView) findViewById(R.id.tv_select_2);
        tvUseMoney = (TextView) findViewById(R.id.tv_use_money);
        tvDongjieMoney = (TextView) findViewById(R.id.tv_dongjie_money);
        tvWinMoney = (TextView) findViewById(R.id.tv_win_money);
        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        navView = (NavigationView) findViewById(R.id.nav_view);
    }

    public static void reLoadTopTitle() {
        tvUseMoney.setText(MainGlobalData.USE_MONEY);
        tvDongjieMoney.setText(MainGlobalData.DONGJIE_MONEY);
        tvWinMoney.setText(MainGlobalData.REBATE);
    }

    public static void reLoadActivity() {
        progressBar.setVisibility(View.VISIBLE);
        CreatViews.BTN_BIEWS = new ArrayList<>();
        CreatViews.TV_PEILVS = new ArrayList<>();
        //初始化窗口总个数，select1和select2上面的TextView
        Log.e("CreatViews.TV_PEILVS", "finish");
        windowNum = DataInit.initWindowNum(MainGlobalData.LOTTERY_TYPE, MainGlobalData.LOTTERY_PAGE, tvSelect1, tvSelect2);
        //初始化tvTitles,tvContents,tvGames,tvSubs数据
        Log.e("windowNum", "init");
        ArrayList<String[]> resInitData = DataInit.initData(MainGlobalData.LOTTERY_TYPE, MainGlobalData.LOTTERY_PAGE);
        tvTitles = resInitData.get(0);
        tvContents = resInitData.get(1);
        tvGames = resInitData.get(2);
        tvSubs = resInitData.get(3);
        //Log.e("tvTitles", String.valueOf(tvTitles[1]));
        initView();
        LoadAllInfoService.startInitActivity(mContext, MainGlobalData.LOTTERY_TYPE, MainGlobalData.LOTTERY_PAGE);
    }


    private void initTimeCount() {
        timer_fp = new CountDownTimerUtil(Math.abs(closeTimeStamp - nowTimeStamp), 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String timeString = MainGlobalData.calculateTime(millisUntilFinished);
                tvTime.setText("距离封盘：" + timeString);
            }

            @Override
            public void onFinish() {
                tvTime.setTextColor(getResources().getColor(R.color.red));
                timer_kj.start();
            }
        };
        timer_kj = new CountDownTimerUtil(Math.abs(openTimeStamp - nowTimeStamp), 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                String timeString = MainGlobalData.calculateTime(millisUntilFinished);
                tvTime.setText("距离开奖：" + timeString);
            }

            @Override
            public void onFinish() {
                timer_kj.cancel();
                timer_fp.cancel();
                reLoadActivity();
            }
        };
        timer.start();
        if (closeTimeStamp >= nowTimeStamp) {//距离封盘
            timer_fp.start();
        } else {
            timer_kj.start();
        }
    }

    private TextWatcher watcher = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            Log.e("before", etDefault.getText().toString());
        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {
            Log.e("on", etDefault.getText().toString());
            MainGlobalData.DEFAULT_MONEY = etDefault.getText().toString();
            for (int i = 0; i < lvBets.getChildCount(); i++) {
                EditText etAmount = (EditText) lvBets.getChildAt(i).findViewById(R.id.et_amount);
                etAmount.setText(etDefault.getText().toString());
            }
        }

        @Override
        public void afterTextChanged(Editable s) {
            Log.e("after", etDefault.getText().toString());
        }
    };

    private void refreshViews() {
        if (isFengpan) {
            counts = MainGlobalData.smallWindowCheckListener(mContext, windowNum, counts, MainGlobalData.LOTTERY_PAGE, topPeilv);
        }
        LoadLotteryInfos.createLotteryNumsView(mContext, MainGlobalData.LOTTERY_TYPE, lotteryNums, lotteryNums2, extraAddLayout, nums);
        setPeilvAndNumber();
        initTimeCount();
        for (int i = 0; i < mBuys.length; i++) {
            mBuys[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isFengpan) {
                        if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_lm") || MainGlobalData.LOTTERY_PAGE.equals("klsf_lm")) {
                            int sum = 0;
                            for (int n : counts) {
                                sum += n;
                            }
                            if (MainGlobalData.LOTTERY_PAGE.equals("klsf_lm")) {
                                if ((counts[0] == 1 && sum > 2) || (counts[1] == 1 && sum > 2) || (counts[2] == 1 && sum > 3) || (counts[3] == 1 && sum > 3) ||
                                        (counts[4] == 1 && sum > 4) || (counts[5] == 1 && sum > 5)) {

                                    list = MainGlobalData.initLMBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                                    betWindowInitial();
                                }
                            } else if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_lm")) {
                                if ((counts[0] == 1 && sum > 2) || (counts[1] == 1 && sum > 3) || (counts[2] == 1 && sum > 4) || (counts[3] == 1 && sum > 5) ||
                                        (counts[4] == 1 && sum > 6) || (counts[5] == 1 && sum > 7) || (counts[6] == 1 && sum > 8) || (counts[7] == 1 && sum > 2)
                                        || (counts[8] == 1 && sum > 3)) {
                                    list = MainGlobalData.initLMBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                                    betWindowInitial();
                                }
                            }
                        } else if (MainGlobalData.LOTTERY_PAGE.equals("hk6_lm")) {
                            int sum = 0;
                            for (int n : counts) {
                                sum += n;
                            }
                            if ((counts[0] == 1 && (sum > 3 && sum < 12)) || (counts[1] == 1 && (sum > 2 && sum < 12)) || (counts[2] == 1 && (sum > 3 && sum < 12)) ||
                                    (counts[3] == 1 && (sum > 2 && sum < 12)) || (counts[4] == 1 && (sum > 2 && sum < 12)) || (counts[5] == 1 && (sum > 4 && sum < 12))) {
                                list = MainGlobalData.initHK6LmBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                                betWindowInitial();
                            }
                        } else if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_zx")) {
                            list = MainGlobalData.initZxBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                            betWindowInitial();
                        } else {
                            list = MainGlobalData.initBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                            betWindowInitial();
                        }
                        etDefault.addTextChangedListener(watcher);
                        MainGlobalData.btnCheckListener(mContext, btnCheck, lvBets, isFengpan, dNumber, list, tvGames, tvSubs, peilvStrings, MainGlobalData.LOTTERY_TYPE,
                                betWindow, counts,betResultWindow,btnClose,lvBetsResult);
                    }
                }
            });
        }
        if (Arrays.asList(singleTouch).contains(MainGlobalData.LOTTERY_PAGE)) {//如果是单点弹出window的界面
            for (int i = 0; i < windowNum; i++) {
                int finalI = i;
                CreatViews.BTN_BIEWS.get(i).setOnClickListener((View view) -> {
                    counts[finalI]++;
                    list = MainGlobalData.initBetWindow(list, counts, tvTitles, tvContents, peilvStrings, windowNum);
                    tvTotalNum.setText(String.valueOf(list.size()));
                    adapter = new BetsAdapter(getApplicationContext(), list);
                    lvBets.setAdapter(adapter);
                    adapter.notifyDataSetChanged();
                    betWindow.setVisibility(View.VISIBLE);
                    MainGlobalData.btnCheckListener(mContext, btnCheck, lvBets, isFengpan, dNumber, list, tvGames, tvSubs, peilvStrings, MainGlobalData.LOTTERY_TYPE, betWindow, counts,
                            betResultWindow,btnClose,lvBetsResult);
                    counts[finalI] = 0;
                });
            }
        }
        select1.setClickable(true);
        select2.setClickable(true);
        select3.setClickable(true);
        MainGlobalData.select1Listner(select1, select2, select3, mContext, mActivity, intent, timer_fp, timer_kj);
        MainGlobalData.select2Listner(select1, select2, select3, mContext, mActivity, MainGlobalData.LOTTERY_TYPE, intent, timer_fp, timer_kj);
        MainGlobalData.select3Listner(select1, select2, select3, mContext, mActivity, MainGlobalData.LOTTERY_TYPE, MainGlobalData.LOTTERY_PAGE, intent, timer_fp, timer_kj);
        MainGlobalData.btnCloseLisener(mContext,btnClose,lvBetsResult,dNumber,list);
        progressBar.setVisibility(View.GONE);
    }

    private void betWindowInitial() {
        tvTotalNum.setText(String.valueOf(list.size()));
        adapter = new BetsAdapter(getApplicationContext(), list);
        lvBets.setAdapter(adapter);
        adapter.notifyDataSetChanged();
        betWindow.setVisibility(View.VISIBLE);
    }

    private static void initView() {
        creatView();
    }

    private static void creatView() {
        //生成主界面具体内容
        mBuys = GenerateView.generateView(MainGlobalData.LOTTERY_TYPE, MainGlobalData.LOTTERY_PAGE, mContext, mActivity);
        counts = new int[windowNum];

    }

    //<<<<<<<<------------------  分割线  -------------------->>>>>>>>>>

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_cancel:
                betWindow.setVisibility(View.GONE);
                break;
        }
    }


    private void setPeilvAndNumber() {
        if (isFengpan) {
            MainGlobalData.setTopPeilv(topPeilv, peilvStrings);
            tvTime.setTextColor(getResources().getColor(R.color.green));
            if (peilvStrings != null) {
                if (MainGlobalData.LOTTERY_PAGE.equals("hk6_lm")) {
                    for (int i = 0; i < windowNum + 2; i++) {
                        CreatViews.TV_PEILVS.get(i).setText(peilvStrings[i]);
                    }
                } else {
                    for (int i = 0; i < windowNum; i++) {
                        CreatViews.TV_PEILVS.get(i).setText(peilvStrings[i]);
                    }
                }
            }
        } else {
            tvTime.setTextColor(getResources().getColor(R.color.red));
            for (int i = 0; i < windowNum; i++) {
                CreatViews.TV_PEILVS.get(i).setText("--");
            }
        }
        pnumber.setText(pNumber);
        drawNumber.setText(dNumber);
    }

    private String resPei;
    private BroadcastReceiver initActivityReciever = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction() == MainGlobalData.INIT_RESULT) {
                isLoadFinish = intent.getBooleanExtra("isLoadFinish", false);
                if (isLoadFinish) {
                    pNumber = intent.getStringExtra("pNumber");
                    dNumber = intent.getStringExtra("dNumber");
                    isFengpan = intent.getBooleanExtra("isFengpan", true);
                    peilvStrings = intent.getStringArrayExtra("peilvStrings");
                    nums = intent.getStringArrayExtra("nums");
                    nowTimeStamp = intent.getLongExtra("nowTimeStamp", 0);
                    closeTimeStamp = intent.getLongExtra("closeTimeStamp", 0);
                    openTimeStamp = intent.getLongExtra("openTimeStamp", 0);
                    resPei = intent.getStringExtra("resPei");
                    refreshViews();
                }
            }
        }
    };
    private CountDownTimerUtil timer = new CountDownTimerUtil(10000, 1000) {

        @Override
        public void onTick(long millisUntilFinished) {
            second.setText(String.valueOf(millisUntilFinished / 1000) + "秒");
        }

        @Override
        public void onFinish() {
            second.setText("载入");
            timer.start();
        }
    };

    private void registerMyReceiver() {
        IntentFilter filter = new IntentFilter();
        filter.addAction(MainGlobalData.INIT_RESULT);
        registerReceiver(initActivityReciever, filter);
    }


}
