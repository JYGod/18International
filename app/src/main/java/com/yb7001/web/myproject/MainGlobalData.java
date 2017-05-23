package com.yb7001.web.myproject;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.support.v7.widget.GridLayout;
import android.support.v7.widget.PopupMenu;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;
import com.yb7001.web.myproject.adapter.BetResAdapter;
import com.yb7001.web.myproject.bean.BetResult;
import com.yb7001.web.myproject.bean.BetSuccess;
import com.yb7001.web.myproject.bean.SaveBet;
import com.yb7001.web.myproject.global.CreatViews;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import com.yb7001.web.myproject.tools.CountDownTimerUtil;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.yb7001.web.myproject.Login;
import com.yb7001.web.myproject.JingriYijie;
import com.yb7001.web.myproject.Baobiao;
import com.yb7001.web.myproject.MoneyMain;
import com.yb7001.web.myproject.PersonCenterMain;
import com.yb7001.web.myproject.PK10TwoSide;

public class MainGlobalData {
    public static String kefuAddress="https://messenger.providesupport.com/messenger/1tmdhlqqr8sfb18aavw2keum4h.html";
    public static  String TOKEN="75316486-ba06-4234-9091-4fc0f371ad56";
    public static String  USER_NAME="luyou6";
    public static String USE_MONEY="0.0";
    public static String DONGJIE_MONEY="0.0";
    public static String REBATE="4.5";
    public static final String LOTTER_CODE="BJPK10";
    public static String GUIZE_CODE="BJPK10";
    public static boolean isFirstPick=true;
    public static String TOP_PEILV="";
    public static String PAN;
    public static boolean isDefault=false;
    public static String DEFAULT_MONEY="";
    public static Boolean IS_SENDING_BROADCAST=false;
    public static String LOTTERY_TYPE="BJPK10";
    public static String LOTTERY_PAGE="pk10_twoside";
    public static String LOTTERY_SUBTITLE="";
    public static final String INIT_RESULT="com.yb7001.web.myproject.global.INIT_RESULT";
    private static String resPeilv;
    private static int sum;
    private static TextView tvTopPeilv;
    private static String betResult;
    private static Context mContextTemp;
    private static RelativeLayout mBetWindow;
    private static ArrayList<Map<String, Object>> mList;
    private static String mDnumber;
    private static RelativeLayout mBetResWindow;
    private static Button mBtnClose;
    private static ListView mLvBetRes;
    private static ListView mLvBets;

