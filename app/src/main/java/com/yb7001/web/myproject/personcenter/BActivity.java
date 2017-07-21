package com.yb7001.web.myproject.personcenter;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.R;
import com.yb7001.web.myproject.PK10TwoSide;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.bean.UserAddressInfo;
import com.yb7001.web.myproject.service.SoapServiceImpl;

import butterknife.Bind;
import butterknife.ButterKnife;

public class BActivity extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.btn_save_adress)
    Button btnSaveAdress;
    private EditText address;
    private EditText uSer;
    private EditText phone;
    private Context mContext;
    private String result;
    private String selectRes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_zhanghao);
        ButterKnife.bind(this);
        findIds();
        init();
        listenActions();
    }

    private void listenActions() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(mContext, PK10TwoSide.class);
//                startActivity(intent);
                finish();
            }
        });
        btnSaveAdress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!address.getText().toString().equals("")&&!uSer.getText().toString().equals("")&&
                        !phone.getText().toString().equals("")){
                    new Thread(){
                        public void run(){
                            result=new SoapServiceImpl().bindUserAddressService(address.getText().toString(),
                                    uSer.getText().toString(),phone.getText().toString(), MainGlobalData.TOKEN);
                            mHandler.sendEmptyMessage(0);
                        }
                    }.start();

                }
            }
        });
    }

    private void init() {
        mContext = this;
        new Thread() {
            public void run() {
                selectRes=new SoapServiceImpl().loadUserAddressService(MainGlobalData.TOKEN);
                mHandler.sendEmptyMessage(1);
            }

        }.start();
    }

    private void findIds() {
        address = (EditText) findViewById(R.id.et_shouhuo_address);
        uSer = (EditText) findViewById(R.id.et_shouhuo_user);
        phone = (EditText) findViewById(R.id.et_shouhuo_phone);
    }

    Handler mHandler = new Handler() {

        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what == 0) {
                if (!result.equals("请求数据失败！")){
                    Toast.makeText(getApplicationContext(),"用户资料保存成功！",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(getApplicationContext(),"修改失败",Toast.LENGTH_SHORT).show();
                }
            }else if (msg.what==1){
                if (!selectRes.equals("请求数据失败！")){

                    Log.e("用户地址信息",selectRes);

                    Gson gson = new Gson();
                    UserAddressInfo userAddressInfo = gson.fromJson(selectRes, UserAddressInfo.class);
                    address.setText(userAddressInfo.getResult().getAddress());
                    uSer.setText(userAddressInfo.getResult().getRealUserName());
                    phone.setText(userAddressInfo.getResult().getUserTel());
                }
            }
        }
    };
}
