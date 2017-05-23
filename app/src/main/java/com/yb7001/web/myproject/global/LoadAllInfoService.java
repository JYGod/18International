package com.yb7001.web.myproject.global;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Nullable;

import com.google.gson.Gson;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.bean.LoadLotteryInfo;
import com.yb7001.web.myproject.paser.LotteryPaser;
import com.yb7001.web.myproject.service.SoapServiceImpl;
import com.yb7001.web.myproject.tools.CountDownTimerUtil;
import com.yb7001.web.myproject.tools.DateUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;


public class LoadAllInfoService extends IntentService {

    private static final String ACTION_INIT_ACTIVITY="com.yb7001.web.myproject.global.action.INIT_ACTIVITY";
    private static Context mContext;
    private static Intent mIntent;
    private static String lotteryGames;
    private static String resPeilv;
    private static int numSize;
    private String nowStart,nowEnd;
    private Long closeTimeStamp,openTimeStamp,nowTimeStamp;
    private CountDownTimerUtil timer_fp,timer_kj;


    public static void startInitActivity(Context context,String lotteryType,String page){
        mContext=context;
        lotteryGames=DataInit.selectGames(lotteryType,page);
        mIntent=new Intent(MainGlobalData.INIT_RESULT);
        Intent intent=new Intent(context,LoadAllInfoService.class);
        intent.setAction(ACTION_INIT_ACTIVITY);
        intent.putExtra("lotteryType",lotteryType);
        intent.putExtra("lotteryGames",lotteryGames);
        intent.putExtra("page",page);
        context.startService(intent);
    }

    public LoadAllInfoService() {
        super("LoadAllInfoService");
    }



    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

        if (intent!=null){
            final String action=intent.getAction();
            if (ACTION_INIT_ACTIVITY.equals(action)){
                final String lotteryType=MainGlobalData.LOTTERY_TYPE;
                final String lotteryGames=intent.getStringExtra("lotteryGames");
                final String page=intent.getStringExtra("page");
                loadLotteryInfo(lotteryType,lotteryGames,page);
            }
        }
    }

    private void loadLotteryInfo(String lotteryType,String lotteryGames,String page) {
        Calendar now = Calendar.getInstance();
        nowStart = now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH) + "  00:00:00";
        nowEnd = now.get(Calendar.YEAR) + "/" + (now.get(Calendar.MONTH) + 1) + "/" + now.get(Calendar.DAY_OF_MONTH) + "  23:59:59";
        String resPeilv="";
        if (MainGlobalData.LOTTERY_PAGE.equals("3D_select3")){

        }else {
            resPeilv = new SoapServiceImpl().loadLotteryPeilvService(lotteryType, lotteryGames, "A", MainGlobalData.TOKEN);
        }
        String lotteryInfo = new SoapServiceImpl().loadLotteryInfoService(lotteryType, MainGlobalData.TOKEN);
        String result = new SoapServiceImpl().loadLotteryHistoryService(lotteryType, nowStart, nowEnd, 1, 1, MainGlobalData.TOKEN);
        Gson gson = new Gson();
        if (lotteryInfo!=null){
            LoadLotteryInfo loadLotteryInfo = gson.fromJson(lotteryInfo, LoadLotteryInfo.class);
            String closeTime = loadLotteryInfo.getResult().getCloseTime();
            String openTime = loadLotteryInfo.getResult().getDrawTime();
            closeTimeStamp = Long.valueOf(closeTime);
            openTimeStamp = Long.valueOf(openTime);
            nowTimeStamp = DateUtils.getTimeStamp(DateUtils.getCurrentTime());
            mIntent.putExtra("dNumber",loadLotteryInfo.getResult().getDrawNumber());
            mIntent.putExtra("pNumber",loadLotteryInfo.getResult().getPnumber() + "期");
            mIntent.putExtra("closeTimeStamp",closeTimeStamp);
            mIntent.putExtra("openTimeStamp",openTimeStamp);
            mIntent.putExtra("nowTimeStamp",nowTimeStamp);
            if (closeTimeStamp >= nowTimeStamp) {//距离封盘
                mIntent.putExtra("isFengpan", true);
            } else {
                mIntent.putExtra("isFengpan", false);
            }
        }
        if (result!=null){
            transDifTypeNums(lotteryType,result);
        }
        transPeilvRes(page,resPeilv);
        mIntent.putExtra("isLoadFinish",true);
        String selectRes = new SoapServiceImpl().loadUserBetsService("1", 10, 1, MainGlobalData.TOKEN);
        sendBroadcast(mIntent);

    }

    private void transDifTypeNums(String lotteryType,String result) {
        ArrayList<String>types=new ArrayList<>(Arrays.asList("BJPK10","CQSSC","XJSSC","TJSSC","BJKL8","GXK3","GXKLSF",
                "GD11X5","GDKLSF","XYNC","F3D","PL3","HK6"));
        ArrayList<String>names=new ArrayList<>(Arrays.asList("twoSideResult","sscResult","sscResult","sscResult",
                "kl8Result","k3Result","GXKLSFResult","GD11X5FResult","KLSFResult","KLSFResult","_3DResult","_3DResult","hk6Result"));
        Class<LotteryPaser>LotteryPrserClass=LotteryPaser.class;
        try {
            Method method=LotteryPrserClass.getMethod(names.get(types.indexOf(lotteryType)),String.class);
            String[] nums = (String[]) method.invoke(LotteryPrserClass.newInstance(), result);
            mIntent.putExtra("nums",nums);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    private void transPeilvRes(String page,String resPeilv) {

        if (!resPeilv.equals("请求数据失败！")){
            String methodName="_"+MainGlobalData.LOTTERY_TYPE.substring(2)+MainGlobalData.LOTTERY_PAGE+"Peilv";
            Class<LotteryPaser>LotteryPrserClass=LotteryPaser.class;
            try {
                Method method=LotteryPrserClass.getMethod(methodName,String.class);
                String[] peilvStrings = (String[]) method.invoke(LotteryPrserClass.newInstance(), resPeilv);
                mIntent.putExtra("peilvStrings",peilvStrings);
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }



}
