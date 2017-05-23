package com.yb7001.web.myproject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v4.widget.NestedScrollView;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.tencent.bugly.crashreport.CrashReport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import butterknife.Bind;
import butterknife.ButterKnife;


public class Guize extends Activity {
    @Bind(R.id.btn_back)
    ImageButton btnBack;
    @Bind(R.id.tv_guize)
    TextView tvGuize;
    @Bind(R.id.guize_select)
    LinearLayout guizeSelect;
    private StringBuffer stringBuffer;
    private String string;
    private Context mContext;
    private String lotteryCode = "";
    private ArrayList<String> lotteryType;
    private int[] ids;
    private String[] tvs;
    private HashMap<Integer, String> map;
    private int[] layouts;
    private NestedScrollView nestLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guize);
        ButterKnife.bind(this);
        mContext = this;
        CrashReport.initCrashReport(getApplicationContext(), "16e5be7f65", true);
        map=new HashMap<>();
        map.put(R.id.bjsc,"BJPK10");
        map.put(R.id.cqssc,"CQSSC");
        map.put(R.id.bjkl,"BJKL8");
        map.put(R.id.gxk,"GXK3");
        map.put(R.id.gxkl,"GXKLSF");
        map.put(R.id.gd,"GD11X5");
        map.put(R.id.xglhc,"HK6");
        map.put(R.id.xjssc,"XJSSC");
        map.put(R.id.tjssc, "TJSSC");
        map.put(R.id.gdkl,"GDKLSF");
        map.put(R.id.fc, "F3D");
        map.put(R.id.tcpl,"PL3");
        map.put(R.id.cqxync,"XYNC");
        lotteryType = new ArrayList<>(Arrays.asList("BJPK10", "CQSSC", "BJKL8", "GXK3","GXKLSF", "GD11X5",
                "XJSSC", "TJSSC", "GDKLSF", "F3D", "PL3", "XYNC","HK6"));
        layouts = new int[]{R.layout.gz_pk10, R.layout.gz_cqssc,R.layout.gz_bjkl8,  R.layout.gz_gxk3, R.layout.gz_gxklsf, R.layout.gz_gd11x5
                , R.layout.gz_xjssc, R.layout.gz_tjssc, R.layout.gz_gdklsf, R.layout.gz_f3d, R.layout.gz_pl3, R.layout.gz_xync,R.layout.gz_hk6};
        tvs=new String[]{"北京赛车(PK10)","重庆时时彩","北京快乐8","广西快3","广西快乐十分","广东11选5","新疆时时彩",
                "天津时时彩","广东快乐十分","福彩3D","体彩排列3","重庆幸运农场","香港六合彩"};
        nestLayout = (NestedScrollView) findViewById(R.id.nest_layout);
        reLoadGuize();
        listenAction();
    }

    private void reLoadGuize() {
        int index=lotteryType.indexOf(MainGlobalData.GUIZE_CODE);
        Log.e("tvs[index]",tvs[index]);
        tvGuize.setText(tvs[index]);
        nestLayout.removeAllViews();
        View mInflate = View.inflate(getApplicationContext(), layouts[index], null);
        nestLayout.addView(mInflate);
    }

    private void listenAction() {
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, PK10TwoSide.class);
                startActivity(intent);
                finish();
            }
        });
        guizeSelect.setOnClickListener((View view)->{
            PopupMenu popupMenu = new PopupMenu(mContext, view);
            popupMenu.getMenuInflater().inflate(R.menu.pop_menu_1, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener((MenuItem item)->{
                MainGlobalData.GUIZE_CODE=map.get(item.getItemId());
                Log.e("GUIZE_CODE",MainGlobalData.GUIZE_CODE);
                reLoadGuize();
                return false;
            });
            popupMenu.show();
        });
    }

}
