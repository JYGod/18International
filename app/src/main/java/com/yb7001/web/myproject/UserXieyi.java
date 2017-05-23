package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tencent.bugly.crashreport.CrashReport;

import butterknife.Bind;
import butterknife.ButterKnife;



public class UserXieyi extends Activity {
    @Bind(R.id.btn_ok)
    Button btnOk;
    @Bind(R.id.btn_back)
    Button btnBack;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tongyi);
        ButterKnife.bind(this);
        mContext=this;
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Login.class);
                startActivity(intent);
                finish();
            }
        });

        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,PK10TwoSide.class);
                MainGlobalData.LOTTERY_TYPE="BJPK10";
                MainGlobalData.LOTTERY_PAGE="pk10_twoside";
                startActivity(intent);
                finish();
            }
        });
    }
}
