package com.yb7001.web.myproject.global;

import android.util.Log;
import android.widget.TextView;

import com.yb7001.web.myproject.MainGlobalData;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;

public class DataInit {


    private static String[] tvTitles,tvContents,tvGames,tvSubs;
    private static ArrayList<String[]> result;
    private static String games;

    public static ArrayList<String[]> initData(String lotteryType,String page){
        String methodName="_"+ MainGlobalData.LOTTERY_TYPE.substring(2)+MainGlobalData.LOTTERY_PAGE+"Init";
        Class<DataInit>dataInitClass=DataInit.class;
        try {
            Method method=dataInitClass.getMethod(methodName);
            Log.e("method", String.valueOf(method));
            method.invoke(dataInitClass.newInstance());
            result=new ArrayList<>();
            result.add(tvTitles);
            result.add(tvContents);
            result.add(tvGames);
            result.add(tvSubs);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return result;

    }
    public static void initTvs(int num) {
        tvTitles=new String[num];
        tvGames=new String[num];
        tvContents=new String[num];
        tvSubs=new String[num];
    }
    public static void _6hk6_zxbzInit() {
        initTvs(49);
        for (int i=0;i<49;i++){
            String numStr=generateDoubleNums(i+1);
            tvContents[i]=numStr;
            tvSubs[i]=numStr;
        }
        tvTitles=new String[]{"自选不中"};
        tvGames=new String[]{"ZXBZ"};
    }
    public static void _6hk6_lmInit() {
        tvTitles=new String[]{"三中二","二中特","三全中","二全中","特串","四全中"};
        tvContents=new String[]{"01","02","03","04","05","06","07","08","09",
                "11","12","13","14","15","16","17","18","19","22",
                "23","24","25","26","27","28","29","33","34","35",
                "36","37","38","39","44","45","46","47","48","49"};
        tvSubs=new String[]{"01","02","03","04","05","06","07","08","09",
                "11","12","13","14","15","16","17","18","19","22",
                "23","24","25","26","27","28","29","33","34","35",
                "36","37","38","39","44","45","46","47","48","49"};
        tvGames=new String[]{"LM3Z2","LM2ZT","LM3QZ","LM2QZ","LMTC","LM4QZ"};

    }
    public static void _6hk6_dpInit() {
        initTvs(12);
        String[] sx=new String[]{"鼠", "马", "牛", "羊", "虎", "猴", "兔", "鸡", "龙", "狗", "蛇", "猪"};
        String[] ws=new String[]{"0尾", "5尾", "1尾", "6尾", "2尾", "7尾", "3尾", "8尾", "4尾", "9尾"};
        ArrayList<String> subTitles = new ArrayList<String>(Arrays.asList("hk6_lx2", "hk6_lx3", "hk6_lx4", "hk6_lx5", "hk6_lw2", "hk6_lw3",
                "hk6_lw4", "hk6_lw5"));
        String[] ttitles = new String[]{"二连肖", "三连肖", "四连肖", "五连肖", "二连尾", "三连尾", "四连尾", "五连尾"};
        String[] games=new String[]{"LX2","LX3","LX4","LX5","LW2","LW3","LW4","LW5"};
        int index = subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE);
        if (index<4){
            for (int i=0;i<12;i++){
                tvSubs[i]=String.valueOf(i);
                tvTitles[i]=ttitles[index];
                tvContents[i]=sx[i];
                tvGames[i]=games[index];
            }
        }else {
            for (int i=0;i<10;i++){
                tvSubs[i]=String.valueOf(i);
                tvTitles[i]=ttitles[index];
                tvContents[i]=ws[i];
                tvGames[i]=games[index];
            }
        }
    }
    public static void _6hk6_zongxiaoInit() {
        initTvs(8);
        for (int i=0;i<8;i++){
            tvTitles[i]="总肖";
        }
        tvContents = new String[]{
                "2肖","3肖","4肖","5肖","6肖","7肖","总肖单","总肖双"
        };
        tvGames=new String[]{
                "ZSX","ZSX","ZSX","ZSX","ZSX","ZSX","ZSXDS","ZSXDS"

        };
        tvSubs=new String[]{
                "2","3","4","5","6","7","D","S"
        };
    }
    public static void _6hk6_7sbInit() {
        initTvs(4);
        for (int i=0;i<4;i++){
            tvTitles[i]="7色波";
            tvGames[i]="7SB";
        }
        tvContents=new String[]{
                "红波","蓝波","绿波","和局"
        };
        tvSubs=new String[]{
                "R","B","G","TIE"
        };
    }
    public static void _6hk6_yxwsInit() {
        initTvs(12);
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
            tvContents = new String[]{
                    "鼠", "马", "牛", "羊", "虎", "猴", "兔", "鸡", "龙", "狗", "蛇", "猪"
            };
            for (int i=0;i<12;i++){
                tvSubs[i]=String.valueOf(i);
                tvTitles[i]="一肖尾数";
                tvGames[i]="YX";
            }
        }else {
            tvContents = new String[]{
                    "0尾", "5尾", "1尾", "6尾", "2尾", "7尾", "3尾", "8尾", "4尾", "9尾"
            };
            for (int i=0;i<12;i++){
                tvSubs[i]=String.valueOf(i);
                tvTitles[i]="一肖尾数";
                tvGames[i]="WS";
            }
        }
    }
    public static void _6hk6_wxInit() {
        initTvs(5);
        for (int i=0;i<5;i++){
            tvTitles[i]="五行 种类";
            tvGames[i]="WX";
            tvSubs[i]=String.valueOf(i);
        }
        tvContents = new String[]{
                "金","木","水","火","土"
        };
    }
    public static void _6hk6_zm16Init() {
        initTvs(78);
        String[] titleString = new String[]{"正码一","正码二","正码三","正码四","正码五","正码六"};
        String[] contentString = new String[]{"单码","双码","大码","小码","合单","合双","合大","合小","红波","蓝波","绿波","尾大","尾小"};
        String[] subString = new String[]{ "D","S","D","X","D","S","D","X","R","B","G","D","X"};
        String[] gameString = new String[]{"ZMDS","ZMDS","ZMDX","ZMDX","ZHDS","ZHDS","ZHDX","ZHDX","ZMSB","ZMSB","ZMSB","ZMWDX","ZMWDX"};
        for (int i=0;i<78;i++){
            tvTitles[i]=titleString[i/13];
            tvContents[i]=contentString[i%13];
            tvSubs[i]=subString[i%13];
            tvGames[i]=gameString[i%13]+String.valueOf(i/13+1);
        }
    }
    public static void _6hk6_zmtInit() {
        initTvs(58);
        String[] zntString=new String[]{"正一特 正码","正二特 正码","正三特 正码","正四特 正码","正五特 正码","正六特 正码"};
        String[] contentString=new String[]{"正n-大","正n-单","正n-合单","正n-小", "正n-双", "正n-合双","正n-红", "正n-蓝", "正n-绿"};
        String[] subString=new String[]{"D","D","D","X","S","S","R","B","G"};
        String[] gameString=new String[]{"ZMDX","ZMDS","ZHDS","ZMDX","ZMDS","ZHDS", "ZMSB","ZMSB","ZMSB","ZMT"};
        ArrayList<String> subTitles = new ArrayList<String>(Arrays.asList("hk6_z1t", "hk6_z2t", "hk6_z3t", "hk6_z4t", "hk6_z5t", "hk6_z6t"));
        int index=subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE);
        for (int i=0;i<58;i++){
            if (i<49){
                tvTitles[i]=zntString[index];
                tvGames[i]=gameString[9]+String.valueOf(index);
                if (i<9){
                    tvContents[i]="0"+String.valueOf(i+1);
                    tvSubs[i]="0"+String.valueOf(i);
                }else {
                    tvContents[i]=String.valueOf(i+1);
                    tvSubs[i]=String.valueOf(i);
                }
            }else {
                tvTitles[i]="两面";
                tvGames[i]=gameString[i-49]+String.valueOf(index);
                tvContents[i]=contentString[i-49].replace("n",String.valueOf(index));
                tvSubs[i]=subString[i-49];
            }
        }
    }
    public static void _6hk6_twsInit() {
        initTvs(15);
        for (int i=0;i<15;i++){
            tvTitles[i]="种类";
        }
        tvContents = new String[]{
                "0头","1尾","6尾","1头","2尾","7尾","2头","3尾","8尾","3头",
                "4尾","9尾","4头","5尾","0尾"
        };
        tvGames=new String[]{
                "TMTS","TMWS","TMWS",
                "TMTS","TMWS","TMWS",
                "TMTS","TMWS","TMWS",
                "TMTS","TMWS","TMWS",
                "TMTS","TMWS","TMWS"
        };
        tvSubs=new String[]{
                "0","1","6",
                "1","2","7",
                "2","3","8",
                "3","4","9",
                "4","5","0"
        };
    }
    public static void _6hk6_srsxInit() {
        initTvs(12);
        tvContents = new String[]{
                "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"
        };
        tvSubs=new String[]{
                "0","6","1","7","2","8","3","9","4","10","5","11"
        };
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
            for (int i=0;i<12;i++){
                tvTitles[i]="十二生肖";
                tvGames[i]="SX";
            }
        }else{
            for (int i=0;i<12;i++){
                tvTitles[i]="正肖";
                tvGames[i]="ZX";
            }
        }
    }
    public static void _6hk6_zhengxiaoInit() {
        initTvs(12);
        tvContents = new String[]{
                "鼠","马","牛","羊","虎","猴","兔","鸡","龙","狗","蛇","猪"
        };
        tvSubs=new String[]{
                "0","6","1","7","2","8","3","9","4","10","5","11"
        };
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
            for (int i=0;i<12;i++){
                tvTitles[i]="十二生肖";
                tvGames[i]="SX";
            }
        }else{
            for (int i=0;i<12;i++){
                tvTitles[i]="正肖";
                tvGames[i]="ZX";
            }
        }
    }
    public static void _6hk6_tmInit() {
        initTvs(63);
        String[] subString=new String[]{"D", "X", "D", "X", "D", "S", "D", "S", "D", "X", "D", "S", "D", "S"};
        String[] contentString=new String[]{"特大", "特小", "特尾大", "特尾小", "特单", "特双", "特大单", "特大双", "特合大", "特合小", "特小单", "特小双", "特合单", "特合双"};
        String[] gameString=new String[]{"DX", "DX", "WDX", "WDX", "DS", "DS", "TDXDS", "TDXDS", "HDX", "HDX", "TDXDS", "TDXDS", "HDS", "HDS"};
        for (int i=0;i<63;i++){
            if (i<49){
                tvTitles[i]="特码";
                if (i<9){
                    tvSubs[i]="0"+String.valueOf(i+1);
                }else {
                    tvSubs[i]=String.valueOf(i+1);
                }
                if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_A")) {
                    tvContents[i]="特码A "+tvSubs[i];
                    tvGames[i]="特码A";
                }else {
                    tvContents[i]="特码B "+tvSubs[i];
                    tvGames[i]="特码B";
                }
            }else {
                tvTitles[i]="两面";
                tvSubs[i]=subString[i-49];
                tvContents[i]=contentString[i-49];
                tvGames[i]=gameString[i-49];
            }
        }
    }
    public static void _33D_select6Init() {
      _D3D_select6Init();
    }
    public static void _D3D_select6Init() {
        initTvs(10);
        for (int i=0;i<10;i++){
            tvContents[i]=String.valueOf(i);
            tvSubs[i]=String.valueOf(i);
        }
        tvTitles=new String[]{"组选六"};
        tvGames=new String[]{"ZX6"};
    }
    public static void _33D_select3Init() {
        _D3D_select3Init();
    }
    public static void _D3D_select3Init() {
        initTvs(10);
        for (int i=0;i<10;i++){
            tvContents[i]=String.valueOf(i);
            tvSubs[i]=String.valueOf(i);
        }
        tvTitles=new String[]{"组选三"};
        tvGames=new String[]{"ZX3"};
    }
    public static void _D3D_locate3Init() {
        initTvs(30);
        for (int i=0;i<30;i++){
            tvContents[i]=String.valueOf(i%10);
        }
        tvTitles=new String[]{"三字定位"};
        tvGames=new String[]{"3DW"};
    }
    public static void _D3D_locate2Init() {
        initTvs(20);
        String[] lotterySubtitle = new String[]{"3D_12","3D_13","3D_23"};
        String[] titleString = new String[]{"佰拾定位","佰个定位","拾个定位"};
        String[] gameString = new String[]{"DW12","DW13","DW23"};
        for (int i=0;i<20;i++){
            tvContents[i]=String.valueOf(i%10);
            tvSubs[i]=String.valueOf(i%10);
            tvTitles[i]=titleString[Arrays.binarySearch(lotterySubtitle,MainGlobalData.LOTTERY_SUBTITLE)];
            tvGames[i]=gameString[Arrays.binarySearch(lotterySubtitle,MainGlobalData.LOTTERY_SUBTITLE)];
        }
    }
    public static void _D3D_spanInit() {
        initTvs(10);
        for (int i=0;i<10;i++){
            tvTitles[i]="跨度";
            tvContents[i]=String.valueOf(i);
            tvSubs[i]=String.valueOf(i);
            tvGames[i]="KD";
        }
    }
    public static void _D3D_sum2Init() {
        initTvs(21);
        tvContents = new String[]{
                "0~4","5","6","7","8","9","10","11","12","13","14~18",
                "0","1","2","3","4","5","6","7","8","9"
        };
        tvSubs=new String[]{
                "4","5","6","7","8","9","10","11","12","13","14",
                "0","1","2","3","4","5","6","7","8","9"
        };
        String[] gameString = new String[]{"HS", "HWS"};
        ArrayList<String> subTitles = new ArrayList<String>(Arrays.asList("3D_bs", "3D_bg", "3D_sg"));
        String[] nums=new String[]{"12","13","23"};
        for (int i=0;i<21;i++){
            if (i<11){
                tvTitles[i]="佰拾和数";
                tvGames[i]=gameString[0]+nums[subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE)];
            }else {
                tvTitles[i]="佰拾和数尾数";
                tvGames[i]=gameString[1]+nums[subTitles.indexOf(MainGlobalData.LOTTERY_SUBTITLE)];
            }
        }
    }
    public static void _D3D_sum3Init() {
        initTvs(26);
        for (int i=0;i<26;i++){
            if (i<16){
                tvTitles[i]="三字和数";
                tvGames[i]="HS";
            }else {
                tvTitles[i]="三字和数尾数";
                tvGames[i]="HWS123";
            }
        }
        tvContents = new String[]{
                "0~6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21~27",
                "0","1","2","3","4","5","6","7","8","9"
        };
        tvSubs=new String[]{
                "6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
                "0","1","2","3","4","5","6","7","8","9"
        };
    }
    public static void _D3D_locate1Init() {
        initTvs(30);
        String[] titleString=new String[]{"佰","拾","个"};
        String[] gameString=new String[]{"DW1","DW2","DW3"};
        for (int i=0;i<30;i++){
            tvTitles[i]=titleString[i/10];
            tvContents[i]=String.valueOf(i%10);
            tvSubs[i]=String.valueOf(i%10);
            tvGames[i]=gameString[i/10];

        }
    }
    public static void _D3D_combin3Init() {
        initTvs(220);
        ArrayList<String>numStrs=new ArrayList<>();
        for (int i=0;i<1000;i++){
            String numStr="";
            if (i<10){
                numStr="00"+String.valueOf(i);
            }else if (i>10&&i<100){
                numStr="0"+String.valueOf(i);
            }else if(i>100){
                numStr=String.valueOf(i);
            }else {
                continue;
            }
            if (isThreeNumMeetRule(numStr)){
                numStrs.add(numStr);
            }
        }
        for (int i=0;i<220;i++){
            tvTitles[i]="三字组合";
            tvGames[i]="3Z";
            tvContents[i]=numStrs.get(i);
            tvSubs[i]=numStrs.get(i);
        }
    }
    public static void _D3D_combin2Init() {
        initTvs(55);
        ArrayList<String>numStrs=new ArrayList<>();
        for (int i=0;i<100;i++){
            String numStr="";
            if (i<10){
                numStr="0"+String.valueOf(i);
            }else {
                numStr=String.valueOf(i);
            }
            if (isTwoNumMeetRule(numStr)){
                numStrs.add(numStr);
            }
        }
        for (int i=0;i<55;i++){
            tvTitles[i]="二字组合";
            tvGames[i]="2Z";
            tvContents[i]=numStrs.get(i);
            tvSubs[i]=numStrs.get(i);
        }
        Log.e("tvTitles",tvTitles[0]);
    }
    public static void _D3D_combin1Init() {
        initTvs(28);
        String[] titleString=new String[]{"一字组合","两面 佰","两面 拾","两面 个"};
        String[] contentString=new String[]{"两面 X 大","两面 X 小","两面 X 单","两面 X 双","两面 X 质","两面 X 合"};
        String[] gameString=new String[]{"DXn","DXn","DSn","DSn","ZIHn","ZIHn"};
        String[] subString=new String[]{"D","X","D","S","Z","H"};
        for (int i=0;i<28;i++){
            if (i<10){
                tvTitles[i]=titleString[0];
                tvContents[i]=String.valueOf(i);
                tvGames[i]="1Z";
                tvSubs[i]=String.valueOf(i);
            }else if (i>=10&&i<16){
                tvTitles[i]=titleString[1];
                tvContents[i]=contentString[(i-10)%6].replace("X","佰");
                tvGames[i]=gameString[(i-10)%6].replace("n","1");
                tvSubs[i]=subString[(i-10)%6];
            }else if (i>=16&&i<22){
                tvTitles[i]=titleString[2];
                tvContents[i]=contentString[(i-10)%6].replace("X","拾");
                tvGames[i]=gameString[(i-10)%6].replace("n","2");
                tvSubs[i]=subString[(i-10)%6];
            }else{
                tvTitles[i]=titleString[3];
                tvContents[i]=contentString[(i-10)%6].replace("X","个");
                tvGames[i]=gameString[(i-10)%6].replace("n","3");
                tvSubs[i]=subString[(i-10)%6];
            }
        }
    }
    public static void _D3D_mainInit() {

        tvTitles = new String[]{
                "一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合",
                "大","大","大","大","大","大","大","大",
                "小","小","小","小","小","小","小","小",
                "单","单","单","单","单","单","单",
                "双","双","双","双","双","双","双",
                "质","质","质","质","质","质","质",
                "合","合","合","合","合","合","合"
        };
        tvContents = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "佰大小 大","拾大小 大","个大小 大","佰拾和尾数 大","佰个和尾数 大","拾个和尾数 大","佰拾个和数 大","佰拾个和尾数 大",
                "佰大小 小","拾大小 小","个大小 小","佰拾和尾数 小","佰个和尾数 小","拾个和尾数 小","佰拾个和数 小","佰拾个和尾数 小",
                "佰单双 单","拾单双 单","个单双 单","佰拾 单","佰个 单","拾个 单","佰拾个 单",
                "佰单双 双","拾单双 双","个单双 双","佰拾 双","佰个 双","拾个 双","佰拾个 双",
                "佰质合 质","拾质合 质","个质合 质","佰拾和尾数 质","佰个和尾数 质","拾个和尾数 质","佰拾个和尾数 质",
                "佰质合 合","拾质合 合","个质合 合","佰拾和尾数 合","佰个和尾数 合","拾个和尾数 合","佰拾个和尾数 合"
        };
        tvGames=new String[]{
                "1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z",
                "DX1","DX2","DX3","DX12","DX13","DX23","3DX","DX123",
                "DX1","DX2","DX3","DX12","DX13","DX23","3DX","DX123",
                "DS1","DS2","DS3","DS12","DS13","DS23","3DS",
                "DS1","DS2","DS3","DS12","DS13","DS23","3DS",
                "ZIH1","ZIH2","ZIH3","ZIH12","ZIH13","ZIH23","3ZIH",
                "ZIH1","ZIH2","ZIH3","ZIH12","ZIH13","ZIH23","3ZIH"
        };
        tvSubs=new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D","D","D","D","D","D","D","D",
                "X","X","X","X","X","X","X","X",
                "D","D","D","D","D","D","D",
                "S","S","S","S","S","S","S",
                "Z","Z","Z","Z","Z","Z","Z",
                "H","H","H","H","H","H","H"
        };
    }
    public static void _33D_locate3Init() {
        initTvs(30);
        for (int i=0;i<30;i++){
            tvContents[i]=String.valueOf(i%10);
        }
        tvTitles=new String[]{"三字定位"};
        tvGames=new String[]{"3DW"};
    }
    public static void _33D_locate2Init() {
        initTvs(20);
        String[] lotterySubtitle = new String[]{"3D_12","3D_13","3D_23"};
        String[] titleString = new String[]{"佰拾定位","佰个定位","拾个定位"};
        String[] gameString = new String[]{"DW12","DW13","DW23"};
        for (int i=0;i<20;i++){
            tvContents[i]=String.valueOf(i%10);
            tvSubs[i]=String.valueOf(i%10);
            tvTitles[i]=titleString[Arrays.binarySearch(lotterySubtitle,MainGlobalData.LOTTERY_SUBTITLE)];
            tvGames[i]=gameString[Arrays.binarySearch(lotterySubtitle,MainGlobalData.LOTTERY_SUBTITLE)];
        }
    }
    public static void _33D_spanInit() {
        initTvs(10);
        for (int i=0;i<10;i++){
            tvTitles[i]="跨度";
            tvContents[i]=String.valueOf(i);
            tvSubs[i]=String.valueOf(i);
            tvGames[i]="KD";
        }
    }
    public static void _33D_sum2Init() {
        initTvs(21);
        for (int i=0;i<21;i++){
            if (i<11){
                tvTitles[i]="佰拾和数";
            }else {
                tvTitles[i]="佰拾和数尾数";
            }
        }
        tvContents = new String[]{
                "0~4","5","6","7","8","9","10","11","12","13","14~18",
                "0","1","2","3","4","5","6","7","8","9"
        };
        tvSubs=new String[]{
                "4","5","6","7","8","9","10","11","12","13","14",
                "0","1","2","3","4","5","6","7","8","9"
        };
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bs")){
            tvGames=new String[]{
                    "HS12","HS12","HS12","HS12","HS12","HS12","HS12","HS12","HS12","HS12","HS12",
                    "HWS12","HWS12","HWS12","HWS12","HWS12","HWS12","HWS12","HWS12","HWS12","HWS12"
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bg")){
            tvGames=new String[]{
                    "HS13","HS13","HS13","HS13","HS13","HS13","HS13","HS13","HS13","HS13","HS13",
                    "HWS13","HWS13","HWS13","HWS13","HWS13","HWS13","HWS13","HWS13","HWS13","HWS13"
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_sg")){
            tvGames=new String[]{
                    "HS23","HS23","HS23","HS23","HS23","HS23","HS23","HS23","HS23","HS23","HS23",
                    "HWS23","HWS23","HWS23","HWS23","HWS23","HWS23","HWS23","HWS23","HWS23","HWS23"
            };
        }
    }
    public static void _33D_sum3Init() {
        initTvs(26);
        for (int i=0;i<26;i++){
            if (i<16){
                tvTitles[i]="三字和数";
                tvGames[i]="HS";
            }else {
                tvTitles[i]="三字和数尾数";
                tvGames[i]="HWS123";
            }
        }
        tvContents = new String[]{
                "0~6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21~27",
                "0","1","2","3","4","5","6","7","8","9"
        };
        tvSubs=new String[]{
                "6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21",
                "0","1","2","3","4","5","6","7","8","9"
        };
    }
    public static void _33D_locate1Init() {
        initTvs(30);
        String[] titleString=new String[]{"佰","拾","个"};
        String[] gameString=new String[]{"DW1","DW2","DW3"};
        for (int i=0;i<30;i++){
            tvTitles[i]=titleString[i/10];
            tvContents[i]=String.valueOf(i%10);
            tvSubs[i]=String.valueOf(i%10);
            tvGames[i]=gameString[i/10];

        }
    }
    public static void _33D_combin3Init() {
       _D3D_combin3Init();
    }
    public static void _33D_combin2Init() {
        _D3D_combin2Init();
    }
    public static void _33D_combin1Init() {
        initTvs(28);
        String[] titleString=new String[]{"一字组合","两面 佰","两面 拾","两面 个"};
        String[] contentString=new String[]{"两面 X 大","两面 X 小","两面 X 单","两面 X 双","两面 X 质","两面 X 合"};
        String[] gameString=new String[]{"DXn","DXn","DSn","DSn","ZIHn","ZIHn"};
        String[] subString=new String[]{"D","X","D","S","Z","H"};
        for (int i=0;i<28;i++){
            if (i<10){
                tvTitles[i]=titleString[0];
                tvContents[i]=String.valueOf(i);
                tvGames[i]="1Z";
                tvSubs[i]=String.valueOf(i);
            }else if (i>=10&&i<16){
                tvTitles[i]=titleString[1];
                tvContents[i]=contentString[(i-10)%6].replace("X","佰");
                tvGames[i]=gameString[(i-10)%6].replace("n","1");
                tvSubs[i]=subString[(i-10)%6];
            }else if (i>=16&&i<22){
                tvTitles[i]=titleString[2];
                tvContents[i]=contentString[(i-10)%6].replace("X","拾");
                tvGames[i]=gameString[(i-10)%6].replace("n","2");
                tvSubs[i]=subString[(i-10)%6];
            }else{
                tvTitles[i]=titleString[3];
                tvContents[i]=contentString[(i-10)%6].replace("X","个");
                tvGames[i]=gameString[(i-10)%6].replace("n","3");
                tvSubs[i]=subString[(i-10)%6];
            }
        }
    }
    public static void _33D_mainInit() {

        tvTitles = new String[]{
                "一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合","一字组合",
                "大","大","大","大","大","大","大","大",
                "小","小","小","小","小","小","小","小",
                "单","单","单","单","单","单","单",
                "双","双","双","双","双","双","双",
                "质","质","质","质","质","质","质",
                "合","合","合","合","合","合","合"
        };
        tvContents = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "佰大小 大","拾大小 大","个大小 大","佰拾和尾数 大","佰个和尾数 大","拾个和尾数 大","佰拾个和数 大","佰拾个和尾数 大",
                "佰大小 小","拾大小 小","个大小 小","佰拾和尾数 小","佰个和尾数 小","拾个和尾数 小","佰拾个和数 小","佰拾个和尾数 小",
                "佰单双 单","拾单双 单","个单双 单","佰拾 单","佰个 单","拾个 单","佰拾个 单",
                "佰单双 双","拾单双 双","个单双 双","佰拾 双","佰个 双","拾个 双","佰拾个 双",
                "佰质合 质","拾质合 质","个质合 质","佰拾和尾数 质","佰个和尾数 质","拾个和尾数 质","佰拾个和尾数 质",
                "佰质合 合","拾质合 合","个质合 合","佰拾和尾数 合","佰个和尾数 合","拾个和尾数 合","佰拾个和尾数 合"
        };
        tvGames=new String[]{
                "1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z","1Z",
                "DX1","DX2","DX3","DX12","DX13","DX23","3DX","DX123",
                "DX1","DX2","DX3","DX12","DX13","DX23","3DX","DX123",
                "DS1","DS2","DS3","DS12","DS13","DS23","3DS",
                "DS1","DS2","DS3","DS12","DS13","DS23","3DS",
                "ZIH1","ZIH2","ZIH3","ZIH12","ZIH13","ZIH23","3ZIH",
                "ZIH1","ZIH2","ZIH3","ZIH12","ZIH13","ZIH23","3ZIH"
        };
        tvSubs=new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D","D","D","D","D","D","D","D",
                "X","X","X","X","X","X","X","X",
                "D","D","D","D","D","D","D",
                "S","S","S","S","S","S","S",
                "Z","Z","Z","Z","Z","Z","Z",
                "H","H","H","H","H","H","H"
        };
    }
    public static void _KLSFklsf_zmInit() {
        for (int i=0;i<26;i++){
            if (i<20){
                tvTitles[i]="正码";
            }else{
                tvTitles[i]="总和";
            }
        }
        tvContents = new String[]{
                "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "总和大", "总和单", "总和尾大", "总和小", "总和双", "总和尾小"
        };
        tvGames = new String[]{
                "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM",
                "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM",
                "ZDX", "ZDS", "ZWDX",
                "ZDX", "ZDS", "ZWDX"
        };
        tvSubs = new String[]{
                "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "D", "D", "D",
                "X", "S", "X"
        };
    }
    public static void _KLSFklsf_ball1Init() {
        initTvs(37);
        String[] subString=new String[]{"D","X","D","S","D","X","D","S","0", "1","2","3","0","1","2","L","H"};
        String[] ballNString=new String[]{"第一球 ","第二球 ","第三球 ","第四球 ","第五球 ","第六球 ","第七球 ","第八球 "};
        String[] lotteryPageString=new String[]{"klsf_ball1","klsf_ball2","klsf_ball3","klsf_ball4","klsf_ball5","klsf_ball6",
                "klsf_ball7","klsf_ball8"};
        String[] contentString=new String[]{ "大", "小", "单", "双","尾大","尾小","合数单","合数双", "东","南","西","北","中","发","白","龙","虎"};
        String[] gameString=new String[]{"DXn","DXn","DSn","DSn","WDXn","WDXn","HDSn","HDSn","WFn",
                "WFn","WFn","WFn","ZFBn","ZFBn","ZFBn","LHn","LHn","Bn"};
        for (int i=0;i<37;i++){
            if (i<20){
                tvTitles[i]="球号";
                if (i<9){
                    tvSubs[i]="0"+String.valueOf(i+1);
                }else{
                    tvSubs[i]=String.valueOf(i+1);
                }
                tvContents[i]=ballNString[Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)]+tvSubs[i];
                tvGames[i]=gameString[17].replace("n",String.valueOf(Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)+1));
            }else {
                tvTitles[i]="两面";
                tvSubs[i]=subString[i-20];
                tvContents[i]=ballNString[Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)]+contentString[i-20];
                tvGames[i]=gameString[i-20].replace("n",String.valueOf(Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)+1));
            }
        }
        Log.e("======","finish");
    }
    public static void _KLSFklsf_ball2Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball3Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball4Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball5Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball6Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball7Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_ball8Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _KLSFklsf_singleInit() {
        initTvs(160);
        String[] titleString=new String[]{"第一球","第二球","第三球","第四球","第五球","第六球","第七球","第八球"};
        String gameString="Bn";
        for (int i=0;i<160;i++){
            tvTitles[i]=titleString[i/20];
            tvGames[i]=gameString.replace("n",String.valueOf((i/20)+1));
            tvContents[i]=String.valueOf(i%20+1);
            if ((i%20+1)<10){
              tvSubs[i]="0"+String.valueOf(i%20+1);
            }else {
                tvSubs[i]=String.valueOf(i%20+1);
            }
        }
    }
    public static void _KLSFklsf_allInit() {
        initTvs(78);
        String[] titleString=new String[]{"总和","第一球","第二球","第三球","第四球","第五球","第六球","第七球","第八球"};
        String[] contentString1=new String[]{"总和大", "总和小", "总和单", "总和双", "总和尾大", "总和尾小"};
        String[] contentString2=new String[]{"大", "小", "单", "双", "尾大", "尾小", "合数单", "合数双", "龙", "虎"};
        for (int i=0;i<78;i++){
            if (i<6){
                tvTitles[i]=titleString[0];
                tvContents[i]=contentString1[i];
            }else if (i>=6&&i<46){
                tvTitles[i]=titleString[(i-6)/10+1];
                tvContents[i]=contentString2[(i-6)%10];
            }else {
                tvTitles[i]=titleString[(i-46)/8+5];
                tvContents[i]=contentString2[(i-46)%8];
            }
        }
        tvGames = new String[]{
                "ZDX", "ZDX", "ZDS", "ZDS", "ZWDX", "ZWDX",
                "DX1", "DX1", "DS1", "DS1", "WDX1", "WDX1", "HDS1", "HDS1", "LH1", "LH1",
                "DX2", "DX2", "DS2", "DS2", "WDX2", "WDX2", "HDS2", "HDS2", "LH2", "LH2",
                "DX3", "DX3", "DS3", "DS3", "WDX3", "WDX3", "HDS3", "HDS3", "LH3", "LH3",
                "DX4", "DX4", "DS4", "DS4", "WDX4", "WDX4", "HDS4", "HDS4", "LH4", "LH4",
                "DX5", "DX5", "DS5", "DS5", "WDX5", "WDX5", "HDS5", "HDS5",
                "DX6", "DX6", "DS6", "DS6", "WDX6", "WDX6", "HDS6", "HDS6",
                "DX7", "DX7", "DS7", "DS7", "WDX7", "WDX7", "HDS7", "HDS7",
                "DX8", "DX8", "DS8", "DS8", "WDX8", "WDX8", "HDS8", "HDS8"
        };
        tvSubs = new String[]{
                "D", "X", "D", "S", "D", "X",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S"
        };
    }
    public static void _KLSFklsf_lmInit() {
        tvTitles=new String[]{"任选二","选二连组","任选三","选三前组","任选四","任选五"};
        tvContents=new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        tvGames=new String[]{"LM2","LM22","LM3","LM32","LM4","LM5"};
        tvSubs=new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
    }

    public static void _NCklsf_zmInit() {
        tvTitles = new String[]{
                "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码",
                "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码", "正码",
                "总和", "总和", "总和", "总和", "总和", "总和"
        };
        tvContents = new String[]{
                "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "总和大", "总和单", "总和尾大", "总和小", "总和双", "总和尾小"
        };
        tvGames = new String[]{
                "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM",
                "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM", "ZM",
                "ZDX", "ZDS", "ZWDX",
                "ZDX", "ZDS", "ZWDX"
        };
        tvSubs = new String[]{
                "01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "D", "D", "D",
                "X", "S", "X"
        };
    }
    public static void _NClsf_ball1Init() {
        initTvs(37);
        String[] subString=new String[]{"D","X","D","S","D","X","D","S","0", "1","2","3","0","1","2","L","H"};
        String[] ballNString=new String[]{"第一球 ","第二球 ","第三球 ","第四球 ","第五球 ","第六球 ","第七球 ","第八球 "};
        String[] lotteryPageString=new String[]{"klsf_ball1","klsf_ball2","klsf_ball3","klsf_ball4","klsf_ball5","klsf_ball6",
                "klsf_ball7","klsf_ball8"};
        String[] contentString=new String[]{ "大", "小", "单", "双","尾大","尾小","合数单","合数双", "东","南","西","北","中","发","白","龙","虎"};
        String[] gameString=new String[]{"DXn","DXn","DSn","DSn","WDXn","WDXn","HDSn","HDSn","WFn",
                "WFn","WFn","WFn","ZFBn","ZFBn","ZFBn","LHn","LHn","Bn"};
        for (int i=0;i<37;i++){
            if (i<20){
                tvTitles[i]="球号";
                if (i<9){
                    tvSubs[i]="0"+String.valueOf(i+1);
                }else{
                    tvSubs[i]=String.valueOf(i+1);
                }
                tvContents[i]=ballNString[Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)]+tvSubs[i];
                tvGames[i]=gameString[17].replace("n",String.valueOf(Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)+1));
            }else {
                tvTitles[i]="两面";
                tvSubs[i]=subString[i-20];
                tvContents[i]=ballNString[Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)]+contentString[i-20];
                tvGames[i]=gameString[i-20].replace("n",String.valueOf(Arrays.binarySearch(lotteryPageString,MainGlobalData.LOTTERY_PAGE)+1));
            }
        }
    }
    public static void _NCklsf_ball2Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball3Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball4Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball5Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball6Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball7Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_ball8Init() {
        _KLSFklsf_ball1Init();
    }
    public static void _NCklsf_singleInit() {
        initTvs(160);
        String[] titleString=new String[]{"第一球","第二球","第三球","第四球","第五球","第六球","第七球","第八球"};
        String gameString="Bn";
        for (int i=0;i<160;i++){
            tvTitles[i]=titleString[i/20];
            tvGames[i]=gameString.replace("n",String.valueOf((i/20)+1));
            tvContents[i]=String.valueOf(i%20+1);
            if ((i%20+1)<10){
                tvSubs[i]="0"+String.valueOf(i%20+1);
            }else {
                tvSubs[i]=String.valueOf(i%20+1);
            }
        }
    }
    public static void _NCklsf_allInit() {
        initTvs(78);
        String[] titleString=new String[]{"总和","第一球","第二球","第三球","第四球","第五球","第六球","第七球","第八球"};
        String[] contentString1=new String[]{"总和大", "总和小", "总和单", "总和双", "总和尾大", "总和尾小"};
        String[] contentString2=new String[]{"大", "小", "单", "双", "尾大", "尾小", "合数单", "合数双", "龙", "虎"};
        for (int i=0;i<78;i++){
            if (i<6){
                tvTitles[i]=titleString[0];
                tvContents[i]=contentString1[i];
            }else if (i>=6&&i<46){
                tvTitles[i]=titleString[(i-6)/10+1];
                tvContents[i]=contentString2[(i-6)%10];
            }else {
                tvTitles[i]=titleString[(i-46)/8+5];
                tvContents[i]=contentString2[(i-46)%8];
            }
        }
        tvGames = new String[]{
                "ZDX", "ZDX", "ZDS", "ZDS", "ZWDX", "ZWDX",
                "DX1", "DX1", "DS1", "DS1", "WDX1", "WDX1", "HDS1", "HDS1", "LH1", "LH1",
                "DX2", "DX2", "DS2", "DS2", "WDX2", "WDX2", "HDS2", "HDS2", "LH2", "LH2",
                "DX3", "DX3", "DS3", "DS3", "WDX3", "WDX3", "HDS3", "HDS3", "LH3", "LH3",
                "DX4", "DX4", "DS4", "DS4", "WDX4", "WDX4", "HDS4", "HDS4", "LH4", "LH4",
                "DX5", "DX5", "DS5", "DS5", "WDX5", "WDX5", "HDS5", "HDS5",
                "DX6", "DX6", "DS6", "DS6", "WDX6", "WDX6", "HDS6", "HDS6",
                "DX7", "DX7", "DS7", "DS7", "WDX7", "WDX7", "HDS7", "HDS7",
                "DX8", "DX8", "DS8", "DS8", "WDX8", "WDX8", "HDS8", "HDS8"
        };
        tvSubs = new String[]{
                "D", "X", "D", "S", "D", "X",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S",
                "D", "X", "D", "S", "D", "X", "D", "S"
        };
    }
    public static void _NCklsf_lmInit() {
        tvTitles=new String[]{"任选二","选二连组","任选三","选三前组","任选四","任选五"};
        tvContents=new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
        tvGames=new String[]{"LM2","LM22","LM3","LM32","LM4","LM5"};
        tvSubs=new String[]{"01", "02", "03", "04", "05", "06", "07", "08", "09", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"};
    }
    public static void _11X5gd11x5_singleInit() {
        initTvs(66);
        String[] titleString=new String[]{"-中—","第一球","第二球","第三球","第四球","第五球"};
        String[] contentString=new String[]{ "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11"};
        String[] gameString=new String[]{ "ZM", "B1", "B2", "B3", "B4", "B5"};
        for (int i=0;i<66;i++){
            tvTitles[i]=titleString[i/11];
            tvContents[i]=contentString[i%11];
            tvSubs[i]=contentString[i%11];
            tvGames[i]=gameString[i/11];
        }
    }
    public static void _11X5gd11x5_twosideInit() {
        tvTitles = new String[]{
                "总和", "总和", "总和", "总和", "总和", "总和", "总和", "总和",
                "第一球", "第一球", "第一球", "第一球",
                "第二球", "第二球", "第二球", "第二球",
                "第三球", "第三球", "第三球", "第三球",
                "第四球", "第四球", "第四球", "第四球",
                "第五球", "第五球", "第五球", "第五球"
        };
        tvContents = new String[]{
                "总和大", "总和小", "总和单", "总和双", "总和尾大", "总和尾小", "虎", "龙",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双"
        };
        tvGames = new String[]{
                "ZDX", "ZDX", "ZDS", "ZDS", "ZWDX", "ZWDX", "LH", "LH",
                "DX1", "DX1", "DS1", "DS1",
                "DX2", "DX2", "DS2", "DS2",
                "DX3", "DX3", "DS3", "DS3",
                "DX4", "DX4", "DS4", "DS4",
                "DX5", "DX5", "DS5", "DS5"
        };
        tvSubs = new String[]{
                "D", "X", "D", "S", "D", "X", "H", "L",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S"
        };
    }
    public static void _11X5gd11x5_lmInit() {
        tvTitles = new String[]{
                "任选二中二","任选三中三","任选四中四","任选五中五","任选六中五","任选七中五","任选八中五","前二组选","前三组选"
        };
        tvContents=new String[]{
                "01","02","03","04","05","06","07","08","09","10","11"
        };
        tvGames=new String[]{
                "LM2","LM3","LM4","LM5","LM6","LM7","LM8","LM30","LM32"
        };
        tvSubs=new String[]{
                "01","02","03","04","05","06","07","08","09","10","11"
        };
    }
    public static void _11X5gd11x5_zxInit() {
        tvTitles = new String[]{
                "前二直选","前三直选"
        };
        tvContents=new String[]{
                "01","02","03","04","05","06","07","08","09","10","11","01","02","03","04","05","06","07","08","09","10","11",
                "01","02","03","04","05","06","07","08","09","10","11"
        };
        tvGames=new String[]{
                "Q2ZX","Q3ZX"
        };
        tvSubs=new String[]{
                "01","02","03","04","05","06","07","08","09","10","11"
        };
    }
    public static void _KLSFgxklsf_ball1Init() {
        initTvs(36);
        String[] contentString=new String[]{"红","绿","蓝","福","禄","寿","喜","大","小","单","双","尾大","尾小","合单","合双"};
        String[] subString=new String[]{"R","G","B","F","L","S","X","D","X","D","S","D","X","D","S"};
        String[] ballString=new String[]{ "B1", "B2", "B3", "B4", "B5"};
        String[] pageString=new String[]{ "gxklsf_ball1", "gxklsf_ball2", "gxklsf_ball3", "gxklsf_ball4", "gxklsf_ball5"};
        String[] gameString=new String[]{ "SBn","SBn","SBn","YFLSXn","YFLSXn","YFLSXn","YFLSXn","YDXn","YDXn","YDSn","YDSn","YWDXn","YWDXn","YHDSn","YHDSn"};
        for (int i=0;i<36;i++){
            tvTitles[i]="球号";
            if (i<21){
                tvContents[i]=generateDoubleNums(i+1);
                tvSubs[i]=generateDoubleNums(i+1);
                tvGames[i]=ballString[Arrays.binarySearch(pageString,MainGlobalData.LOTTERY_PAGE)];
            }else {
                tvContents[i]=contentString[i-21];
                tvSubs[i]=subString[i-21];
                tvGames[i]=gameString[i-21].replace("n",String.valueOf(Arrays.binarySearch(pageString,MainGlobalData.LOTTERY_PAGE)+1));
            }
        }
    }
    public static void _KLSFgxklsf_ball2Init() {
        _KLSFgxklsf_ball1Init();
    }
    public static void _KLSFgxklsf_ball3Init() {
        _KLSFgxklsf_ball1Init();
    }
    public static void _KLSFgxklsf_ball4Init() {
        _KLSFgxklsf_ball1Init();
    }
    public static void _KLSFgxklsf_ball5Init() {
        _KLSFgxklsf_ball1Init();
    }
    public static void _KLSFgxklsf_singleInit() {
        initTvs(105);
        String[] titleString=new String[]{"第一球","第二球","第三球","第四球","第五球"};
        String[] gameString=new String[]{"B1","B2","B3","B4","B5"};
        for (int i=0;i<105;i++){
            tvTitles[i]=titleString[i/21];
            tvContents[i]=generateDoubleNums(i%21+1);
            tvSubs[i]=generateDoubleNums(i%21+1);
            tvGames[i]=gameString[i/21];
        }
    }
    public static void _KLSFgxklsf_twosideInit() {
        initTvs(48);
        String[] titleString=new String[]{"总和、龙虎","第一球","第二球","第三球","第四球","第五球"};
        String[] contentString1=new String[]{"总和单","总和双", "总和大","总和小","总尾大","总尾小","龙","虎"};
        String[] contentString2=new String[]{"大", "小", "单", "双", "尾大", "尾小", "合单", "合双"};
        for (int i=0;i<48;i++){
            tvTitles[i]=titleString[i/8];
            if (i<8){
                tvContents[i]=contentString1[i];
            }else {
                tvContents[i]=contentString2[i%8];
            }
        }
        tvGames=new String[]{
                "ZDS","ZDS","ZDX","ZDX","ZWDX","ZWDX","LH15","LH15",
                "YDX1","YDX1","YDS1","YDS1","YWDX1","YWDX1","YHDS1","YHDS1",
                "YDX2","YDX2","YDS2","YDS2","YWDX2","YWDX2","YHDS2","YHDS2",
                "YDX3","YDX3","YDS3","YDS3","YWDX3","YWDX3","YHDS3","YHDS3",
                "YDX4","YDX4","YDS4","YDS4","YWDX4","YWDX4","YHDS4","YHDS4",
                "YDX5","YDX5","YDS5","YDS5","YWDX5","YWDX5","YHDS5","YHDS5"

        };
        tvSubs=new String[]{
                "D","S","D","X","D","X","L","H",
                "D","X","D","S","D","X","D","S",
                "D","X","D","S","D","X","D","S",
                "D","X","D","S","D","X","D","S",
                "D","X","D","S","D","X","D","S",
                "D","X","D","S","D","X","D","S"
        };
    }
    public static void _K3k3_yxxtbInit() {
        initTvs(6);
        for (int i=0;i<6;i++){
            tvTitles[i]="鱼虾蟹骰宝";
            tvGames[i]="3G";
            tvSubs[i]=String.valueOf(i+1);
        }
        tvContents = new String[]{
                "三军 1/鱼", "三军 2/虾", "三军 3/葫芦", "三军 4/金钱", "三军 5/螃蟹", "三军 6/鷄"
        };
    }
    public static void _K3k3_dxtbInit() {
        tvTitles = new String[]{
                "三军、大小","三军、大小","三军、大小","三军、大小","三军、大小","三军、大小","三军、大小","三军、大小",
                "围骰、全骰","围骰、全骰","围骰、全骰","围骰、全骰","围骰、全骰","围骰、全骰","围骰、全骰",
                "点数","点数","点数","点数","点数","点数","点数","点数","点数","点数","点数","点数","点数","点数",
                "长牌", "长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌","长牌",
                "短牌", "短牌","短牌","短牌","短牌","短牌"
        };
        tvContents = new String[]{
                "三军 1/鱼", "三军 2/虾", "三军 3/葫芦", "三军 4/金钱", "三军 5/螃蟹", "三军 6/鷄", "大", "小",
                "短牌 111","短牌 222","短牌 333","短牌 444","短牌 555","短牌 666","全骰",
                "点数 4点","点数 5点","点数 6点","点数 7点","点数 8点","点数 9点","点数 10点","点数 11点",
                "点数 12点","点数 13点","点数 14点","点数 15点","点数 16点","点数 17点",
                "长牌 12", "长牌 13","长牌 14","长牌 15","长牌 16","长牌 23","长牌 24","长牌 25","长牌 26",
                "长牌 34","长牌 35","长牌 36","长牌 45","长牌 46","长牌 56",
                "短牌 11", "短牌 22","短牌 33","短牌 44","短牌 55","短牌 66"
        };
        tvGames = new String[]{
                "3G", "3G","3G","3G","3G","3G","DX","DX",
                "WS", "WS","WS","WS","WS","WS","QS",
                "DS", "DS","DS","DS","DS","DS","DS","DS","DS","DS","DS","DS","DS","DS",
                "CP","CP","CP","CP","CP","CP","CP","CP","CP","CP","CP","CP","CP","CP","CP",
                "DP", "DP","DP","DP","DP","DP"

        };
        tvSubs = new String[]{
                "1", "2", "3", "4", "5", "6", "D", "X",
                "111", "222","333","444","555","666","0",
                "4", "5","6","7","8","9","10","11","12","13","14","15","16","17",
                "12","13","14","15","16","23","24","25","26","34","35","36","45","46","56",
                "11", "22","33","44","55","66"

        };
    }
    public static void _KL8kl8_zmInit() {
        initTvs(80);
        for (int i=0;i<80;i++){
            tvTitles[i]="正码";
            tvContents[i]=String.valueOf(i+1);
            tvGames[i]="ZM";
            tvSubs[i]=generateDoubleNums(i+1);
        }
    }
    public static void _KL8kl8_allInit() {
        tvTitles = new String[]{
                "总和", "总和", "总和", "总和", "总和", "总和", "总和", "总和", "总和",
                "前后和", "前后和", "前后和",
                "单双和", "单双和", "单双和",
                "五行", "五行", "五行", "五行", "五行"
        };
        tvContents = new String[]{
                "总和大", "总和小", "总和单", "总和双", "总和810", "总大单", "总大双", "总小单", "总小双",
                "前(多)", "後(多)", "前後(和)",
                "单(多)", "双(多)", "单双(和)",
                "金", "木", "水", "火", "土"
        };
        tvGames = new String[]{
                "ZDX", "ZDX", "ZDS", "ZDS", "ZHT", "DXDS", "DXDS", "DXDS", "DXDS",
                "QHH", "QHH", "QHH",
                "DSH", "DSH", "DSH",
                "WX", "WX", "WX", "WX", "WX"
        };
        tvSubs = new String[]{
                "D", "X", "D", "S", "810", "DD", "DS", "XD", "XS",
                "Q", "H", "T",
                "D", "S", "T",
                "0", "1", "2", "3", "4"
        };
    }
    public static void _SSCssc_ball1Init() {
        initTvs(36);
        String[] pageString=new String[]{"ssc_ball1","ssc_ball2","ssc_ball3","ssc_ball4","ssc_ball5"};
        String[] gameString=new String[]{ "Bn", "Bn", "Bn", "Bn", "Bn", "Bn", "Bn", "Bn", "Bn", "Bn",
                "DXn", "DXn", "DSn", "DSn", "ZDX", "ZDX", "ZDS", "ZDS", "LH", "LH", "LH",
                "TS1", "TS1", "TS1", "TS1", "TS1",
                "TS2", "TS2", "TS2", "TS2", "TS2",
                "TS3", "TS3", "TS3", "TS3", "TS3"};
        for (int i=0;i<36;i++){
            tvGames[i]=gameString[i].replace("n",String.valueOf(Arrays.binarySearch(pageString,MainGlobalData.LOTTERY_PAGE)+1));
        }
        tvTitles = new String[]{
                "球号", "球号", "球号", "球号", "球号", "球号", "球号", "球号", "球号", "球号",
                "两面", "两面", "两面", "两面", "两面", "两面", "两面", "两面", "两面", "两面", "两面",
                "前三", "前三", "前三", "前三", "前三",
                "中三", "中三", "中三", "中三", "中三",
                "后三", "后三", "后三", "后三", "后三"
        };
        tvContents = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "大", "小", "单", "双", "总和大", "总和小", "总和单", "总和双", "龙", "虎", "和",
                "豹子", "顺子", "对子", "半顺", "杂六",
                "豹子", "顺子", "对子", "半顺", "杂六",
                "豹子", "顺子", "对子", "半顺", "杂六"
        };
        tvSubs = new String[]{
                "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D", "X", "D", "S", "D", "X", "D", "S", "L", "H", "T",
                "0", "1", "2", "3", "4",
                "0", "1", "2", "3", "4",
                "0", "1", "2", "3", "4"
        };
    }
    public static void _SSCssc_ball2Init() {
        _SSCssc_ball1Init();
    }
    public static void _SSCssc_ball3Init() {
        _SSCssc_ball1Init();
    }
    public static void _SSCssc_ball4Init() {
        _SSCssc_ball1Init();
    }
    public static void _SSCssc_ball5Init() {
        _SSCssc_ball1Init();
    }
    public static void _SSCssc_allInit() {
        tvTitles = new String[]{
                "总和-龙虎和", "总和-龙虎和", "总和-龙虎和", "总和-龙虎和", "总和-龙虎和", "总和-龙虎和", "总和-龙虎和",
                "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球", "第一球",
                "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球", "第二球",
                "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球", "第三球",
                "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球", "第四球",
                "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球", "第五球",
                "前三", "前三", "前三", "前三", "前三",
                "中三", "中三", "中三", "中三", "中三",
                "后三", "后三", "后三", "后三", "后三"
        };
        tvContents = new String[]{
                "总和大", "总和小", "总和单", "总和双", "龙", "虎", "和",
                "大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "大", "小", "单", "双", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "豹子", "顺子", "对子", "半顺", "杂六",
                "豹子", "顺子", "对子", "半顺", "杂六",
                "豹子", "顺子", "对子", "半顺", "杂六"
        };
        tvGames = new String[]{
                "ZDX", "ZDX", "ZDS", "ZDS", "LH", "LH", "LH",
                "DX1", "DX1", "DS1", "DS1", "B1", "B1", "B1", "B1", "B1", "B1", "B1", "B1", "B1", "B1",
                "DX2", "DX2", "DS2", "DS2", "B2", "B2", "B2", "B2", "B2", "B2", "B2", "B2", "B2", "B2",
                "DX3", "DX3", "DS3", "DS3", "B3", "B3", "B3", "B3", "B3", "B3", "B3", "B3", "B3", "B3",
                "DX4", "DX4", "DS4", "DS4", "B4", "B4", "B4", "B4", "B4", "B4", "B4", "B4", "B4", "B4",
                "DX5", "DX5", "DS5", "DS5", "B5", "B5", "B5", "B5", "B5", "B5", "B5", "B5", "B5", "B5",
                "TS1", "TS1", "TS1", "TS1", "TS1",
                "TS2", "TS2", "TS2", "TS2", "TS2",
                "TS3", "TS3", "TS3", "TS3", "TS3"

        };
        tvSubs = new String[]{
                "D", "X", "D", "S", "L", "H", "T",
                "D", "X", "D", "S", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D", "X", "D", "S", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D", "X", "D", "S", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D", "X", "D", "S", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "D", "X", "D", "S", "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "0", "1", "2", "3", "4",
                "0", "1", "2", "3", "4",
                "0", "1", "2", "3", "4"
        };
    }
    public static void _PK10pk10_championshipInit() {
        for (int i=0;i<21;i++){
            tvTitles[i]="冠、亚军和";
        }
        tvContents = new String[]{
                "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "冠亚大",
                "冠亚小", "冠亚单", "冠亚双"
        };
        tvGames = new String[]{
                "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GYH",
                "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GYH", "GDX", "GDX",
                "GDS", "GDS"
        };
        tvSubs = new String[]{
                "3", "4", "5", "6", "7", "8", "9", "10",
                "11", "12", "13", "14", "15", "16", "17", "18", "19", "D",
                "X", "D", "S"
        };
    }
    public static void _PK10pk10_singleInit() {
        initTvs(100);
        String balln="Bn";
        String[] titleString=new String[]{"冠军","亚军","第三名","第四名","第五名","第六名","第七名","第八名","第九名","第十名"};
        for (int i=0;i<100;i++){
            tvTitles[i]=titleString[i/10];
            tvContents[i]=String.valueOf(i%10+1);
            tvSubs[i]=String.valueOf(i%10+1);
            tvGames[i]=balln.replace("n",String.valueOf(i/10+1));
        }
    }
    public static void _PK10pk10_twosideInit() {
        tvTitles = new String[]{
                "冠、亚军和", "冠、亚军和", "冠、亚军和", "冠、亚军和",
                "冠军", "冠军", "冠军", "冠军", "冠军", "冠军",
                "亚军", "亚军", "亚军", "亚军", "亚军", "亚军",
                "第三名", "第三名", "第三名", "第三名", "第三名", "第三名",
                "第四名", "第四名", "第四名", "第四名", "第四名", "第四名",
                "第五名", "第五名", "第五名", "第五名", "第五名", "第五名",
                "第六名", "第六名", "第六名", "第六名",
                "第七名", "第七名", "第七名", "第七名",
                "第八名", "第八名", "第八名", "第八名",
                "第九名", "第九名", "第九名", "第九名",
                "第十名", "第十名", "第十名", "第十名"
        };
        tvContents = new String[]{
                "冠亚大", "冠亚小", "冠亚单", "冠亚双",
                "大", "小", "单", "双", "龙", "虎",
                "大", "小", "单", "双", "龙", "虎",
                "大", "小", "单", "双", "龙", "虎",
                "大", "小", "单", "双", "龙", "虎",
                "大", "小", "单", "双", "龙", "虎",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双",
                "大", "小", "单", "双"
        };
        tvGames = new String[]{
                "GDX", "GDX", "GDS", "GDS",
                "DX1", "DX1", "DS1", "DS1", "LH1", "LH1",
                "DX2", "DX2", "DS2", "DS2", "LH2", "LH2",
                "DX3", "DX3", "DS3", "DS3", "LH3", "LH3",
                "DX4", "DX4", "DS4", "DS4", "LH4", "LH4",
                "DX5", "DX5", "DS5", "DS5", "LH5", "LH5",
                "DX6", "DX6", "DS6", "DS6",
                "DX7", "DX7", "DS7", "DS7",
                "DX8", "DX8", "DS8", "DS8",
                "DX9", "DX9", "DS9", "DS9",
                "DX10", "DX10", "DS10", "DS10"
        };
        tvSubs = new String[]{
                "D", "X", "D", "S",
                "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S", "L", "H",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S",
                "D", "X", "D", "S"
        };
    }

    public static int initWindowNum(String lotteryType, String lotteryPage, TextView tvSelect1,TextView tvSelect2) {
        int windowNum=0;
        String[] pageString=new String[]{"pk10_twoside","pk10_single","pk10_championship","ssc_all","ssc_ball1","ssc_ball2","ssc_ball3","ssc_ball4","ssc_ball5",
                "kl8_all","kl8_zm","k3_dxtb","k3_yxxtb","gxklsf_twoside","gxklsf_single","gxklsf_ball1","gxklsf_ball2",
                "gxklsf_ball3","gxklsf_ball4","gxklsf_ball5","gd11x5_twoside","gd11x5_single","gd11x5_lm","klsf_all",
                "klsf_lm","klsf_single","klsf_ball1","klsf_ball2","klsf_ball3","klsf_ball4","klsf_ball5","klsf_ball6","klsf_ball7",
                "klsf_ball8","klsf_zm","3D_main","3D_combin1","3D_combin2","3D_combin3","3D_locate1","3D_locate2","3D_locate3",
                "3D_sum2","3D_sum3","3D_span","hk6_tm","hk6_srsx","hk6_zhengxiao","hk6_tws","hk6_zmt","hk6_zm16","hk6_wx",
                "hk6_7sb","hk6_zongxiao","hk6_lm","3D_select3","3D_select6","hk6_zxbz"};
        String[] select2String=new String[]{"两面盘","单号1~10","冠亚军组合","整合","第一球","第二球","第三球","第四球","第五球",
                "整合","正码","大小骰宝","鱼虾蟹骰宝","两面","单号1~5","第一球","第二球","第三球","第四球","第五球","两面","单号","连码",
                "整合","连码","单球1~8","第一球","第二球","第三球","第四球","第五球","第六球","第七球","第八球","正码","主势盘","一字组合",
                "二字组合","三字组合","一字定位","二字定位","三字定位","二字和数","三字和数","跨度","特码","十二生肖","正肖","头尾数","正码特",
                "正码1-6","五行","7色波","总肖","连码","组选三","组选六","自选不中"};
       int[] winNums=new int[]{54,100,21,92,36,36,36,36,36,20,80,50,6,48,105,36,36,36,36,36,28,66,20,78,26,160,37,37
                ,37,37,35,35,35,35,26,54,28,55,220,30,20,30,21,26,10,63,12,12,15,58,78,5,4,8,55,10,10,49};
        String[] typeString=new String[]{"BJPK10","CQSSC","XJSSC","TJSSC","BJKL8","GXK3","GXKLSF","GDKLSF","XYNC","F3D","PL3","HK6","GD11X5"};
        String[] select1String=new String[]{"北京赛车(PK10)","重庆时时彩","新疆时时彩","天津时时彩","北京快乐8","广西快3","广西快乐十分","广东快乐十分","重庆幸运农场","福彩3D","体彩排列3","香港六合彩","广东11选5"};
        tvSelect1.setText(select1String[MainGlobalData.find(typeString,MainGlobalData.LOTTERY_TYPE)]);
        if (lotteryType.equals("GD11X5")&&lotteryPage.equals("gd11x5_zx")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("")||MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
                windowNum=22;
            }else  if (MainGlobalData.LOTTERY_SUBTITLE.equals("")||MainGlobalData.LOTTERY_SUBTITLE.equals("qszx")){
                windowNum=33;
            }
            tvSelect2.setText("直选");
        }else if (lotteryPage.equals("hk6_yxws")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
                windowNum=12;
            }else {
                windowNum=10;
            }
            tvSelect2.setText("一肖尾数");
        }else if (lotteryPage.equals("hk6_dp")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx2")||MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx3")||
                    MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx4")||MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx5")){
                windowNum=12;
            }else {
                windowNum=10;
            }
            tvSelect2.setText("对碰");
        }else {
            windowNum=winNums[MainGlobalData.find(pageString,MainGlobalData.LOTTERY_PAGE)];
            tvSelect2.setText(select2String[MainGlobalData.find(pageString,MainGlobalData.LOTTERY_PAGE)]);
        }
        return windowNum;
    }


    public static String selectGames(String lotteryType, String page) {
        String[] pageString=new String[]{"pk10_twoside","pk10_single","pk10_championship","ssc_all","ssc_ball1","ssc_ball2","ssc_ball3","ssc_ball4","ssc_ball5",
                "kl8_all","kl8_zm","k3_dxtb","k3_yxxtb","gxklsf_twoside","gxklsf_single","gxklsf_ball1","gxklsf_ball2",
                "gxklsf_ball3","gxklsf_ball4","gxklsf_ball5","gd11x5_twoside","gd11x5_single","gd11x5_lm","klsf_all",
                "klsf_lm","klsf_single","klsf_ball1","klsf_ball2","klsf_ball3","klsf_ball4","klsf_ball5","klsf_ball6","klsf_ball7",
                "klsf_ball8","klsf_zm","3D_main","3D_combin1","3D_combin2","3D_combin3","3D_locate1","3D_locate2","3D_locate3",
                "3D_sum2","3D_sum3","3D_span","hk6_tm","hk6_srsx","hk6_zhengxiao","hk6_tws","hk6_zmt","hk6_zm16","hk6_wx",
                "hk6_7sb","hk6_zongxiao","hk6_lm","3D_select3","3D_select6","hk6_zxbz"};
        String[] gameString=new String[]{"GDS,GDX,DX1,DX2,DX3,DX4,DX5,DX6,DX7,DX8,DX9,DX10,DS1,DS2,DS3,DS4,DS5,DS6,DS7,DS8,DS9,DS10,LH1,LH2,LH3,LH4,LH5",
                "B1,B2,B3,B4,B5,B6,B7,B8,B9,B10","GYH,GDS,GDX","B1,B2,B3,B4,B5,ZDX,ZDS,LH,DX1,DX2,DX3,DX4,DX5,DS1,DS2,DS3,DS4,DS5,TS1,TS2,TS3",
                "B1,DX1,DS1,ZDX,ZDS,LH,TS1,TS2,TS3","B2,DX2,DS2,ZDX,ZDS,LH,TS1,TS2,TS3","B3,DX3,DS3,ZDX,ZDS,LH,TS1,TS2,TS3",
                "B4,DX4,DS4,ZDX,ZDS,LH,TS1,TS2,TS3","B5,DX5,DS5,ZDX,ZDS,LH,TS1,TS2,TS3","ZDX,ZDS,ZHT,DXDS,DSH,QHH,WX",
                "ZM","3G,DX,WS,QS,DS,CP,DP","3G","ZDS,ZDX,ZWDX,LH15,YDX1,YDX2,YDX3,YDX4,YDX5,YDS1,YDS2,YDS3,YDS4,YDS5," +
                "YWDX1,YWDX2,YWDX3,YWDX4,YWDX5,YHDS1,YHDS2,YHDS3,YHDS4,YHDS5","B1,B2,B3,B4,B5", "B1,YFLSX1,SB1,YDX1,YDS1,YWDX1,YHDS1",
                "B2,YFLSX2,SB2,YDX2,YDS2,YWDX2,YHDS2","B3,YFLSX3,SB3,YDX3,YDS3,YWDX3,YHDS3","B4,YFLSX4,SB4,YDX4,YDS4,YWDX4,YHDS4",
                "B5,YFLSX5,SB5,YDX5,YDS5,YWDX5,YHDS5","ZDX,ZDS,ZWDX,LH,DX1,DX2,DX3,DX4,DX5,DS1,DS2,DS3,DS4,DS5",
                "ZM,B1,B2,B3,B4,B5","LM2,LM3,LM4,LM5,LM6,LM7,LM8,LM30,LM32", "ZWDX,ZDS,ZDX,DS1,DS2,DS3,DS4,DS5,DS6,DS7,DS8,DX1,DX2,DX3,DX4,DX5,DX6,DX7,DX8," +
                "HDS1,HDS2,HDS3,HDS4,HDS5,HDS6,HDS7,HDS8,LH1,LH2,LH3,LH4,WDX1,WDX2,WDX3,WDX4,WDX5,WDX6,WDX7,WDX8","LM2,LM22,LM3,LM32,LM4,LM5",
                "B1,B2,B3,B4,B5,B6,B7,B8","B1,DX1,DS1,WDX1,HDS1,FW1,ZFB1,LH1", "B2,DX2,DS2,WDX2,HDS2,FW2,ZFB2,LH2", "B3,DX3,DS3,WDX3,HDS3,FW3,ZFB3,LH3",
                "B4,DX4,DS4,WDX4,HDS4,FW4,ZFB4,LH4","B5,DX5,DS5,WDX5,HDS5,FW5,ZFB5","B6,DX6,DS6,WDX6,HDS6,FW6,ZFB6",
                "B7,DX7,DS7,WDX7,HDS7,FW7,ZFB7","B8,DX8,DS8,WDX8,HDS8,FW8,ZFB8","ZM,ZWDX,ZDX,ZDS","1Z,DS1,DS2,DS3,DS12,DS23,DS13,3DS,3DX,DX1,DX2,DX3,DX12,DX13,DX23,DX123,3ZIH,ZIH1,ZIH2,ZIH12,ZIH23,ZIH3,ZIH13",
                "1Z,DS1,DS2,DS3,DX1,DX2,DX3,ZIH1,ZIH2,ZIH3","2Z","3Z","DW1,DW2,DW3","DW12,DW23,DW13","3DW","HWS12,HS12,HWS13,HS13,HWS23,HS23",
                "HS,HWS123","KD","TMA,WDX,DS,DX,HDS,TDXDS,HDX,TMB","SX","ZX","TMTS,TMWS","TMTS,TMWS","ZHDS1,ZHDS2,ZHDS3,ZHDS4,ZHDS5,ZHDS6" +
                ",ZHDX1,ZHDX2,ZHDX3,ZHDX4,ZHDX5,ZHDX6,ZMDS1,ZMDS2,ZMDS3,ZMDS4,ZMDS5,ZMDS6," +
                "ZMDX1,ZMDX2,ZMDX3,ZMDX4,ZMDX5,ZMDX6,ZMSB1,ZMSB2,ZMSB3,ZMSB4,ZMSB5,ZMSB6," +
                "ZMWDX1,ZMWDX2,ZMWDX3,ZMWDX4,ZMWDX5,ZMWDX6", "WX","7SB","ZSX,ZSXDS","LM2QZ,LM3QZ,LM4QZ,LM2ZT,LMTC,LM3Z2","ZX3","ZX6","ZXBZ"
        };
       if (lotteryType.equals("GD11X5")&&page.equals("gd11x5_zx")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
                games = "Q2ZX";
            }else {
                games = "Q3ZX";
            }
        }else if (page.equals("3D_locate2")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")){
                games = "DW12";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")){
                games = "DW13";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
                games = "DW23";
            }
        }else if (page.equals("3D_sum2")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bs")){
                games = "HWS12,HS12";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bg")){
                games = "HWS13,HS13";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_sg")){
                games = "HWS23,HS23";
            }
        }else if (page.equals("hk6_tm")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_A")){
                games = "TMA,WDX,DS,DX,HDS,TDXDS,HDX";
            }else {
                games = "TMB,WDX,DS,DX,HDS,TDXDS,HDX";
            }
        }else if (page.equals("hk6_tws")){
            games = "TMTS,TMWS";
        }else if (page.equals("hk6_zmt")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z1t")){
                games = "ZHDS1,ZMDS1,ZMDX1,ZMSB1,ZMT1";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z2t")){
                games = "ZHDS2,ZMDS2,ZMDX2,ZMSB2,ZMT2";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z3t")){
                games = "ZHDS3,ZMDS3,ZMDX3,ZMSB3,ZMT3";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z4t")){
                games = "ZHDS4,ZMDS4,ZMDX4,ZMSB4,ZMT4";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z5t")){
                games = "ZHDS5,ZMDS5,ZMDX5,ZMSB5,ZMT5";
            }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z6t")){
                games = "ZHDS6,ZMDS6,ZMDX6,ZMSB6,ZMT6";
            }
        }else if (page.equals("hk6_yxws")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
                games = "YX";
            }else {
                games = "WS";
            }
        }else if (page.equals("hk6_dp")){
            if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx2")){
                games = "LX2";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx3")){
                games = "LX3";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx4")){
                games = "LX4";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx5")){
                games = "LX5";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw2")){
                games = "LW2";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw3")){
                games = "LW3";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw4")){
                games = "LW4";
            }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw5")){
                games = "LW5";
            }
        }else {
           games=gameString[MainGlobalData.find(pageString,MainGlobalData.LOTTERY_PAGE)];
       }
        return games;
    }

    private static boolean isThreeNumMeetRule(String numStr) {
        String numStr1=numStr.substring(0,1);
        String numStr2=numStr.substring(1,2);
        String numStr3=numStr.substring(2,3);
        int num1=Integer.parseInt(numStr1);
        int num2=Integer.parseInt(numStr2);
        int num3=Integer.parseInt(numStr3);
        Log.e("------",numStr);
        return (num1<=num2&&num2<=num3)?true:false;
    }

    private static boolean isTwoNumMeetRule(String numStr) {
        String numStr1=numStr.substring(0,1);
        String numStr2=numStr.substring(1,2);
        int num1=Integer.parseInt(numStr1);
        int num2=Integer.parseInt(numStr2);
        return (num1<=num2)?true:false;
    }

    private static String generateDoubleNums(int num) {
        String numStr="";
        if (num<9){
            numStr="0"+String.valueOf(num);
        }else {
            numStr=String.valueOf(num);
        }
        return numStr;
    }
}
