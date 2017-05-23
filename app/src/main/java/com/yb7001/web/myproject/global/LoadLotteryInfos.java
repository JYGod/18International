package com.yb7001.web.myproject.global;


import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yb7001.web.myproject.R;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class LoadLotteryInfos {

    public static Drawable pic1, pic2, pic3, pic4, pic5, pic6, pic7, pic8, pic9, pic10;
    private static Drawable[] pics;
    private static ImageView[] ivs;
    private static TextView[] tvs1,tvs2,tvs;

    public static Drawable[] getPK10Drawables(Context mContex){
        int[]ids=new int[]{R.drawable.num_1,R.drawable.num_2,R.drawable.num_3,R.drawable.num_4,R.drawable.num_5,
                R.drawable.num_6,R.drawable.num_7,R.drawable.num_8,R.drawable.num_9,R.drawable.num_10};
        pics=new Drawable[10];
        for (int i=0;i<10;i++){
            Drawable pic= mContex.getResources().getDrawable(ids[i]);
            pics[i]=pic;
        }
        return pics;
    }

    private static Drawable[] getK3Drawables(Context mContext) {
        int[]ids=new int[]{R.drawable.ball_4_01,R.drawable.ball_4_02,R.drawable.ball_4_03,R.drawable.ball_4_04,
                R.drawable.ball_4_05,R.drawable.ball_4_06};
        pics = new Drawable[6];
        for (int i=0;i<6;i++){
            Drawable pic= mContext.getResources().getDrawable(ids[i]);
            pics[i]=pic;
        }
        return pics;
    }

    public static void createLotteryNumsView(Context mContext,String lotteryType,LinearLayout lotteryNums,
                                             LinearLayout lotteryNums2,LinearLayout extraAddLayout,String[] nums){
        lotteryNums.removeAllViews();

        String methodName=lotteryType.toLowerCase()+"Lottery";
        Class<LoadLotteryInfos>lotteryInfosClass=LoadLotteryInfos.class;
        Method method= null;
        try {
            method = lotteryInfosClass.getMethod(methodName,Context.class,String.class,LinearLayout.class,
                    LinearLayout.class, LinearLayout.class,String[].class);
            method.invoke(lotteryInfosClass.newInstance(),mContext,lotteryType,lotteryNums,lotteryNums2,extraAddLayout,nums);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void hk6Lottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                           LinearLayout extraAddLayout,String[] nums){

    }


    public void bjpk10Lottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                              LinearLayout extraAddLayout,String[] nums){
        extraAddLayout.setVisibility(View.GONE);
        ivs=new ImageView[10];
        View[] inflates=new View[10];
        for (int i=0;i<10;i++){
            View mInflate = View.inflate(mContext, R.layout.image_container, null);
            ImageView imageView= (ImageView) mInflate.findViewById(R.id.img_container);
            inflates[i]=mInflate;
            ivs[i]=imageView;
        }
        pics=getPK10Drawables(mContext);
        ArrayList<String>numShu=new ArrayList<>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
        if (nums != null) {
            for (int i = 0; i < 10; i++) {
                ivs[i].setImageDrawable(pics[numShu.indexOf(nums[i])]);
            }
            for (int i = 0; i < 10; i++) {
                lotteryNums.addView(inflates[i]);
            }
        }
    }

    public void cqsscLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                              LinearLayout extraAddLayout,String[] nums){
        extraAddLayout.setVisibility(View.GONE);
        lotteryNums.removeAllViews();
        tvs=new TextView[5];
        for (int i=0;i<5;i++){
            TextView textView=new TextView(mContext);
            textView.setTextSize(12);
            textView.setGravity(Gravity.CENTER);
            tvs[i]=textView;
        }
        if (nums != null) {
            for (int i=0;i<5;i++){
                tvs[i].setText(nums[i]);
                tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
            }
            for (int i = 0; i < 5; i++) {
                lotteryNums.addView(tvs[i]);
            }
        }
    }
    public void xjsscLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){

        cqsscLottery(mContext,lotteryType,lotteryNums,lotteryNums2,extraAddLayout,nums);
    }
    public void tjsscLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){
        cqsscLottery(mContext,lotteryType,lotteryNums,lotteryNums2,extraAddLayout,nums);
    }
    public void bjkl8Lottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){
        lotteryNums.removeAllViews();
        lotteryNums2.removeAllViews();
        extraAddLayout.setVisibility(View.VISIBLE);
        tvs1=new TextView[9];
        tvs2=new TextView[11];
        for (int i=0;i<9;i++){
            TextView textView=new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(12);
            tvs1[i]=textView;
        }
        for (int i=0;i<11;i++){
            TextView textView=new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(12);
            tvs2[i]=textView;
        }
        if (nums != null) {
            for (int i=0;i<9;i++){
                tvs1[i].setText(nums[i]);
                tvs1[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
            }
            for (int i=0;i<11;i++){
                tvs2[i].setText(nums[i+9]);
                tvs2[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
            }
            for (int i = 0; i < 9; i++) {
                lotteryNums.addView(tvs1[i]);
            }
            for (int i = 0; i < 11; i++) {
                lotteryNums2.addView(tvs2[i]);
            }
        }
    }
    public void gxk3cLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){

        extraAddLayout.setVisibility(View.GONE);
        ivs=new ImageView[3];
        View[] inflates=new View[3];
        for (int i=0;i<3;i++){
            View mInflate = View.inflate(mContext, R.layout.image_container, null);
            ImageView imageView= (ImageView) mInflate.findViewById(R.id.img_container);
            inflates[i]=mInflate;
            ivs[i]=imageView;
        }
        pics=getK3Drawables(mContext);
        if (nums != null) {
            for (int i = 0; i < 3; i++) {
                if (nums[i].equals("1")) {
                    ivs[i].setImageDrawable(pics[0]);
                } else if (nums[i].equals("2")) {
                    ivs[i].setImageDrawable(pics[1]);
                } else if (nums[i].equals("3")) {
                    ivs[i].setImageDrawable(pics[2]);
                } else if (nums[i].equals("4")) {
                    ivs[i].setImageDrawable(pics[3]);
                } else if (nums[i].equals("5")) {
                    ivs[i].setImageDrawable(pics[4]);
                } else if (nums[i].equals("6")) {
                    ivs[i].setImageDrawable(pics[5]);
                }
            }
            for (int i = 0; i < 3; i++) {
                lotteryNums.addView(inflates[i]);
            }
        }
    }

    public void gxklsfLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){
        extraAddLayout.setVisibility(View.GONE);
        lotteryNums.removeAllViews();
        tvs=new TextView[5];
        int[] nums_int=new int[5];
        for (int i=0;i<5;i++){
            TextView textView=new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(12);
            tvs[i]=textView;
            nums_int[i]=Integer.parseInt( nums[i]);
        }
        if (nums != null) {
            for (int i=0;i<5;i++){
                tvs[i].setText(nums[i]);
                if (nums_int[i]%3==1){
                    tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circlered));
                }else if (nums_int[i]%3==2){
                    tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
                }else {
                    tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circlegreen));
                }
            }
            for (int i = 0; i < 5; i++) {
                lotteryNums.addView(tvs[i]);
            }
        }
    }

    public void gd11x5Lottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){
        extraAddLayout.setVisibility(View.GONE);
        lotteryNums.removeAllViews();
        tvs=new TextView[5];
        int[] nums_int=new int[5];
        for (int i=0;i<5;i++){
            TextView textView=new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(12);
            tvs[i]=textView;
            nums_int[i]=Integer.parseInt( nums[i]);
        }
        if (nums != null) {
            for (int i=0;i<5;i++){
                tvs[i].setText(nums[i]);
                tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
            }
            for (int i = 0; i < 5; i++) {
                lotteryNums.addView(tvs[i]);
            }
        }
    }

    public void gdklsfLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){

        extraAddLayout.setVisibility(View.GONE);
        lotteryNums.removeAllViews();
        tvs=new TextView[8];
        int[] nums_int=new int[8];
        for (int i=0;i<8;i++){
            TextView textView=new TextView(mContext);
            textView.setGravity(Gravity.CENTER);
            textView.setTextSize(12);
            tvs[i]=textView;
            nums_int[i]=Integer.parseInt( nums[i]);
        }
        if (nums != null) {
            for (int i=0;i<8;i++){
                tvs[i].setText(nums[i]);
                if (nums_int[i]==20||nums_int[i]==21){
                    tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circlered));
                }else {
                    tvs[i].setBackground(mContext.getResources().getDrawable(R.drawable.circleblue));
                }
            }
            for (int i = 0; i < 8; i++) {
                lotteryNums.addView(tvs[i]);
            }
        }
    }
    public void xyncLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                             LinearLayout extraAddLayout,String[] nums){

        gdklsfLottery(mContext,lotteryType,lotteryNums,lotteryNums2,extraAddLayout,nums);
    }
    public void f3dLottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                            LinearLayout extraAddLayout,String[] nums){
        extraAddLayout.setVisibility(View.GONE);
        lotteryNums.removeAllViews();
        String[] tvDowns = new String[]{"佰", "拾", "个"};
        if (nums != null&&nums.length>0) {
            for (int i=0;i<3;i++){
                View mInflate=View.inflate(mContext,R.layout.small_pic_and_text,null);
                TextView textUp = (TextView) mInflate.findViewById(R.id.text_up);
                TextView textDown = (TextView) mInflate.findViewById(R.id.text_down);
                textUp.setText(nums[i]);
                textDown.setText(tvDowns[i]);
                lotteryNums.addView(mInflate);
            }
        }
    }
    public void pl3Lottery(Context mContext,String lotteryType,LinearLayout lotteryNums, LinearLayout lotteryNums2,
                            LinearLayout extraAddLayout,String[] nums){

        f3dLottery(mContext,lotteryType,lotteryNums,lotteryNums2,extraAddLayout,nums);
    }
}
