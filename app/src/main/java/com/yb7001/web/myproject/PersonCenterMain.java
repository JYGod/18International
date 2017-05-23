package com.yb7001.web.myproject;


import android.app.TabActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TabHost;

import com.tencent.bugly.crashreport.CrashReport;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.personcenter.AActivity;
import com.yb7001.web.myproject.personcenter.BActivity;
import com.yb7001.web.myproject.personcenter.CActivity;

public class PersonCenterMain extends TabActivity implements CompoundButton.OnCheckedChangeListener{
    private Context mContext;
    private String TabTag;
    private Intent mAIntent,mBIntent,mCIntent,mDIntent;
    private RadioButton radio_0,radio_1,radio_2,radio_3;
    private TabHost mTabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.maintabs);
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        Intent intent = getIntent();
        mContext=this;
        TabTag = intent.getStringExtra("TabTag");
        this.mAIntent = new Intent(this, AActivity.class);
        this.mBIntent = new Intent(this, BActivity.class);
        this.mCIntent = new Intent(this, CActivity.class);
        radio_0=(RadioButton)findViewById(R.id.radio_button0);
        radio_1=(RadioButton)findViewById(R.id.radio_button1);
        radio_2=(RadioButton)findViewById(R.id.radio_button2);
        if ("A_TAB".equals(TabTag)){
            radio_0.setChecked(true);
        }else if ("B_TAB".equals(TabTag)){
            radio_1.setChecked(true);
        }else if ("C_TAB".equals(TabTag)){
            radio_2.setChecked(true);
        }else {
            radio_0.setChecked(true);
        }

        ((RadioButton) findViewById(R.id.radio_button0))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button1))
                .setOnCheckedChangeListener(this);
        ((RadioButton) findViewById(R.id.radio_button2))
                .setOnCheckedChangeListener(this);
        setupIntent();
        this.mTabHost.setCurrentTabByTag(TabTag);
    }

    private void setupIntent() {
        this.mTabHost = getTabHost();
        TabHost localTabHost = this.mTabHost;

        localTabHost.addTab(buildTabSpec("A_TAB",R.string.lock,
                R.drawable.lock, this.mAIntent));

        localTabHost.addTab(buildTabSpec("B_TAB", R.string.user,
                R.drawable.user, this.mBIntent));

        localTabHost.addTab(buildTabSpec("C_TAB",
                R.string.message, R.drawable.message,
                this.mCIntent));


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        if (isChecked) {
            switch (buttonView.getId()) {
                case R.id.radio_button0:
                    this.mTabHost.setCurrentTabByTag("A_TAB");
                    break;
                case R.id.radio_button1:
                    this.mTabHost.setCurrentTabByTag("B_TAB");
                    break;
                case R.id.radio_button2:
                    this.mTabHost.setCurrentTabByTag("C_TAB");
                    break;
            }
        }
    }

    private TabHost.TabSpec buildTabSpec(String tag, int resLabel, int resIcon,
                                         final Intent content) {
        return this.mTabHost.newTabSpec(tag).setIndicator(getString(resLabel),
                getResources().getDrawable(resIcon)).setContent(content);
    }

}
