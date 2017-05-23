package com.yb7001.web.myproject.money;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.service.SoapServiceImpl;

public class JiaoyiLishi extends Activity{
    private String result;
    private String tag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        new Thread(){
            public void run(){
                result = new SoapServiceImpl().loadLotteryInfoService("F3D", MainGlobalData.TOKEN);
                Log.e("F3D",result);
             //   tag = new SoapServiceImpl().loadLotteryHistoryService("F3D", nowStart, nowEnd, 1, 1, MainGlobalData.TOKEN);
            }
        }.start();
    }
}
