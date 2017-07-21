package com.yb7001.web.myproject.money;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.PK10TwoSide;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.bean.BankInfo;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import butterknife.Bind;
import butterknife.ButterKnife;

public class Tikuan extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.progressBar)
    ProgressBar progressBar;
    @Bind(R.id.tv_bank_name)
    TextView tvBankName;
    @Bind(R.id.tv_bank_user)
    TextView tvBankUser;
    @Bind(R.id.tv_bank_number)
    TextView tvBankNumber;
    @Bind(R.id.et_amount)
    EditText etAmount;
    @Bind(R.id.et_password)
    EditText etPassword;
    private Context mContext;
    private String resBankInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tikuan);
        ButterKnife.bind(this);
        init();
        listenAction();
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

    private void init() {
        mContext = this;
        progressBar.setVisibility(View.VISIBLE);
        new Thread() {
            public void run() {
                resBankInfo = new SoapServiceImpl().loadUserBankInfoService(MainGlobalData.TOKEN);
                mHandler.sendEmptyMessage(1);
            }
        }.start();

    }

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 1) {
                if (!resBankInfo.trim().equals("请求数据失败！")) {
                    Log.e("resBankInfo", resBankInfo);
                    Gson gson = new Gson();
                    BankInfo bankInfo = gson.fromJson(resBankInfo, BankInfo.class);
                    tvBankName.setText(bankInfo.getResult().getBankName());
                    tvBankNumber.setText(bankInfo.getResult().getBankNumber());
                    tvBankUser.setText(bankInfo.getResult().getBankUser());
                    progressBar.setVisibility(View.GONE);
                } else {
                    Toast.makeText(getApplicationContext(), "加载数据失败！", Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

}