    public static String trimFirstAndLastChar(String source,char element){
        boolean beginIndexFlag = true;
        boolean endIndexFlag = true;
        do{
            int beginIndex = source.indexOf(element) == 0 ? 1 : 0;
            int endIndex = source.lastIndexOf(element) + 1 == source.length() ? source.lastIndexOf(element) : source.length();
            source = source.substring(beginIndex, endIndex);
            beginIndexFlag = (source.indexOf(element) == 0);
            endIndexFlag = (source.lastIndexOf(element) + 1 == source.length());
        } while (beginIndexFlag || endIndexFlag);
        return source;
    }
    /**
     * 左侧导航栏跳转
     * @param activity
     * @param itemId
     */
    public static void itemClickListener(Activity activity, int itemId) {
        if (itemId==R.id.nav_kefu){
            final Uri uri = Uri.parse(MainGlobalData.kefuAddress);
            final Intent it = new Intent(Intent.ACTION_VIEW, uri);
            activity.startActivity(it);
        }else {
            ArrayList<Integer>ids=new ArrayList<>(Arrays.asList(R.id.nav_home,R.id.nav_gerenzhongxin,R.id.nav_cunqukuan,
                    R.id.nav_mingxi, R.id.nav_yijie,R.id.nav_baobiao,R.id.nav_jieguo,R.id.nav_guize,R.id.nav_out));
            String[] pages=new String[]{"PK10TwoSide","PersonCenterMain","MoneyMain","Weijie","JingriYijie",
                    "Baobiao","kaijiang_result","Guize","Login"};
            Log.e("itemClickListener：","点击itemClickListener");
            try {
                Class clazz = Class.forName("com.yb7001.web.myproject."+pages[ids.indexOf(itemId)]);
                Intent intent=new Intent(activity,clazz);
                activity.startActivity(intent);
                activity.finish();
            } catch (ClassNotFoundException e) {
                Log.e("没有找到类：",pages[ids.indexOf(itemId)]);
                e.printStackTrace();
            }
        }
    }
    /**
     * 初始化bet_window窗口
     * @param list
     * @param titles
     * @param contens
     * @param peilvStrings
     * @param num  页面窗口总数
     * @return
     */
    public static ArrayList<Map<String, Object>> initBetWindow(ArrayList<Map<String, Object>> list,int[] checkCounts, String[] titles, String[] contens,
                                                               String[] peilvStrings, int num) {
        list = new ArrayList<Map<String, Object>>();
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")||MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")||MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
            int index=0;
            for (int i=0;i<10;i++){
                for (int j=10;j<20;j++){
                    if (checkCounts[i]%2==1&&checkCounts[j]%2==1){
                        HashMap<String, Object> map = new HashMap<String, Object>();
                        map.put("title", titles[0]);
                        map.put("content", contens[i]+","+contens[j]);
                        map.put("peilv", peilvStrings[20]);
                        map.put("index", index);
                        list.add(map);
                        index++;
                    }
                }
            }
        }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")||MainGlobalData.LOTTERY_PAGE.equals("3D_select6")
                ||MainGlobalData.LOTTERY_PAGE.equals("hk6_zxbz")){
            String contents="";
            for (int i=0;i<checkCounts.length;i++){
                if (checkCounts[i]%2==1){
                    if (contents.equals("")){
                        contents=contens[i];
                    }else {
                        contents+=","+contens[i];
                    }
                }
            }
            HashMap<String, Object> map = new HashMap<String, Object>();
            if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")){
                map.put("title", "组选三");
            }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_select6")){
                map.put("title", "组选六");
            }else {
                map.put("title", "自选不中");
            }
            map.put("content",contents);
            map.put("peilv", MainGlobalData.TOP_PEILV);
            map.put("index", 0);
            list.add(map);

        } else if (MainGlobalData.LOTTERY_PAGE.equals("3D_locate3")){
            int index=0;
            for (int i=0;i<10;i++){
                for (int j=10;j<20;j++){
                    for (int k=20;k<30;k++){
                        if (checkCounts[i]%2==1&&checkCounts[j]%2==1&&checkCounts[k]%2==1){
                            HashMap<String, Object> map = new HashMap<String, Object>();
                            map.put("title", titles[0]);
                            map.put("content", contens[i]+","+contens[j]+","+contens[k]);
                            map.put("peilv", peilvStrings[30]);
                            map.put("index", index);
                            list.add(map);
                            index++;
                        }
                    }
                }
            }
        }else {
            for (int i = 0; i < num; i++) {
                if (checkCounts[i]%2==1) {
                    HashMap<String, Object> map = new HashMap<String, Object>();
                    map.put("title", titles[i]);
                    map.put("content", contens[i]);
                    map.put("peilv", peilvStrings[i]);
                    map.put("index", i);
                    list.add(map);
                }
            }
        }
        return list;
    }
    public static ArrayList<Map<String, Object>> initHK6LmBetWindow(ArrayList<Map<String, Object>> list, int[] counts, String[] tvTitles, String[] tvContents, String[] peilvStrings, int windowNum) {
        list = new ArrayList<Map<String, Object>>();
        String peilv="";
        String content="";
        int index=0;
        if (counts[0]==1){
            peilv=peilvStrings[0];
            index=0;
        }else if(counts[1]==1){
            peilv=peilvStrings[2];
            index=1;
        }else if(counts[2]==1){
            peilv=peilvStrings[4];
            index=2;
        }else if(counts[3]==1){
            peilv=peilvStrings[5];
            index=3;
        }else if(counts[4]==1){
            peilv=peilvStrings[6];
            index=4;
        }else if(counts[5]==1){
            peilv=peilvStrings[7];
            index=5;
        }
        for (int i=6;i<counts.length;i++){
            if (counts[i]==1){
                if (content.equals("")){
                    content+=tvContents[i-6];
                }else {
                    content+=","+tvContents[i-6];
                }
            }
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", tvTitles[index]);
        map.put("content", content);
        map.put("peilv", peilv);
        map.put("index", index);
        list.add(map);
        return list;
    }
    public static ArrayList<Map<String, Object>> initZxBetWindow(ArrayList<Map<String, Object>> list, int[] counts, String[] tvTitles, String[] tvContents, String[] peilvStrings, int windowNum) {
        list = new ArrayList<Map<String, Object>>();
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
            String title=tvTitles[0];
            String peilv=peilvStrings[22];
            int index=0;
            for (int i=0;i<11;i++){
                for (int j=11;j<22;j++){
                    if (counts[i]%2==1&&counts[j]%2==1){
                        HashMap<String, Object> map = new HashMap<String, Object>();
                        map.put("title", title);
                        map.put("content",tvContents[i]+","+tvContents[j]);
                        map.put("peilv",peilv);
                        map.put("index",index);
                        list.add(map);
                        index++;
                    }
                }
            }
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("qszx")){
            String title=tvTitles[1];
            String peilv=peilvStrings[33];
            int index=0;
            for (int i=0;i<11;i++){
                for (int j=11;j<22;j++){
                    for(int k=22;k<33;k++){
                        if (counts[i]%2==1&&counts[j]%2==1&&counts[k]%2==1){
                            HashMap<String, Object> map = new HashMap<String, Object>();
                            map.put("title", title);
                            map.put("content",tvContents[i]+","+tvContents[j]+","+tvContents[k]);
                            map.put("peilv",peilv);
                            map.put("index",index);
                            list.add(map);
                            index++;
                        }
                    }
                }
            }
        }
        return list;
    }

    public static ArrayList<Map<String, Object>> initLMBetWindow(ArrayList<Map<String, Object>> list, int[] counts, String[] tvTitles,
                                                                 String[] tvContents, String[] peilvStrings, int windowNum) {
        list = new ArrayList<Map<String, Object>>();
        String title="";
        String content="";
        String peilv="";
        int singleSelect=0;
        if (MainGlobalData.LOTTERY_PAGE.equals("klsf_lm")){
            singleSelect=6;
        }else if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_lm")){
            singleSelect=9;
        }
        int index=0;
        for (int i = 0; i < singleSelect; i++) {
            if (counts[i]==1){
                title=tvTitles[i];
                peilv=peilvStrings[i];
                break;
            }
        }
        for (int i=singleSelect;i<windowNum;i++){
            if (counts[i]==1){
                if (!content.equals("")){
                    content=content+","+tvContents[i-singleSelect];
                }else {
                    content=content+tvContents[i-singleSelect];
                }
            }
        }
        HashMap<String, Object> map = new HashMap<String, Object>();
        map.put("title", title);
        map.put("content", content);
        map.put("peilv", peilv);
        map.put("index", index);
        list.add(map);
        return list;
    }
    /**
     * 隐藏按钮监听
     * @param btnHide
     * @param checkCount
     * @param gridLayout
     * @return
     */
    public static int btnHideListenner(View btnHide, int checkCount, GridLayout gridLayout) {
        final int[] finalI = {checkCount};
        btnHide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finalI[0]++;
                if (finalI[0] % 2 == 1) {
                    gridLayout.setVisibility(View.GONE);
                } else {
                    gridLayout.setVisibility(View.VISIBLE);
                }
            }
        });
        return finalI[0];
    }

    public static int[] smallWindowCheckListener(Context mContext,int num,int[] counts,String lotteryPage,TextView topPeilv) {
        tvTopPeilv=topPeilv;
        if (lotteryPage.equals("k3_yxxtb")){//点一下窗口直接出window弹窗的

        }else if(lotteryPage.equals("gd11x5_zx")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
                ArrayList<LinearLayout> btnGroup1=new ArrayList<>();
                ArrayList<LinearLayout> btnGroup2=new ArrayList<>();
                int[] limit=new int[]{0,0,0,0,0,0,0,0,0,0,0};
                for (int i=0;i<11;i++){
                    btnGroup1.add(CreatViews.BTN_BIEWS.get(i));
                }
                for (int i=11;i<22;i++){
                    btnGroup2.add(CreatViews.BTN_BIEWS.get(i));
                }
                for (int i=0;i<11;i++){
                    int finalI = i;
                    btnGroup1.get(i).setOnClickListener((View view)->{
                        if (counts[finalI] % 2 == 0) {
                            if (limit[finalI]==0){
                                btnGroup1.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                counts[finalI]++;
                                limit[finalI]++;
                            }
                        }else {
                            btnGroup1.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            counts[finalI]++;
                            limit[finalI]--;
                        }
                    });
                    btnGroup2.get(i).setOnClickListener((View view)->{
                        if (counts[finalI+11] % 2 == 0) {
                            if (limit[finalI]==0){
                                btnGroup2.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                counts[finalI+11]++;
                                limit[finalI]++;
                            }
                        }else {
                            btnGroup2.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            counts[finalI+11]++;
                            limit[finalI]--;
                        }
                    });
                }
            }else {
                ArrayList<LinearLayout> btnGroup1=new ArrayList<>();
                ArrayList<LinearLayout> btnGroup2=new ArrayList<>();
                ArrayList<LinearLayout> btnGroup3=new ArrayList<>();
                int[] limit=new int[]{0,0,0,0,0,0,0,0,0,0,0};
                for (int i=0;i<11;i++){
                    btnGroup1.add(CreatViews.BTN_BIEWS.get(i));
                }
                for (int i=11;i<22;i++){
                    btnGroup2.add(CreatViews.BTN_BIEWS.get(i));
                }
                for (int i=22;i<33;i++){
                    btnGroup3.add(CreatViews.BTN_BIEWS.get(i));
                }
                for (int i=0;i<11;i++){
                    int finalI = i;
                    btnGroup1.get(i).setOnClickListener((View view)->{
                        if (counts[finalI] % 2 == 0) {
                            if (limit[finalI]==0){
                                btnGroup1.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                counts[finalI]++;
                                limit[finalI]++;
                            }
                        }else {
                            btnGroup1.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            counts[finalI]++;
                            limit[finalI]--;
                        }
                    });
                    btnGroup2.get(i).setOnClickListener((View view)->{
                        if (counts[finalI+11] % 2 == 0) {
                            if (limit[finalI]==0){
                                btnGroup2.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                counts[finalI+11]++;
                                limit[finalI]++;
                            }
                        }else {
                            btnGroup2.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            counts[finalI+11]++;
                            limit[finalI]--;
                        }
                    });
                    btnGroup3.get(i).setOnClickListener((View view)->{
                        if (counts[finalI+22] % 2 == 0) {
                            if (limit[finalI]==0){
                                btnGroup3.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                counts[finalI+22]++;
                                limit[finalI]++;
                            }
                        }else {
                            btnGroup1.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            counts[finalI+22]++;
                            limit[finalI]--;
                        }
                    });
                }
            }
        }else if(lotteryPage.equals("klsf_lm")){
            ArrayList<LinearLayout> btnGroup1=new ArrayList<>();
            ArrayList<LinearLayout> btnGroup2=new ArrayList<>();
            int[] maxCount = {0};//记录窗口点击限制
            int singleSelect=6;//单选框个数
            final boolean[] isClickable = {true};
            for (int i=0;i<singleSelect;i++){
                btnGroup1.add(CreatViews.BTN_BIEWS.get(i));
            }
            for (int i=0;i<num-singleSelect;i++){
                btnGroup2.add(CreatViews.BTN_BIEWS.get(i+singleSelect));
            }
            for (int i=0;i<singleSelect;i++){
                int finalI = i;
                int finalI1 = i;
                btnGroup1.get(i).setOnClickListener((View view)->{
                    maxCount[0] =0;
                    isClickable[0] =true;
                    for (int j=0;j<singleSelect;j++){//清空上面
                        counts[j]=0;
                        btnGroup1.get(j).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                    for (int j=0;j<num-singleSelect;j++){//清空下面
                        counts[j+singleSelect]=0;
                        btnGroup2.get(j).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                    counts[finalI]++;
                    if (counts[finalI] % 2 == 1) {
                        CreatViews.BTN_BIEWS.get(finalI1).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                    }else {
                        CreatViews.BTN_BIEWS.get(finalI1).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                });
            }
            int[] countLimit=new int[]{7,7,7,7,5,5};
            for (int i=0;i<num-singleSelect;i++){//下面的按钮监听
                int finalI = i;
                btnGroup2.get(i).setOnClickListener((View view)->{
                    if (counts[finalI +singleSelect]%2==0){
                        if (isClickable[0]){
                            maxCount[0]++;
                            counts[finalI +singleSelect]++;
                            Log.e("maxCount", String.valueOf(maxCount[0]));
                            btnGroup2.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                        }
                    }else {
                        maxCount[0]--;
                        counts[finalI +singleSelect]++;
                        Log.e("maxCount", String.valueOf(maxCount[0]));
                        btnGroup2.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                    for (int j=0;j<singleSelect;j++){
                        if (counts[j]==1){
                            if (maxCount[0]<countLimit[j]){
                                isClickable[0] =true;
                            }else {
                                isClickable[0] =false;
                            }
                        }
                    }
                });
            }
        }else if(lotteryPage.equals("gd11x5_lm")){//连码
            ArrayList<LinearLayout> btnGroup1=new ArrayList<>();
            ArrayList<LinearLayout> btnGroup2=new ArrayList<>();
            int[] maxCount = {0};//记录窗口点击限制
            int singleSelect=9;//单选框个数
            final boolean[] isClickable = {true};
            for (int i=0;i<singleSelect;i++){
                btnGroup1.add(CreatViews.BTN_BIEWS.get(i));
            }
            for (int i=0;i<num-singleSelect;i++){
                btnGroup2.add(CreatViews.BTN_BIEWS.get(i+singleSelect));
            }
            for (int i=0;i<singleSelect;i++){
                int finalI = i;
                int finalI1 = i;
                btnGroup1.get(i).setOnClickListener((View view)->{
                    maxCount[0] =0;
                    isClickable[0] =true;
                    for (int j=0;j<singleSelect;j++){//清空上面
                        counts[j]=0;
                        btnGroup1.get(j).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                    for (int j=0;j<num-singleSelect;j++){//清空下面
                        counts[j+singleSelect]=0;
                        btnGroup2.get(j).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                    counts[finalI]++;
                    if (counts[finalI] % 2 == 1) {
                        CreatViews.BTN_BIEWS.get(finalI1).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                    }else {
                        CreatViews.BTN_BIEWS.get(finalI1).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                    }
                });
            }
            int[] countLimit=new int[]{2,3,4,5,6,7,8,5,5};
            for (int i=0;i<num-singleSelect;i++){//下面的按钮监听
                int finalI = i;
                    btnGroup2.get(i).setOnClickListener((View view)->{
                            if (counts[finalI +singleSelect]%2==0){
                                if (isClickable[0]){
                                    maxCount[0]++;
                                    counts[finalI +singleSelect]++;
                                    Log.e("maxCount", String.valueOf(maxCount[0]));
                                    btnGroup2.get(finalI).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                                }
                            }else {
                                maxCount[0]--;
                                counts[finalI +singleSelect]++;
                                Log.e("maxCount", String.valueOf(maxCount[0]));
                                btnGroup2.get(finalI).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            }
                            for (int j=0;j<singleSelect;j++){
                                if (counts[j]==1){
                                    if (maxCount[0]<countLimit[j]){
                                        isClickable[0] =true;
                                    }else {
                                        isClickable[0] =false;
                                    }
                                }
                            }
                    });
            }
        }else{
            for (int i = 0; i < num; i++) {
                int finalI = i;
                int finalI1 = i;
                Log.e("size", String.valueOf(CreatViews.BTN_BIEWS.size()));
                CreatViews.BTN_BIEWS.get(i).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        counts[finalI]++;
                        if (counts[finalI] % 2 == 1) {
                            CreatViews.BTN_BIEWS.get(finalI1).setBackgroundColor(mContext.getResources().getColor(R.color.colorPrimary));
                            if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")){
                                sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                topPeilv.setText("");
                                Log.e("mun", String.valueOf(sum));
                                if (sum>4&&sum<11){
                                   new Thread(){
                                       public void run(){
                                           resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZX3", "A", MainGlobalData.TOKEN);
                                           mHandler.sendEmptyMessage(0);

                                       }
                                   }.start();
                                }
                            }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_select6")){
                                sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                topPeilv.setText("");
                                Log.e("mun", String.valueOf(sum));
                                if (sum>3&&sum<9){
                                    new Thread(){
                                        public void run(){
                                            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZX6", "A", MainGlobalData.TOKEN);
                                            mHandler.sendEmptyMessage(1);

                                        }
                                    }.start();
                                }
                            }else if (MainGlobalData.LOTTERY_PAGE.equals("hk6_zxbz")){
                                sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                topPeilv.setText("");
                                Log.e("mun", String.valueOf(sum));
                                if (sum>4&&sum<12){
                                    new Thread(){
                                        public void run(){
                                            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZXBZ", "A", MainGlobalData.TOKEN);
                                            mHandler.sendEmptyMessage(2);

                                        }
                                    }.start();
                                }
                            }
                        }else {
                            CreatViews.BTN_BIEWS.get(finalI1).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                            if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")){
                                topPeilv.setText("");
                                int sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                Log.e("mun", String.valueOf(sum));
                                if (sum>4&&sum<11){
                                    new Thread(){
                                        public void run(){
                                            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZX3", "A", MainGlobalData.TOKEN);
                                            mHandler.sendEmptyMessage(0);

                                        }
                                    }.start();
                                }
                            }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_select6")){
                                sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                topPeilv.setText("");
                                Log.e("mun", String.valueOf(sum));
                                if (sum>3&&sum<9){
                                    new Thread(){
                                        public void run(){
                                            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZX6", "A", MainGlobalData.TOKEN);
                                            mHandler.sendEmptyMessage(1);

                                        }
                                    }.start();
                                }
                            }else if (MainGlobalData.LOTTERY_PAGE.equals("hk6_zxbz")){
                                sum=0;
                                for (int j=0;j<counts.length;j++){
                                    if (counts[j]%2==1){
                                        sum++;
                                    }
                                }
                                topPeilv.setText("");
                                Log.e("mun", String.valueOf(sum));
                                if (sum>4&&sum<12){
                                    new Thread(){
                                        public void run(){
                                            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(MainGlobalData.LOTTERY_TYPE, "ZXBZ", "A", MainGlobalData.TOKEN);
                                            mHandler.sendEmptyMessage(2);

                                        }
                                    }.start();
                                }
                            }
                        }
                    }
                });
            }
        }
        return counts;
    }

    /**
     * 下注确认
     * @param mContext
     * @param btnCheck
     * @param lvBets
     * @param isFengpan
     * @param dNumber
     * @param list
     * @param tvGames
     * @param tvSubs
     * @param peilvStrings
     * @param lotteryType
     * @param betWindow
     */
    public static void btnCheckListener(Context mContext,Button btnCheck,ListView lvBets,boolean isFengpan, String dNumber,
                                        ArrayList<Map<String, Object>> list, String[] tvGames, String[] tvSubs, String[] peilvStrings,
                                        String lotteryType, RelativeLayout betWindow,int[] counts,RelativeLayout betResultWindow,Button btnClose, ListView lvBetsResult) {
        mContextTemp=mContext;
        mList=list;
        mDnumber=dNumber;
        mBetResWindow=betResultWindow;
        mBtnClose=btnClose;
        mLvBetRes=lvBetsResult;
        mLvBets=lvBets;
        btnCheck.setOnClickListener((View view)->{
            if (isFengpan){
                Gson gson=new Gson();
                SaveBet saveBet = new SaveBet();
                saveBet.setDrawNumber(dNumber);
                saveBet.setLottery(lotteryType);
                ArrayList<SaveBet.bets> betses = new ArrayList<SaveBet.bets>();
                for (int i = 0; i < lvBets.getChildCount(); i++) {
                    EditText etAmount = (EditText) lvBets.getChildAt(i).findViewById(R.id.et_amount);
                    SaveBet.bets bets = new SaveBet.bets();
                    bets.setAmount(etAmount.getText().toString());
                    int index = (int) list.get(i).get("index");
                    if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_zx")&&MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
                        bets.setGame(tvGames[0]);
                        bets.setContents((String) list.get(index).get("content"));
                        bets.setOdds(peilvStrings[22]);
                    }else if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_zx")&&MainGlobalData.LOTTERY_SUBTITLE.equals("qszx")){
                        bets.setGame(tvGames[1]);
                        bets.setContents((String) list.get(index).get("content"));
                        bets.setOdds(peilvStrings[33]);
                    }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")||MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")||MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
                        bets.setGame(tvGames[0]);
                        bets.setContents((String) list.get(index).get("content"));
                        bets.setOdds(peilvStrings[20]);
                    }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_locate3")){
                        bets.setGame(tvGames[0]);
                        bets.setContents((String) list.get(index).get("content"));
                        bets.setOdds(peilvStrings[30]);
                    }else if (MainGlobalData.LOTTERY_PAGE.equals("hk6_lm")){
                        bets.setGame(tvGames[index]);
                        bets.setContents((String) list.get(0).get("content"));
                        bets.setOdds((String) list.get(0).get("peilv"));
                    }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")||MainGlobalData.LOTTERY_PAGE.equals("3D_select6")
                            ||MainGlobalData.LOTTERY_PAGE.equals("hk6_zxbz")){
                        bets.setGame(tvGames[index]);
                        bets.setContents((String) list.get(0).get("content"));
                        bets.setOdds(MainGlobalData.TOP_PEILV);
                    }else {
                        bets.setGame(tvGames[index]);
                        bets.setContents(tvSubs[index]);
                        bets.setOdds(peilvStrings[index]);
                    }
                    betses.add(bets);
                    //Log.e("etAmount",etAmount.getText().toString());
                }
                saveBet.setBets(betses);
                String bet = gson.toJson(saveBet, SaveBet.class);
                new Thread() {
                    public void run() {
                        betResult = new SoapServiceImpl().saveUserBetService(bet, MainGlobalData.TOKEN);
                        mHandler.sendEmptyMessage(3);
                        mBetWindow=betWindow;
                    }
                }.start();
                tvTopPeilv.setText("");
                //Toast.makeText(mContext, "下注成功！", Toast.LENGTH_SHORT).show();
                for (int i=0;i<counts.length;i++){
                    counts[i]=0;
                    CreatViews.BTN_BIEWS.get(i).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                }
               // betWindow.setVisibility(View.GONE);

            }else {
                Toast.makeText(mContext, "下注失败！", Toast.LENGTH_SHORT).show();
                for (int i=0;i<counts.length;i++){
                    counts[i]=0;
                    CreatViews.BTN_BIEWS.get(i).setBackground(mContext.getResources().getDrawable(R.drawable.activity_back));
                }
               // betWindow.setVisibility(View.GONE);
            }
        });
    }

    /**
     * 选择不同彩种
     * @param select1
     * @param mContext
     * @param mActivity
     */
    public static void select1Listner(LinearLayout select1,LinearLayout select2,LinearLayout select3, Context mContext, Activity mActivity, Intent mIntent, CountDownTimerUtil timer_fp,CountDownTimerUtil timer_kj) {
        HashMap<Integer,String[]>map=new HashMap<>();
        map.put(R.id.bjsc,new String[]{"BJPK10", "pk10_twoside",""});
        map.put(R.id.cqssc,new String[]{"CQSSC", "ssc_all",""});
        map.put(R.id.bjkl,new String[]{"BJKL8", "kl8_all",""});
        map.put(R.id.gxk,new String[]{"GXK3", "k3_dxtb",""});
        map.put(R.id.gxkl,new String[]{"GXKLSF", "gxklsf_twoside",""});
        map.put(R.id.gd,new String[]{"GD11X5", "gd11x5_twoside",""});
        map.put(R.id.xglhc,new String[]{"HK6", "hk6_tm","hk6_A"});
        map.put(R.id.xjssc,new String[]{"XJSSC", "ssc_all",""});
        map.put(R.id.tjssc,new String[]{"TJSSC", "ssc_all",""});
        map.put(R.id.gdkl,new String[]{"GDKLSF", "klsf_all",""});
        map.put(R.id.fc,new String[]{"F3D", "3D_main",""});
        map.put(R.id.tcpl,new String[]{"PL3", "3D_main",""});
        map.put(R.id.cqxync,new String[]{"XYNC", "klsf_all",""});
        select1.setOnClickListener((View view)->{
            PopupMenu popupMenu = new PopupMenu(mContext, view);
            popupMenu.getMenuInflater().inflate(R.menu.pop_menu_1, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener((MenuItem item)->{
                initDataAndRefresh(String.valueOf(map.get(item.getItemId())[0]),
                        String.valueOf(map.get(item.getItemId())[1]),String.valueOf(map.get(item.getItemId())[2]),
                        timer_fp,timer_kj,select1,select2,select3);
                return true;
            });
            popupMenu.show();
        });
    }

    private static void initDataAndRefresh(String lotteryType, String lotteryPage,String subTitle, CountDownTimerUtil timer_fp,CountDownTimerUtil timer_kj
    ,LinearLayout select1,LinearLayout select2,LinearLayout select3) {
        if (!lotteryType.equals("")){
            MainGlobalData.LOTTERY_TYPE=lotteryType;
        }
        if (!lotteryPage.equals("")){
            MainGlobalData.LOTTERY_PAGE=lotteryPage;
        }
        if (!subTitle.equals("")){
            MainGlobalData.LOTTERY_SUBTITLE=subTitle;
        }
        select1.setClickable(false);
        select2.setClickable(false);
        select3.setClickable(false);
        refreshActivity(timer_fp,timer_kj);
    }

    private static void refreshActivity( CountDownTimerUtil timer_fp,CountDownTimerUtil timer_kj) {
        timer_fp.cancel();
        timer_kj.cancel();
        PK10TwoSide.reLoadActivity();
    }

    public static void select2Listner(LinearLayout select1,LinearLayout select2,LinearLayout select3, Context mContext, Activity mActivity, String lotteryType,Intent mIntent,
                                      CountDownTimerUtil timer_fp,CountDownTimerUtil timer_kj) {
        ArrayList<String>lotteryTypes = new ArrayList<String>(Arrays.asList("BJPK10", "CQSSC", "XJSSC", "TJSSC",
                "BJKL8", "GXK3", "GXKLSF", "GD11X5", "GDKLSF","XYNC", "F3D", "PL3", "HK6"));
        ArrayList<Integer>menus=new ArrayList<Integer>(Arrays.asList(R.menu.beijingsaiche,R.menu.shishicai,
                R.menu.shishicai,R.menu.shishicai,R.menu.beijingkuaile,R.menu.guangxi,R.menu.guangxikuaileshifen,
                R.menu.guangdong,R.menu.guangdongkuaile,R.menu.guangdongkuaile,R.menu.fucai,R.menu.fucai,R.menu.hk6_menu));
        HashMap<Integer,String[]>map=new HashMap<>();
        map.put(R.id.lmp,new String[]{"BJPK10", "pk10_twoside",""});
        map.put(R.id.dh,new String[]{"BJPK10", "pk10_single",""});
        map.put(R.id.gyjzh,new String[]{"BJPK10", "pk10_championship",""});
        map.put(R.id.ball_all,new String[]{"", "ssc_all",""});
        map.put(R.id.ball_1,new String[]{"", "ssc_ball1",""});
        map.put(R.id.ball_2,new String[]{"", "ssc_ball2",""});
        map.put(R.id.ball_3,new String[]{"", "ssc_ball3",""});
        map.put(R.id.ball_4,new String[]{"", "ssc_ball4",""});
        map.put(R.id.ball_5,new String[]{"", "ssc_ball5",""});
        map.put(R.id.zh,new String[]{"", "kl8_all",""});
        map.put(R.id.zm,new String[]{"", "kl8_zm",""});
        map.put(R.id.dxtb,new String[]{"", "k3_dxtb",""});
        map.put(R.id.yxxtb,new String[]{"", "k3_yxxtb",""});
        map.put(R.id.gxkl_ball_two,new String[]{"", "gxklsf_twoside",""});
        map.put(R.id.gxkl_ball_single,new String[]{"", "gxklsf_single",""});
        map.put(R.id.gxkl_ball_1,new String[]{"", "gxklsf_ball1",""});
        map.put(R.id.gxkl_ball_2,new String[]{"", "gxklsf_ball2",""});
        map.put(R.id.gxkl_ball_3,new String[]{"", "gxklsf_ball3",""});
        map.put(R.id.gxkl_ball_4,new String[]{"", "gxklsf_ball4",""});
        map.put(R.id.gxkl_ball_5,new String[]{"", "gxklsf_ball5",""});
        map.put(R.id.gd11x5_two_side,new String[]{"", "gd11x5_twoside",""});
        map.put(R.id.gd11x5_single,new String[]{"", "gd11x5_single",""});
        map.put(R.id.gd11x5_lm,new String[]{"", "gd11x5_lm",""});
        map.put(R.id.gd11x5_zx,new String[]{"", "gd11x5_zx","qezx"});
        map.put(R.id.klsf_ball_all,new String[]{"", "klsf_all",""});
        map.put(R.id.klsf_ball_1,new String[]{"", "klsf_ball1",""});
        map.put(R.id.klsf_ball_2,new String[]{"", "klsf_ball2",""});
        map.put(R.id.klsf_ball_3,new String[]{"", "klsf_ball3",""});
        map.put(R.id.klsf_ball_4,new String[]{"", "klsf_ball4",""});
        map.put(R.id.klsf_ball_5,new String[]{"", "klsf_ball5",""});
        map.put(R.id.klsf_ball_6,new String[]{"", "klsf_ball6",""});
        map.put(R.id.klsf_ball_7,new String[]{"", "klsf_ball7",""});
        map.put(R.id.klsf_ball_8,new String[]{"", "klsf_ball8",""});
        map.put(R.id.klsf_zm,new String[]{"", "klsf_zm",""});
        map.put(R.id.klsf_lm,new String[]{"", "klsf_lm",""});
        map.put(R.id.zsp,new String[]{"", "3D_main",""});
        map.put(R.id.yzzh,new String[]{"", "3D_combin1",""});
        map.put(R.id.ezzh,new String[]{"", "3D_combin2",""});
        map.put(R.id.szzh,new String[]{"", "3D_combin3",""});
        map.put(R.id.yzdw,new String[]{"", "3D_locate1",""});
        map.put(R.id.ezdw,new String[]{"", "3D_locate2","3D_12"});
        map.put(R.id.szdw,new String[]{"", "3D_locate3",""});
        map.put(R.id.ezhs,new String[]{"", "3D_sum2","3D_bs"});
        map.put(R.id.szhs,new String[]{"", "3D_sum3",""});
        map.put(R.id.zxs,new String[]{"", "3D_select3",""});
        map.put(R.id.zxl,new String[]{"", "3D_select6",""});
        map.put(R.id.kd,new String[]{"", "3D_span",""});
        map.put(R.id.hk6_tm,new String[]{"", "hk6_tm","hk6_A"});
        map.put(R.id.hk6_srsx,new String[]{"", "hk6_srsx",""});
        map.put(R.id.hk6_tws,new String[]{"", "hk6_tws",""});
        map.put(R.id.hk6_zmt,new String[]{"", "hk6_zmt","hk6_z1t"});
        map.put(R.id.hk6_zm16,new String[]{"", "hk6_zm16",""});
        map.put(R.id.hk6_wx,new String[]{"", "hk6_wx",""});
        map.put(R.id.hk6_yxws,new String[]{"", "hk6_yxws","hk6_yx"});
        map.put(R.id.hk6_xiao_zheng,new String[]{"", "hk6_zhengxiao",""});
        map.put(R.id.hk6_7se,new String[]{"", "hk6_7sb",""});
        map.put(R.id.hk6_xiao_zong,new String[]{"", "hk6_zongxiao",""});
        map.put(R.id.hk6_zxbz,new String[]{"", "hk6_zxbz",""});
        map.put(R.id.hk6_dp,new String[]{"", "hk6_dp","hk6_lx2"});
        map.put(R.id.hk6_lm,new String[]{"", "hk6_lm",""});
        select2.setOnClickListener((View view)->{
            PopupMenu popupMenu = new PopupMenu(mContext, view);
            popupMenu.getMenuInflater().inflate(menus.get(lotteryTypes.indexOf(lotteryType)), popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener((MenuItem item)->{
                if (map.containsKey(item.getItemId())){
                    initDataAndRefresh(String.valueOf(map.get(item.getItemId())[0]),
                            String.valueOf(map.get(item.getItemId())[1]),String.valueOf(map.get(item.getItemId())[2]),
                            timer_fp,timer_kj,select1,select2,select3);
                }
                return false;
            });
            popupMenu.show();
        });

    }


    public static String calculateTime(long millisUntilFinished) {

        long deltTimeStamp = millisUntilFinished / 1000;
        long minute = deltTimeStamp / 60;
        long second = deltTimeStamp - minute * 60;
        String minuteString, secondString;
        if (minute < 10) {
            minuteString = "0" + String.valueOf(minute);
        } else {
            minuteString = String.valueOf(minute);
        }
        if (second < 10) {
            secondString = "0" + String.valueOf(second);
        } else {
            secondString = String.valueOf(second);
        }
        return minuteString + ":" + secondString;
    }


    public static void select3Listner(LinearLayout select1,LinearLayout select2,LinearLayout select3, Context mContext, Activity mActivity, String lotteryType, String lotteryPage,
                                      Intent intent, CountDownTimerUtil timer_fp, CountDownTimerUtil timer_kj) {
        ArrayList<String>lotteryPages = new ArrayList<String>(Arrays.asList("gd11x5_zx", "3D_locate2", "3D_sum2", "hk6_tm",
                "hk6_zmt", "hk6_yxws", "hk6_dp"));
        ArrayList<Integer>menus=new ArrayList<Integer>(Arrays.asList(R.menu.guangdong_extra,R.menu.fucai_6_extra,
                R.menu.fucai_8_extra,R.menu.tema,R.menu.zmt_menu,R.menu.menu_yxws,R.menu.menu_lxw));
        HashMap<Integer,String[]>map=new HashMap<>();
        map.put(R.id.qezx,new String[]{"","","qezx"});
        map.put(R.id.qszx,new String[]{"","","qszx"});
        map.put(R.id.bsdw,new String[]{"","","3D_12"});
        map.put(R.id.bgdw,new String[]{"","","3D_13"});
        map.put(R.id.sgdw,new String[]{"","","3D_23"});
        map.put(R.id.bs,new String[]{"","","3D_bs"});
        map.put(R.id.bg,new String[]{"","","3D_bg"});
        map.put(R.id.sg,new String[]{"","","3D_sg"});
        map.put(R.id.tm_a,new String[]{"","","hk6_A"});
        map.put(R.id.tm_b,new String[]{"","","hk6_B"});
        map.put(R.id.zmt_1,new String[]{"","","hk6_z1t"});
        map.put(R.id.zmt_2,new String[]{"","","hk6_z2t"});
        map.put(R.id.zmt_3,new String[]{"","","hk6_z3t"});
        map.put(R.id.zmt_4,new String[]{"","","hk6_z4t"});
        map.put(R.id.zmt_5,new String[]{"","","hk6_z5t"});
        map.put(R.id.zmt_6,new String[]{"","","hk6_z6t"});
        map.put(R.id.yx,new String[]{"","","hk6_yx"});
        map.put(R.id.ws,new String[]{"","","hk6_ws"});
        map.put(R.id.lx2,new String[]{"","","hk6_lx2"});
        map.put(R.id.lx3,new String[]{"","","hk6_lx3"});
        map.put(R.id.lx4,new String[]{"","","hk6_lx4"});
        map.put(R.id.lx5,new String[]{"","","hk6_lx5"});
        map.put(R.id.lw2,new String[]{"","","hk6_lw2"});
        map.put(R.id.lw3,new String[]{"","","hk6_lw3"});
        map.put(R.id.lw4,new String[]{"","","hk6_lw4"});
        map.put(R.id.lw5,new String[]{"","","hk6_lw5"});
        select3.setOnClickListener((View view)->{
            PopupMenu popupMenu = new PopupMenu(mContext, view);
            popupMenu.getMenuInflater().inflate(menus.get(lotteryPages.indexOf(lotteryPage)), popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener((MenuItem item)->{
                if (map.containsKey(item.getItemId())){
                    initDataAndRefresh(String.valueOf(map.get(item.getItemId())[0]),
                            String.valueOf(map.get(item.getItemId())[1]),String.valueOf(map.get(item.getItemId())[2]),
                            timer_fp,timer_kj,select1,select2,select3);
                }
                return false;
            });
            popupMenu.show();
        });

    }

    public static void setTopPeilv(TextView topPeilv, String[] peilvStrings) {
        if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_zx")&&MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
            topPeilv.setText(peilvStrings[22]);
        }else if (MainGlobalData.LOTTERY_PAGE.equals("gd11x5_zx")&&MainGlobalData.LOTTERY_SUBTITLE.equals("qszx")){
            topPeilv.setText(peilvStrings[33]);
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")||MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")||
                MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
            topPeilv.setText(peilvStrings[20]);
        }else if (MainGlobalData.LOTTERY_PAGE.equals("3D_locate3")){
            topPeilv.setText(peilvStrings[30]);
        }
    }

    public static int find(String[] arr,String str){
        boolean flag=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(str)) {
                flag=true;
                return i;
            }
        }
        if (flag==false) {
            return -1;
        }
        return -1;
    }

    public static int numSize;
    public static Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (msg.what==0){
                numSize=sum;
                String select3Str="ZX3_n";
                try {
                    JSONTokener jsonTokener = new JSONTokener(resPeilv);
                    JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
                    JSONObject fctcRes = fcTc.getJSONObject("result");
                    String resPei = fctcRes.getString(select3Str.replace("n",String.valueOf(numSize)));
                    MainGlobalData.TOP_PEILV=resPei;
                    tvTopPeilv.setText(resPei);
                    Log.e("loadPeilv", "finished");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else if (msg.what==1){
                numSize=sum;
                String select6Str="ZX6_n";
                try {
                    JSONTokener jsonTokener = new JSONTokener(resPeilv);
                    JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
                    JSONObject fctcRes = fcTc.getJSONObject("result");
                    String resPei = fctcRes.getString(select6Str.replace("n",String.valueOf(numSize)));
                    MainGlobalData.TOP_PEILV=resPei;
                    tvTopPeilv.setText(resPei);
                    Log.e("loadPeilv", "finished");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else if (msg.what==2){
                numSize=sum;
                String zxbzStr="ZXBZ_n";
                try {
                    JSONTokener jsonTokener = new JSONTokener(resPeilv);
                    JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
                    JSONObject fctcRes = fcTc.getJSONObject("result");
                    String resPei = fctcRes.getString(zxbzStr.replace("n",String.valueOf(numSize)));
                    MainGlobalData.TOP_PEILV=resPei;
                    tvTopPeilv.setText(resPei);
                    Log.e("loadPeilv", "finished");
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }else if (msg.what==3){
                Gson gson=new Gson();
                if (!betResult.equals("请求数据失败！")){
                    BetResult resBet = gson.fromJson(betResult, BetResult.class);
                    Log.e("betResult", betResult);
                    if (resBet.getResult()!=null){
                        mBetWindow.setVisibility(View.GONE);
                        resultWindowInit(mList,mLvBetRes,mBetResWindow,mBtnClose,mDnumber,resBet,mLvBets);
                        mBetResWindow.setVisibility(View.VISIBLE);
                        DecimalFormat df = new DecimalFormat("#.##");
                        MainGlobalData.USE_MONEY=String.valueOf(df.format(Double.parseDouble(resBet.getResult().getAccount().getBalance())));
                        MainGlobalData.DONGJIE_MONEY=String.valueOf(df.format(Double.parseDouble(resBet.getResult().getAccount().getBetting())));
                        MainGlobalData.REBATE=String.valueOf(df.format(Double.parseDouble(resBet.getResult().getAccount().getFreeze())));
                    }else {
                        mBetWindow.setVisibility(View.GONE);
                        Toast.makeText(mContextTemp.getApplicationContext(),resBet.getTip()==null?"下注成功":resBet.getTip(),Toast.LENGTH_SHORT).show();
                    }
                }else {
                    Toast.makeText(mContextTemp.getApplicationContext(),"下注失败",Toast.LENGTH_SHORT).show();
                }
            }
        }
    };

    private static void resultWindowInit(ArrayList<Map<String, Object>> mList, ListView mLvBetRes, RelativeLayout mBetResWindow,
                                         Button mBtnClose, String mDnumber,BetResult resBet,ListView mLvBets) {
        ArrayList<BetSuccess>resList=new ArrayList<>();
        int size=mList.size();
        List<String> ids = resBet.getResult().getIds();
        List<String> odds = resBet.getResult().getOdds();
        for (int i=0;i<size;i++){
            BetSuccess bet=new BetSuccess();
            bet.setBetId(ids.get(i));
            bet.setBetNum(mDnumber);
            bet.setBetGame(String.valueOf(mList.get(i).get("content")));
            bet.setBetOdd(String.valueOf(mList.get(i).get("peilv")));
            EditText etAmount = (EditText) mLvBets.getChildAt(i).findViewById(R.id.et_amount);
            bet.setBetMoney(etAmount.getText().toString());
            resList.add(bet);
        }
        BetResAdapter adapter = new BetResAdapter(mContextTemp, resList);
        mLvBetRes.setAdapter(adapter);
        adapter.notifyDataSetChanged();
    }

    public static void btnCloseLisener(Context mContext, Button btnClose, ListView lvBetsResult, String dNumber, ArrayList<Map<String, Object>> list) {
        btnClose.setOnClickListener((View v)->{
            mBetResWindow.setVisibility(View.GONE);
            PK10TwoSide.reLoadTopTitle();
        });
    }
}
