package com.yb7001.web.myproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.tencent.bugly.crashreport.CrashReport;
import com.yb7001.web.myproject.adapter.WeijieAdapter;
import com.yb7001.web.myproject.bean.JiesuanBets;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import com.yb7001.web.myproject.tools.CustomListView;

import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Weijie extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.tv_title)
    TextView tvTitle;
    @Bind(R.id.tv_total)
    TextView tvTotal;
    @Bind(R.id.tv_bet_money)
    TextView tvBetMoney;
    @Bind(R.id.tv_account)
    TextView tvAccount;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.lv_yiwj)
    CustomListView lvYiwj;
    @Bind(R.id.tv_total_num)
    TextView tvTotalNum;
    @Bind(R.id.tv_index)
    TextView tvIndex;
    private Context mContext;
    private String selectRes;
    private boolean isRefreshing;
    private int index;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.jinriyijie);
        ButterKnife.bind(this);
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        init();
        listenAction();
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btnBack.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(mContext, PK10TwoSide.class);
                        startActivity(intent);
                        finish();
                    }
                });
            }
        });

        isRefreshing = false;
        lvYiwj.setonLoadListener(new CustomListView.OnLoadListener() {
            @Override
            public void onLoad() {
                if (!isRefreshing&&lvYiwj.getCount()>9) {
                    index++;
                    isRefreshing = true;
                    new Thread() {
                        public void run() {
                            selectRes = new SoapServiceImpl().loadUserBetsService("0", 10, index, MainGlobalData.TOKEN);
                            mHandler.sendEmptyMessage(1);
                        }
                    }.start();
                }else {
                    Toast.makeText(getApplicationContext(),"没有更多数据了",Toast.LENGTH_SHORT).show();
                    lvYiwj.onLoadComplete();
                }
            }
        });

        lvYiwj.setonRefreshListener(new CustomListView.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (!isRefreshing) {
                    index = 1;
                    isRefreshing = true;
                    new Thread() {
                        public void run() {
                            selectRes = new SoapServiceImpl().loadUserBetsService("0", 10, index, MainGlobalData.TOKEN);
                            mHandler.sendEmptyMessage(1);
                        }
                    }.start();
                }
            }
        });
    }

    private void init() {
        tvTitle.setText("未结明细");
        mContext = this;
        index = 1;
        progressBar.setVisibility(View.VISIBLE);
        new Thread() {
            public void run() {
                selectRes = new SoapServiceImpl().loadUserBetsService("0", 10, 1, MainGlobalData.TOKEN);
                mHandler.sendEmptyMessage(1);
            }
        }.start();
    }

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                if (!selectRes.equals("请求数据失败！")) {
                    Gson gson = new Gson();
                    JiesuanBets res = gson.fromJson(selectRes, JiesuanBets.class);
                    if (res.getResult() != null) {
                        Log.e("selectRes", selectRes);
                        int total = res.getResult().getTotal();
                        String totalStr = String.valueOf(total);
                        tvTotal.setText(totalStr);
                        tvBetMoney.setText(res.getResult().getFooter().get(1).getBetMoney());
                        tvAccount.setText(res.getResult().getFooter().get(1).getAccount());
                        tvTotalNum.setText("共" + totalStr + "笔记录 共" + String.valueOf(total / 10 + 1) + "页");
                        tvIndex.setText("第" + index + "页");
                        List<JiesuanBets.Result.Rows> mList = res.getResult().getRows();
                        WeijieAdapter adapter = new WeijieAdapter(mContext, mList);
                        lvYiwj.setAdapter(adapter);
                        adapter.notifyDataSetChanged();
                        isRefreshing = false;
                        lvYiwj.onRefreshComplete();
                        lvYiwj.onLoadComplete();
                    }
                }
                progressBar.setVisibility(View.GONE);
            }
        }
    };
}
