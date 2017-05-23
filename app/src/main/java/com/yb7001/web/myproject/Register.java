package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.optimus.edittextfield.EditTextField;
import com.tencent.bugly.crashreport.CrashReport;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import butterknife.Bind;
import butterknife.ButterKnife;


public class Register extends Activity {
    @Bind(R.id.et_account)
    EditTextField etAccount;
    @Bind(R.id.et_pwd)
    EditTextField etPwd;
    @Bind(R.id.et_pwd2)
    EditTextField etPwd2;
    @Bind(R.id.et_email)
    EditTextField etEmail;
    @Bind(R.id.et_phone)
    EditTextField etPhone;
    @Bind(R.id.btn_ok)
    Button btnOk;
    @Bind(R.id.btn_cancle)
    Button btnCancle;
    private String resRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        ButterKnife.bind(this);
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        mContext=this;


        btnCancle.setOnClickListener(new View.OnClickListener() {
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
                if (!etAccount.getText().toString().equals("")&&!etPwd.getText().toString().equals("")&&
                        !etPwd2.getText().toString().equals("")&&!etEmail.getText().toString().equals("")&&
                        !etPhone.getText().toString().equals("")){

                    if (etPwd.getText().toString().equals(etPwd2.getText().toString())){
                        new Thread(){
                            public void run(){
                              resRegister= new SoapServiceImpl().registerService(etAccount.getText().toString(),
                                        etPwd.getText().toString(),etEmail.getText().toString(),etPhone.getText().toString());
                                mHandler.sendEmptyMessage(0);
                            }
                        }.start();
                    }else {
                        Toast.makeText(getApplicationContext(),"两次密码不一致！",Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(getApplicationContext(),"请填写信息",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }

    private Context mContext;
    private JSONObject fcTc;
    private String resString;
    Handler mHandler=new Handler(){

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                try {
                    JSONTokener jsonTokener = new JSONTokener(resRegister);
                    fcTc = (JSONObject) jsonTokener.nextValue();
                    resString="";
                    resString=fcTc.getString("tip");
                    Log.e("tag", String.valueOf(fcTc));
                    if (fcTc.getString("status").equals("ok")){
                        mHandler.sendEmptyMessage(1);
                    }else {
                        mHandler.sendEmptyMessage(2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else if (msg.what==1){
                Toast.makeText(getApplicationContext(),"注册成功！",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(mContext,Login.class);
                startActivity(intent);
                finish();
            }else if (msg.what==2){

                Toast.makeText(getApplicationContext(),resString,Toast.LENGTH_SHORT).show();
            }
        }
    };
}
