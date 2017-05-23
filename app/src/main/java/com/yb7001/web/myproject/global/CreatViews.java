package com.yb7001.web.myproject.global;


import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.GridLayout;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.yb7001.web.myproject.R;

import java.util.ArrayList;
import java.util.Arrays;

public class CreatViews {
    public static ArrayList<LinearLayout> BTN_BIEWS;//存储当前界面内的所有方框
    public static ArrayList<TextView> TV_PEILVS;//存储当前界面的所有赔率TextView
    public static void creatViewGoups(int num, Activity mActivity, GridLayout gridLayout,
                                                              ArrayList<String> titles, ArrayList<String> contens, String[] content) {

        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setTextSize(12);
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewGoupsWithPic(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles,
                                             ArrayList<String> contens, Drawable[] pics) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small_pic, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    ImageView img = (ImageView) mSmall.findViewById(R.id.small_img);
                    img.setImageDrawable(pics[tag%10]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewGoupsWithBlueBack(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    if (tag>3){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    }
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }

    }

    public static void creatViewGoupsWithBlueBack0to9(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void createK3With1Pic(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens,Drawable[] pics,String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    if (tag>5){
                        View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                        LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                        BTN_BIEWS.add(smallLayout);
                        TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                        tvSub.setText(content[tag-6]);
                        TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                        TV_PEILVS.add(tvPeilv);
                        params.width = screenWidth / 3;
                        gridLayout.addView(mSmall, params);
                    }else {
                        View mSmall = View.inflate(mActivity, R.layout.test_small_pic, null);
                        LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                        BTN_BIEWS.add(smallLayout);
                        ImageView img = (ImageView) mSmall.findViewById(R.id.small_img);
                        img.setImageDrawable(pics[tag]);
                        TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                        TV_PEILVS.add(tvPeilv);
                        params.width = screenWidth / 3;
                        gridLayout.addView(mSmall, params);
                    }
                    tag++;
                }
            }
        }
    }

    public static void createK3With3Pic(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, Drawable[] pics,String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    if (tag>5){
                        View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                        LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                        BTN_BIEWS.add(smallLayout);
                        TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                        tvSub.setText(content[tag-6]);
                        TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                        TV_PEILVS.add(tvPeilv);
                        params.width = screenWidth / 3;
                        gridLayout.addView(mSmall, params);
                    }else {
                        View mSmall = View.inflate(mActivity, R.layout.test_small_pic, null);
                        LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                        BTN_BIEWS.add(smallLayout);
                        ImageView img = (ImageView) mSmall.findViewById(R.id.small_img);
                        ImageView img2 = (ImageView) mSmall.findViewById(R.id.small_img2);
                        ImageView img3 = (ImageView) mSmall.findViewById(R.id.small_img3);
                        img.setImageDrawable(pics[tag]);
                        img2.setImageDrawable(pics[tag]);
                        img3.setImageDrawable(pics[tag]);
                        img2.setVisibility(View.VISIBLE);
                        img3.setVisibility(View.VISIBLE);
                        TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                        TV_PEILVS.add(tvPeilv);
                        params.width = screenWidth / 3;
                        gridLayout.addView(mSmall, params);
                    }

                    tag++;
                }
            }
        }
    }

    public static void createK3With2PicDif(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, Drawable[] pics) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small_pic, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    ImageView img = (ImageView) mSmall.findViewById(R.id.small_img);
                    ImageView img2 = (ImageView) mSmall.findViewById(R.id.small_img2);
                    if (tag>=0&&tag<5){
                        img.setImageDrawable(pics[0]);
                    }else if (tag>=5&&tag<9){
                        img.setImageDrawable(pics[1]);
                    }else if (tag>=9&&tag<12){
                        img.setImageDrawable(pics[2]);
                    }else if (tag>=12&&tag<14){
                        img.setImageDrawable(pics[3]);
                    }else {
                        img.setImageDrawable(pics[4]);
                    }
                    if (tag==0){
                        img2.setImageDrawable(pics[1]);
                    }else if (tag==1||tag==5){
                        img2.setImageDrawable(pics[2]);
                    }else if (tag==2||tag==6||tag==9){
                        img2.setImageDrawable(pics[3]);
                    }else if (tag==3||tag==7||tag==10||tag==12){
                        img2.setImageDrawable(pics[4]);
                    }else {
                        img2.setImageDrawable(pics[5]);
                    }
                    img2.setVisibility(View.VISIBLE);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void createK3With2PicSame(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, Drawable[] pics) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small_pic, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    ImageView img = (ImageView) mSmall.findViewById(R.id.small_img);
                    ImageView img2 = (ImageView) mSmall.findViewById(R.id.small_img2);
                    img.setImageDrawable(pics[tag]);
                    img2.setImageDrawable(pics[tag]);
                    img2.setVisibility(View.VISIBLE);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewGoupsWithThreeColor(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setText(content[tag]);
                    if ((tag+1)%3==1){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                    }else if ((tag+1)%3==2){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    }else {
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                    }
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewGoupsWithThreeColorAndText(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setText(content[tag]);
                    if (tag<21){
                        if ((tag+1)%3==1){
                            tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                        }else if ((tag+1)%3==2){
                            tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                        }else {
                            tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                        }
                    }
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void create11X5WithBlueCircle(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void createKLSFblueAndRed(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    if (tag==18||tag==19){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                    }else {
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    }
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void createK3YxxWith1Pic(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, Drawable[] pics) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/2; row++) {
            for (int col = 0; col < 2; col++) {
                if (row * 2 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.small_only_pic, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    ImageView img = (ImageView) mSmall.findViewById(R.id.img_yxx);
                    img.setImageDrawable(pics[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 2;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewGoupsWithThreeColorBack1To49(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        ArrayList<Integer> red=new ArrayList<>(Arrays.asList(1,2,7,8,12,13,18,19,23,24,29,30,34,35,40,45,46));
        ArrayList<Integer> blue=new ArrayList<>(Arrays.asList(3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48));
        for (int row = 0; row <= num/3; row++) {
            for (int col = 0; col < 3; col++) {
                if (row * 3 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    if (red.contains(tag+1)){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                    }else if (blue.contains(tag+1)){
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                    }else {
                        tvSub.setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                    }
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 3;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewSrsx(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content)
    {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        ArrayList<Integer> red=new ArrayList<>(Arrays.asList(1,2,7,8,12,13,18,19,23,24,29,30,34,35,40,45,46));
        ArrayList<Integer> blue=new ArrayList<>(Arrays.asList(3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48));
        int[] nums=new int[]{10,4,9,3,8,2,7,1,6,12,5,11};
        for (int row = 0; row <= num/2; row++) {
            for (int col = 0; col < 2; col++) {
                if (row * 2 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.srsx_small_window, null);
                    TextView tv1= (TextView) mSmall.findViewById(R.id.tv_1);
                    TextView tv2 = (TextView) mSmall.findViewById(R.id.tv_2);
                    TextView tv3=(TextView) mSmall.findViewById(R.id.tv_3);
                    TextView tv4=(TextView) mSmall.findViewById(R.id.tv_4);
                    TextView tv5=(TextView) mSmall.findViewById(R.id.tv_5);
                    TextView[] tvs = new TextView[]{tv1, tv2, tv3, tv4, tv5};
                    ArrayList<String> tempString=new ArrayList<>();
                    for (int i=nums[tag];i<50;i=i+12){
                        tempString.add(String.valueOf(i));
                    }
                    for (int i=0;i<tempString.size();i++){
                        tvs[i].setText(tempString.get(i));
                        tvs[i].setVisibility(View.VISIBLE);
                        if (red.contains(Integer.parseInt(tempString.get(i)))){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                        }else if (blue.contains(Integer.parseInt(tempString.get(i)))){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                        }else {
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                        }
                    }
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 2;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewWx(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        ArrayList<Integer> red=new ArrayList<>(Arrays.asList(1,2,7,8,12,13,18,19,23,24,29,30,34,35,40,45,46));
        ArrayList<Integer> blue=new ArrayList<>(Arrays.asList(3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48));
        int[] wx1=new int[]{3,4,17,18,25,26,33,34,47,48};
        int[] wx2=new int[]{7,8,15,16,29,30,37,38,45,46};
        int[] wx3=new int[]{5,6,13,14,21,22,35,36,43,44};
        int[] wx4=new int[]{1,2,9,10,23,24,31,32,39,40};
        int[] wx5=new int[]{11,12,19,20,27,28,41,42,49};
        ArrayList<int[]>wxs=new ArrayList<>(Arrays.asList(wx1,wx2,wx3,wx4,wx5));
        for (int row = 0; row <= num/1; row++) {
            for (int col = 0; col < 1; col++) {
                if (row * 1 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.wx_small_layout, null);
                    TextView tv1= (TextView) mSmall.findViewById(R.id.tv_1);
                    TextView tv2 = (TextView) mSmall.findViewById(R.id.tv_2);
                    TextView tv3=(TextView) mSmall.findViewById(R.id.tv_3);
                    TextView tv4=(TextView) mSmall.findViewById(R.id.tv_4);
                    TextView tv5=(TextView) mSmall.findViewById(R.id.tv_5);
                    TextView tv6=(TextView) mSmall.findViewById(R.id.tv_6);
                    TextView tv7=(TextView) mSmall.findViewById(R.id.tv_7);
                    TextView tv8=(TextView) mSmall.findViewById(R.id.tv_8);
                    TextView tv9=(TextView) mSmall.findViewById(R.id.tv_9);
                    TextView tv10=(TextView) mSmall.findViewById(R.id.tv_10);
                    TextView[] tvs = new TextView[]{tv1, tv2, tv3, tv4, tv5,tv6,tv7,tv8,tv9,tv10};
                    int[] wxTemp = wxs.get(tag);
                    for (int i=0;i<wxTemp.length;i++){
                        tvs[i].setText(String.valueOf(wxTemp[i]));
                        tvs[i].setVisibility(View.VISIBLE);
                        if (red.contains(wxTemp[i])){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                        }else if (blue.contains(wxTemp[i])){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                        }else {
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                        }

                    }
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 1;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatViewYxWs0To9W(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        ArrayList<Integer> red=new ArrayList<>(Arrays.asList(1,2,7,8,12,13,18,19,23,24,29,30,34,35,40,45,46));
        ArrayList<Integer> blue=new ArrayList<>(Arrays.asList(3,4,9,10,14,15,20,25,26,31,36,37,41,42,47,48));
        int[] num0=new int[]{10,20,30,40};
        int[] num1=new int[]{1,11,21,31,41};
        int[] num2=new int[]{2,12,22,32,42};
        int[] num3=new int[]{3,13,23,33,43};
        int[] num4=new int[]{4,14,24,34,44};
        int[] num5=new int[]{5,15,25,35,45};
        int[] num6=new int[]{6,16,26,36,46};
        int[] num7=new int[]{7,17,27,37,47};
        int[] num8=new int[]{8,18,28,38,48};
        int[] num9=new int[]{9,19,29,39,49};
        ArrayList<int[]>num0To9=new ArrayList<>(Arrays.asList(num0,num5,num1,num6,num2,num7,num3,num8,num4,num9));
        for (int row = 0; row <= num/2; row++) {
            for (int col = 0; col < 2; col++) {
                if (row * 2 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.srsx_small_window, null);
                    TextView tv1= (TextView) mSmall.findViewById(R.id.tv_1);
                    TextView tv2 = (TextView) mSmall.findViewById(R.id.tv_2);
                    TextView tv3=(TextView) mSmall.findViewById(R.id.tv_3);
                    TextView tv4=(TextView) mSmall.findViewById(R.id.tv_4);
                    TextView tv5=(TextView) mSmall.findViewById(R.id.tv_5);
                    TextView[] tvs = new TextView[]{tv1, tv2, tv3, tv4, tv5};
                    int[] tempNum = num0To9.get(tag);
                    for (int i=0;i<tempNum.length;i++){
                        tvs[i].setText(String.valueOf(tempNum[i]));
                        tvs[i].setVisibility(View.VISIBLE);
                        if (red.contains(tempNum[i])){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlered));
                        }else if (blue.contains(tempNum[i])){
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circleblue));
                        }else {
                            tvs[i].setBackground(mActivity.getResources().getDrawable(R.drawable.circlegreen));
                        }
                    }
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setText(content[tag]);
                    TextView tvPeilv = (TextView) mSmall.findViewById(R.id.tv_peilv);
                    TV_PEILVS.add(tvPeilv);
                    params.width = screenWidth / 2;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }

    public static void creatHK6LmTopView(int num, Activity mActivity, GridLayout gridLayout, ArrayList<String> titles, ArrayList<String> contens, String[] content) {
        int screenWidth = mActivity.getWindowManager().getDefaultDisplay().getWidth();
        int tag = 0;
        for (int row = 0; row <= num/2; row++) {
            for (int col = 0; col < 2; col++) {
                if (row * 2 + col < num) {
                    GridLayout.Spec rowSpec = GridLayout.spec(row);
                    GridLayout.Spec colSpec = GridLayout.spec(col);
                    GridLayout.LayoutParams params = new GridLayout.LayoutParams(rowSpec, colSpec);
                    View mSmall = View.inflate(mActivity, R.layout.test_hk6lm_small, null);
                    LinearLayout smallLayout = (LinearLayout) mSmall.findViewById(R.id.small);
                    BTN_BIEWS.add(smallLayout);
                    TextView tvSub = (TextView) mSmall.findViewById(R.id.tv_sub);
                    tvSub.setTextSize(12);
                    tvSub.setText(content[tag]);
                    TextView peilvDescrip1= (TextView) mSmall.findViewById(R.id.peilvDescrip_1);
                    TextView peilvDescrip2= (TextView) mSmall.findViewById(R.id.peilvDescrip_2);
                    TextView tvPeilv1 = (TextView) mSmall.findViewById(R.id.tv_peilv_1);
                    TextView tvPeilv2 = (TextView) mSmall.findViewById(R.id.tv_peilv_2);
                    if (tag==0||tag==1){
                        if (tag==0){
                            peilvDescrip1.setText("中二 ");
                            peilvDescrip2.setText(",中三 ");
                        }else {
                            peilvDescrip1.setText("中特 ");
                            peilvDescrip2.setText(",中二 ");
                        }
                        peilvDescrip1.setVisibility(View.VISIBLE);
                        peilvDescrip2.setVisibility(View.VISIBLE);
                        tvPeilv2.setVisibility(View.VISIBLE);
                        TV_PEILVS.add(tvPeilv1);
                        TV_PEILVS.add(tvPeilv2);
                    }else{
                        TV_PEILVS.add(tvPeilv1);
                    }
                    params.width = screenWidth / 2;
                    gridLayout.addView(mSmall, params);
                    tag++;
                }
            }
        }
    }
}
