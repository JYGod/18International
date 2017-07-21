package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.gson.Gson;
import com.tencent.bugly.crashreport.CrashReport;
import com.yb7001.web.myproject.bean.ValidateLoginResult;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import com.optimus.edittextfield.EditTextField;

import java.text.DecimalFormat;
import java.util.Map;

import butterknife.Bind;
import butterknife.ButterKnife;
import info.hoang8f.widget.FButton;



public class Login extends Activity {
    @Bind(R.id.btn_login)
    FButton btnLogin;
    @Bind(R.id.btn_register)
    FButton btnRegister;
    @Bind(R.id.btn_viewer)
    FButton btnViewer;
    @Bind(R.id.et_name)
    EditTextField etName;
    @Bind(R.id.et_password)
    EditTextField etPassword;
    private String loginResult;
    private ValidateLoginResult validateLoginResult;
    private String selectRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        ButterKnife.bind(this);
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        init();
        listernAction();
    }

    private void listernAction() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               // if (checkView.isEquals(checkText.getText().toString())) {
                    new Thread() {
                        public void run() {
                            loginResult = new SoapServiceImpl().validateLogin(etName.getText().toString(),etPassword.getText().toString());
                            Log.e("login",loginResult);
                            Gson gson=new Gson();
                            validateLoginResult = gson.fromJson(loginResult, ValidateLoginResult.class);
                            if (validateLoginResult!=null){
                                if (validateLoginResult.getStatus().equals("ok")){
                                    mHandler.sendEmptyMessage(0);
                                }else {
                                    mHandler.sendEmptyMessage(1);
                                }
                            }else {
                                mHandler.sendEmptyMessage(2);
                            }
                        }
                    }.start();
                //} else {
                 //   Toast.makeText(getApplicationContext(), "验证码输入错误!", Toast.LENGTH_SHORT).show();
               // }
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(mContext,Register.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void init() {
        mContext=this;
        btnRegister.setButtonColor(getResources().getColor(R.color.btn_register));
        btnRegister.setShadowColor(getResources().getColor(R.color.btn_register_shadow));
        btnViewer.setButtonColor(getResources().getColor(R.color.btn_viewer));
        btnViewer.setShadowColor(getResources().getColor(R.color.btn_viewer_shadow));

    }

    private Context mContext;
    Handler mHandler=new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                DecimalFormat df = new DecimalFormat("#.##");
                MainGlobalData.USER_NAME=validateLoginResult.getResult().getUserName();
                MainGlobalData.TOKEN=validateLoginResult.getResult().getToken();
                MainGlobalData.USE_MONEY=String.valueOf(df.format(Double.parseDouble(validateLoginResult.getResult().getUseMoney())));
                MainGlobalData.DONGJIE_MONEY=String.valueOf(df.format(Double.parseDouble(validateLoginResult.getResult().getDongjieMoney())));
                MainGlobalData.REBATE=String.valueOf(df.format(Double.parseDouble(validateLoginResult.getResult().getRebate())));
                MainGlobalData.SYS_DEPOSITE_URL = validateLoginResult.getResult().getSysDepositUrl();
                Intent intent=new Intent(mContext,UserXieyi.class);
                startActivity(intent);
                finish();
            }else if (msg.what==1){
                Toast.makeText(getApplicationContext(), "密码错误!", Toast.LENGTH_SHORT).show();
            }else if (msg.what==2){
                Toast.makeText(getApplicationContext(), "网络异常!", Toast.LENGTH_SHORT).show();
            }
        }
    };

    public static String exChange(String str){
        StringBuffer sb = new StringBuffer();
        if(str!=null){
            for(int i=0;i<str.length();i++){
                char c = str.charAt(i);
                if(Character.isUpperCase(c)){
                    sb.append(Character.toLowerCase(c));
                }else if(Character.isLowerCase(c)){
                    sb.append(Character.toUpperCase(c));
                }
            }
        }

        return sb.toString();
    }
}
