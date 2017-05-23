package com.yb7001.web.myproject.global;


import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class GenerateView {
    private static ArrayList<String> tvPeilvs,titles,contens;
    private static View[] mBuys;
    public static Drawable pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10;
    private static Drawable[] pics;

    public static View[] generateView(String lotteryType, String lotteryPage, Context mContext, Activity mActivity) {
        View mLayoutInflate = mActivity.findViewById(R.id.layout_select_3);
        View select3 = mLayoutInflate.findViewById(R.id.select_3);
        View topPeilv = mLayoutInflate.findViewById(R.id.top_peilv);
        View topPeilvPre = mLayoutInflate.findViewById(R.id.top_peilv_pre);
        topPeilv.setVisibility(View.VISIBLE);
        topPeilvPre.setVisibility(View.VISIBLE);
        select3.setVisibility(View.VISIBLE);
        mLayoutInflate.setVisibility(View.GONE);
        String methodName="generate"+ MainGlobalData.LOTTERY_TYPE.substring(2)+MainGlobalData.LOTTERY_PAGE;
        Class<GenerateView>generateViewClass=GenerateView.class;
        try {
            Method method=generateViewClass.getMethod(methodName,String.class,String.class,Context.class,Activity.class,View.class,View.class,View.class,View.class);
            method.invoke(generateViewClass.newInstance(),lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return mBuys;
    }
    public static void generate6hk6_zxbz(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        select3.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[49];
        for (int i=0;i<49;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"选择"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithThreeColorBack1To49(49, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_lm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{  "三中二","二中特","三全中","二全中","特串","四全中"};
        String[] string2 = new String[49];
        for (int i=0;i<49;i++){
            string2[i]=String.valueOf(i+1);
        }
        String[]  tvTitles = new String[]{"","选择"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            View gridBar = mInflates[i].findViewById(R.id.grid_bar);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                gridBar.setVisibility(View.GONE);
                CreatViews.creatHK6LmTopView(6, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoupsWithThreeColorBack1To49(49, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_dp(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        topPeilv.setVisibility(View.GONE);
        topPeilvPre.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"};
        String[] string2 = new String[]{ "0尾", "5尾", "1尾", "6尾", "2尾", "7尾", "3尾", "8尾", "4尾", "9尾"};
        String[] tvTitles = new String[]{"选择"};
        ArrayList<String> subTitles = new ArrayList<String>(Arrays.asList("hk6_lx2", "hk6_lx3", "hk6_lx4", "hk6_lx5", "hk6_lw2", "hk6_lw3",
                "hk6_lw4", "hk6_lw5"));
        String[] tvs = new String[]{"二连肖", "三连肖", "四连肖", "五连肖", "二连尾", "三连尾", "四连尾", "五连尾"};
        int index=subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE);
        tvSelect3.setText(tvs[index]);
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (index<4){
                CreatViews.creatViewSrsx(12, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewYxWs0To9W(10, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_zongxiao(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{  "2肖","3肖","4肖","5肖","6肖","7肖","总肖单","总肖双"};
        String[]  tvTitles = new String[]{"总肖"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_7sb(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "红波","蓝波","绿波","和局"};
        String[]  tvTitles = new String[]{"7色波"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(4, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_yxws(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        topPeilv.setVisibility(View.GONE);
        topPeilvPre.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"};
        String[] string2 = new String[]{ "0尾", "5尾", "1尾", "6尾", "2尾", "7尾", "3尾", "8尾", "4尾", "9尾"};
        String[] tvTitles = new String[]{"一肖尾数"};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
            tvSelect3.setText("一肖");
        }else {
            tvSelect3.setText("尾数");
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
                CreatViews.creatViewSrsx(12, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewYxWs0To9W(10, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_wx(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{  "金","木","水","火","土"};
        String[]  tvTitles = new String[]{"五行 种类"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewWx(5, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_zm16(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[6];
        for (int i = 0; i < 6; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{  "单码","双码","大码","小码","合单","合双","合大","合小","红波","蓝波","绿波","尾大","尾小"};
        String[]  tvTitles = new String[]{"正码一","正码二","正码三","正码四","正码五","正码六"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(13, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_zmt(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        topPeilv.setVisibility(View.GONE);
        topPeilvPre.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[49];
        for (int i=0;i<49;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles =new String[2];
        ArrayList<String> subTitles = new ArrayList<String>(Arrays.asList("hk6_z1t", "hk6_z2t", "hk6_z3t", "hk6_z4t", "hk6_z5t", "hk6_z6t"));
        String[] mTitles = new String[]{"正一特", "正二特", "正三特", "正四特", "正五特", "正六特"};
        String[] string2 = new String[]{ "正1-大","正1-单","正1-合单","正1-小","正1-双","正1-合双","正1-红","正1-蓝","正1-绿"};
        int index=subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE);
        tvTitles[0]=mTitles[index]+" 正码";
        tvTitles[1]="两面";
        tvSelect3.setText(mTitles[index]);
        for (int i=0;i<9;i++){
            string2[i].replace("1",String.valueOf(index+1));
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoupsWithThreeColorBack1To49(49, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(9, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }

    }

    public static void generate6hk6_tws(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{  "0头","1尾","6尾","1头","2尾","7尾","2头","3尾","8尾","3头",
                "4尾","9尾","4头","5尾","0尾"};
        String[] tvTitles=new String[]{"种类"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(15, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generate6hk6_zhengxiao(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"};
        String[] tvTitles=new String[]{};
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
            tvTitles = new String[]{"十二生肖"};
        }else{
            tvTitles = new String[]{"正肖"};
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewSrsx(12, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate6hk6_srsx(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"};
        String[] tvTitles=new String[]{};
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
             tvTitles = new String[]{"十二生肖"};
        }else{
            tvTitles = new String[]{"正肖"};
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewSrsx(12, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generate6hk6_tm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        topPeilv.setVisibility(View.GONE);
        topPeilvPre.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[49];
        for (int i=0;i<49;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] string2 = new String[]{ "特大", "特小", "特尾大", "特尾小", "特单", "特双", "特大单", "特大双",
                "特合大", "特合小", "特小单", "特小双", "特合单", "特合双"};
        String[]  tvTitles = new String[]{"特码","两面"};
        for (int i=0;i<63;i++){
            if (i<49){
                titles.add(tvTitles[0]);
            }else {
                titles.add(tvTitles[1]);
            }
        }
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_A")){
            tvSelect3.setText("特码A");
        }else{
            tvSelect3.setText("特码B");
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoupsWithThreeColorBack1To49(49, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(14, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }

    }
    public static void generate11X5gd11x5_zx(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        mLinear.removeAllViews();
        View[] mInflates;
        int[] checkCounts;
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
            mInflates = new View[2];
            for (int i = 0; i < 2; i++) {
                View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
                mInflates[i] = mInflate;
            }
            tvSelect3.setText("前二直选");
            checkCounts = new int[]{0,0};
        }else {
            mInflates = new View[3];
            for (int i = 0; i < 3; i++) {
                View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
                mInflates[i] = mInflate;
            }
            tvSelect3.setText("前三直选");
            checkCounts = new int[]{0,0,0};
        }
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[11];
        for (int i=0;i<11;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"第一球","第二球","第三球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            btnHide.setVisibility(View.GONE);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithBlueBack0to9(11, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate11X5gd11x5_lm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "任选二中二","任选三中三","任选四中四","任选五中五","任选六中五","任选七中五","任选八中五","前二组选","前三组选"};
        String[] string2 = new String[11];
        for (int i=0;i<11;i++){
            string2[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"","选择"};
        for (int i = 0; i < mInflates.length; i++) {
            if (i==0){
                View bar = mInflates[i].findViewById(R.id.grid_bar);
                bar.setVisibility(View.GONE);
            }
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            btnHide.setVisibility(View.GONE);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(9, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoupsWithBlueBack0to9(11, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateD3D_sum2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        topPeilv.setVisibility(View.GONE);
        topPeilvPre.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "0~4","5","6","7","8","9","10","11","12","13","14~18"};
        String[] string2 = new String[10];
        for (int i=0;i<10;i++){
            string2[i]=String.valueOf(i);
        }
        String[] tvTitles =new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bs")){
            tvTitles = new String[]{"佰拾和数","佰拾和数尾数"};
            tvSelect3.setText("佰拾定位");
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bg")){
            tvTitles = new String[]{"佰个和数","佰个和数尾数"};
            tvSelect3.setText("佰个定位");
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_sg")){
            tvSelect3.setText("拾个定位");
            tvTitles = new String[]{"拾个和数","拾个和数尾数"};
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(11, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_locate3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        select3.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        mLinear.removeAllViews();
        View[] mInflates = new View[3];
        for (int i = 0; i < 3; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] tvTitles = new String[]{"佰位","拾位","个位"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            btnHide.setVisibility(View.GONE);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_locate2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        mLayoutInflate.setVisibility(View.VISIBLE);
        TextView tvSelect3 = (TextView) mLayoutInflate.findViewById(R.id.tv_select_3);
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] tvTitles =new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")){
             tvTitles = new String[]{"佰位","拾位"};
             tvSelect3.setText("佰拾定位");
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")){
            tvTitles = new String[]{"佰位","个位"};
            tvSelect3.setText("佰个定位");
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
            tvSelect3.setText("拾个定位");
            tvTitles = new String[]{"拾位","个位"};
        }
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            btnHide.setVisibility(View.GONE);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithBlueBack0to9(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_span(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] tvTitles = new String[]{"跨度"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_sum3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "0~6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21~27"};
        String[] string2 = new String[10];
        for (int i=0;i<10;i++){
            string2[i]=String.valueOf(i);
        }
        String[] tvTitles = new String[]{"三字和数","三字和数尾数"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(16, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_locate1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[3];
        for (int i = 0; i < 3; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] tvTitles = new String[]{"佰","拾","个"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_combin3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[10];
        for (int i = 0; i < 10; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0,0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "000", "001", "002", "003", "004", "005", "006", "007", "008", "009",
                "011", "012", "013", "014", "015", "016", "017", "018", "019", "022",
                "023", "024", "025", "026", "027", "028", "029", "033", "034", "035",
                "036", "037", "038", "039", "044", "045", "046", "047", "048", "049",
                "055", "056", "057", "058", "059", "066", "067", "068", "069", "077",
                "078", "079", "088", "089", "099"};
        String[] string2 = new String[]{"111", "112", "113", "114", "115",
                "116", "117", "118", "119", "122", "123", "124", "125", "126", "127",
                "128", "129", "133", "134", "135", "136", "137", "138", "139", "144",
                "145", "146", "147", "148", "149", "155", "156", "157", "158", "159",
                "166", "167", "168", "169", "177", "178", "179", "188", "189", "199"};
        String[] string3 = new String[]{"222", "223", "224", "225", "226", "227", "228", "229", "233", "234",
                "235", "236", "237", "238", "239", "244", "245", "246", "247", "248",
                "249", "255", "256", "257", "258", "259", "266", "267", "268", "269",
                "277", "278", "279", "288", "289", "299"};
        String[] string4 = new String[]{"333", "334", "335", "336",
                "337", "338", "339", "344", "345", "346", "347", "348", "349", "355",
                "356", "357", "358", "359", "366", "367", "368", "369", "377", "378",
                "379", "388", "389", "399"};
        String[] string5 = new String[]{"444", "445", "446", "447", "448", "449",
                "455", "456", "457", "458", "459", "466", "467", "468", "469", "477",
                "478", "479", "488", "489", "499"};
        String[] string6 = new String[]{"555", "556", "557", "558", "559",
                "566", "567", "568", "569", "577", "578", "579", "588", "589", "599"};
        String[] string7 = new String[]{"666", "667", "668", "669", "677", "678", "679", "688", "689", "699"};
        String[] string8 = new String[]{ "777", "778", "779", "788", "789", "799"};
        String[] string9 = new String[]{"888", "889", "899"};
        String[] string10 = new String[]{"999"};
        String[] tvTitles = new String[]{"三字组合","三字组合","三字组合","三字组合","三字组合","三字组合","三字组合","三字组合","三字组合","三字组合"};
        ArrayList<String[]>strings=new ArrayList<>();
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        strings.add(string4);
        strings.add(string5);
        strings.add(string6);
        strings.add(string7);
        strings.add(string8);
        strings.add(string9);
        strings.add(string10);
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(strings.get(i).length, mActivity, gridLayout, titles, contens,strings.get(i));
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_combin2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"00","01","02","03","04","05","06","07","08","09",
                "11","12","13","14","15","16","17","18","19","22",
                "23","24","25","26","27","28","29","33","34","35",
                "36","37","38","39","44","45","46","47","48","49",
                "55","56","57","58","59","66","67","68","69","77",
                "78","79","88","89","99"};
        String[] tvTitles = new String[]{"二字组合"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(55, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateD3D_select6(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        select3.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] tvTitles = new String[]{"选择"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithBlueBack0to9(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generate33D_select6(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_select6(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }

    public static void generateD3D_select3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        select3.setVisibility(View.GONE);
        mLayoutInflate.setVisibility(View.VISIBLE);
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] tvTitles = new String[]{"选择"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithBlueBack0to9(10, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generate33D_select3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_select3(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateD3D_combin1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[4];
        for (int i = 0; i < 4; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] string2 = new String[]{"大","小","单","双","质","合"};
        String[] tvTitles = new String[]{"一字组合", "两面 佰", "两面 拾", "两面 个"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i == 0) {
                CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string1);
            }else{
                CreatViews.creatViewGoups(6, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;

        }
    }
    public static void generateD3D_main(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[7];
        for (int i = 0; i < 7; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[10];
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] string2 = new String[]{"佰大小","拾大小","个大小","佰拾和尾数","佰个和尾数","拾个和尾数","佰拾个和数","佰拾个和尾数"};
        String[] string3 = new String[]{"佰单双","拾单双","个单双","佰拾","佰个","拾个","佰拾个"};
        String[] string4 = new String[]{"佰质合","拾质合","个质合","佰拾和尾数","佰个和尾数","拾个和尾数","佰拾个和尾数"};
        String[] tvTitles = new String[]{"一字组合", "大", "小", "单", "双", "质", "合"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i == 0) {
                CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string1);
            }else if(i==1||i ==2){
                CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string2);
            }else if(i==3||i ==4){
                CreatViews.creatViewGoups(7, mActivity, gridLayout, titles, contens, string3);
            }else{
                CreatViews.creatViewGoups(7, mActivity, gridLayout, titles, contens, string4);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;

        }
    }

    public static void generate33D_sum2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_sum2(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_locate3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_locate3(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_locate2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_locate2(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_span(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_span(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_sum3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_sum3(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_locate1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_locate1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_combin3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_combin3(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_combin2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_combin2(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_combin1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_combin1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generate33D_main(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateD3D_main(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }

    public static void generateKLSFklsf_lm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "任选二","选二连组","任选三","选三前组","任选四","任选五"};
        String[] string2 = new String[20];
        for (int i=0;i<20;i++){
            string2[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"","选择"};
        for (int i = 0; i < mInflates.length; i++) {
            if (i==0){
                View bar = mInflates[i].findViewById(R.id.grid_bar);
                bar.setVisibility(View.GONE);
            }
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            btnHide.setVisibility(View.GONE);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(6, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.createKLSFblueAndRed(20, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateKLSFklsf_zm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[20];
        for (int i=0;i<20;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] string2 = new String[]{"总和大", "总和单", "总和尾大", "总和小", "总和双", "总和尾小"};
        String[] tvTitles = new String[]{"正码", "总和"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.createKLSFblueAndRed(20, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(6, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateKLSFklsf_ball1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[2];
        for (int i = 0; i < 2; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[20];
        for (int i=0;i<20;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] string2 = new String[]{"大", "小", "单", "双","尾大","尾小","合数单","合数双",
                "东","南","西","北","中","发","白","龙","虎"};
        String[] string3 = new String[]{"大", "小", "单", "双","尾大","尾小","合数单","合数双",
                "东","南","西","北","中","发","白"};
        String[] tvTitles = new String[]{"球号", "两面"};
        if (lotteryPage.equals("klsf_ball1")||lotteryPage.equals("klsf_ball2")||lotteryPage.equals("klsf_ball3")||
                lotteryPage.equals("klsf_ball4")){
            for (int i = 0; i < mInflates.length; i++) {
                View btnHide = mInflates[i].findViewById(R.id.btn_hide);
                View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
                TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);

                GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
                tvTitle.setText(tvTitles[i]);
                if (i==0){
                    CreatViews.createKLSFblueAndRed(20, mActivity, gridLayout, titles, contens, string1);
                }else {
                    CreatViews.creatViewGoups(17, mActivity, gridLayout, titles, contens, string2);
                }
                mLinear.addView(mInflates[i]);
                checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
                mBuys[i]=btnBuy;
            }
        }else {
            for (int i = 0; i < mInflates.length; i++) {
                View btnHide = mInflates[i].findViewById(R.id.btn_hide);
                View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
                TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);

                GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
                tvTitle.setText(tvTitles[i]);
                if (i==0){
                    CreatViews.createKLSFblueAndRed(20, mActivity, gridLayout, titles, contens, string1);
                }else {
                    CreatViews.creatViewGoups(15, mActivity, gridLayout, titles, contens, string3);
                }
                mLinear.addView(mInflates[i]);
                checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
                mBuys[i]=btnBuy;
            }
        }
    }
    public static void generateKLSFklsf_ball2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball4(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball5(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball6(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball7(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_ball8(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFklsf_single(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[8];
        for (int i = 0; i < 8; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[20];
        for (int i=0;i<20;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"第一球", "第二球", "第三球", "第四球", "第五球", "第六球", "第七球", "第八球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
           CreatViews.createKLSFblueAndRed(20, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateKLSFklsf_all(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[9];
        for (int i = 0; i < 9; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0,0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"总和大", "总和小", "总和单", "总和双", "总和尾大", "总和尾小"};
        String[] string2 = new String[]{ "大", "小", "单", "双", "尾大", "尾小", "合数单", "合数双", "龙", "虎"};
        String[] string3 = new String[]{ "大", "小", "单", "双", "尾大", "尾小", "合数单", "合数双"};
        String[] tvTitles = new String[]{"总和", "第一球", "第二球", "第三球", "第四球", "第五球", "第六球", "第七球", "第八球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(6, mActivity, gridLayout, titles, contens, string1);
            }else if (i>0&&i<5){
                CreatViews.creatViewGoups(10, mActivity, gridLayout, titles, contens, string2);
            }else {
                CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string3);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateNCklsf_lm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_lm(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_zm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_zm(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball4(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball5(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball6(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball7(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_ball8(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_single(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_single(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateNCklsf_all(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFklsf_all(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }

    public static void generate11X5gd11x5_single(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[6];
        for (int i = 0; i < 6; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[11];
        for (int i=0;i<11;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"-中—", "第一球", "第二球", "第三球", "第四球", "第五球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.create11X5WithBlueCircle(11, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generate11X5gd11x5_twoside(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[6];
        for (int i = 0; i < 6; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "总和大", "总和小", "总和单", "总和双", "总和尾大", "总和尾小", "虎", "龙"};
        String[] string2 = new String[]{ "大", "小", "单", "双"};
        String[] tvTitles = new String[]{"总和", "第一球", "第二球", "第三球", "第四球", "第五球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i == 0) {
                CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string1);

            }else {
                CreatViews.creatViewGoups(4, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateKLSFgxklsf_ball1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10","11","12","13","14","15","16","17","18","19","20","21","红","绿","蓝","福","禄","寿","喜","大","小","单","双","尾大","尾小","合单","合双"};
        String[] tvTitles = new String[]{"球号"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithThreeColorAndText(36, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateKLSFgxklsf_ball2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFgxklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFgxklsf_ball3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFgxklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFgxklsf_ball4(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFgxklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }
    public static void generateKLSFgxklsf_ball5(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateKLSFgxklsf_ball1(lotteryType,lotteryPage,mContext,mActivity,select3,mLayoutInflate,topPeilv,topPeilvPre);
    }

    public static void generateKLSFgxklsf_single(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[5];
        for (int i = 0; i < 5; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[21];
        for (int i=0;i<21;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"第一球","第二球","第三球","第四球","第五球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithThreeColor(21, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateKLSFgxklsf_twoside(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[6];
        for (int i = 0; i < 6; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"总和单","总和双", "总和大","总和小","总尾大","总尾小","龙","虎"};
        String[] string2 = new String[]{ "大", "小", "单", "双", "尾大", "尾小", "合单", "合双"};
        String[] tvTitles = new String[]{"总和、龙虎", "第一球", "第二球", "第三球", "第四球", "第五球"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i == 0) {
                CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string1);
            }else {
                CreatViews.creatViewGoups(8, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateK3k3_yxxtb(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        pic1 = mContext.getResources().getDrawable(R.drawable.yxx_03);
        pic2 = mContext.getResources().getDrawable(R.drawable.yxx_05);
        pic3 = mContext.getResources().getDrawable(R.drawable.yxx_07);
        pic4 = mContext.getResources().getDrawable(R.drawable.yxx_12);
        pic5 = mContext.getResources().getDrawable(R.drawable.yxx_13);
        pic6 = mContext.getResources().getDrawable(R.drawable.yxx_14);
        pics = new Drawable[]{pic1, pic2, pic3, pic4, pic5, pic6};
        String[] tvTitles = new String[]{"三军、大小","围骰、全骰","点数","长牌","短牌"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.createK3YxxWith1Pic(6,mActivity,gridLayout,titles, contens,pics);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateK3k3_dxtb(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[5];
        for (int i = 0; i < 5; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        pic1 = mContext.getResources().getDrawable(R.drawable.ball_4_01);
        pic2 = mContext.getResources().getDrawable(R.drawable.ball_4_02);
        pic3 = mContext.getResources().getDrawable(R.drawable.ball_4_03);
        pic4 = mContext.getResources().getDrawable(R.drawable.ball_4_04);
        pic5 = mContext.getResources().getDrawable(R.drawable.ball_4_05);
        pic6 = mContext.getResources().getDrawable(R.drawable.ball_4_06);
        pics = new Drawable[]{pic1, pic2, pic3, pic4, pic5, pic6};
        String[] string1 = new String[]{"大","小"};
        String[] string2 = new String[]{"全骰"};
        String[] string3 = new String[]{"4点","5点","6点","7点","8点","9点","10点","11点","12点","13点","14点","15点","16点","17点"};
        String[] tvTitles = new String[]{"三军、大小","围骰、全骰","点数","长牌","短牌"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.createK3With1Pic(8,mActivity,gridLayout,titles, contens,pics,string1);
            }else if (i==1){
                CreatViews.createK3With3Pic(7, mActivity, gridLayout, titles, contens, pics,string2);
            }else if (i==2){
                CreatViews.creatViewGoups(14, mActivity, gridLayout, titles, contens, string3);
            }else if (i==3) {
                CreatViews.createK3With2PicDif(15, mActivity, gridLayout, titles, contens, pics);
            }else {
                CreatViews.createK3With2PicSame(6, mActivity, gridLayout, titles, contens, pics);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateKL8kl8_zm(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[80];
        for (int i=0;i<80;i++){
            string1[i]=String.valueOf(i+1);
        }
        String[] tvTitles = new String[]{"正码"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithBlueBack0to9(80, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateKL8kl8_all(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[4];
        for (int i = 0; i < 4; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "总和大", "总和小", "总和单", "总和双", "总和810", "总大单", "总大双", "总小单", "总小双"};
        String[] string2 = new String[]{"前(多)", "後(多)", "前後(和)"};
        String[] string3 = new String[]{"单(多)", "双(多)", "单双(和)"};
        String[] string4 = new String[]{"金", "木", "水", "火", "土"};
        String[] tvTitles = new String[]{"总和","前后和","单双和","五行"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(9, mActivity, gridLayout, titles, contens, string1);
            }else if (i==1){
                CreatViews.creatViewGoups(3, mActivity, gridLayout, titles, contens, string2);
            }else if (i==2){
                CreatViews.creatViewGoups(3, mActivity, gridLayout, titles, contens, string3);
            }else {
                CreatViews.creatViewGoups(5, mActivity, gridLayout, titles, contens, string4);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generateSSCssc_ball1(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[5];
        for (int i = 0; i < 5; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{ "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        for (int i=0;i<10;i++){
            string1[i]=String.valueOf(i);
        }
        String[] string2 = new String[]{"大", "小", "单", "双", "总和大", "总和小", "总和单", "总和双", "龙", "虎", "和"};
        String[] string3 = new String[]{"豹子", "顺子", "对子", "半顺", "杂六"};
        String[] tvTitles = new String[]{"球号","两面","前三","中三","后三"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoupsWithBlueBack0to9(10, mActivity, gridLayout, titles, contens, string1);
            }else if (i==1){
                CreatViews.creatViewGoups(11, mActivity, gridLayout, titles, contens, string2);
            }else {
                CreatViews.creatViewGoups(5, mActivity, gridLayout, titles, contens, string3);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }
    public static void generateSSCssc_ball2(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateSSCssc_ball1(lotteryType,  lotteryPage,  mContext,  mActivity, select3,  mLayoutInflate,  topPeilv,  topPeilvPre);
    }
    public static void generateSSCssc_ball3(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateSSCssc_ball1(lotteryType,  lotteryPage,  mContext,  mActivity, select3,  mLayoutInflate,  topPeilv,  topPeilvPre);
    }
    public static void generateSSCssc_ball4(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateSSCssc_ball1(lotteryType,  lotteryPage,  mContext,  mActivity, select3,  mLayoutInflate,  topPeilv,  topPeilvPre);
    }
    public static void generateSSCssc_ball5(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        generateSSCssc_ball1(lotteryType,  lotteryPage,  mContext,  mActivity, select3,  mLayoutInflate,  topPeilv,  topPeilvPre);
    }

    public static void generateSSCssc_all(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[9];
        for (int i = 0; i < 9; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0,0,0,0,0,0,0,0,0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"总和大", "总和小", "总和单", "总和双", "龙", "虎", "和"};
        String[] string2 = new String[]{"大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        String[] string3 = new String[]{"豹子", "顺子", "对子", "半顺", "杂六"};
        String[] tvTitles = new String[]{"总和-龙虎和","第一球","第二球","第三球","第四球","第五球","前三","中三","后三"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i==0){
                CreatViews.creatViewGoups(7, mActivity, gridLayout, titles, contens, string1);
            }else if (i>0&&i<6){
                CreatViews.creatViewGoupsWithBlueBack(14, mActivity, gridLayout, titles, contens, string2);
            }else {
                CreatViews.creatViewGoups(5, mActivity, gridLayout, titles, contens, string3);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public static void generatePK10pk10_championship(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[1];
        for (int i = 0; i < 1; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "冠亚大",
                "冠亚小", "冠亚单", "冠亚双"};
        String[] tvTitles = new String[]{"冠、亚军和"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoups(21, mActivity, gridLayout, titles, contens, string1);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public  void generatePK10pk10_single(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        pics = new Drawable[10];
        View[] mInflates = new View[10];
        int[] ids = new int[]{R.drawable.num_1, R.drawable.num_2, R.drawable.num_3, R.drawable.num_4, R.drawable.num_5, R.drawable.num_6
                , R.drawable.num_7, R.drawable.num_8, R.drawable.num_9, R.drawable.num_10};
        for (int i=0;i<10;i++){
            Drawable pic = mContext.getResources().getDrawable(ids[i]);
            pics[i]=pic;
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] tvTitles = new String[]{"冠军", "亚军", "第三名", "第四名", "第五名", "第六名", "第七名", "第八名", "第九名", "第十名"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            CreatViews.creatViewGoupsWithPic(10, mActivity, gridLayout, titles, contens, pics);
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;
        }
    }

    public  void generatePK10pk10_twoside(String lotteryType, String lotteryPage, Context mContext, Activity mActivity,View select3, View mLayoutInflate, View topPeilv, View topPeilvPre) {
        LinearLayout mLinear = (LinearLayout) mActivity.findViewById(R.id.box);
        mLinear.removeAllViews();
        View[] mInflates = new View[11];
        for (int i = 0; i < 11; i++) {
            View mInflate = View.inflate(mActivity, R.layout.bet_basic_window, null);
            mInflates[i] = mInflate;
        }
        int[] checkCounts = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        tvPeilvs = new ArrayList<>();
        titles = new ArrayList<>();
        contens = new ArrayList<>();
        mBuys=new View[mInflates.length];
        String[] string1 = new String[]{"冠亚大", "冠亚小", "冠亚单", "冠亚双"};
        String[] string2 = new String[]{"大", "小", "单", "双", "龙", "虎"};
        String[] tvTitles = new String[]{"冠、亚军和", "冠军", "亚军", "第三名", "第四名", "第五名", "第六名", "第七名", "第八名", "第九名", "第十名"};
        for (int i = 0; i < mInflates.length; i++) {
            View btnHide = mInflates[i].findViewById(R.id.btn_hide);
            View btnBuy = mInflates[i].findViewById(R.id.btn_buy);
            TextView tvTitle = (TextView) mInflates[i].findViewById(R.id.tv_title);
            GridLayout gridLayout = (GridLayout) mInflates[i].findViewById(R.id.grid_layout);
            tvTitle.setText(tvTitles[i]);
            if (i == 0) {
                CreatViews.creatViewGoups(4, mActivity, gridLayout, titles, contens, string1);

            } else if (i > 0 && i < 6) {
                CreatViews.creatViewGoups(6, mActivity, gridLayout, titles, contens, string2);

            } else {
                CreatViews.creatViewGoups(4, mActivity, gridLayout, titles, contens, string2);
            }
            mLinear.addView(mInflates[i]);
            checkCounts[i] = MainGlobalData.btnHideListenner(btnHide, checkCounts[i], gridLayout);
            mBuys[i]=btnBuy;

        }
    }


}
