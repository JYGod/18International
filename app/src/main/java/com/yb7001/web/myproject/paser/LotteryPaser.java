package com.yb7001.web.myproject.paser;

import com.google.gson.Gson;
import com.yb7001.web.myproject.bean.LoadLotteryHistory;
import com.yb7001.web.myproject.MainGlobalData;
import com.yb7001.web.myproject.peilv.F3D_1;
import com.yb7001.web.myproject.peilv.GD11X5.GD11X5;
import com.yb7001.web.myproject.peilv.GD11X5.GD11X5_Q2ZX;
import com.yb7001.web.myproject.peilv.GD11X5.GD11X5_Q3ZX;
import com.yb7001.web.myproject.peilv.GDKLSF.GDKLSF_1;
import com.yb7001.web.myproject.peilv.GDKLSF.GDKLSF_2;
import com.yb7001.web.myproject.peilv.GXKLSF.GXKLSF;
import com.yb7001.web.myproject.peilv.HK6_1;
import com.yb7001.web.myproject.peilv.KL8.KL8;
import com.yb7001.web.myproject.peilv.KL8.KL8_ZM;
import com.yb7001.web.myproject.peilv.PK10.PK10;
import com.yb7001.web.myproject.peilv.SSC.SSC;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class LotteryPaser {


    /**
     * 北京赛车
     * @param result
     * @return
     */
    public static String[] twoSideResult(String result){

        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(), res.getOpenNo4(), res.getOpenNo5(),
                    res.getOpenNo6(), res.getOpenNo7(), res.getOpenNo8(), res.getOpenNo9(), res.getOpenNo10()};
        }
        return nums;
    }

    public static String[] _PK10pk10_twosidePeilv(String res){
        Gson gson=new Gson();
        PK10 pk10 = gson.fromJson(res, PK10.class);
        String[] resultString = new String[]{
                pk10.getResult().getGDS_D(), pk10.getResult().getGDS_S(), pk10.getResult().getGDX_D(), pk10.getResult().getGDX_X(),
                pk10.getResult().getDX1_D(), pk10.getResult().getDX1_X(), pk10.getResult().getDX2_D(), pk10.getResult().getDX2_X(),
                pk10.getResult().getDX3_D(), pk10.getResult().getDX3_X(), pk10.getResult().getDX4_D(), pk10.getResult().getDX4_X(),
                pk10.getResult().getDX5_D(), pk10.getResult().getDX5_X(), pk10.getResult().getDX6_D(), pk10.getResult().getDX6_X(),
                pk10.getResult().getDX7_D(), pk10.getResult().getDX7_X(), pk10.getResult().getDX8_D(), pk10.getResult().getDX8_X(),
                pk10.getResult().getDX9_D(), pk10.getResult().getDX9_X(), pk10.getResult().getDX10_D(), pk10.getResult().getDX10_X(),
                pk10.getResult().getDS1_D(), pk10.getResult().getDS1_S(), pk10.getResult().getDS2_D(), pk10.getResult().getDS2_S(),
                pk10.getResult().getDS3_D(), pk10.getResult().getDS3_S(), pk10.getResult().getDS4_D(), pk10.getResult().getDS4_S(),
                pk10.getResult().getDS5_D(), pk10.getResult().getDS5_S(), pk10.getResult().getDS6_D(), pk10.getResult().getDS6_S(),
                pk10.getResult().getDS7_D(), pk10.getResult().getDS7_S(), pk10.getResult().getDS8_D(), pk10.getResult().getDS8_S(),
                pk10.getResult().getDS9_D(), pk10.getResult().getDS9_S(), pk10.getResult().getDS10_D(), pk10.getResult().getDS10_S(),
                pk10.getResult().getLH1_H(), pk10.getResult().getLH1_L(), pk10.getResult().getLH2_H(), pk10.getResult().getLH2_L(),
                pk10.getResult().getLH3_H(), pk10.getResult().getLH3_L(), pk10.getResult().getLH4_H(), pk10.getResult().getLH4_L(),
                pk10.getResult().getLH5_H(), pk10.getResult().getLH5_L(),
        };
        return resultString;
    }

    public static String[] _PK10pk10_singlePeilv(String res) {
        Gson gson=new Gson();
        PK10 pk10 = gson.fromJson(res, PK10.class);
        String[] resultString = new String[]{
                pk10.getResult().getB1_1(), pk10.getResult().getB1_2(), pk10.getResult().getB1_3(), pk10.getResult().getB1_4(),
                pk10.getResult().getB1_5(), pk10.getResult().getB1_6(), pk10.getResult().getB1_7(), pk10.getResult().getB1_8(),
                pk10.getResult().getB1_9(), pk10.getResult().getB1_10(),
                pk10.getResult().getB2_1(), pk10.getResult().getB2_2(), pk10.getResult().getB2_3(), pk10.getResult().getB2_4(),
                pk10.getResult().getB2_5(), pk10.getResult().getB2_6(), pk10.getResult().getB2_7(), pk10.getResult().getB2_8(),
                pk10.getResult().getB2_9(), pk10.getResult().getB2_10(),
                pk10.getResult().getB3_1(), pk10.getResult().getB3_2(), pk10.getResult().getB3_3(), pk10.getResult().getB3_4(),
                pk10.getResult().getB3_5(), pk10.getResult().getB3_6(), pk10.getResult().getB3_7(), pk10.getResult().getB3_8(),
                pk10.getResult().getB3_9(), pk10.getResult().getB3_10(),
                pk10.getResult().getB4_1(), pk10.getResult().getB4_2(), pk10.getResult().getB4_3(), pk10.getResult().getB4_4(),
                pk10.getResult().getB4_5(), pk10.getResult().getB4_6(), pk10.getResult().getB4_7(), pk10.getResult().getB4_8(),
                pk10.getResult().getB4_9(), pk10.getResult().getB4_10(),
                pk10.getResult().getB5_1(), pk10.getResult().getB5_2(), pk10.getResult().getB5_3(), pk10.getResult().getB5_4(),
                pk10.getResult().getB5_5(), pk10.getResult().getB5_6(), pk10.getResult().getB5_7(), pk10.getResult().getB5_8(),
                pk10.getResult().getB5_9(), pk10.getResult().getB5_10(),
                pk10.getResult().getB6_1(), pk10.getResult().getB6_2(), pk10.getResult().getB6_3(), pk10.getResult().getB6_4(),
                pk10.getResult().getB6_5(), pk10.getResult().getB6_6(), pk10.getResult().getB6_7(), pk10.getResult().getB6_8(),
                pk10.getResult().getB6_9(), pk10.getResult().getB6_10(),
                pk10.getResult().getB7_1(), pk10.getResult().getB7_2(), pk10.getResult().getB7_3(), pk10.getResult().getB7_4(),
                pk10.getResult().getB7_5(), pk10.getResult().getB7_6(), pk10.getResult().getB7_7(), pk10.getResult().getB7_8(),
                pk10.getResult().getB7_9(), pk10.getResult().getB7_10(),
                pk10.getResult().getB8_1(), pk10.getResult().getB8_2(), pk10.getResult().getB8_3(), pk10.getResult().getB8_4(),
                pk10.getResult().getB8_5(), pk10.getResult().getB8_6(), pk10.getResult().getB8_7(), pk10.getResult().getB8_8(),
                pk10.getResult().getB8_9(), pk10.getResult().getB8_10(),
                pk10.getResult().getB9_1(), pk10.getResult().getB9_2(), pk10.getResult().getB9_3(), pk10.getResult().getB9_4(),
                pk10.getResult().getB9_5(), pk10.getResult().getB9_6(), pk10.getResult().getB9_7(), pk10.getResult().getB9_8(),
                pk10.getResult().getB9_9(), pk10.getResult().getB9_10(),
                pk10.getResult().getB10_1(), pk10.getResult().getB10_2(), pk10.getResult().getB10_3(), pk10.getResult().getB10_4(),
                pk10.getResult().getB10_5(), pk10.getResult().getB10_6(), pk10.getResult().getB10_7(), pk10.getResult().getB10_8(),
                pk10.getResult().getB10_9(), pk10.getResult().getB10_10(),
        };
        return resultString;
    }

    public static String[] _PK10pk10_championshipPeilv(String resPeilv) {
        Gson gson=new Gson();
        PK10 pk10 = gson.fromJson(resPeilv, PK10.class);
        String[] resultString = new String[]{
                pk10.getResult().getGYH_3(), pk10.getResult().getGYH_4(), pk10.getResult().getGYH_5(),
                pk10.getResult().getGYH_6(), pk10.getResult().getGYH_7(), pk10.getResult().getGYH_8(),
                pk10.getResult().getGYH_9(), pk10.getResult().getGYH_10(), pk10.getResult().getGYH_11(),
                pk10.getResult().getGYH_12(), pk10.getResult().getGYH_13(), pk10.getResult().getGYH_14(),
                pk10.getResult().getGYH_15(), pk10.getResult().getGYH_16(), pk10.getResult().getGYH_17(),
                pk10.getResult().getGYH_18(), pk10.getResult().getGYH_19(),
                pk10.getResult().getGDX_D(), pk10.getResult().getGDX_X(),
                pk10.getResult().getGDS_D(), pk10.getResult().getGDS_S()
        };
        return resultString;
    }

    /**
     * 重庆时时彩
     * @param result
     * @return
     */
    public static String[] sscResult(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(), res.getOpenNo4(), res.getOpenNo5()};
        }
        return nums;
    }

    public static String[] _SSCssc_allPeilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getDX1_D(), ssC.getResult().getDX1_X(), ssC.getResult().getDS1_D(), ssC.getResult().getDS1_S(),
                ssC.getResult().getB1_0(), ssC.getResult().getB1_1(), ssC.getResult().getB1_2(), ssC.getResult().getB1_3(),
                ssC.getResult().getB1_4(), ssC.getResult().getB1_5(), ssC.getResult().getB1_6(), ssC.getResult().getB1_7(),
                ssC.getResult().getB1_8(), ssC.getResult().getB1_9(),
                ssC.getResult().getDX2_D(), ssC.getResult().getDX2_X(), ssC.getResult().getDS2_D(), ssC.getResult().getDS2_S(),
                ssC.getResult().getB2_0(), ssC.getResult().getB2_1(), ssC.getResult().getB2_2(), ssC.getResult().getB2_3(),
                ssC.getResult().getB2_4(), ssC.getResult().getB2_5(), ssC.getResult().getB2_6(), ssC.getResult().getB2_7(),
                ssC.getResult().getB2_8(), ssC.getResult().getB2_9(),
                ssC.getResult().getDX3_D(), ssC.getResult().getDX3_X(), ssC.getResult().getDS3_D(), ssC.getResult().getDS3_S(),
                ssC.getResult().getB3_0(), ssC.getResult().getB3_1(), ssC.getResult().getB3_2(), ssC.getResult().getB3_3(),
                ssC.getResult().getB3_4(), ssC.getResult().getB3_5(), ssC.getResult().getB3_6(), ssC.getResult().getB3_7(),
                ssC.getResult().getB3_8(), ssC.getResult().getB3_9(),
                ssC.getResult().getDX4_D(), ssC.getResult().getDX4_X(), ssC.getResult().getDS4_D(), ssC.getResult().getDS4_S(),
                ssC.getResult().getB4_0(), ssC.getResult().getB4_1(), ssC.getResult().getB4_2(), ssC.getResult().getB4_3(),
                ssC.getResult().getB4_4(), ssC.getResult().getB4_5(), ssC.getResult().getB4_6(), ssC.getResult().getB4_7(),
                ssC.getResult().getB4_8(), ssC.getResult().getB4_9(),
                ssC.getResult().getDX5_D(), ssC.getResult().getDX5_X(), ssC.getResult().getDS5_D(), ssC.getResult().getDS5_S(),
                ssC.getResult().getB5_0(), ssC.getResult().getB5_1(), ssC.getResult().getB5_2(), ssC.getResult().getB5_3(),
                ssC.getResult().getB5_4(), ssC.getResult().getB5_5(), ssC.getResult().getB5_6(), ssC.getResult().getB5_7(),
                ssC.getResult().getB5_8(), ssC.getResult().getB5_9(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }
    public static String[] _SSCssc_ball1Peilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getB1_0(), ssC.getResult().getB1_1(), ssC.getResult().getB1_2(), ssC.getResult().getB1_3(),
                ssC.getResult().getB1_4(), ssC.getResult().getB1_5(), ssC.getResult().getB1_6(), ssC.getResult().getB1_7(),
                ssC.getResult().getB1_8(), ssC.getResult().getB1_9(),
                ssC.getResult().getDX1_D(), ssC.getResult().getDX1_X(), ssC.getResult().getDS1_D(), ssC.getResult().getDS1_S(),
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }
    public static String[] _SSCssc_ball2Peilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getB2_0(), ssC.getResult().getB2_1(), ssC.getResult().getB2_2(), ssC.getResult().getB2_3(),
                ssC.getResult().getB2_4(), ssC.getResult().getB2_5(), ssC.getResult().getB2_6(), ssC.getResult().getB2_7(),
                ssC.getResult().getB2_8(), ssC.getResult().getB2_9(),
                ssC.getResult().getDX2_D(), ssC.getResult().getDX2_X(), ssC.getResult().getDS2_D(), ssC.getResult().getDS2_S(),
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }
    public static String[] _SSCssc_ball3Peilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getB3_0(), ssC.getResult().getB3_1(), ssC.getResult().getB3_2(), ssC.getResult().getB3_3(),
                ssC.getResult().getB3_4(), ssC.getResult().getB3_5(), ssC.getResult().getB3_6(), ssC.getResult().getB3_7(),
                ssC.getResult().getB3_8(), ssC.getResult().getB3_9(),
                ssC.getResult().getDX3_D(), ssC.getResult().getDX3_X(), ssC.getResult().getDS3_D(), ssC.getResult().getDS3_S(),
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }
    public static String[] _SSCssc_ball4Peilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getB4_0(), ssC.getResult().getB4_1(), ssC.getResult().getB4_2(), ssC.getResult().getB4_3(),
                ssC.getResult().getB4_4(), ssC.getResult().getB4_5(), ssC.getResult().getB4_6(), ssC.getResult().getB4_7(),
                ssC.getResult().getB4_8(), ssC.getResult().getB4_9(),
                ssC.getResult().getDX4_D(), ssC.getResult().getDX4_X(), ssC.getResult().getDS4_D(), ssC.getResult().getDS4_S(),
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }
    public static String[] _SSCssc_ball5Peilv(String resPeilv) {
        Gson gson=new Gson();
        SSC ssC = gson.fromJson(resPeilv, SSC.class);
        String[] resultString = new String[]{
                ssC.getResult().getB5_0(), ssC.getResult().getB5_1(), ssC.getResult().getB5_2(), ssC.getResult().getB5_3(),
                ssC.getResult().getB5_4(), ssC.getResult().getB5_5(), ssC.getResult().getB5_6(), ssC.getResult().getB5_7(),
                ssC.getResult().getB5_8(), ssC.getResult().getB5_9(),
                ssC.getResult().getDX5_D(), ssC.getResult().getDX5_X(), ssC.getResult().getDS5_D(), ssC.getResult().getDS5_S(),
                ssC.getResult().getZDX_D(), ssC.getResult().getZDX_X(), ssC.getResult().getZDS_D(), ssC.getResult().getZDS_S(),
                ssC.getResult().getLH_L(), ssC.getResult().getLH_H(), ssC.getResult().getLH_T(),
                ssC.getResult().getTS1_0(), ssC.getResult().getTS1_1(), ssC.getResult().getTS1_2(), ssC.getResult().getTS1_3(),
                ssC.getResult().getTS1_4(),
                ssC.getResult().getTS2_0(), ssC.getResult().getTS2_1(), ssC.getResult().getTS2_2(), ssC.getResult().getTS2_3(),
                ssC.getResult().getTS2_4(),
                ssC.getResult().getTS3_0(), ssC.getResult().getTS3_1(), ssC.getResult().getTS3_2(), ssC.getResult().getTS3_3(),
                ssC.getResult().getTS3_4(),
        };
        return resultString;
    }

    /**
     * 北京快乐8
     * @param result
     * @return
     */
    public static String[] kl8Result(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(), res.getOpenNo4(), res.getOpenNo5(), res.getOpenNo6(),
                    res.getOpenNo7(), res.getOpenNo8(), res.getOpenNo9(), res.getOpenNo10(), res.getOpenNo11(), res.getOpenNo12(),
                    res.getOpenNo13(), res.getOpenNo14(), res.getOpenNo15(), res.getOpenNo16(), res.getOpenNo17(), res.getOpenNo18(),
                    res.getOpenNo19(), res.getOpenNo20()};
        }
        return nums;
    }

    public static String[] _KL8kl8_allPeilv(String resPeilv) {
        Gson gson=new Gson();
        KL8 Beijing = gson.fromJson(resPeilv, KL8.class);
        String[] resultString = new String[]{
                Beijing.getResult().getZDX_D(), Beijing.getResult().getZDX_X(), Beijing.getResult().getZDS_D(), Beijing.getResult().getZDS_S(),
                Beijing.getResult().getZHT_810(), Beijing.getResult().getDXDS_DD(), Beijing.getResult().getDXDS_DS(),
                Beijing.getResult().getDXDS_XD(), Beijing.getResult().getDXDS_XS(),
                Beijing.getResult().getQHH_Q(), Beijing.getResult().getQHH_H(), Beijing.getResult().getQHH_T(),
                Beijing.getResult().getDSH_D(), Beijing.getResult().getDSH_S(), Beijing.getResult().getDSH_T(),
                Beijing.getResult().getWX_0(), Beijing.getResult().getWX_1(), Beijing.getResult().getWX_2(),
                Beijing.getResult().getWX_3(), Beijing.getResult().getWX_4()
        };
        return resultString;
    }

    public static String[] _KL8kl8_zmPeilv(String resPeilv) {
        Gson gson=new Gson();
        KL8_ZM ZM = gson.fromJson(resPeilv, KL8_ZM.class);
        String[] resultString = new String[]{
                ZM.getResult().getZM_01(), ZM.getResult().getZM_02(), ZM.getResult().getZM_03(), ZM.getResult().getZM_04(),
                ZM.getResult().getZM_05(), ZM.getResult().getZM_06(), ZM.getResult().getZM_07(), ZM.getResult().getZM_08(),
                ZM.getResult().getZM_09(), ZM.getResult().getZM_10(), ZM.getResult().getZM_11(), ZM.getResult().getZM_12(),
                ZM.getResult().getZM_13(), ZM.getResult().getZM_14(), ZM.getResult().getZM_15(), ZM.getResult().getZM_16(),
                ZM.getResult().getZM_17(), ZM.getResult().getZM_18(), ZM.getResult().getZM_19(), ZM.getResult().getZM_20(),
                ZM.getResult().getZM_21(), ZM.getResult().getZM_22(), ZM.getResult().getZM_23(), ZM.getResult().getZM_24(),
                ZM.getResult().getZM_25(), ZM.getResult().getZM_26(), ZM.getResult().getZM_27(), ZM.getResult().getZM_28(),
                ZM.getResult().getZM_29(), ZM.getResult().getZM_30(), ZM.getResult().getZM_31(), ZM.getResult().getZM_32(),
                ZM.getResult().getZM_33(), ZM.getResult().getZM_34(), ZM.getResult().getZM_35(), ZM.getResult().getZM_36(),
                ZM.getResult().getZM_37(), ZM.getResult().getZM_38(), ZM.getResult().getZM_39(), ZM.getResult().getZM_40(),
                ZM.getResult().getZM_41(), ZM.getResult().getZM_42(), ZM.getResult().getZM_43(), ZM.getResult().getZM_44(),
                ZM.getResult().getZM_45(), ZM.getResult().getZM_46(), ZM.getResult().getZM_47(), ZM.getResult().getZM_48(),
                ZM.getResult().getZM_49(), ZM.getResult().getZM_50(), ZM.getResult().getZM_51(), ZM.getResult().getZM_52(),
                ZM.getResult().getZM_53(), ZM.getResult().getZM_54(), ZM.getResult().getZM_55(), ZM.getResult().getZM_56(),
                ZM.getResult().getZM_57(), ZM.getResult().getZM_58(), ZM.getResult().getZM_59(), ZM.getResult().getZM_60(),
                ZM.getResult().getZM_61(), ZM.getResult().getZM_62(), ZM.getResult().getZM_63(), ZM.getResult().getZM_64(),
                ZM.getResult().getZM_65(), ZM.getResult().getZM_66(), ZM.getResult().getZM_67(), ZM.getResult().getZM_68(),
                ZM.getResult().getZM_69(), ZM.getResult().getZM_70(), ZM.getResult().getZM_71(), ZM.getResult().getZM_72(),
                ZM.getResult().getZM_73(), ZM.getResult().getZM_74(), ZM.getResult().getZM_75(), ZM.getResult().getZM_76(),
                ZM.getResult().getZM_77(), ZM.getResult().getZM_78(), ZM.getResult().getZM_79(), ZM.getResult().getZM_80()
        };
        return resultString;
    }

    /**
     * 广西快3
     * @param result
     * @return
     */
    public static String[] k3Result(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3()};
        }
        return nums;
    }

    public static String[] _K3k3_dxtbPeilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject guangXi = (JSONObject) jsonTokener.nextValue();
            JSONObject guangxiRes = guangXi.getJSONObject("result");
            resultString = new String[]{
                    guangxiRes.getString("3G_1"), guangxiRes.getString("3G_2"), guangxiRes.getString("3G_3"),
                    guangxiRes.getString("3G_4"), guangxiRes.getString("3G_5"), guangxiRes.getString("3G_6"),
                    guangxiRes.getString("DX_D"), guangxiRes.getString("DX_X"), guangxiRes.getString("WS_111"),
                    guangxiRes.getString("WS_222"), guangxiRes.getString("WS_333"), guangxiRes.getString("WS_444"),
                    guangxiRes.getString("WS_555"), guangxiRes.getString("WS_666"), guangxiRes.getString("QS_0"),
                    guangxiRes.getString("DS_4"), guangxiRes.getString("DS_5"), guangxiRes.getString("DS_6"),
                    guangxiRes.getString("DS_7"), guangxiRes.getString("DS_8"), guangxiRes.getString("DS_9"),
                    guangxiRes.getString("DS_10"), guangxiRes.getString("DS_11"), guangxiRes.getString("DS_12"),
                    guangxiRes.getString("DS_13"), guangxiRes.getString("DS_14"), guangxiRes.getString("DS_15"),
                    guangxiRes.getString("DS_16"), guangxiRes.getString("DS_17"),
                    guangxiRes.getString("CP_12"), guangxiRes.getString("CP_13"), guangxiRes.getString("CP_14"),
                    guangxiRes.getString("CP_14"), guangxiRes.getString("CP_15"), guangxiRes.getString("CP_16"),
                    guangxiRes.getString("CP_23"), guangxiRes.getString("CP_24"), guangxiRes.getString("CP_25"),
                    guangxiRes.getString("CP_26"), guangxiRes.getString("CP_34"), guangxiRes.getString("CP_35"),
                    guangxiRes.getString("CP_36"), guangxiRes.getString("CP_45"), guangxiRes.getString("CP_46"),
                    guangxiRes.getString("CP_56"),
                    guangxiRes.getString("DP_11"), guangxiRes.getString("DP_22"), guangxiRes.getString("DP_33"),
                    guangxiRes.getString("DP_44"), guangxiRes.getString("DP_55"), guangxiRes.getString("DP_66")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _K3k3_yxxtbPeilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject guangXi = (JSONObject) jsonTokener.nextValue();
            JSONObject guangxiRes = guangXi.getJSONObject("result");
            resultString = new String[]{
                    guangxiRes.getString("3G_1"), guangxiRes.getString("3G_2"), guangxiRes.getString("3G_3"),
                    guangxiRes.getString("3G_4"), guangxiRes.getString("3G_5"), guangxiRes.getString("3G_6")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    /**
     * 广西快乐十分
     * @param result
     * @return
     */
    public static String[] GXKLSFResult(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(),res.getOpenNo4(),res.getOpenNo5()};
        }
        return nums;
    }
    public static String[] _KLSFgxklsf_twosidePeilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString = new String[]{
                guangXi.getResult().getZDS_D(), guangXi.getResult().getZDS_S(), guangXi.getResult().getZDX_D(), guangXi.getResult().getZDX_X(),
                guangXi.getResult().getZWDX_D(), guangXi.getResult().getZWDX_X(), guangXi.getResult().getLH15_L(), guangXi.getResult().getLH15_H(),
                guangXi.getResult().getYDX1_D(), guangXi.getResult().getYDX1_X(), guangXi.getResult().getYDS1_D(), guangXi.getResult().getYDS1_S(),
                guangXi.getResult().getYWDX1_D(), guangXi.getResult().getYWDX1_X(), guangXi.getResult().getYHDS1_D(), guangXi.getResult().getYHDS1_S(),
                guangXi.getResult().getYDX2_D(), guangXi.getResult().getYDX2_X(), guangXi.getResult().getYDS2_D(), guangXi.getResult().getYDS2_S(),
                guangXi.getResult().getYWDX2_D(), guangXi.getResult().getYWDX2_X(), guangXi.getResult().getYHDS2_D(), guangXi.getResult().getYHDS2_S(),
                guangXi.getResult().getYDX3_D(), guangXi.getResult().getYDX3_X(), guangXi.getResult().getYDS3_D(), guangXi.getResult().getYDS3_S(),
                guangXi.getResult().getYWDX3_D(), guangXi.getResult().getYWDX3_X(), guangXi.getResult().getYHDS3_D(), guangXi.getResult().getYHDS3_S(),
                guangXi.getResult().getYDX4_D(), guangXi.getResult().getYDX4_X(), guangXi.getResult().getYDS4_D(), guangXi.getResult().getYDS4_S(),
                guangXi.getResult().getYWDX4_D(), guangXi.getResult().getYWDX4_X(), guangXi.getResult().getYHDS4_D(), guangXi.getResult().getYHDS4_S(),
                guangXi.getResult().getYDX5_D(), guangXi.getResult().getYDX5_X(), guangXi.getResult().getYDS4_D(), guangXi.getResult().getYDS5_S(),
                guangXi.getResult().getYWDX5_D(), guangXi.getResult().getYWDX5_X(), guangXi.getResult().getYHDS4_D(), guangXi.getResult().getYHDS5_S()
        };
        return resultString;
    }
    public static String[] _KLSFgxklsf_singlePeilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString = new String[]{
                guangXi.getResult().getB1_01(), guangXi.getResult().getB1_02(), guangXi.getResult().getB1_03(), guangXi.getResult().getB1_04(),
                guangXi.getResult().getB1_05(), guangXi.getResult().getB1_06(), guangXi.getResult().getB1_07(), guangXi.getResult().getB1_08(),
                guangXi.getResult().getB1_09(), guangXi.getResult().getB1_10(), guangXi.getResult().getB1_11(), guangXi.getResult().getB1_12(),
                guangXi.getResult().getB1_13(), guangXi.getResult().getB1_14(), guangXi.getResult().getB1_15(), guangXi.getResult().getB1_16(),
                guangXi.getResult().getB1_17(), guangXi.getResult().getB1_18(), guangXi.getResult().getB1_19(), guangXi.getResult().getB1_20(),
                guangXi.getResult().getB1_21(),
                guangXi.getResult().getB2_01(), guangXi.getResult().getB2_02(), guangXi.getResult().getB2_03(), guangXi.getResult().getB2_04(),
                guangXi.getResult().getB2_05(), guangXi.getResult().getB2_06(), guangXi.getResult().getB2_07(), guangXi.getResult().getB2_08(),
                guangXi.getResult().getB2_09(), guangXi.getResult().getB2_10(), guangXi.getResult().getB2_11(), guangXi.getResult().getB2_12(),
                guangXi.getResult().getB2_13(), guangXi.getResult().getB2_14(), guangXi.getResult().getB2_15(), guangXi.getResult().getB2_16(),
                guangXi.getResult().getB2_17(), guangXi.getResult().getB2_18(), guangXi.getResult().getB2_19(), guangXi.getResult().getB2_20(),
                guangXi.getResult().getB2_21(),
                guangXi.getResult().getB3_01(), guangXi.getResult().getB3_02(), guangXi.getResult().getB3_03(), guangXi.getResult().getB3_04(),
                guangXi.getResult().getB3_05(), guangXi.getResult().getB3_06(), guangXi.getResult().getB3_07(), guangXi.getResult().getB3_08(),
                guangXi.getResult().getB3_09(), guangXi.getResult().getB3_10(), guangXi.getResult().getB3_11(), guangXi.getResult().getB3_12(),
                guangXi.getResult().getB3_13(), guangXi.getResult().getB3_14(), guangXi.getResult().getB3_15(), guangXi.getResult().getB3_16(),
                guangXi.getResult().getB3_17(), guangXi.getResult().getB3_18(), guangXi.getResult().getB3_19(), guangXi.getResult().getB3_20(),
                guangXi.getResult().getB3_21(),
                guangXi.getResult().getB4_01(), guangXi.getResult().getB4_02(), guangXi.getResult().getB4_03(), guangXi.getResult().getB4_04(),
                guangXi.getResult().getB4_05(), guangXi.getResult().getB4_06(), guangXi.getResult().getB4_07(), guangXi.getResult().getB4_08(),
                guangXi.getResult().getB4_09(), guangXi.getResult().getB4_10(), guangXi.getResult().getB4_11(), guangXi.getResult().getB4_12(),
                guangXi.getResult().getB4_13(), guangXi.getResult().getB4_14(), guangXi.getResult().getB4_15(), guangXi.getResult().getB4_16(),
                guangXi.getResult().getB4_17(), guangXi.getResult().getB4_18(), guangXi.getResult().getB4_19(), guangXi.getResult().getB4_20(),
                guangXi.getResult().getB4_21(),
                guangXi.getResult().getB5_01(), guangXi.getResult().getB5_02(), guangXi.getResult().getB5_03(), guangXi.getResult().getB5_04(),
                guangXi.getResult().getB5_05(), guangXi.getResult().getB5_06(), guangXi.getResult().getB5_07(), guangXi.getResult().getB5_08(),
                guangXi.getResult().getB5_09(), guangXi.getResult().getB5_10(), guangXi.getResult().getB5_11(), guangXi.getResult().getB5_12(),
                guangXi.getResult().getB5_13(), guangXi.getResult().getB5_14(), guangXi.getResult().getB5_15(), guangXi.getResult().getB5_16(),
                guangXi.getResult().getB5_17(), guangXi.getResult().getB5_18(), guangXi.getResult().getB5_19(), guangXi.getResult().getB5_20(),
                guangXi.getResult().getB5_21()
        };

        return resultString;
    }
    public static String[] _KLSFgxklsf_ball1Peilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString = new String[]{
                guangXi.getResult().getB1_01(), guangXi.getResult().getB1_02(), guangXi.getResult().getB1_03(), guangXi.getResult().getB1_04(),
                guangXi.getResult().getB1_05(), guangXi.getResult().getB1_06(), guangXi.getResult().getB1_07(), guangXi.getResult().getB1_08(),
                guangXi.getResult().getB1_09(), guangXi.getResult().getB1_10(), guangXi.getResult().getB1_11(), guangXi.getResult().getB1_12(),
                guangXi.getResult().getB1_13(), guangXi.getResult().getB1_14(), guangXi.getResult().getB1_15(), guangXi.getResult().getB1_16(),
                guangXi.getResult().getB1_17(), guangXi.getResult().getB1_18(), guangXi.getResult().getB1_19(), guangXi.getResult().getB1_20(),
                guangXi.getResult().getB1_21(),
                guangXi.getResult().getSB1_R(), guangXi.getResult().getSB1_G(), guangXi.getResult().getSB1_B(),
                guangXi.getResult().getYFLSX1_F(), guangXi.getResult().getYFLSX1_L(), guangXi.getResult().getYFLSX1_S(), guangXi.getResult().getYFLSX1_X(),
                guangXi.getResult().getYDX1_D(), guangXi.getResult().getYDX1_X(), guangXi.getResult().getYDS1_D(), guangXi.getResult().getYDS1_S(),
                guangXi.getResult().getYWDX1_D(), guangXi.getResult().getYWDX1_X(), guangXi.getResult().getYHDS1_D(), guangXi.getResult().getYHDS1_S()
        };
        return resultString;
    }
    public static String[] _KLSFgxklsf_ball2Peilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString = new String[]{
                guangXi.getResult().getB2_01(), guangXi.getResult().getB2_02(), guangXi.getResult().getB2_03(), guangXi.getResult().getB2_04(),
                guangXi.getResult().getB2_05(), guangXi.getResult().getB2_06(), guangXi.getResult().getB2_07(), guangXi.getResult().getB2_08(),
                guangXi.getResult().getB2_09(), guangXi.getResult().getB2_10(), guangXi.getResult().getB2_11(), guangXi.getResult().getB2_12(),
                guangXi.getResult().getB2_13(), guangXi.getResult().getB2_14(), guangXi.getResult().getB2_15(), guangXi.getResult().getB2_16(),
                guangXi.getResult().getB2_17(), guangXi.getResult().getB2_18(), guangXi.getResult().getB2_19(), guangXi.getResult().getB2_20(),
                guangXi.getResult().getB2_21(),
                guangXi.getResult().getSB2_R(), guangXi.getResult().getSB2_G(), guangXi.getResult().getSB2_B(),
                guangXi.getResult().getYFLSX2_F(), guangXi.getResult().getYFLSX2_L(), guangXi.getResult().getYFLSX2_S(), guangXi.getResult().getYFLSX2_X(),
                guangXi.getResult().getYDX2_D(), guangXi.getResult().getYDX2_X(), guangXi.getResult().getYDS2_D(), guangXi.getResult().getYDS2_S(),
                guangXi.getResult().getYWDX2_D(), guangXi.getResult().getYWDX2_X(), guangXi.getResult().getYHDS2_D(), guangXi.getResult().getYHDS2_S()
        };
        return resultString;
    }
    public static String[] _KLSFgxklsf_ball3Peilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[]  resultString=new String[]{
                guangXi.getResult().getB3_01(),guangXi.getResult().getB3_02(),guangXi.getResult().getB3_03(),guangXi.getResult().getB3_04(),
                guangXi.getResult().getB3_05(),guangXi.getResult().getB3_06(),guangXi.getResult().getB3_07(),guangXi.getResult().getB3_08(),
                guangXi.getResult().getB3_09(),guangXi.getResult().getB3_10(),guangXi.getResult().getB3_11(),guangXi.getResult().getB3_12(),
                guangXi.getResult().getB3_13(),guangXi.getResult().getB3_14(),guangXi.getResult().getB3_15(),guangXi.getResult().getB3_16(),
                guangXi.getResult().getB3_17(),guangXi.getResult().getB3_18(),guangXi.getResult().getB3_19(),guangXi.getResult().getB3_20(),
                guangXi.getResult().getB3_21(),
                guangXi.getResult().getSB3_R(),guangXi.getResult().getSB3_G(),guangXi.getResult().getSB3_B(),
                guangXi.getResult().getYFLSX3_F(),guangXi.getResult().getYFLSX3_L(),guangXi.getResult().getYFLSX3_S(),guangXi.getResult().getYFLSX3_X(),
                guangXi.getResult().getYDX3_D(),guangXi.getResult().getYDX3_X(),guangXi.getResult().getYDS3_D(),guangXi.getResult().getYDS3_S(),
                guangXi.getResult().getYWDX3_D(),guangXi.getResult().getYWDX3_X(),guangXi.getResult().getYHDS3_D(),guangXi.getResult().getYHDS3_S()
        };
        return resultString;
    }
    public static String[] _KLSFgxklsf_ball4Peilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString=new String[]{
                guangXi.getResult().getB4_01(),guangXi.getResult().getB4_02(),guangXi.getResult().getB4_03(),guangXi.getResult().getB4_04(),
                guangXi.getResult().getB4_05(),guangXi.getResult().getB4_06(),guangXi.getResult().getB4_07(),guangXi.getResult().getB4_08(),
                guangXi.getResult().getB4_09(),guangXi.getResult().getB4_10(),guangXi.getResult().getB4_11(),guangXi.getResult().getB4_12(),
                guangXi.getResult().getB4_13(),guangXi.getResult().getB4_14(),guangXi.getResult().getB4_15(),guangXi.getResult().getB4_16(),
                guangXi.getResult().getB4_17(),guangXi.getResult().getB4_18(),guangXi.getResult().getB4_19(),guangXi.getResult().getB4_20(),
                guangXi.getResult().getB4_21(),
                guangXi.getResult().getSB4_R(),guangXi.getResult().getSB4_G(),guangXi.getResult().getSB4_B(),
                guangXi.getResult().getYFLSX4_F(),guangXi.getResult().getYFLSX4_L(),guangXi.getResult().getYFLSX4_S(),guangXi.getResult().getYFLSX4_X(),
                guangXi.getResult().getYDX4_D(),guangXi.getResult().getYDX4_X(),guangXi.getResult().getYDS4_D(),guangXi.getResult().getYDS4_S(),
                guangXi.getResult().getYWDX4_D(),guangXi.getResult().getYWDX4_X(),guangXi.getResult().getYHDS4_D(),guangXi.getResult().getYHDS4_S()
        };
        return resultString;
    }
    public static String[] _KLSFgxklsf_ball5Peilv(String resPeilv) {
        Gson gson=new Gson();
        GXKLSF guangXi = gson.fromJson(resPeilv, GXKLSF.class);
        String[] resultString=new String[]{
                guangXi.getResult().getB5_01(),guangXi.getResult().getB5_02(),guangXi.getResult().getB5_03(),guangXi.getResult().getB5_04(),
                guangXi.getResult().getB5_05(),guangXi.getResult().getB5_06(),guangXi.getResult().getB5_07(),guangXi.getResult().getB5_08(),
                guangXi.getResult().getB5_09(),guangXi.getResult().getB5_10(),guangXi.getResult().getB5_11(),guangXi.getResult().getB5_12(),
                guangXi.getResult().getB5_13(),guangXi.getResult().getB5_14(),guangXi.getResult().getB5_15(),guangXi.getResult().getB5_16(),
                guangXi.getResult().getB5_17(),guangXi.getResult().getB5_18(),guangXi.getResult().getB5_19(),guangXi.getResult().getB5_20(),
                guangXi.getResult().getB5_21(),
                guangXi.getResult().getSB5_R(),guangXi.getResult().getSB5_G(),guangXi.getResult().getSB5_B(),
                guangXi.getResult().getYFLSX5_F(),guangXi.getResult().getYFLSX5_L(),guangXi.getResult().getYFLSX5_S(),guangXi.getResult().getYFLSX5_X(),
                guangXi.getResult().getYDX5_D(),guangXi.getResult().getYDX5_X(),guangXi.getResult().getYDS5_D(),guangXi.getResult().getYDS5_S(),
                guangXi.getResult().getYWDX5_D(),guangXi.getResult().getYWDX5_X(),guangXi.getResult().getYHDS5_D(),guangXi.getResult().getYHDS5_S()
        };
        return resultString;
    }

    /**
     * 广东11选5
     * @param result
     * @return
     */
    public static String[] GD11X5FResult(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(),res.getOpenNo4(),res.getOpenNo5()};
        }
        return nums;
    }
    public static String[] _11X5gd11x5_zxPeilv(String resPeilv) {
        Gson gson=new Gson();
        String[] resultString=new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("qezx")){
            GD11X5_Q2ZX Q2ZX = gson.fromJson(resPeilv, GD11X5_Q2ZX.class);
            resultString = new String[]{
                    "", "", "", "", "", "","", "", "", "", "",
                    "", "", "", "", "", "","", "", "", "", "",
                    Q2ZX.getResult().getQ2ZX()
            };
        }else {
            GD11X5_Q3ZX Q3ZX = gson.fromJson(resPeilv, GD11X5_Q3ZX.class);
            resultString = new String[]{
                    "", "", "", "", "", "","", "", "", "", "",
                    "", "", "", "", "", "","", "", "", "", "",
                    "", "", "", "", "", "","", "", "", "", "",
                    Q3ZX.getResult().getQ3ZX()
            };
        }

        return resultString;
    }
    public static String[] _11X5gd11x5_twosidePeilv(String resPeilv) {
        Gson gson=new Gson();
        GD11X5 guangDong = gson.fromJson(resPeilv, GD11X5.class);
        String[] resultString = new String[]{
                guangDong.getResult().getZDX_D(), guangDong.getResult().getZDX_X(), guangDong.getResult().getZDS_D(),
                guangDong.getResult().getZDS_S(), guangDong.getResult().getZWDX_D(), guangDong.getResult().getZWDX_X(),
                guangDong.getResult().getLH_H(), guangDong.getResult().getLH_L(),
                guangDong.getResult().getDX1_D(), guangDong.getResult().getDX1_X(),
                guangDong.getResult().getDS1_D(), guangDong.getResult().getDS1_S(),
                guangDong.getResult().getDX2_D(), guangDong.getResult().getDX2_X(),
                guangDong.getResult().getDS2_D(), guangDong.getResult().getDS2_S(),
                guangDong.getResult().getDX3_D(), guangDong.getResult().getDX3_X(),
                guangDong.getResult().getDS3_D(), guangDong.getResult().getDS3_S(),
                guangDong.getResult().getDX4_D(), guangDong.getResult().getDX4_X(),
                guangDong.getResult().getDS4_D(), guangDong.getResult().getDS4_S(),
                guangDong.getResult().getDX5_D(), guangDong.getResult().getDX5_X(),
                guangDong.getResult().getDS5_D(), guangDong.getResult().getDS5_S()
        };
        return resultString;
    }
    public static String[] _11X5gd11x5_singlePeilv(String resPeilv) {
        Gson gson=new Gson();
        GD11X5 guangDong = gson.fromJson(resPeilv, GD11X5.class);
        String[] resultString = new String[]{
                guangDong.getResult().getZM_01(), guangDong.getResult().getZM_02(), guangDong.getResult().getZM_03(),
                guangDong.getResult().getZM_04(), guangDong.getResult().getZM_05(), guangDong.getResult().getZM_06(),
                guangDong.getResult().getZM_07(), guangDong.getResult().getZM_08(), guangDong.getResult().getZM_09(),
                guangDong.getResult().getZM_10(), guangDong.getResult().getZM_11(),
                guangDong.getResult().getB1_01(), guangDong.getResult().getB1_02(), guangDong.getResult().getB1_03(),
                guangDong.getResult().getB1_04(), guangDong.getResult().getB1_05(), guangDong.getResult().getB1_06(),
                guangDong.getResult().getB1_07(), guangDong.getResult().getB1_08(), guangDong.getResult().getB1_09(),
                guangDong.getResult().getB1_10(), guangDong.getResult().getB1_11(),

                guangDong.getResult().getB2_01(), guangDong.getResult().getB2_02(), guangDong.getResult().getB2_03(),
                guangDong.getResult().getB2_04(), guangDong.getResult().getB2_05(), guangDong.getResult().getB2_06(),
                guangDong.getResult().getB2_07(), guangDong.getResult().getB2_08(), guangDong.getResult().getB2_09(),
                guangDong.getResult().getB2_10(), guangDong.getResult().getB2_11(),

                guangDong.getResult().getB3_01(), guangDong.getResult().getB3_02(), guangDong.getResult().getB3_03(),
                guangDong.getResult().getB3_04(), guangDong.getResult().getB3_05(), guangDong.getResult().getB3_06(),
                guangDong.getResult().getB3_07(), guangDong.getResult().getB3_08(), guangDong.getResult().getB3_09(),
                guangDong.getResult().getB3_10(), guangDong.getResult().getB3_11(),

                guangDong.getResult().getB4_01(), guangDong.getResult().getB4_02(), guangDong.getResult().getB4_03(),
                guangDong.getResult().getB4_04(), guangDong.getResult().getB4_05(), guangDong.getResult().getB4_06(),
                guangDong.getResult().getB4_07(), guangDong.getResult().getB4_08(), guangDong.getResult().getB4_09(),
                guangDong.getResult().getB4_10(), guangDong.getResult().getB4_11(),

                guangDong.getResult().getB5_01(), guangDong.getResult().getB5_02(), guangDong.getResult().getB5_03(),
                guangDong.getResult().getB5_04(), guangDong.getResult().getB5_05(), guangDong.getResult().getB5_06(),
                guangDong.getResult().getB5_07(), guangDong.getResult().getB5_08(), guangDong.getResult().getB5_09(),
                guangDong.getResult().getB5_10(), guangDong.getResult().getB5_11()
        };
        return resultString;
    }
    public static String[] _11X5gd11x5_lmPeilv(String resPeilv) {
        Gson gson=new Gson();
        GD11X5 guangDong = gson.fromJson(resPeilv, GD11X5.class);
        String[] resultString = new String[]{
                guangDong.getResult().getLM2(), guangDong.getResult().getLM3(), guangDong.getResult().getLM4(),
                guangDong.getResult().getLM5(), guangDong.getResult().getLM6(), guangDong.getResult().getLM7(),
                guangDong.getResult().getLM8(), guangDong.getResult().getLM30(), guangDong.getResult().getLM32(),
                "","","","","","","","","","",""
        };
        return resultString;
    }

    /**
     * 广东快乐十分 && 重庆幸运农场
     * @param result
     * @return
     */
    public static String[] KLSFResult(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3(),res.getOpenNo4(),res.getOpenNo5()
                    ,res.getOpenNo6(),res.getOpenNo7(),res.getOpenNo8()};
        }
        return nums;
    }
    public static String[] _KLSFklsf_allPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_1 Guangdong = gson.fromJson(resPeilv, GDKLSF_1.class);
        GDKLSF_1.result GuangdongResult = Guangdong.getResult();
        String[] resultString = new String[]{
                GuangdongResult.getZDX_D(), GuangdongResult.getZDX_X(), GuangdongResult.getZDS_D(), GuangdongResult.getZDS_S(),
                GuangdongResult.getZWDX_D(), GuangdongResult.getZWDX_X(),

                GuangdongResult.getDX1_D(), GuangdongResult.getDX1_X(), GuangdongResult.getDS1_D(), GuangdongResult.getDS1_S(),
                GuangdongResult.getWDX1_D(), GuangdongResult.getWDX1_X(), GuangdongResult.getHDS1_D(), GuangdongResult.getHDS1_S(),
                GuangdongResult.getLH1_L(), GuangdongResult.getLH1_H(),

                GuangdongResult.getDX2_D(), GuangdongResult.getDX2_X(), GuangdongResult.getDS2_D(), GuangdongResult.getDS2_S(),
                GuangdongResult.getWDX2_D(), GuangdongResult.getWDX2_X(), GuangdongResult.getHDS2_D(), GuangdongResult.getHDS2_S(),
                GuangdongResult.getLH2_L(), GuangdongResult.getLH2_H(),

                GuangdongResult.getDX3_D(), GuangdongResult.getDX3_X(), GuangdongResult.getDS3_D(), GuangdongResult.getDS3_S(),
                GuangdongResult.getWDX3_D(), GuangdongResult.getWDX3_X(), GuangdongResult.getHDS3_D(), GuangdongResult.getHDS3_S(),
                GuangdongResult.getLH3_L(), GuangdongResult.getLH3_H(),

                GuangdongResult.getDX4_D(), GuangdongResult.getDX4_X(), GuangdongResult.getDS4_D(), GuangdongResult.getDS4_S(),
                GuangdongResult.getWDX4_D(), GuangdongResult.getWDX4_X(), GuangdongResult.getHDS4_D(), GuangdongResult.getHDS4_S(),
                GuangdongResult.getLH4_L(), GuangdongResult.getLH4_H(),

                GuangdongResult.getDX5_D(), GuangdongResult.getDX5_X(), GuangdongResult.getDS5_D(), GuangdongResult.getDS5_S(),
                GuangdongResult.getWDX5_D(), GuangdongResult.getWDX5_X(), GuangdongResult.getHDS5_D(), GuangdongResult.getHDS5_S(),

                GuangdongResult.getDX6_D(), GuangdongResult.getDX6_X(), GuangdongResult.getDS6_D(), GuangdongResult.getDS6_S(),
                GuangdongResult.getWDX6_D(), GuangdongResult.getWDX6_X(), GuangdongResult.getHDS6_D(), GuangdongResult.getHDS6_S(),

                GuangdongResult.getDX7_D(), GuangdongResult.getDX7_X(), GuangdongResult.getDS7_D(), GuangdongResult.getDS7_S(),
                GuangdongResult.getWDX7_D(), GuangdongResult.getWDX7_X(), GuangdongResult.getHDS7_D(), GuangdongResult.getHDS7_S(),

                GuangdongResult.getDX8_D(), GuangdongResult.getDX8_X(), GuangdongResult.getDS8_D(), GuangdongResult.getDS8_S(),
                GuangdongResult.getWDX8_D(), GuangdongResult.getWDX8_X(), GuangdongResult.getHDS8_D(), GuangdongResult.getHDS8_S()

        };
        return resultString;
    }
    public static String[] _KLSFklsf_singlePeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangdongResult = Guangdong.getResult();
        String[] resultString = new String[]{GuangdongResult.getB1_01(), GuangdongResult.getB1_02(), GuangdongResult.getB1_03(), GuangdongResult.getB1_04(), GuangdongResult.getB1_05(),
                GuangdongResult.getB1_06(), GuangdongResult.getB1_07(), GuangdongResult.getB1_08(), GuangdongResult.getB1_09(), GuangdongResult.getB1_10(),
                GuangdongResult.getB1_11(), GuangdongResult.getB1_12(), GuangdongResult.getB1_13(), GuangdongResult.getB1_14(), GuangdongResult.getB1_15(),
                GuangdongResult.getB1_16(), GuangdongResult.getB1_17(), GuangdongResult.getB1_18(), GuangdongResult.getB1_19(), GuangdongResult.getB1_20(),
                GuangdongResult.getB2_01(), GuangdongResult.getB2_02(), GuangdongResult.getB2_03(), GuangdongResult.getB2_04(), GuangdongResult.getB2_05(),
                GuangdongResult.getB2_06(), GuangdongResult.getB2_07(), GuangdongResult.getB2_08(), GuangdongResult.getB2_09(), GuangdongResult.getB2_10(),
                GuangdongResult.getB2_11(), GuangdongResult.getB2_12(), GuangdongResult.getB2_13(), GuangdongResult.getB2_14(), GuangdongResult.getB2_15(),
                GuangdongResult.getB2_16(), GuangdongResult.getB2_17(), GuangdongResult.getB2_18(), GuangdongResult.getB2_19(), GuangdongResult.getB2_20(),
                GuangdongResult.getB3_01(), GuangdongResult.getB3_02(), GuangdongResult.getB3_03(), GuangdongResult.getB3_04(), GuangdongResult.getB3_05(),
                GuangdongResult.getB3_06(), GuangdongResult.getB3_07(), GuangdongResult.getB3_08(), GuangdongResult.getB3_09(), GuangdongResult.getB3_10(),
                GuangdongResult.getB3_11(), GuangdongResult.getB3_12(), GuangdongResult.getB3_13(), GuangdongResult.getB3_14(), GuangdongResult.getB3_15(),
                GuangdongResult.getB3_16(), GuangdongResult.getB3_17(), GuangdongResult.getB3_18(), GuangdongResult.getB3_19(), GuangdongResult.getB3_20(),
                GuangdongResult.getB4_01(), GuangdongResult.getB4_02(), GuangdongResult.getB4_03(), GuangdongResult.getB4_04(), GuangdongResult.getB4_05(),
                GuangdongResult.getB4_06(), GuangdongResult.getB4_07(), GuangdongResult.getB4_08(), GuangdongResult.getB4_09(), GuangdongResult.getB4_10(),
                GuangdongResult.getB4_11(), GuangdongResult.getB4_12(), GuangdongResult.getB4_13(), GuangdongResult.getB4_14(), GuangdongResult.getB4_15(),
                GuangdongResult.getB4_16(), GuangdongResult.getB4_17(), GuangdongResult.getB4_18(), GuangdongResult.getB4_19(), GuangdongResult.getB4_20(),
                GuangdongResult.getB5_01(), GuangdongResult.getB5_02(), GuangdongResult.getB5_03(), GuangdongResult.getB5_04(), GuangdongResult.getB5_05(),
                GuangdongResult.getB5_06(), GuangdongResult.getB5_07(), GuangdongResult.getB5_08(), GuangdongResult.getB5_09(), GuangdongResult.getB5_10(),
                GuangdongResult.getB5_11(), GuangdongResult.getB5_12(), GuangdongResult.getB5_13(), GuangdongResult.getB5_14(), GuangdongResult.getB5_15(),
                GuangdongResult.getB5_16(), GuangdongResult.getB5_17(), GuangdongResult.getB5_18(), GuangdongResult.getB5_19(), GuangdongResult.getB5_20(),
                GuangdongResult.getB6_01(), GuangdongResult.getB6_02(), GuangdongResult.getB6_03(), GuangdongResult.getB6_04(), GuangdongResult.getB6_05(),
                GuangdongResult.getB6_06(), GuangdongResult.getB6_07(), GuangdongResult.getB6_08(), GuangdongResult.getB6_09(), GuangdongResult.getB6_10(),
                GuangdongResult.getB6_11(), GuangdongResult.getB6_12(), GuangdongResult.getB6_13(), GuangdongResult.getB6_14(), GuangdongResult.getB6_15(),
                GuangdongResult.getB6_16(), GuangdongResult.getB6_17(), GuangdongResult.getB6_18(), GuangdongResult.getB6_19(), GuangdongResult.getB6_20(),
                GuangdongResult.getB7_01(), GuangdongResult.getB7_02(), GuangdongResult.getB7_03(), GuangdongResult.getB7_04(), GuangdongResult.getB7_05(),
                GuangdongResult.getB7_06(), GuangdongResult.getB7_07(), GuangdongResult.getB7_08(), GuangdongResult.getB7_09(), GuangdongResult.getB7_10(),
                GuangdongResult.getB7_11(), GuangdongResult.getB7_12(), GuangdongResult.getB7_13(), GuangdongResult.getB7_14(), GuangdongResult.getB7_15(),
                GuangdongResult.getB7_16(), GuangdongResult.getB7_17(), GuangdongResult.getB7_18(), GuangdongResult.getB7_19(), GuangdongResult.getB7_20(),
                GuangdongResult.getB8_01(), GuangdongResult.getB8_02(), GuangdongResult.getB8_03(), GuangdongResult.getB8_04(), GuangdongResult.getB8_05(),
                GuangdongResult.getB8_06(), GuangdongResult.getB8_07(), GuangdongResult.getB8_08(), GuangdongResult.getB8_09(), GuangdongResult.getB8_10(),
                GuangdongResult.getB8_11(), GuangdongResult.getB8_12(), GuangdongResult.getB8_13(), GuangdongResult.getB8_14(), GuangdongResult.getB8_15(),
                GuangdongResult.getB8_16(), GuangdongResult.getB8_17(), GuangdongResult.getB8_18(), GuangdongResult.getB8_19(), GuangdongResult.getB8_20(),
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball1Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString = new String[]{
                GuangDongResult.getB1_01(), GuangDongResult.getB1_02(), GuangDongResult.getB1_03(), GuangDongResult.getB1_04(),
                GuangDongResult.getB1_05(), GuangDongResult.getB1_06(), GuangDongResult.getB1_07(), GuangDongResult.getB1_08(),
                GuangDongResult.getB1_09(), GuangDongResult.getB1_10(), GuangDongResult.getB1_11(), GuangDongResult.getB1_12(),
                GuangDongResult.getB1_13(), GuangDongResult.getB1_14(), GuangDongResult.getB1_15(), GuangDongResult.getB1_16(),
                GuangDongResult.getB1_17(), GuangDongResult.getB1_18(), GuangDongResult.getB1_19(), GuangDongResult.getB1_20(),
                GuangDongResult.getDX1_D(), GuangDongResult.getDX1_X(), GuangDongResult.getDS1_D(), GuangDongResult.getDS1_S(),
                GuangDongResult.getWDX1_D(), GuangDongResult.getWDX1_X(), GuangDongResult.getHDS1_D(), GuangDongResult.getHDS1_S(),
                GuangDongResult.getFW1_0(), GuangDongResult.getFW1_1(), GuangDongResult.getFW1_2(), GuangDongResult.getFW1_3(),
                GuangDongResult.getZFB1_0(), GuangDongResult.getZFB1_1(), GuangDongResult.getZFB1_2(),
                GuangDongResult.getLH1_L(), GuangDongResult.getLH1_H()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball2Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[]  resultString=new String[]{
                GuangDongResult.getB2_01(),GuangDongResult.getB2_02(),GuangDongResult.getB2_03(),GuangDongResult.getB2_04(),
                GuangDongResult.getB2_05(),GuangDongResult.getB2_06(),GuangDongResult.getB2_07(),GuangDongResult.getB2_08(),
                GuangDongResult.getB2_09(),GuangDongResult.getB2_10(),GuangDongResult.getB2_11(),GuangDongResult.getB2_12(),
                GuangDongResult.getB2_13(),GuangDongResult.getB2_14(),GuangDongResult.getB2_15(),GuangDongResult.getB2_16(),
                GuangDongResult.getB2_17(),GuangDongResult.getB2_18(),GuangDongResult.getB2_19(),GuangDongResult.getB2_20(),
                GuangDongResult.getDX2_D(),GuangDongResult.getDX2_X(),GuangDongResult.getDS2_D(),GuangDongResult.getDS2_S(),
                GuangDongResult.getWDX2_D(),GuangDongResult.getWDX2_X(),GuangDongResult.getHDS2_D(),GuangDongResult.getHDS2_S(),
                GuangDongResult.getFW2_0(),GuangDongResult.getFW2_1(),GuangDongResult.getFW2_2(),GuangDongResult.getFW2_3(),
                GuangDongResult.getZFB2_0(),GuangDongResult.getZFB2_1(),GuangDongResult.getZFB2_2(),
                GuangDongResult.getLH2_L(),GuangDongResult.getLH2_H()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball3Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB3_01(),GuangDongResult.getB3_02(),GuangDongResult.getB3_03(),GuangDongResult.getB3_04(),
                GuangDongResult.getB3_05(),GuangDongResult.getB3_06(),GuangDongResult.getB3_07(),GuangDongResult.getB3_08(),
                GuangDongResult.getB3_09(),GuangDongResult.getB3_10(),GuangDongResult.getB3_11(),GuangDongResult.getB3_12(),
                GuangDongResult.getB3_13(),GuangDongResult.getB3_14(),GuangDongResult.getB3_15(),GuangDongResult.getB3_16(),
                GuangDongResult.getB3_17(),GuangDongResult.getB3_18(),GuangDongResult.getB3_19(),GuangDongResult.getB3_20(),
                GuangDongResult.getDX3_D(),GuangDongResult.getDX3_X(),GuangDongResult.getDS3_D(),GuangDongResult.getDS3_S(),
                GuangDongResult.getWDX3_D(),GuangDongResult.getWDX3_X(),GuangDongResult.getHDS3_D(),GuangDongResult.getHDS3_S(),
                GuangDongResult.getFW3_0(),GuangDongResult.getFW3_1(),GuangDongResult.getFW3_2(),GuangDongResult.getFW3_3(),
                GuangDongResult.getZFB3_0(),GuangDongResult.getZFB3_1(),GuangDongResult.getZFB3_2(),
                GuangDongResult.getLH3_L(),GuangDongResult.getLH3_H()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball4Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB4_01(),GuangDongResult.getB4_02(),GuangDongResult.getB4_03(),GuangDongResult.getB4_04(),
                GuangDongResult.getB4_05(),GuangDongResult.getB4_06(),GuangDongResult.getB4_07(),GuangDongResult.getB4_08(),
                GuangDongResult.getB4_09(),GuangDongResult.getB4_10(),GuangDongResult.getB4_11(),GuangDongResult.getB4_12(),
                GuangDongResult.getB4_13(),GuangDongResult.getB4_14(),GuangDongResult.getB4_15(),GuangDongResult.getB4_16(),
                GuangDongResult.getB4_17(),GuangDongResult.getB4_18(),GuangDongResult.getB4_19(),GuangDongResult.getB4_20(),
                GuangDongResult.getDX4_D(),GuangDongResult.getDX4_X(),GuangDongResult.getDS4_D(),GuangDongResult.getDS4_S(),
                GuangDongResult.getWDX4_D(),GuangDongResult.getWDX4_X(),GuangDongResult.getHDS4_D(),GuangDongResult.getHDS4_S(),
                GuangDongResult.getFW4_0(),GuangDongResult.getFW4_1(),GuangDongResult.getFW4_2(),GuangDongResult.getFW4_3(),
                GuangDongResult.getZFB4_0(),GuangDongResult.getZFB4_1(),GuangDongResult.getZFB4_2(),
                GuangDongResult.getLH4_L(),GuangDongResult.getLH4_H()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball5Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB5_01(),GuangDongResult.getB5_02(),GuangDongResult.getB5_03(),GuangDongResult.getB5_04(),
                GuangDongResult.getB5_05(),GuangDongResult.getB5_06(),GuangDongResult.getB5_07(),GuangDongResult.getB5_08(),
                GuangDongResult.getB5_09(),GuangDongResult.getB5_10(),GuangDongResult.getB5_11(),GuangDongResult.getB5_12(),
                GuangDongResult.getB5_13(),GuangDongResult.getB5_14(),GuangDongResult.getB5_15(),GuangDongResult.getB5_16(),
                GuangDongResult.getB5_17(),GuangDongResult.getB5_18(),GuangDongResult.getB5_19(),GuangDongResult.getB5_20(),
                GuangDongResult.getDX5_D(),GuangDongResult.getDX5_X(),GuangDongResult.getDS5_D(),GuangDongResult.getDS5_S(),
                GuangDongResult.getWDX5_D(),GuangDongResult.getWDX5_X(),GuangDongResult.getHDS5_D(),GuangDongResult.getHDS5_S(),
                GuangDongResult.getFW5_0(),GuangDongResult.getFW5_1(),GuangDongResult.getFW5_2(),GuangDongResult.getFW5_3(),
                GuangDongResult.getZFB5_0(),GuangDongResult.getZFB5_1(),GuangDongResult.getZFB5_2()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball6Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB6_01(),GuangDongResult.getB6_02(),GuangDongResult.getB6_03(),GuangDongResult.getB6_04(),
                GuangDongResult.getB6_05(),GuangDongResult.getB6_06(),GuangDongResult.getB6_07(),GuangDongResult.getB6_08(),
                GuangDongResult.getB6_09(),GuangDongResult.getB6_10(),GuangDongResult.getB6_11(),GuangDongResult.getB6_12(),
                GuangDongResult.getB6_13(),GuangDongResult.getB6_14(),GuangDongResult.getB6_15(),GuangDongResult.getB6_16(),
                GuangDongResult.getB6_17(),GuangDongResult.getB6_18(),GuangDongResult.getB6_19(),GuangDongResult.getB6_20(),
                GuangDongResult.getDX6_D(),GuangDongResult.getDX6_X(),GuangDongResult.getDS6_D(),GuangDongResult.getDS6_S(),
                GuangDongResult.getWDX6_D(),GuangDongResult.getWDX6_X(),GuangDongResult.getHDS6_D(),GuangDongResult.getHDS6_S(),
                GuangDongResult.getFW6_0(),GuangDongResult.getFW6_1(),GuangDongResult.getFW6_2(),GuangDongResult.getFW6_3(),
                GuangDongResult.getZFB6_0(),GuangDongResult.getZFB6_1(),GuangDongResult.getZFB6_2()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball7Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB7_01(),GuangDongResult.getB7_02(),GuangDongResult.getB7_03(),GuangDongResult.getB7_04(),
                GuangDongResult.getB7_05(),GuangDongResult.getB7_06(),GuangDongResult.getB7_07(),GuangDongResult.getB7_08(),
                GuangDongResult.getB7_09(),GuangDongResult.getB7_10(),GuangDongResult.getB7_11(),GuangDongResult.getB7_12(),
                GuangDongResult.getB7_13(),GuangDongResult.getB7_14(),GuangDongResult.getB7_15(),GuangDongResult.getB7_16(),
                GuangDongResult.getB7_17(),GuangDongResult.getB7_18(),GuangDongResult.getB7_19(),GuangDongResult.getB7_20(),
                GuangDongResult.getDX7_D(),GuangDongResult.getDX7_X(),GuangDongResult.getDS7_D(),GuangDongResult.getDS7_S(),
                GuangDongResult.getWDX7_D(),GuangDongResult.getWDX7_X(),GuangDongResult.getHDS7_D(),GuangDongResult.getHDS7_S(),
                GuangDongResult.getFW7_0(),GuangDongResult.getFW7_1(),GuangDongResult.getFW7_2(),GuangDongResult.getFW7_3(),
                GuangDongResult.getZFB7_0(),GuangDongResult.getZFB7_1(),GuangDongResult.getZFB7_2()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_ball8Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB8_01(),GuangDongResult.getB8_02(),GuangDongResult.getB8_03(),GuangDongResult.getB8_04(),
                GuangDongResult.getB8_05(),GuangDongResult.getB8_06(),GuangDongResult.getB8_07(),GuangDongResult.getB8_08(),
                GuangDongResult.getB8_09(),GuangDongResult.getB8_10(),GuangDongResult.getB8_11(),GuangDongResult.getB8_12(),
                GuangDongResult.getB8_13(),GuangDongResult.getB8_14(),GuangDongResult.getB8_15(),GuangDongResult.getB8_16(),
                GuangDongResult.getB8_17(),GuangDongResult.getB8_18(),GuangDongResult.getB8_19(),GuangDongResult.getB8_20(),
                GuangDongResult.getDX8_D(),GuangDongResult.getDX8_X(),GuangDongResult.getDS8_D(),GuangDongResult.getDS8_S(),
                GuangDongResult.getWDX8_D(),GuangDongResult.getWDX8_X(),GuangDongResult.getHDS8_D(),GuangDongResult.getHDS8_S(),
                GuangDongResult.getFW8_0(),GuangDongResult.getFW8_1(),GuangDongResult.getFW8_2(),GuangDongResult.getFW8_3(),
                GuangDongResult.getZFB8_0(),GuangDongResult.getZFB8_1(),GuangDongResult.getZFB8_2()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_zmPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 GuangDong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangdongResul = GuangDong.getResult();
        String[] resultString = new String[]{
                GuangdongResul.getZM_01(), GuangdongResul.getZM_02(), GuangdongResul.getZM_03(), GuangdongResul.getZM_04(),
                GuangdongResul.getZM_05(), GuangdongResul.getZM_06(), GuangdongResul.getZM_07(), GuangdongResul.getZM_08(),
                GuangdongResul.getZM_09(), GuangdongResul.getZM_10(), GuangdongResul.getZM_11(), GuangdongResul.getZM_12(),
                GuangdongResul.getZM_13(), GuangdongResul.getZM_14(), GuangdongResul.getZM_15(), GuangdongResul.getZM_16(),
                GuangdongResul.getZM_17(), GuangdongResul.getZM_18(), GuangdongResul.getZM_19(), GuangdongResul.getZM_20(),
                GuangdongResul.getZDX_D(), GuangdongResul.getZDS_D(), GuangdongResul.getZWDX_D(),
                GuangdongResul.getZDX_X(), GuangdongResul.getZDS_S(), GuangdongResul.getZWDX_X()
        };
        return resultString;
    }
    public static String[] _KLSFklsf_lmPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 GuangDong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = GuangDong.getResult();
        String[] resultString = new String[]{
                GuangDongResult.getLM2(),GuangDongResult.getLM22(),GuangDongResult.getLM3(),
                GuangDongResult.getLM32(),GuangDongResult.getLM4(),GuangDongResult.getLM5(),
                "","","","","","","","","","","","","","","","","","","",""
        };
        return resultString;
    }

    public static String[] _NCklsf_allPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_1 Guangdong = gson.fromJson(resPeilv, GDKLSF_1.class);
        GDKLSF_1.result GuangdongResult = Guangdong.getResult();
        String[] resultString = new String[]{
                GuangdongResult.getZDX_D(), GuangdongResult.getZDX_X(), GuangdongResult.getZDS_D(), GuangdongResult.getZDS_S(),
                GuangdongResult.getZWDX_D(), GuangdongResult.getZWDX_X(),

                GuangdongResult.getDX1_D(), GuangdongResult.getDX1_X(), GuangdongResult.getDS1_D(), GuangdongResult.getDS1_S(),
                GuangdongResult.getWDX1_D(), GuangdongResult.getWDX1_X(), GuangdongResult.getHDS1_D(), GuangdongResult.getHDS1_S(),
                GuangdongResult.getLH1_L(), GuangdongResult.getLH1_H(),

                GuangdongResult.getDX2_D(), GuangdongResult.getDX2_X(), GuangdongResult.getDS2_D(), GuangdongResult.getDS2_S(),
                GuangdongResult.getWDX2_D(), GuangdongResult.getWDX2_X(), GuangdongResult.getHDS2_D(), GuangdongResult.getHDS2_S(),
                GuangdongResult.getLH2_L(), GuangdongResult.getLH2_H(),

                GuangdongResult.getDX3_D(), GuangdongResult.getDX3_X(), GuangdongResult.getDS3_D(), GuangdongResult.getDS3_S(),
                GuangdongResult.getWDX3_D(), GuangdongResult.getWDX3_X(), GuangdongResult.getHDS3_D(), GuangdongResult.getHDS3_S(),
                GuangdongResult.getLH3_L(), GuangdongResult.getLH3_H(),

                GuangdongResult.getDX4_D(), GuangdongResult.getDX4_X(), GuangdongResult.getDS4_D(), GuangdongResult.getDS4_S(),
                GuangdongResult.getWDX4_D(), GuangdongResult.getWDX4_X(), GuangdongResult.getHDS4_D(), GuangdongResult.getHDS4_S(),
                GuangdongResult.getLH4_L(), GuangdongResult.getLH4_H(),

                GuangdongResult.getDX5_D(), GuangdongResult.getDX5_X(), GuangdongResult.getDS5_D(), GuangdongResult.getDS5_S(),
                GuangdongResult.getWDX5_D(), GuangdongResult.getWDX5_X(), GuangdongResult.getHDS5_D(), GuangdongResult.getHDS5_S(),

                GuangdongResult.getDX6_D(), GuangdongResult.getDX6_X(), GuangdongResult.getDS6_D(), GuangdongResult.getDS6_S(),
                GuangdongResult.getWDX6_D(), GuangdongResult.getWDX6_X(), GuangdongResult.getHDS6_D(), GuangdongResult.getHDS6_S(),

                GuangdongResult.getDX7_D(), GuangdongResult.getDX7_X(), GuangdongResult.getDS7_D(), GuangdongResult.getDS7_S(),
                GuangdongResult.getWDX7_D(), GuangdongResult.getWDX7_X(), GuangdongResult.getHDS7_D(), GuangdongResult.getHDS7_S(),

                GuangdongResult.getDX8_D(), GuangdongResult.getDX8_X(), GuangdongResult.getDS8_D(), GuangdongResult.getDS8_S(),
                GuangdongResult.getWDX8_D(), GuangdongResult.getWDX8_X(), GuangdongResult.getHDS8_D(), GuangdongResult.getHDS8_S()

        };
        return resultString;
    }
    public static String[] _NCklsf_singlePeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangdongResult = Guangdong.getResult();
        String[] resultString = new String[]{GuangdongResult.getB1_01(), GuangdongResult.getB1_02(), GuangdongResult.getB1_03(), GuangdongResult.getB1_04(), GuangdongResult.getB1_05(),
                GuangdongResult.getB1_06(), GuangdongResult.getB1_07(), GuangdongResult.getB1_08(), GuangdongResult.getB1_09(), GuangdongResult.getB1_10(),
                GuangdongResult.getB1_11(), GuangdongResult.getB1_12(), GuangdongResult.getB1_13(), GuangdongResult.getB1_14(), GuangdongResult.getB1_15(),
                GuangdongResult.getB1_16(), GuangdongResult.getB1_17(), GuangdongResult.getB1_18(), GuangdongResult.getB1_19(), GuangdongResult.getB1_20(),
                GuangdongResult.getB2_01(), GuangdongResult.getB2_02(), GuangdongResult.getB2_03(), GuangdongResult.getB2_04(), GuangdongResult.getB2_05(),
                GuangdongResult.getB2_06(), GuangdongResult.getB2_07(), GuangdongResult.getB2_08(), GuangdongResult.getB2_09(), GuangdongResult.getB2_10(),
                GuangdongResult.getB2_11(), GuangdongResult.getB2_12(), GuangdongResult.getB2_13(), GuangdongResult.getB2_14(), GuangdongResult.getB2_15(),
                GuangdongResult.getB2_16(), GuangdongResult.getB2_17(), GuangdongResult.getB2_18(), GuangdongResult.getB2_19(), GuangdongResult.getB2_20(),
                GuangdongResult.getB3_01(), GuangdongResult.getB3_02(), GuangdongResult.getB3_03(), GuangdongResult.getB3_04(), GuangdongResult.getB3_05(),
                GuangdongResult.getB3_06(), GuangdongResult.getB3_07(), GuangdongResult.getB3_08(), GuangdongResult.getB3_09(), GuangdongResult.getB3_10(),
                GuangdongResult.getB3_11(), GuangdongResult.getB3_12(), GuangdongResult.getB3_13(), GuangdongResult.getB3_14(), GuangdongResult.getB3_15(),
                GuangdongResult.getB3_16(), GuangdongResult.getB3_17(), GuangdongResult.getB3_18(), GuangdongResult.getB3_19(), GuangdongResult.getB3_20(),
                GuangdongResult.getB4_01(), GuangdongResult.getB4_02(), GuangdongResult.getB4_03(), GuangdongResult.getB4_04(), GuangdongResult.getB4_05(),
                GuangdongResult.getB4_06(), GuangdongResult.getB4_07(), GuangdongResult.getB4_08(), GuangdongResult.getB4_09(), GuangdongResult.getB4_10(),
                GuangdongResult.getB4_11(), GuangdongResult.getB4_12(), GuangdongResult.getB4_13(), GuangdongResult.getB4_14(), GuangdongResult.getB4_15(),
                GuangdongResult.getB4_16(), GuangdongResult.getB4_17(), GuangdongResult.getB4_18(), GuangdongResult.getB4_19(), GuangdongResult.getB4_20(),
                GuangdongResult.getB5_01(), GuangdongResult.getB5_02(), GuangdongResult.getB5_03(), GuangdongResult.getB5_04(), GuangdongResult.getB5_05(),
                GuangdongResult.getB5_06(), GuangdongResult.getB5_07(), GuangdongResult.getB5_08(), GuangdongResult.getB5_09(), GuangdongResult.getB5_10(),
                GuangdongResult.getB5_11(), GuangdongResult.getB5_12(), GuangdongResult.getB5_13(), GuangdongResult.getB5_14(), GuangdongResult.getB5_15(),
                GuangdongResult.getB5_16(), GuangdongResult.getB5_17(), GuangdongResult.getB5_18(), GuangdongResult.getB5_19(), GuangdongResult.getB5_20(),
                GuangdongResult.getB6_01(), GuangdongResult.getB6_02(), GuangdongResult.getB6_03(), GuangdongResult.getB6_04(), GuangdongResult.getB6_05(),
                GuangdongResult.getB6_06(), GuangdongResult.getB6_07(), GuangdongResult.getB6_08(), GuangdongResult.getB6_09(), GuangdongResult.getB6_10(),
                GuangdongResult.getB6_11(), GuangdongResult.getB6_12(), GuangdongResult.getB6_13(), GuangdongResult.getB6_14(), GuangdongResult.getB6_15(),
                GuangdongResult.getB6_16(), GuangdongResult.getB6_17(), GuangdongResult.getB6_18(), GuangdongResult.getB6_19(), GuangdongResult.getB6_20(),
                GuangdongResult.getB7_01(), GuangdongResult.getB7_02(), GuangdongResult.getB7_03(), GuangdongResult.getB7_04(), GuangdongResult.getB7_05(),
                GuangdongResult.getB7_06(), GuangdongResult.getB7_07(), GuangdongResult.getB7_08(), GuangdongResult.getB7_09(), GuangdongResult.getB7_10(),
                GuangdongResult.getB7_11(), GuangdongResult.getB7_12(), GuangdongResult.getB7_13(), GuangdongResult.getB7_14(), GuangdongResult.getB7_15(),
                GuangdongResult.getB7_16(), GuangdongResult.getB7_17(), GuangdongResult.getB7_18(), GuangdongResult.getB7_19(), GuangdongResult.getB7_20(),
                GuangdongResult.getB8_01(), GuangdongResult.getB8_02(), GuangdongResult.getB8_03(), GuangdongResult.getB8_04(), GuangdongResult.getB8_05(),
                GuangdongResult.getB8_06(), GuangdongResult.getB8_07(), GuangdongResult.getB8_08(), GuangdongResult.getB8_09(), GuangdongResult.getB8_10(),
                GuangdongResult.getB8_11(), GuangdongResult.getB8_12(), GuangdongResult.getB8_13(), GuangdongResult.getB8_14(), GuangdongResult.getB8_15(),
                GuangdongResult.getB8_16(), GuangdongResult.getB8_17(), GuangdongResult.getB8_18(), GuangdongResult.getB8_19(), GuangdongResult.getB8_20(),
        };
        return resultString;
    }
    public static String[] _NCklsf_ball1Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString = new String[]{
                GuangDongResult.getB1_01(), GuangDongResult.getB1_02(), GuangDongResult.getB1_03(), GuangDongResult.getB1_04(),
                GuangDongResult.getB1_05(), GuangDongResult.getB1_06(), GuangDongResult.getB1_07(), GuangDongResult.getB1_08(),
                GuangDongResult.getB1_09(), GuangDongResult.getB1_10(), GuangDongResult.getB1_11(), GuangDongResult.getB1_12(),
                GuangDongResult.getB1_13(), GuangDongResult.getB1_14(), GuangDongResult.getB1_15(), GuangDongResult.getB1_16(),
                GuangDongResult.getB1_17(), GuangDongResult.getB1_18(), GuangDongResult.getB1_19(), GuangDongResult.getB1_20(),
                GuangDongResult.getDX1_D(), GuangDongResult.getDX1_X(), GuangDongResult.getDS1_D(), GuangDongResult.getDS1_S(),
                GuangDongResult.getWDX1_D(), GuangDongResult.getWDX1_X(), GuangDongResult.getHDS1_D(), GuangDongResult.getHDS1_S(),
                GuangDongResult.getFW1_0(), GuangDongResult.getFW1_1(), GuangDongResult.getFW1_2(), GuangDongResult.getFW1_3(),
                GuangDongResult.getZFB1_0(), GuangDongResult.getZFB1_1(), GuangDongResult.getZFB1_2(),
                GuangDongResult.getLH1_L(), GuangDongResult.getLH1_H()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball2Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[]  resultString=new String[]{
                GuangDongResult.getB2_01(),GuangDongResult.getB2_02(),GuangDongResult.getB2_03(),GuangDongResult.getB2_04(),
                GuangDongResult.getB2_05(),GuangDongResult.getB2_06(),GuangDongResult.getB2_07(),GuangDongResult.getB2_08(),
                GuangDongResult.getB2_09(),GuangDongResult.getB2_10(),GuangDongResult.getB2_11(),GuangDongResult.getB2_12(),
                GuangDongResult.getB2_13(),GuangDongResult.getB2_14(),GuangDongResult.getB2_15(),GuangDongResult.getB2_16(),
                GuangDongResult.getB2_17(),GuangDongResult.getB2_18(),GuangDongResult.getB2_19(),GuangDongResult.getB2_20(),
                GuangDongResult.getDX2_D(),GuangDongResult.getDX2_X(),GuangDongResult.getDS2_D(),GuangDongResult.getDS2_S(),
                GuangDongResult.getWDX2_D(),GuangDongResult.getWDX2_X(),GuangDongResult.getHDS2_D(),GuangDongResult.getHDS2_S(),
                GuangDongResult.getFW2_0(),GuangDongResult.getFW2_1(),GuangDongResult.getFW2_2(),GuangDongResult.getFW2_3(),
                GuangDongResult.getZFB2_0(),GuangDongResult.getZFB2_1(),GuangDongResult.getZFB2_2(),
                GuangDongResult.getLH2_L(),GuangDongResult.getLH2_H()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball3Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB3_01(),GuangDongResult.getB3_02(),GuangDongResult.getB3_03(),GuangDongResult.getB3_04(),
                GuangDongResult.getB3_05(),GuangDongResult.getB3_06(),GuangDongResult.getB3_07(),GuangDongResult.getB3_08(),
                GuangDongResult.getB3_09(),GuangDongResult.getB3_10(),GuangDongResult.getB3_11(),GuangDongResult.getB3_12(),
                GuangDongResult.getB3_13(),GuangDongResult.getB3_14(),GuangDongResult.getB3_15(),GuangDongResult.getB3_16(),
                GuangDongResult.getB3_17(),GuangDongResult.getB3_18(),GuangDongResult.getB3_19(),GuangDongResult.getB3_20(),
                GuangDongResult.getDX3_D(),GuangDongResult.getDX3_X(),GuangDongResult.getDS3_D(),GuangDongResult.getDS3_S(),
                GuangDongResult.getWDX3_D(),GuangDongResult.getWDX3_X(),GuangDongResult.getHDS3_D(),GuangDongResult.getHDS3_S(),
                GuangDongResult.getFW3_0(),GuangDongResult.getFW3_1(),GuangDongResult.getFW3_2(),GuangDongResult.getFW3_3(),
                GuangDongResult.getZFB3_0(),GuangDongResult.getZFB3_1(),GuangDongResult.getZFB3_2(),
                GuangDongResult.getLH3_L(),GuangDongResult.getLH3_H()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball4Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB4_01(),GuangDongResult.getB4_02(),GuangDongResult.getB4_03(),GuangDongResult.getB4_04(),
                GuangDongResult.getB4_05(),GuangDongResult.getB4_06(),GuangDongResult.getB4_07(),GuangDongResult.getB4_08(),
                GuangDongResult.getB4_09(),GuangDongResult.getB4_10(),GuangDongResult.getB4_11(),GuangDongResult.getB4_12(),
                GuangDongResult.getB4_13(),GuangDongResult.getB4_14(),GuangDongResult.getB4_15(),GuangDongResult.getB4_16(),
                GuangDongResult.getB4_17(),GuangDongResult.getB4_18(),GuangDongResult.getB4_19(),GuangDongResult.getB4_20(),
                GuangDongResult.getDX4_D(),GuangDongResult.getDX4_X(),GuangDongResult.getDS4_D(),GuangDongResult.getDS4_S(),
                GuangDongResult.getWDX4_D(),GuangDongResult.getWDX4_X(),GuangDongResult.getHDS4_D(),GuangDongResult.getHDS4_S(),
                GuangDongResult.getFW4_0(),GuangDongResult.getFW4_1(),GuangDongResult.getFW4_2(),GuangDongResult.getFW4_3(),
                GuangDongResult.getZFB4_0(),GuangDongResult.getZFB4_1(),GuangDongResult.getZFB4_2(),
                GuangDongResult.getLH4_L(),GuangDongResult.getLH4_H()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball5Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB5_01(),GuangDongResult.getB5_02(),GuangDongResult.getB5_03(),GuangDongResult.getB5_04(),
                GuangDongResult.getB5_05(),GuangDongResult.getB5_06(),GuangDongResult.getB5_07(),GuangDongResult.getB5_08(),
                GuangDongResult.getB5_09(),GuangDongResult.getB5_10(),GuangDongResult.getB5_11(),GuangDongResult.getB5_12(),
                GuangDongResult.getB5_13(),GuangDongResult.getB5_14(),GuangDongResult.getB5_15(),GuangDongResult.getB5_16(),
                GuangDongResult.getB5_17(),GuangDongResult.getB5_18(),GuangDongResult.getB5_19(),GuangDongResult.getB5_20(),
                GuangDongResult.getDX5_D(),GuangDongResult.getDX5_X(),GuangDongResult.getDS5_D(),GuangDongResult.getDS5_S(),
                GuangDongResult.getWDX5_D(),GuangDongResult.getWDX5_X(),GuangDongResult.getHDS5_D(),GuangDongResult.getHDS5_S(),
                GuangDongResult.getFW5_0(),GuangDongResult.getFW5_1(),GuangDongResult.getFW5_2(),GuangDongResult.getFW5_3(),
                GuangDongResult.getZFB5_0(),GuangDongResult.getZFB5_1(),GuangDongResult.getZFB5_2()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball6Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB6_01(),GuangDongResult.getB6_02(),GuangDongResult.getB6_03(),GuangDongResult.getB6_04(),
                GuangDongResult.getB6_05(),GuangDongResult.getB6_06(),GuangDongResult.getB6_07(),GuangDongResult.getB6_08(),
                GuangDongResult.getB6_09(),GuangDongResult.getB6_10(),GuangDongResult.getB6_11(),GuangDongResult.getB6_12(),
                GuangDongResult.getB6_13(),GuangDongResult.getB6_14(),GuangDongResult.getB6_15(),GuangDongResult.getB6_16(),
                GuangDongResult.getB6_17(),GuangDongResult.getB6_18(),GuangDongResult.getB6_19(),GuangDongResult.getB6_20(),
                GuangDongResult.getDX6_D(),GuangDongResult.getDX6_X(),GuangDongResult.getDS6_D(),GuangDongResult.getDS6_S(),
                GuangDongResult.getWDX6_D(),GuangDongResult.getWDX6_X(),GuangDongResult.getHDS6_D(),GuangDongResult.getHDS6_S(),
                GuangDongResult.getFW6_0(),GuangDongResult.getFW6_1(),GuangDongResult.getFW6_2(),GuangDongResult.getFW6_3(),
                GuangDongResult.getZFB6_0(),GuangDongResult.getZFB6_1(),GuangDongResult.getZFB6_2()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball7Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB7_01(),GuangDongResult.getB7_02(),GuangDongResult.getB7_03(),GuangDongResult.getB7_04(),
                GuangDongResult.getB7_05(),GuangDongResult.getB7_06(),GuangDongResult.getB7_07(),GuangDongResult.getB7_08(),
                GuangDongResult.getB7_09(),GuangDongResult.getB7_10(),GuangDongResult.getB7_11(),GuangDongResult.getB7_12(),
                GuangDongResult.getB7_13(),GuangDongResult.getB7_14(),GuangDongResult.getB7_15(),GuangDongResult.getB7_16(),
                GuangDongResult.getB7_17(),GuangDongResult.getB7_18(),GuangDongResult.getB7_19(),GuangDongResult.getB7_20(),
                GuangDongResult.getDX7_D(),GuangDongResult.getDX7_X(),GuangDongResult.getDS7_D(),GuangDongResult.getDS7_S(),
                GuangDongResult.getWDX7_D(),GuangDongResult.getWDX7_X(),GuangDongResult.getHDS7_D(),GuangDongResult.getHDS7_S(),
                GuangDongResult.getFW7_0(),GuangDongResult.getFW7_1(),GuangDongResult.getFW7_2(),GuangDongResult.getFW7_3(),
                GuangDongResult.getZFB7_0(),GuangDongResult.getZFB7_1(),GuangDongResult.getZFB7_2()
        };
        return resultString;
    }
    public static String[] _NCklsf_ball8Peilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 Guangdong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = Guangdong.getResult();
        String[] resultString=new String[]{
                GuangDongResult.getB8_01(),GuangDongResult.getB8_02(),GuangDongResult.getB8_03(),GuangDongResult.getB8_04(),
                GuangDongResult.getB8_05(),GuangDongResult.getB8_06(),GuangDongResult.getB8_07(),GuangDongResult.getB8_08(),
                GuangDongResult.getB8_09(),GuangDongResult.getB8_10(),GuangDongResult.getB8_11(),GuangDongResult.getB8_12(),
                GuangDongResult.getB8_13(),GuangDongResult.getB8_14(),GuangDongResult.getB8_15(),GuangDongResult.getB8_16(),
                GuangDongResult.getB8_17(),GuangDongResult.getB8_18(),GuangDongResult.getB8_19(),GuangDongResult.getB8_20(),
                GuangDongResult.getDX8_D(),GuangDongResult.getDX8_X(),GuangDongResult.getDS8_D(),GuangDongResult.getDS8_S(),
                GuangDongResult.getWDX8_D(),GuangDongResult.getWDX8_X(),GuangDongResult.getHDS8_D(),GuangDongResult.getHDS8_S(),
                GuangDongResult.getFW8_0(),GuangDongResult.getFW8_1(),GuangDongResult.getFW8_2(),GuangDongResult.getFW8_3(),
                GuangDongResult.getZFB8_0(),GuangDongResult.getZFB8_1(),GuangDongResult.getZFB8_2()
        };
        return resultString;
    }
    public static String[] _NCklsf_zmPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 GuangDong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangdongResul = GuangDong.getResult();
        String[] resultString = new String[]{
                GuangdongResul.getZM_01(), GuangdongResul.getZM_02(), GuangdongResul.getZM_03(), GuangdongResul.getZM_04(),
                GuangdongResul.getZM_05(), GuangdongResul.getZM_06(), GuangdongResul.getZM_07(), GuangdongResul.getZM_08(),
                GuangdongResul.getZM_09(), GuangdongResul.getZM_10(), GuangdongResul.getZM_11(), GuangdongResul.getZM_12(),
                GuangdongResul.getZM_13(), GuangdongResul.getZM_14(), GuangdongResul.getZM_15(), GuangdongResul.getZM_16(),
                GuangdongResul.getZM_17(), GuangdongResul.getZM_18(), GuangdongResul.getZM_19(), GuangdongResul.getZM_20(),
                GuangdongResul.getZDX_D(), GuangdongResul.getZDS_D(), GuangdongResul.getZWDX_D(),
                GuangdongResul.getZDX_X(), GuangdongResul.getZDS_S(), GuangdongResul.getZWDX_X()
        };
        return resultString;
    }
    public static String[]  NCklsf_lmPeilv(String resPeilv) {
        Gson gson=new Gson();
        GDKLSF_2 GuangDong = gson.fromJson(resPeilv, GDKLSF_2.class);
        GDKLSF_2.result GuangDongResult = GuangDong.getResult();
        String[] resultString = new String[]{
                GuangDongResult.getLM2(),GuangDongResult.getLM22(),GuangDongResult.getLM3(),
                GuangDongResult.getLM32(),GuangDongResult.getLM4(),GuangDongResult.getLM5(),
                "","","","","","","","","","","","","","","","","","","",""
        };
        return resultString;
    }

    /**
     * 福彩3D && 体彩排列3
     * @param result
     * @return
     */
    public static String[] _3DResult(String result) {
        Gson gson=new Gson();
        LoadLotteryHistory loadLotteryHistory = gson.fromJson(result, LoadLotteryHistory.class);
        String[] nums=new String[]{};
        if (loadLotteryHistory!=null&&loadLotteryHistory.getResult().getRows().size() > 0) {
            LoadLotteryHistory.Rows res = loadLotteryHistory.getResult().getRows().get(0);
            nums = new String[]{res.getOpenNo1(), res.getOpenNo2(), res.getOpenNo3()};
        }
        return nums;
    }
    public static String[] _D3D_mainPeilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("1Z_0"), fctcRes.getString("1Z_1"), fctcRes.getString("1Z_2"),
                    fctcRes.getString("1Z_3"), fctcRes.getString("1Z_4"), fctcRes.getString("1Z_5"),
                    fctcRes.getString("1Z_6"), fctcRes.getString("1Z_7"), fctcRes.getString("1Z_8"),
                    fctcRes.getString("1Z_9"),
                    fctcRes.getString("DX1_D"), fctcRes.getString("DX2_D"), fctcRes.getString("DX3_D"),
                    fctcRes.getString("DX12_D"), fctcRes.getString("DX13_D"), fctcRes.getString("DX23_D"),
                    fctcRes.getString("3DX_D"), fctcRes.getString("DX123_D"),
                    fctcRes.getString("DX1_X"), fctcRes.getString("DX2_X"), fctcRes.getString("DX3_X"),
                    fctcRes.getString("DX12_X"), fctcRes.getString("DX13_X"), fctcRes.getString("DX23_X"),
                    fctcRes.getString("3DX_X"), fctcRes.getString("DX123_X"),
                    fctcRes.getString("DS1_D"), fctcRes.getString("DS2_D"), fctcRes.getString("DS3_D"),
                    fctcRes.getString("DS12_D"), fctcRes.getString("DS13_D"), fctcRes.getString("DS23_D"),
                    fctcRes.getString("3DS_D"),
                    fctcRes.getString("DS1_S"), fctcRes.getString("DS2_S"), fctcRes.getString("DS3_S"),
                    fctcRes.getString("DS12_S"), fctcRes.getString("DS13_S"), fctcRes.getString("DS23_S"),
                    fctcRes.getString("3DS_S"),
                    fctcRes.getString("ZIH1_Z"), fctcRes.getString("ZIH2_Z"), fctcRes.getString("ZIH3_Z"),
                    fctcRes.getString("ZIH12_Z"), fctcRes.getString("ZIH13_Z"), fctcRes.getString("ZIH23_Z"),
                    fctcRes.getString("3ZIH_Z"),
                    fctcRes.getString("ZIH1_H"), fctcRes.getString("ZIH2_H"), fctcRes.getString("ZIH3_H"),
                    fctcRes.getString("ZIH12_H"), fctcRes.getString("ZIH13_H"), fctcRes.getString("ZIH23_H"),
                    fctcRes.getString("3ZIH_H"),
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _D3D_combin1Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("1Z_0"), fctcRes.getString("1Z_1"), fctcRes.getString("1Z_2"),
                    fctcRes.getString("1Z_3"), fctcRes.getString("1Z_4"), fctcRes.getString("1Z_5"),
                    fctcRes.getString("1Z_6"), fctcRes.getString("1Z_7"), fctcRes.getString("1Z_8"),
                    fctcRes.getString("1Z_9"),
                    fctcRes.getString("DX1_D"), fctcRes.getString("DX1_X"), fctcRes.getString("DS1_D"),
                    fctcRes.getString("DS1_S"), fctcRes.getString("ZIH1_Z"), fctcRes.getString("ZIH1_H"),
                    fctcRes.getString("DX2_D"), fctcRes.getString("DX2_X"), fctcRes.getString("DS2_D"),
                    fctcRes.getString("DS2_S"), fctcRes.getString("ZIH2_Z"), fctcRes.getString("ZIH2_H"),
                    fctcRes.getString("DX3_D"), fctcRes.getString("DX3_X"), fctcRes.getString("DS3_D"),
                    fctcRes.getString("DS3_S"), fctcRes.getString("ZIH3_Z"), fctcRes.getString("ZIH3_H"),
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _D3D_combin2Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString=new String[]{
                    fctcRes.getString("2Z_00"),fctcRes.getString("2Z_01"),fctcRes.getString("2Z_02"),
                    fctcRes.getString("2Z_03"),fctcRes.getString("2Z_04"),fctcRes.getString("2Z_05"),
                    fctcRes.getString("2Z_06"),fctcRes.getString("2Z_07"),fctcRes.getString("2Z_08"),
                    fctcRes.getString("2Z_09"),fctcRes.getString("2Z_11"),fctcRes.getString("2Z_12"),
                    fctcRes.getString("2Z_13"),fctcRes.getString("2Z_14"),fctcRes.getString("2Z_15"),
                    fctcRes.getString("2Z_16"),fctcRes.getString("2Z_17"),fctcRes.getString("2Z_18"),
                    fctcRes.getString("2Z_19"),fctcRes.getString("2Z_22"),fctcRes.getString("2Z_23"),
                    fctcRes.getString("2Z_24"),fctcRes.getString("2Z_25"),fctcRes.getString("2Z_26"),
                    fctcRes.getString("2Z_27"),fctcRes.getString("2Z_28"),fctcRes.getString("2Z_29"),
                    fctcRes.getString("2Z_33"),fctcRes.getString("2Z_34"),fctcRes.getString("2Z_35"),
                    fctcRes.getString("2Z_36"),fctcRes.getString("2Z_37"),fctcRes.getString("2Z_38"),
                    fctcRes.getString("2Z_39"),fctcRes.getString("2Z_44"),fctcRes.getString("2Z_45"),
                    fctcRes.getString("2Z_46"),fctcRes.getString("2Z_47"),fctcRes.getString("2Z_48"),
                    fctcRes.getString("2Z_49"),fctcRes.getString("2Z_55"),fctcRes.getString("2Z_56"),
                    fctcRes.getString("2Z_57"),fctcRes.getString("2Z_58"),fctcRes.getString("2Z_59"),
                    fctcRes.getString("2Z_66"),fctcRes.getString("2Z_67"),fctcRes.getString("2Z_68"),
                    fctcRes.getString("2Z_69"),fctcRes.getString("2Z_77"),fctcRes.getString("2Z_78"),
                    fctcRes.getString("2Z_79"),fctcRes.getString("2Z_88"),fctcRes.getString("2Z_89"),
                    fctcRes.getString("2Z_99")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _D3D_combin3Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("3Z_000"), fctcRes.getString("3Z_001"), fctcRes.getString("3Z_002"),
                    fctcRes.getString("3Z_003"), fctcRes.getString("3Z_004"), fctcRes.getString("3Z_005"),
                    fctcRes.getString("3Z_006"), fctcRes.getString("3Z_007"), fctcRes.getString("3Z_008"),
                    fctcRes.getString("3Z_009"), fctcRes.getString("3Z_011"), fctcRes.getString("3Z_012"),
                    fctcRes.getString("3Z_013"), fctcRes.getString("3Z_014"), fctcRes.getString("3Z_015"),
                    fctcRes.getString("3Z_016"), fctcRes.getString("3Z_017"), fctcRes.getString("3Z_018"),
                    fctcRes.getString("3Z_019"), fctcRes.getString("3Z_022"), fctcRes.getString("3Z_023"),
                    fctcRes.getString("3Z_024"), fctcRes.getString("3Z_025"), fctcRes.getString("3Z_026"),
                    fctcRes.getString("3Z_027"), fctcRes.getString("3Z_028"), fctcRes.getString("3Z_029"),
                    fctcRes.getString("3Z_033"), fctcRes.getString("3Z_034"), fctcRes.getString("3Z_035"),
                    fctcRes.getString("3Z_036"), fctcRes.getString("3Z_037"), fctcRes.getString("3Z_038"),
                    fctcRes.getString("3Z_039"), fctcRes.getString("3Z_044"), fctcRes.getString("3Z_045"),
                    fctcRes.getString("3Z_046"), fctcRes.getString("3Z_047"), fctcRes.getString("3Z_048"),
                    fctcRes.getString("3Z_049"), fctcRes.getString("3Z_055"), fctcRes.getString("3Z_056"),
                    fctcRes.getString("3Z_057"), fctcRes.getString("3Z_058"), fctcRes.getString("3Z_059"),
                    fctcRes.getString("3Z_066"), fctcRes.getString("3Z_067"), fctcRes.getString("3Z_068"),
                    fctcRes.getString("3Z_069"), fctcRes.getString("3Z_077"), fctcRes.getString("3Z_078"),
                    fctcRes.getString("3Z_079"), fctcRes.getString("3Z_088"), fctcRes.getString("3Z_089"),
                    fctcRes.getString("3Z_099"), fctcRes.getString("3Z_111"), fctcRes.getString("3Z_112"),
                    fctcRes.getString("3Z_113"), fctcRes.getString("3Z_114"), fctcRes.getString("3Z_115"),
                    fctcRes.getString("3Z_116"), fctcRes.getString("3Z_117"), fctcRes.getString("3Z_118"),
                    fctcRes.getString("3Z_119"), fctcRes.getString("3Z_122"), fctcRes.getString("3Z_123"),
                    fctcRes.getString("3Z_124"), fctcRes.getString("3Z_125"), fctcRes.getString("3Z_126"),
                    fctcRes.getString("3Z_127"), fctcRes.getString("3Z_128"), fctcRes.getString("3Z_129"),
                    fctcRes.getString("3Z_133"), fctcRes.getString("3Z_134"), fctcRes.getString("3Z_135"),
                    fctcRes.getString("3Z_136"), fctcRes.getString("3Z_137"), fctcRes.getString("3Z_138"),
                    fctcRes.getString("3Z_139"), fctcRes.getString("3Z_144"), fctcRes.getString("3Z_145"),
                    fctcRes.getString("3Z_146"), fctcRes.getString("3Z_147"), fctcRes.getString("3Z_148"),
                    fctcRes.getString("3Z_149"), fctcRes.getString("3Z_155"), fctcRes.getString("3Z_156"),
                    fctcRes.getString("3Z_157"), fctcRes.getString("3Z_158"), fctcRes.getString("3Z_159"),
                    fctcRes.getString("3Z_166"), fctcRes.getString("3Z_167"), fctcRes.getString("3Z_168"),
                    fctcRes.getString("3Z_169"), fctcRes.getString("3Z_177"), fctcRes.getString("3Z_178"),
                    fctcRes.getString("3Z_179"), fctcRes.getString("3Z_188"), fctcRes.getString("3Z_189"),
                    fctcRes.getString("3Z_199"), fctcRes.getString("3Z_222"), fctcRes.getString("3Z_223"),
                    fctcRes.getString("3Z_224"), fctcRes.getString("3Z_225"), fctcRes.getString("3Z_226"),
                    fctcRes.getString("3Z_227"), fctcRes.getString("3Z_228"), fctcRes.getString("3Z_229"),
                    fctcRes.getString("3Z_233"), fctcRes.getString("3Z_234"), fctcRes.getString("3Z_235"),
                    fctcRes.getString("3Z_236"), fctcRes.getString("3Z_237"), fctcRes.getString("3Z_238"),
                    fctcRes.getString("3Z_239"), fctcRes.getString("3Z_244"), fctcRes.getString("3Z_245"),
                    fctcRes.getString("3Z_246"), fctcRes.getString("3Z_247"), fctcRes.getString("3Z_248"),
                    fctcRes.getString("3Z_249"), fctcRes.getString("3Z_255"), fctcRes.getString("3Z_256"),
                    fctcRes.getString("3Z_257"), fctcRes.getString("3Z_258"), fctcRes.getString("3Z_259"),
                    fctcRes.getString("3Z_266"), fctcRes.getString("3Z_267"), fctcRes.getString("3Z_268"),
                    fctcRes.getString("3Z_269"), fctcRes.getString("3Z_277"), fctcRes.getString("3Z_278"),
                    fctcRes.getString("3Z_279"), fctcRes.getString("3Z_288"), fctcRes.getString("3Z_289"),
                    fctcRes.getString("3Z_299"), fctcRes.getString("3Z_333"), fctcRes.getString("3Z_334"),
                    fctcRes.getString("3Z_335"), fctcRes.getString("3Z_336"), fctcRes.getString("3Z_337"),
                    fctcRes.getString("3Z_338"), fctcRes.getString("3Z_339"), fctcRes.getString("3Z_344"),
                    fctcRes.getString("3Z_345"), fctcRes.getString("3Z_346"), fctcRes.getString("3Z_347"),
                    fctcRes.getString("3Z_348"), fctcRes.getString("3Z_349"), fctcRes.getString("3Z_355"),
                    fctcRes.getString("3Z_356"), fctcRes.getString("3Z_357"), fctcRes.getString("3Z_358"),
                    fctcRes.getString("3Z_359"), fctcRes.getString("3Z_366"), fctcRes.getString("3Z_367"),
                    fctcRes.getString("3Z_368"), fctcRes.getString("3Z_369"), fctcRes.getString("3Z_377"),
                    fctcRes.getString("3Z_378"), fctcRes.getString("3Z_379"), fctcRes.getString("3Z_388"),
                    fctcRes.getString("3Z_389"), fctcRes.getString("3Z_399"), fctcRes.getString("3Z_444"),
                    fctcRes.getString("3Z_445"), fctcRes.getString("3Z_446"), fctcRes.getString("3Z_447"),
                    fctcRes.getString("3Z_448"), fctcRes.getString("3Z_449"), fctcRes.getString("3Z_455"),
                    fctcRes.getString("3Z_456"), fctcRes.getString("3Z_457"), fctcRes.getString("3Z_458"),
                    fctcRes.getString("3Z_459"), fctcRes.getString("3Z_466"), fctcRes.getString("3Z_467"),
                    fctcRes.getString("3Z_468"), fctcRes.getString("3Z_469"), fctcRes.getString("3Z_477"),
                    fctcRes.getString("3Z_478"), fctcRes.getString("3Z_479"), fctcRes.getString("3Z_488"),
                    fctcRes.getString("3Z_489"), fctcRes.getString("3Z_499"), fctcRes.getString("3Z_555"),
                    fctcRes.getString("3Z_556"), fctcRes.getString("3Z_557"), fctcRes.getString("3Z_558"),
                    fctcRes.getString("3Z_559"), fctcRes.getString("3Z_566"), fctcRes.getString("3Z_567"),
                    fctcRes.getString("3Z_568"), fctcRes.getString("3Z_569"), fctcRes.getString("3Z_577"),
                    fctcRes.getString("3Z_578"), fctcRes.getString("3Z_579"), fctcRes.getString("3Z_588"),
                    fctcRes.getString("3Z_589"), fctcRes.getString("3Z_599"), fctcRes.getString("3Z_666"),
                    fctcRes.getString("3Z_667"), fctcRes.getString("3Z_668"), fctcRes.getString("3Z_669"),
                    fctcRes.getString("3Z_677"), fctcRes.getString("3Z_678"), fctcRes.getString("3Z_679"),
                    fctcRes.getString("3Z_688"), fctcRes.getString("3Z_689"), fctcRes.getString("3Z_699"),
                    fctcRes.getString("3Z_777"), fctcRes.getString("3Z_778"), fctcRes.getString("3Z_779"),
                    fctcRes.getString("3Z_788"), fctcRes.getString("3Z_789"), fctcRes.getString("3Z_799"),
                    fctcRes.getString("3Z_888"), fctcRes.getString("3Z_889"), fctcRes.getString("3Z_899"),
                    fctcRes.getString("3Z_999")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _D3D_locate1Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getDW1_0(), FucaiResult.getDW1_1(), FucaiResult.getDW1_2(), FucaiResult.getDW1_3(),
                FucaiResult.getDW1_4(), FucaiResult.getDW1_5(), FucaiResult.getDW1_6(), FucaiResult.getDW1_7(),
                FucaiResult.getDW1_8(), FucaiResult.getDW1_9(),
                FucaiResult.getDW2_0(), FucaiResult.getDW2_1(), FucaiResult.getDW2_2(), FucaiResult.getDW2_3(),
                FucaiResult.getDW2_4(), FucaiResult.getDW2_5(), FucaiResult.getDW2_6(), FucaiResult.getDW2_7(),
                FucaiResult.getDW2_8(), FucaiResult.getDW2_9(),
                FucaiResult.getDW3_0(), FucaiResult.getDW3_1(), FucaiResult.getDW3_2(), FucaiResult.getDW3_3(),
                FucaiResult.getDW3_4(), FucaiResult.getDW3_5(), FucaiResult.getDW3_6(), FucaiResult.getDW3_7(),
                FucaiResult.getDW3_8(), FucaiResult.getDW3_9()};
        return resultString;
    }
    public static String[] _D3D_locate2Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        String[] resultString=new String[]{};
        if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW12()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW13()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW23()};
        }
        return resultString;
    }
    public static String[] _D3D_locate3Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    fctcRes.getString("3DW")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _D3D_sum2Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString=new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bs")){
            resultString = new String[]{FucaiResult.getHS12_4(), FucaiResult.getHS12_5(), FucaiResult.getHS12_6(),
                    FucaiResult.getHS12_7(), FucaiResult.getHS12_8(), FucaiResult.getHS12_9(), FucaiResult.getHS12_10(),
                    FucaiResult.getHS12_11(), FucaiResult.getHS12_12(), FucaiResult.getHS12_13(), FucaiResult.getHS12_14(),
                    FucaiResult.getHWS12_0(), FucaiResult.getHWS12_1(), FucaiResult.getHWS12_2(), FucaiResult.getHWS12_3(),
                    FucaiResult.getHWS12_4(), FucaiResult.getHWS12_5(), FucaiResult.getHWS12_6(), FucaiResult.getHWS12_7(),
                    FucaiResult.getHWS12_8(), FucaiResult.getHWS12_9()
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bg")){
            resultString = new String[]{FucaiResult.getHS13_4(), FucaiResult.getHS13_5(), FucaiResult.getHS13_6(),
                    FucaiResult.getHS13_7(), FucaiResult.getHS13_8(), FucaiResult.getHS13_9(), FucaiResult.getHS13_10(),
                    FucaiResult.getHS13_11(), FucaiResult.getHS13_12(), FucaiResult.getHS13_13(), FucaiResult.getHS13_14(),
                    FucaiResult.getHWS13_0(), FucaiResult.getHWS13_1(), FucaiResult.getHWS13_2(), FucaiResult.getHWS13_3(),
                    FucaiResult.getHWS13_4(), FucaiResult.getHWS13_5(), FucaiResult.getHWS13_6(), FucaiResult.getHWS13_7(),
                    FucaiResult.getHWS13_8(), FucaiResult.getHWS13_9()
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_sg")){
            resultString = new String[]{FucaiResult.getHS23_4(), FucaiResult.getHS23_5(), FucaiResult.getHS23_6(),
                    FucaiResult.getHS23_7(), FucaiResult.getHS23_8(), FucaiResult.getHS23_9(), FucaiResult.getHS23_10(),
                    FucaiResult.getHS23_11(), FucaiResult.getHS23_12(), FucaiResult.getHS23_13(), FucaiResult.getHS23_14(),
                    FucaiResult.getHWS23_0(), FucaiResult.getHWS23_1(), FucaiResult.getHWS23_2(), FucaiResult.getHWS23_3(),
                    FucaiResult.getHWS23_4(), FucaiResult.getHWS23_5(), FucaiResult.getHWS23_6(), FucaiResult.getHWS23_7(),
                    FucaiResult.getHWS23_8(), FucaiResult.getHWS23_9()
            };
        }
        return resultString;
    }
    public static String[] _D3D_sum3Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getHS_6(), FucaiResult.getHS_7(), FucaiResult.getHS_8(), FucaiResult.getHS_9(), FucaiResult.getHS_10(),
                FucaiResult.getHS_11(), FucaiResult.getHS_12(), FucaiResult.getHS_13(), FucaiResult.getHS_14(), FucaiResult.getHS_15(),
                FucaiResult.getHS_16(), FucaiResult.getHS_17(), FucaiResult.getHS_18(), FucaiResult.getHS_19(), FucaiResult.getHS_20(),
                FucaiResult.getHS_21(), FucaiResult.getHWS123_0(), FucaiResult.getHWS123_1(), FucaiResult.getHWS123_2(), FucaiResult.getHWS123_3(),
                FucaiResult.getHWS123_4(), FucaiResult.getHWS123_5(), FucaiResult.getHWS123_6(), FucaiResult.getHWS123_7(),
                FucaiResult.getHWS123_8(), FucaiResult.getHWS123_9()
        };
        return resultString;
    }
    public static String[] _D3D_spanPeilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getKD_0(), FucaiResult.getKD_1(), FucaiResult.getKD_2(), FucaiResult.getKD_3(),
                FucaiResult.getKD_4(), FucaiResult.getKD_5(), FucaiResult.getKD_6(), FucaiResult.getKD_7(),
                FucaiResult.getKD_8(), FucaiResult.getKD_9()
        };
        return resultString;
    }
    public static String[] _D3D_select3Peilv(String resPeilv) {
        String[] resultString=new String[]{"","","","","","","","","",""};
        return resultString;
    }
    public static String[] _D3D_select6Peilv(String resPeilv) {
        String[] resultString=new String[]{"","","","","","","","","",""};
        return resultString;
    }

    public static String[] _33D_mainPeilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("1Z_0"), fctcRes.getString("1Z_1"), fctcRes.getString("1Z_2"),
                    fctcRes.getString("1Z_3"), fctcRes.getString("1Z_4"), fctcRes.getString("1Z_5"),
                    fctcRes.getString("1Z_6"), fctcRes.getString("1Z_7"), fctcRes.getString("1Z_8"),
                    fctcRes.getString("1Z_9"),
                    fctcRes.getString("DX1_D"), fctcRes.getString("DX2_D"), fctcRes.getString("DX3_D"),
                    fctcRes.getString("DX12_D"), fctcRes.getString("DX13_D"), fctcRes.getString("DX23_D"),
                    fctcRes.getString("3DX_D"), fctcRes.getString("DX123_D"),
                    fctcRes.getString("DX1_X"), fctcRes.getString("DX2_X"), fctcRes.getString("DX3_X"),
                    fctcRes.getString("DX12_X"), fctcRes.getString("DX13_X"), fctcRes.getString("DX23_X"),
                    fctcRes.getString("3DX_X"), fctcRes.getString("DX123_X"),
                    fctcRes.getString("DS1_D"), fctcRes.getString("DS2_D"), fctcRes.getString("DS3_D"),
                    fctcRes.getString("DS12_D"), fctcRes.getString("DS13_D"), fctcRes.getString("DS23_D"),
                    fctcRes.getString("3DS_D"),
                    fctcRes.getString("DS1_S"), fctcRes.getString("DS2_S"), fctcRes.getString("DS3_S"),
                    fctcRes.getString("DS12_S"), fctcRes.getString("DS13_S"), fctcRes.getString("DS23_S"),
                    fctcRes.getString("3DS_S"),
                    fctcRes.getString("ZIH1_Z"), fctcRes.getString("ZIH2_Z"), fctcRes.getString("ZIH3_Z"),
                    fctcRes.getString("ZIH12_Z"), fctcRes.getString("ZIH13_Z"), fctcRes.getString("ZIH23_Z"),
                    fctcRes.getString("3ZIH_Z"),
                    fctcRes.getString("ZIH1_H"), fctcRes.getString("ZIH2_H"), fctcRes.getString("ZIH3_H"),
                    fctcRes.getString("ZIH12_H"), fctcRes.getString("ZIH13_H"), fctcRes.getString("ZIH23_H"),
                    fctcRes.getString("3ZIH_H"),
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _33D_combin1Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("1Z_0"), fctcRes.getString("1Z_1"), fctcRes.getString("1Z_2"),
                    fctcRes.getString("1Z_3"), fctcRes.getString("1Z_4"), fctcRes.getString("1Z_5"),
                    fctcRes.getString("1Z_6"), fctcRes.getString("1Z_7"), fctcRes.getString("1Z_8"),
                    fctcRes.getString("1Z_9"),
                    fctcRes.getString("DX1_D"), fctcRes.getString("DX1_X"), fctcRes.getString("DS1_D"),
                    fctcRes.getString("DS1_S"), fctcRes.getString("ZIH1_Z"), fctcRes.getString("ZIH1_H"),
                    fctcRes.getString("DX2_D"), fctcRes.getString("DX2_X"), fctcRes.getString("DS2_D"),
                    fctcRes.getString("DS2_S"), fctcRes.getString("ZIH2_Z"), fctcRes.getString("ZIH2_H"),
                    fctcRes.getString("DX3_D"), fctcRes.getString("DX3_X"), fctcRes.getString("DS3_D"),
                    fctcRes.getString("DS3_S"), fctcRes.getString("ZIH3_Z"), fctcRes.getString("ZIH3_H"),
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _33D_combin2Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString=new String[]{
                    fctcRes.getString("2Z_00"),fctcRes.getString("2Z_01"),fctcRes.getString("2Z_02"),
                    fctcRes.getString("2Z_03"),fctcRes.getString("2Z_04"),fctcRes.getString("2Z_05"),
                    fctcRes.getString("2Z_06"),fctcRes.getString("2Z_07"),fctcRes.getString("2Z_08"),
                    fctcRes.getString("2Z_09"),fctcRes.getString("2Z_11"),fctcRes.getString("2Z_12"),
                    fctcRes.getString("2Z_13"),fctcRes.getString("2Z_14"),fctcRes.getString("2Z_15"),
                    fctcRes.getString("2Z_16"),fctcRes.getString("2Z_17"),fctcRes.getString("2Z_18"),
                    fctcRes.getString("2Z_19"),fctcRes.getString("2Z_22"),fctcRes.getString("2Z_23"),
                    fctcRes.getString("2Z_24"),fctcRes.getString("2Z_25"),fctcRes.getString("2Z_26"),
                    fctcRes.getString("2Z_27"),fctcRes.getString("2Z_28"),fctcRes.getString("2Z_29"),
                    fctcRes.getString("2Z_33"),fctcRes.getString("2Z_34"),fctcRes.getString("2Z_35"),
                    fctcRes.getString("2Z_36"),fctcRes.getString("2Z_37"),fctcRes.getString("2Z_38"),
                    fctcRes.getString("2Z_39"),fctcRes.getString("2Z_44"),fctcRes.getString("2Z_45"),
                    fctcRes.getString("2Z_46"),fctcRes.getString("2Z_47"),fctcRes.getString("2Z_48"),
                    fctcRes.getString("2Z_49"),fctcRes.getString("2Z_55"),fctcRes.getString("2Z_56"),
                    fctcRes.getString("2Z_57"),fctcRes.getString("2Z_58"),fctcRes.getString("2Z_59"),
                    fctcRes.getString("2Z_66"),fctcRes.getString("2Z_67"),fctcRes.getString("2Z_68"),
                    fctcRes.getString("2Z_69"),fctcRes.getString("2Z_77"),fctcRes.getString("2Z_78"),
                    fctcRes.getString("2Z_79"),fctcRes.getString("2Z_88"),fctcRes.getString("2Z_89"),
                    fctcRes.getString("2Z_99")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _33D_combin3Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString = new String[]{
                    fctcRes.getString("3Z_000"), fctcRes.getString("3Z_001"), fctcRes.getString("3Z_002"),
                    fctcRes.getString("3Z_003"), fctcRes.getString("3Z_004"), fctcRes.getString("3Z_005"),
                    fctcRes.getString("3Z_006"), fctcRes.getString("3Z_007"), fctcRes.getString("3Z_008"),
                    fctcRes.getString("3Z_009"), fctcRes.getString("3Z_011"), fctcRes.getString("3Z_012"),
                    fctcRes.getString("3Z_013"), fctcRes.getString("3Z_014"), fctcRes.getString("3Z_015"),
                    fctcRes.getString("3Z_016"), fctcRes.getString("3Z_017"), fctcRes.getString("3Z_018"),
                    fctcRes.getString("3Z_019"), fctcRes.getString("3Z_022"), fctcRes.getString("3Z_023"),
                    fctcRes.getString("3Z_024"), fctcRes.getString("3Z_025"), fctcRes.getString("3Z_026"),
                    fctcRes.getString("3Z_027"), fctcRes.getString("3Z_028"), fctcRes.getString("3Z_029"),
                    fctcRes.getString("3Z_033"), fctcRes.getString("3Z_034"), fctcRes.getString("3Z_035"),
                    fctcRes.getString("3Z_036"), fctcRes.getString("3Z_037"), fctcRes.getString("3Z_038"),
                    fctcRes.getString("3Z_039"), fctcRes.getString("3Z_044"), fctcRes.getString("3Z_045"),
                    fctcRes.getString("3Z_046"), fctcRes.getString("3Z_047"), fctcRes.getString("3Z_048"),
                    fctcRes.getString("3Z_049"), fctcRes.getString("3Z_055"), fctcRes.getString("3Z_056"),
                    fctcRes.getString("3Z_057"), fctcRes.getString("3Z_058"), fctcRes.getString("3Z_059"),
                    fctcRes.getString("3Z_066"), fctcRes.getString("3Z_067"), fctcRes.getString("3Z_068"),
                    fctcRes.getString("3Z_069"), fctcRes.getString("3Z_077"), fctcRes.getString("3Z_078"),
                    fctcRes.getString("3Z_079"), fctcRes.getString("3Z_088"), fctcRes.getString("3Z_089"),
                    fctcRes.getString("3Z_099"), fctcRes.getString("3Z_111"), fctcRes.getString("3Z_112"),
                    fctcRes.getString("3Z_113"), fctcRes.getString("3Z_114"), fctcRes.getString("3Z_115"),
                    fctcRes.getString("3Z_116"), fctcRes.getString("3Z_117"), fctcRes.getString("3Z_118"),
                    fctcRes.getString("3Z_119"), fctcRes.getString("3Z_122"), fctcRes.getString("3Z_123"),
                    fctcRes.getString("3Z_124"), fctcRes.getString("3Z_125"), fctcRes.getString("3Z_126"),
                    fctcRes.getString("3Z_127"), fctcRes.getString("3Z_128"), fctcRes.getString("3Z_129"),
                    fctcRes.getString("3Z_133"), fctcRes.getString("3Z_134"), fctcRes.getString("3Z_135"),
                    fctcRes.getString("3Z_136"), fctcRes.getString("3Z_137"), fctcRes.getString("3Z_138"),
                    fctcRes.getString("3Z_139"), fctcRes.getString("3Z_144"), fctcRes.getString("3Z_145"),
                    fctcRes.getString("3Z_146"), fctcRes.getString("3Z_147"), fctcRes.getString("3Z_148"),
                    fctcRes.getString("3Z_149"), fctcRes.getString("3Z_155"), fctcRes.getString("3Z_156"),
                    fctcRes.getString("3Z_157"), fctcRes.getString("3Z_158"), fctcRes.getString("3Z_159"),
                    fctcRes.getString("3Z_166"), fctcRes.getString("3Z_167"), fctcRes.getString("3Z_168"),
                    fctcRes.getString("3Z_169"), fctcRes.getString("3Z_177"), fctcRes.getString("3Z_178"),
                    fctcRes.getString("3Z_179"), fctcRes.getString("3Z_188"), fctcRes.getString("3Z_189"),
                    fctcRes.getString("3Z_199"), fctcRes.getString("3Z_222"), fctcRes.getString("3Z_223"),
                    fctcRes.getString("3Z_224"), fctcRes.getString("3Z_225"), fctcRes.getString("3Z_226"),
                    fctcRes.getString("3Z_227"), fctcRes.getString("3Z_228"), fctcRes.getString("3Z_229"),
                    fctcRes.getString("3Z_233"), fctcRes.getString("3Z_234"), fctcRes.getString("3Z_235"),
                    fctcRes.getString("3Z_236"), fctcRes.getString("3Z_237"), fctcRes.getString("3Z_238"),
                    fctcRes.getString("3Z_239"), fctcRes.getString("3Z_244"), fctcRes.getString("3Z_245"),
                    fctcRes.getString("3Z_246"), fctcRes.getString("3Z_247"), fctcRes.getString("3Z_248"),
                    fctcRes.getString("3Z_249"), fctcRes.getString("3Z_255"), fctcRes.getString("3Z_256"),
                    fctcRes.getString("3Z_257"), fctcRes.getString("3Z_258"), fctcRes.getString("3Z_259"),
                    fctcRes.getString("3Z_266"), fctcRes.getString("3Z_267"), fctcRes.getString("3Z_268"),
                    fctcRes.getString("3Z_269"), fctcRes.getString("3Z_277"), fctcRes.getString("3Z_278"),
                    fctcRes.getString("3Z_279"), fctcRes.getString("3Z_288"), fctcRes.getString("3Z_289"),
                    fctcRes.getString("3Z_299"), fctcRes.getString("3Z_333"), fctcRes.getString("3Z_334"),
                    fctcRes.getString("3Z_335"), fctcRes.getString("3Z_336"), fctcRes.getString("3Z_337"),
                    fctcRes.getString("3Z_338"), fctcRes.getString("3Z_339"), fctcRes.getString("3Z_344"),
                    fctcRes.getString("3Z_345"), fctcRes.getString("3Z_346"), fctcRes.getString("3Z_347"),
                    fctcRes.getString("3Z_348"), fctcRes.getString("3Z_349"), fctcRes.getString("3Z_355"),
                    fctcRes.getString("3Z_356"), fctcRes.getString("3Z_357"), fctcRes.getString("3Z_358"),
                    fctcRes.getString("3Z_359"), fctcRes.getString("3Z_366"), fctcRes.getString("3Z_367"),
                    fctcRes.getString("3Z_368"), fctcRes.getString("3Z_369"), fctcRes.getString("3Z_377"),
                    fctcRes.getString("3Z_378"), fctcRes.getString("3Z_379"), fctcRes.getString("3Z_388"),
                    fctcRes.getString("3Z_389"), fctcRes.getString("3Z_399"), fctcRes.getString("3Z_444"),
                    fctcRes.getString("3Z_445"), fctcRes.getString("3Z_446"), fctcRes.getString("3Z_447"),
                    fctcRes.getString("3Z_448"), fctcRes.getString("3Z_449"), fctcRes.getString("3Z_455"),
                    fctcRes.getString("3Z_456"), fctcRes.getString("3Z_457"), fctcRes.getString("3Z_458"),
                    fctcRes.getString("3Z_459"), fctcRes.getString("3Z_466"), fctcRes.getString("3Z_467"),
                    fctcRes.getString("3Z_468"), fctcRes.getString("3Z_469"), fctcRes.getString("3Z_477"),
                    fctcRes.getString("3Z_478"), fctcRes.getString("3Z_479"), fctcRes.getString("3Z_488"),
                    fctcRes.getString("3Z_489"), fctcRes.getString("3Z_499"), fctcRes.getString("3Z_555"),
                    fctcRes.getString("3Z_556"), fctcRes.getString("3Z_557"), fctcRes.getString("3Z_558"),
                    fctcRes.getString("3Z_559"), fctcRes.getString("3Z_566"), fctcRes.getString("3Z_567"),
                    fctcRes.getString("3Z_568"), fctcRes.getString("3Z_569"), fctcRes.getString("3Z_577"),
                    fctcRes.getString("3Z_578"), fctcRes.getString("3Z_579"), fctcRes.getString("3Z_588"),
                    fctcRes.getString("3Z_589"), fctcRes.getString("3Z_599"), fctcRes.getString("3Z_666"),
                    fctcRes.getString("3Z_667"), fctcRes.getString("3Z_668"), fctcRes.getString("3Z_669"),
                    fctcRes.getString("3Z_677"), fctcRes.getString("3Z_678"), fctcRes.getString("3Z_679"),
                    fctcRes.getString("3Z_688"), fctcRes.getString("3Z_689"), fctcRes.getString("3Z_699"),
                    fctcRes.getString("3Z_777"), fctcRes.getString("3Z_778"), fctcRes.getString("3Z_779"),
                    fctcRes.getString("3Z_788"), fctcRes.getString("3Z_789"), fctcRes.getString("3Z_799"),
                    fctcRes.getString("3Z_888"), fctcRes.getString("3Z_889"), fctcRes.getString("3Z_899"),
                    fctcRes.getString("3Z_999")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _33D_locate1Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getDW1_0(), FucaiResult.getDW1_1(), FucaiResult.getDW1_2(), FucaiResult.getDW1_3(),
                FucaiResult.getDW1_4(), FucaiResult.getDW1_5(), FucaiResult.getDW1_6(), FucaiResult.getDW1_7(),
                FucaiResult.getDW1_8(), FucaiResult.getDW1_9(),
                FucaiResult.getDW2_0(), FucaiResult.getDW2_1(), FucaiResult.getDW2_2(), FucaiResult.getDW2_3(),
                FucaiResult.getDW2_4(), FucaiResult.getDW2_5(), FucaiResult.getDW2_6(), FucaiResult.getDW2_7(),
                FucaiResult.getDW2_8(), FucaiResult.getDW2_9(),
                FucaiResult.getDW3_0(), FucaiResult.getDW3_1(), FucaiResult.getDW3_2(), FucaiResult.getDW3_3(),
                FucaiResult.getDW3_4(), FucaiResult.getDW3_5(), FucaiResult.getDW3_6(), FucaiResult.getDW3_7(),
                FucaiResult.getDW3_8(), FucaiResult.getDW3_9()};
        return resultString;
    }
    public static String[] _33D_locate2Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        String[] resultString=new String[]{};
        if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_12")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW12()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_13")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW13()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("3D_23")){
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    Fucai.getResult().getDW23()};
        }
        return resultString;
    }
    public static String[] _33D_locate3Peilv(String resPeilv) {
        String[] resultString=new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
            resultString=new String[]{
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    "","","","","","","","","","",
                    fctcRes.getString("3DW")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _33D_sum2Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString=new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bs")){
            resultString = new String[]{FucaiResult.getHS12_4(), FucaiResult.getHS12_5(), FucaiResult.getHS12_6(),
                    FucaiResult.getHS12_7(), FucaiResult.getHS12_8(), FucaiResult.getHS12_9(), FucaiResult.getHS12_10(),
                    FucaiResult.getHS12_11(), FucaiResult.getHS12_12(), FucaiResult.getHS12_13(), FucaiResult.getHS12_14(),
                    FucaiResult.getHWS12_0(), FucaiResult.getHWS12_1(), FucaiResult.getHWS12_2(), FucaiResult.getHWS12_3(),
                    FucaiResult.getHWS12_4(), FucaiResult.getHWS12_5(), FucaiResult.getHWS12_6(), FucaiResult.getHWS12_7(),
                    FucaiResult.getHWS12_8(), FucaiResult.getHWS12_9()
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_bg")){
            resultString = new String[]{FucaiResult.getHS13_4(), FucaiResult.getHS13_5(), FucaiResult.getHS13_6(),
                    FucaiResult.getHS13_7(), FucaiResult.getHS13_8(), FucaiResult.getHS13_9(), FucaiResult.getHS13_10(),
                    FucaiResult.getHS13_11(), FucaiResult.getHS13_12(), FucaiResult.getHS13_13(), FucaiResult.getHS13_14(),
                    FucaiResult.getHWS13_0(), FucaiResult.getHWS13_1(), FucaiResult.getHWS13_2(), FucaiResult.getHWS13_3(),
                    FucaiResult.getHWS13_4(), FucaiResult.getHWS13_5(), FucaiResult.getHWS13_6(), FucaiResult.getHWS13_7(),
                    FucaiResult.getHWS13_8(), FucaiResult.getHWS13_9()
            };
        }else if (MainGlobalData.LOTTERY_SUBTITLE.equals("3D_sg")){
            resultString = new String[]{FucaiResult.getHS23_4(), FucaiResult.getHS23_5(), FucaiResult.getHS23_6(),
                    FucaiResult.getHS23_7(), FucaiResult.getHS23_8(), FucaiResult.getHS23_9(), FucaiResult.getHS23_10(),
                    FucaiResult.getHS23_11(), FucaiResult.getHS23_12(), FucaiResult.getHS23_13(), FucaiResult.getHS23_14(),
                    FucaiResult.getHWS23_0(), FucaiResult.getHWS23_1(), FucaiResult.getHWS23_2(), FucaiResult.getHWS23_3(),
                    FucaiResult.getHWS23_4(), FucaiResult.getHWS23_5(), FucaiResult.getHWS23_6(), FucaiResult.getHWS23_7(),
                    FucaiResult.getHWS23_8(), FucaiResult.getHWS23_9()
            };
        }
        return resultString;
    }
    public static String[] _33D_sum3Peilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getHS_6(), FucaiResult.getHS_7(), FucaiResult.getHS_8(), FucaiResult.getHS_9(), FucaiResult.getHS_10(),
                FucaiResult.getHS_11(), FucaiResult.getHS_12(), FucaiResult.getHS_13(), FucaiResult.getHS_14(), FucaiResult.getHS_15(),
                FucaiResult.getHS_16(), FucaiResult.getHS_17(), FucaiResult.getHS_18(), FucaiResult.getHS_19(), FucaiResult.getHS_20(),
                FucaiResult.getHS_21(), FucaiResult.getHWS123_0(), FucaiResult.getHWS123_1(), FucaiResult.getHWS123_2(), FucaiResult.getHWS123_3(),
                FucaiResult.getHWS123_4(), FucaiResult.getHWS123_5(), FucaiResult.getHWS123_6(), FucaiResult.getHWS123_7(),
                FucaiResult.getHWS123_8(), FucaiResult.getHWS123_9()
        };
        return resultString;
    }
    public static String[] _33D_spanPeilv(String resPeilv) {
        Gson gson=new Gson();
        F3D_1 Fucai = gson.fromJson(resPeilv, F3D_1.class);
        F3D_1.result FucaiResult = Fucai.getResult();
        String[] resultString = new String[]{
                FucaiResult.getKD_0(), FucaiResult.getKD_1(), FucaiResult.getKD_2(), FucaiResult.getKD_3(),
                FucaiResult.getKD_4(), FucaiResult.getKD_5(), FucaiResult.getKD_6(), FucaiResult.getKD_7(),
                FucaiResult.getKD_8(), FucaiResult.getKD_9()
        };
        return resultString;
    }
    public static String[] _33D_select3Peilv(String resPeilv) {
        String[] resultString=new String[]{"","","","","","","","","",""};
        return resultString;
    }
    public static String[] _33D_select6Peilv(String resPeilv) {
        String[] resultString=new String[]{"","","","","","","","","",""};
        return resultString;
    }

    /**
     * 香港六合彩
     * @param result
     * @return
     */
    public static String[] hk6Result(String result){
        String[] nums=new String[]{};
        return nums;
    }
    public static String[] _6hk6_zxbzPeilv(String resPeilv) {
        String[] resultString=new String[49];
        for (int i=0;i<49;i++){
            resultString[i]="";
        }
        return resultString;
    }
    public static String[] _6hk6_tmPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 Hongkong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResut = Hongkong.getResult();
        String[] resultStrings=new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_A")){
            resultStrings = new String[]{HongKongResut.getTMA_01(), HongKongResut.getTMA_02(), HongKongResut.getTMA_03(), HongKongResut.getTMA_04(), HongKongResut.getTMA_05(),
                    HongKongResut.getTMA_06(), HongKongResut.getTMA_07(), HongKongResut.getTMA_08(), HongKongResut.getTMA_09(), HongKongResut.getTMA_10(),
                    HongKongResut.getTMA_11(), HongKongResut.getTMA_12(), HongKongResut.getTMA_13(), HongKongResut.getTMA_14(), HongKongResut.getTMA_15(),
                    HongKongResut.getTMA_16(), HongKongResut.getTMA_17(), HongKongResut.getTMA_18(), HongKongResut.getTMA_19(), HongKongResut.getTMA_20(),
                    HongKongResut.getTMA_21(), HongKongResut.getTMA_22(), HongKongResut.getTMA_23(), HongKongResut.getTMA_24(), HongKongResut.getTMA_25(),
                    HongKongResut.getTMA_26(), HongKongResut.getTMA_27(), HongKongResut.getTMA_28(), HongKongResut.getTMA_29(), HongKongResut.getTMA_30(),
                    HongKongResut.getTMA_31(), HongKongResut.getTMA_32(), HongKongResut.getTMA_33(), HongKongResut.getTMA_34(), HongKongResut.getTMA_35(),
                    HongKongResut.getTMA_36(), HongKongResut.getTMA_37(), HongKongResut.getTMA_38(), HongKongResut.getTMA_39(), HongKongResut.getTMA_40(),
                    HongKongResut.getTMA_41(), HongKongResut.getTMA_42(), HongKongResut.getTMA_43(), HongKongResut.getTMA_44(), HongKongResut.getTMA_45(),
                    HongKongResut.getTMA_46(), HongKongResut.getTMA_47(), HongKongResut.getTMA_48(), HongKongResut.getTMA_49(),
                    HongKongResut.getDX_D(), HongKongResut.getDX_X(), HongKongResut.getWDX_D(), HongKongResut.getWDX_X(), HongKongResut.getDS_D(),
                    HongKongResut.getDS_S(), HongKongResut.getTDXDS_DD(), HongKongResut.getTDXDS_DS(), HongKongResut.getHDX_D(), HongKongResut.getHDX_X(),
                    HongKongResut.getTDXDS_XD(), HongKongResut.getTDXDS_XS(), HongKongResut.getHDS_D(), HongKongResut.getHDS_S()
            };
        }else {
            resultStrings = new String[]{HongKongResut.getTMB_01(), HongKongResut.getTMB_02(), HongKongResut.getTMB_03(), HongKongResut.getTMB_04(), HongKongResut.getTMB_05(),
                    HongKongResut.getTMB_06(), HongKongResut.getTMB_07(), HongKongResut.getTMB_08(), HongKongResut.getTMB_09(), HongKongResut.getTMB_10(),
                    HongKongResut.getTMB_11(), HongKongResut.getTMB_12(), HongKongResut.getTMB_13(), HongKongResut.getTMB_14(), HongKongResut.getTMB_15(),
                    HongKongResut.getTMB_16(), HongKongResut.getTMB_17(), HongKongResut.getTMB_18(), HongKongResut.getTMB_19(), HongKongResut.getTMB_20(),
                    HongKongResut.getTMB_21(), HongKongResut.getTMB_22(), HongKongResut.getTMB_23(), HongKongResut.getTMB_24(), HongKongResut.getTMB_25(),
                    HongKongResut.getTMB_26(), HongKongResut.getTMB_27(), HongKongResut.getTMB_28(), HongKongResut.getTMB_29(), HongKongResut.getTMB_30(),
                    HongKongResut.getTMB_31(), HongKongResut.getTMB_32(), HongKongResut.getTMB_33(), HongKongResut.getTMB_34(), HongKongResut.getTMB_35(),
                    HongKongResut.getTMB_36(), HongKongResut.getTMB_37(), HongKongResut.getTMB_38(), HongKongResut.getTMB_39(), HongKongResut.getTMB_40(),
                    HongKongResut.getTMB_41(), HongKongResut.getTMB_42(), HongKongResut.getTMB_43(), HongKongResut.getTMB_44(), HongKongResut.getTMB_45(),
                    HongKongResut.getTMB_46(), HongKongResut.getTMB_47(), HongKongResut.getTMB_48(), HongKongResut.getTMB_49(),
                    HongKongResut.getDX_D(), HongKongResut.getDX_X(), HongKongResut.getWDX_D(), HongKongResut.getWDX_X(), HongKongResut.getDS_D(),
                    HongKongResut.getDS_S(), HongKongResut.getTDXDS_DD(), HongKongResut.getTDXDS_DS(), HongKongResut.getHDX_D(), HongKongResut.getHDX_X(),
                    HongKongResut.getTDXDS_XD(), HongKongResut.getTDXDS_XS(), HongKongResut.getHDS_D(), HongKongResut.getHDS_S()
            };
        }
        return resultStrings;
    }
    public static String[] _6hk6_srsxPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 Hongkong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongkongResult = Hongkong.getResult();
        String[] resultString=new String[]{};
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
            resultString = new String[]{
                    HongkongResult.getSX_0(), HongkongResult.getSX_1(), HongkongResult.getSX_2(), HongkongResult.getSX_3(),
                    HongkongResult.getSX_4(), HongkongResult.getSX_5(), HongkongResult.getSX_6(), HongkongResult.getSX_7(),
                    HongkongResult.getSX_8(), HongkongResult.getSX_9(), HongkongResult.getSX_10(), HongkongResult.getSX_11()};
        }else {
            resultString = new String[]{
                    HongkongResult.getZX_0(), HongkongResult.getZX_1(), HongkongResult.getZX_2(), HongkongResult.getZX_3(),
                    HongkongResult.getZX_4(), HongkongResult.getZX_5(), HongkongResult.getZX_6(), HongkongResult.getZX_7(),
                    HongkongResult.getZX_8(), HongkongResult.getZX_9(), HongkongResult.getZX_10(), HongkongResult.getZX_11()
            };
        }
        return resultString;
    }
    public static String[] _6hk6_zhengxiaoPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 Hongkong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongkongResult = Hongkong.getResult();
        String[] resultString=new String[]{};
        if (MainGlobalData.LOTTERY_PAGE.equals("hk6_srsx")){
            resultString = new String[]{
                    HongkongResult.getSX_0(), HongkongResult.getSX_1(), HongkongResult.getSX_2(), HongkongResult.getSX_3(),
                    HongkongResult.getSX_4(), HongkongResult.getSX_5(), HongkongResult.getSX_6(), HongkongResult.getSX_7(),
                    HongkongResult.getSX_8(), HongkongResult.getSX_9(), HongkongResult.getSX_10(), HongkongResult.getSX_11()};
        }else {
            resultString = new String[]{
                    HongkongResult.getZX_0(), HongkongResult.getZX_1(), HongkongResult.getZX_2(), HongkongResult.getZX_3(),
                    HongkongResult.getZX_4(), HongkongResult.getZX_5(), HongkongResult.getZX_6(), HongkongResult.getZX_7(),
                    HongkongResult.getZX_8(), HongkongResult.getZX_9(), HongkongResult.getZX_10(), HongkongResult.getZX_11()
            };
        }
        return resultString;
    }
    public static String[] _6hk6_twsPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 Hongkong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = Hongkong.getResult();
        String[] resultString = new String[]{HongKongResult.getTMTS_0(), HongKongResult.getTMWS_1(), HongKongResult.getTMWS_6(),
                HongKongResult.getTMTS_1(), HongKongResult.getTMWS_2(), HongKongResult.getTMWS_7(),
                HongKongResult.getTMTS_2(), HongKongResult.getTMWS_3(), HongKongResult.getTMWS_8(),
                HongKongResult.getTMTS_3(), HongKongResult.getTMWS_4(), HongKongResult.getTMWS_9(),
                HongKongResult.getTMTS_4(), HongKongResult.getTMWS_5(), HongKongResult.getTMWS_0()};
        return resultString;
    }
    public static String[] _6hk6_zmtPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultStrings=new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z1t")){
            resultStrings = new String[]{HongKongResult.getZMT1_01(), HongKongResult.getZMT1_02(), HongKongResult.getZMT1_03(), HongKongResult.getZMT1_04(), HongKongResult.getZMT1_05(),
                    HongKongResult.getZMT1_06(), HongKongResult.getZMT1_07(), HongKongResult.getZMT1_08(), HongKongResult.getZMT1_09(), HongKongResult.getZMT1_10(),
                    HongKongResult.getZMT1_11(), HongKongResult.getZMT1_12(), HongKongResult.getZMT1_13(), HongKongResult.getZMT1_14(), HongKongResult.getZMT1_15(),
                    HongKongResult.getZMT1_16(), HongKongResult.getZMT1_17(), HongKongResult.getZMT1_18(), HongKongResult.getZMT1_19(), HongKongResult.getZMT1_20(),
                    HongKongResult.getZMT1_21(), HongKongResult.getZMT1_22(), HongKongResult.getZMT1_23(), HongKongResult.getZMT1_24(), HongKongResult.getZMT1_25(),
                    HongKongResult.getZMT1_26(), HongKongResult.getZMT1_27(), HongKongResult.getZMT1_28(), HongKongResult.getZMT1_29(), HongKongResult.getZMT1_30(),
                    HongKongResult.getZMT1_31(), HongKongResult.getZMT1_32(), HongKongResult.getZMT1_33(), HongKongResult.getZMT1_34(), HongKongResult.getZMT1_35(),
                    HongKongResult.getZMT1_36(), HongKongResult.getZMT1_37(), HongKongResult.getZMT1_38(), HongKongResult.getZMT1_39(), HongKongResult.getZMT1_40(),
                    HongKongResult.getZMT1_41(), HongKongResult.getZMT1_42(), HongKongResult.getZMT1_43(), HongKongResult.getZMT1_44(), HongKongResult.getZMT1_45(),
                    HongKongResult.getZMT1_46(), HongKongResult.getZMT1_47(), HongKongResult.getZMT1_48(), HongKongResult.getZMT1_49(),
                    HongKongResult.getZMDX1_D(), HongKongResult.getZMDS1_D(), HongKongResult.getZHDS1_D(),
                    HongKongResult.getZMDX1_X(), HongKongResult.getZMDS1_S(), HongKongResult.getZHDS1_S(),
                    HongKongResult.getZMSB1_R(), HongKongResult.getZMSB1_B(), HongKongResult.getZMSB1_G()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z2t")){
            resultStrings = new String[]{HongKongResult.getZMT2_01(), HongKongResult.getZMT2_02(), HongKongResult.getZMT2_03(), HongKongResult.getZMT2_04(), HongKongResult.getZMT2_05(),
                    HongKongResult.getZMT2_06(), HongKongResult.getZMT2_07(), HongKongResult.getZMT2_08(), HongKongResult.getZMT2_09(), HongKongResult.getZMT2_10(),
                    HongKongResult.getZMT2_11(), HongKongResult.getZMT2_12(), HongKongResult.getZMT2_13(), HongKongResult.getZMT2_14(), HongKongResult.getZMT2_15(),
                    HongKongResult.getZMT2_16(), HongKongResult.getZMT2_17(), HongKongResult.getZMT2_18(), HongKongResult.getZMT2_19(), HongKongResult.getZMT2_20(),
                    HongKongResult.getZMT2_21(), HongKongResult.getZMT2_22(), HongKongResult.getZMT2_23(), HongKongResult.getZMT2_24(), HongKongResult.getZMT2_25(),
                    HongKongResult.getZMT2_26(), HongKongResult.getZMT2_27(), HongKongResult.getZMT2_28(), HongKongResult.getZMT2_29(), HongKongResult.getZMT2_30(),
                    HongKongResult.getZMT2_31(), HongKongResult.getZMT2_32(), HongKongResult.getZMT2_33(), HongKongResult.getZMT2_34(), HongKongResult.getZMT2_35(),
                    HongKongResult.getZMT2_36(), HongKongResult.getZMT2_37(), HongKongResult.getZMT2_38(), HongKongResult.getZMT2_39(), HongKongResult.getZMT2_40(),
                    HongKongResult.getZMT2_41(), HongKongResult.getZMT2_42(), HongKongResult.getZMT2_43(), HongKongResult.getZMT2_44(), HongKongResult.getZMT2_45(),
                    HongKongResult.getZMT2_46(), HongKongResult.getZMT2_47(), HongKongResult.getZMT2_48(), HongKongResult.getZMT2_49(),
                    HongKongResult.getZMDX2_D(), HongKongResult.getZMDS2_D(), HongKongResult.getZHDS2_D(),
                    HongKongResult.getZMDX2_X(), HongKongResult.getZMDS2_S(), HongKongResult.getZHDS2_S(),
                    HongKongResult.getZMSB2_R(), HongKongResult.getZMSB2_B(), HongKongResult.getZMSB2_G()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z3t")){
            resultStrings = new String[]{HongKongResult.getZMT3_01(), HongKongResult.getZMT3_02(), HongKongResult.getZMT3_03(), HongKongResult.getZMT3_04(), HongKongResult.getZMT3_05(),
                    HongKongResult.getZMT3_06(), HongKongResult.getZMT3_07(), HongKongResult.getZMT3_08(), HongKongResult.getZMT3_09(), HongKongResult.getZMT3_10(),
                    HongKongResult.getZMT3_11(), HongKongResult.getZMT3_12(), HongKongResult.getZMT3_13(), HongKongResult.getZMT3_14(), HongKongResult.getZMT3_15(),
                    HongKongResult.getZMT3_16(), HongKongResult.getZMT3_17(), HongKongResult.getZMT3_18(), HongKongResult.getZMT3_19(), HongKongResult.getZMT3_20(),
                    HongKongResult.getZMT3_21(), HongKongResult.getZMT3_22(), HongKongResult.getZMT3_23(), HongKongResult.getZMT3_24(), HongKongResult.getZMT3_25(),
                    HongKongResult.getZMT3_26(), HongKongResult.getZMT3_27(), HongKongResult.getZMT3_28(), HongKongResult.getZMT3_29(), HongKongResult.getZMT3_30(),
                    HongKongResult.getZMT3_31(), HongKongResult.getZMT3_32(), HongKongResult.getZMT3_33(), HongKongResult.getZMT3_34(), HongKongResult.getZMT3_35(),
                    HongKongResult.getZMT3_36(), HongKongResult.getZMT3_37(), HongKongResult.getZMT3_38(), HongKongResult.getZMT3_39(), HongKongResult.getZMT3_40(),
                    HongKongResult.getZMT3_41(), HongKongResult.getZMT3_42(), HongKongResult.getZMT3_43(), HongKongResult.getZMT3_44(), HongKongResult.getZMT3_45(),
                    HongKongResult.getZMT3_46(), HongKongResult.getZMT3_47(), HongKongResult.getZMT3_48(), HongKongResult.getZMT3_49(),
                    HongKongResult.getZMDX3_D(), HongKongResult.getZMDS3_D(), HongKongResult.getZHDS3_D(),
                    HongKongResult.getZMDX3_X(), HongKongResult.getZMDS3_S(), HongKongResult.getZHDS3_S(),
                    HongKongResult.getZMSB3_R(), HongKongResult.getZMSB3_B(), HongKongResult.getZMSB3_G()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z4t")){
            resultStrings = new String[]{HongKongResult.getZMT4_01(), HongKongResult.getZMT4_02(), HongKongResult.getZMT4_03(), HongKongResult.getZMT4_04(), HongKongResult.getZMT4_05(),
                    HongKongResult.getZMT4_06(), HongKongResult.getZMT4_07(), HongKongResult.getZMT4_08(), HongKongResult.getZMT4_09(), HongKongResult.getZMT4_10(),
                    HongKongResult.getZMT4_11(), HongKongResult.getZMT4_12(), HongKongResult.getZMT4_13(), HongKongResult.getZMT4_14(), HongKongResult.getZMT4_15(),
                    HongKongResult.getZMT4_16(), HongKongResult.getZMT4_17(), HongKongResult.getZMT4_18(), HongKongResult.getZMT4_19(), HongKongResult.getZMT4_20(),
                    HongKongResult.getZMT4_21(), HongKongResult.getZMT4_22(), HongKongResult.getZMT4_23(), HongKongResult.getZMT4_24(), HongKongResult.getZMT4_25(),
                    HongKongResult.getZMT4_26(), HongKongResult.getZMT4_27(), HongKongResult.getZMT4_28(), HongKongResult.getZMT4_29(), HongKongResult.getZMT4_30(),
                    HongKongResult.getZMT4_31(), HongKongResult.getZMT4_32(), HongKongResult.getZMT4_33(), HongKongResult.getZMT4_34(), HongKongResult.getZMT4_35(),
                    HongKongResult.getZMT4_36(), HongKongResult.getZMT4_37(), HongKongResult.getZMT4_38(), HongKongResult.getZMT4_39(), HongKongResult.getZMT4_40(),
                    HongKongResult.getZMT4_41(), HongKongResult.getZMT4_42(), HongKongResult.getZMT4_43(), HongKongResult.getZMT4_44(), HongKongResult.getZMT4_45(),
                    HongKongResult.getZMT4_46(), HongKongResult.getZMT4_47(), HongKongResult.getZMT4_48(), HongKongResult.getZMT4_49(),
                    HongKongResult.getZMDX4_D(), HongKongResult.getZMDS4_D(), HongKongResult.getZHDS4_D(),
                    HongKongResult.getZMDX4_X(), HongKongResult.getZMDS4_S(), HongKongResult.getZHDS4_S(),
                    HongKongResult.getZMSB4_R(), HongKongResult.getZMSB4_B(), HongKongResult.getZMSB4_G()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z5t")){
            resultStrings = new String[]{HongKongResult.getZMT5_01(), HongKongResult.getZMT5_02(), HongKongResult.getZMT5_03(), HongKongResult.getZMT5_04(), HongKongResult.getZMT5_05(),
                    HongKongResult.getZMT5_06(), HongKongResult.getZMT5_07(), HongKongResult.getZMT5_08(), HongKongResult.getZMT5_09(), HongKongResult.getZMT5_10(),
                    HongKongResult.getZMT5_11(), HongKongResult.getZMT5_12(), HongKongResult.getZMT5_13(), HongKongResult.getZMT5_14(), HongKongResult.getZMT5_15(),
                    HongKongResult.getZMT5_16(), HongKongResult.getZMT5_17(), HongKongResult.getZMT5_18(), HongKongResult.getZMT5_19(), HongKongResult.getZMT5_20(),
                    HongKongResult.getZMT5_21(), HongKongResult.getZMT5_22(), HongKongResult.getZMT5_23(), HongKongResult.getZMT5_24(), HongKongResult.getZMT5_25(),
                    HongKongResult.getZMT5_26(), HongKongResult.getZMT5_27(), HongKongResult.getZMT5_28(), HongKongResult.getZMT5_29(), HongKongResult.getZMT5_30(),
                    HongKongResult.getZMT5_31(), HongKongResult.getZMT5_32(), HongKongResult.getZMT5_33(), HongKongResult.getZMT5_34(), HongKongResult.getZMT5_35(),
                    HongKongResult.getZMT5_36(), HongKongResult.getZMT5_37(), HongKongResult.getZMT5_38(), HongKongResult.getZMT5_39(), HongKongResult.getZMT5_40(),
                    HongKongResult.getZMT5_41(), HongKongResult.getZMT5_42(), HongKongResult.getZMT5_43(), HongKongResult.getZMT5_44(), HongKongResult.getZMT5_45(),
                    HongKongResult.getZMT5_46(), HongKongResult.getZMT5_47(), HongKongResult.getZMT5_48(), HongKongResult.getZMT5_49(),
                    HongKongResult.getZMDX5_D(), HongKongResult.getZMDS5_D(), HongKongResult.getZHDS5_D(),
                    HongKongResult.getZMDX5_X(), HongKongResult.getZMDS5_S(), HongKongResult.getZHDS5_S(),
                    HongKongResult.getZMSB5_R(), HongKongResult.getZMSB5_B(), HongKongResult.getZMSB5_G()};
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_z6t")){
            resultStrings = new String[]{HongKongResult.getZMT6_01(), HongKongResult.getZMT6_02(), HongKongResult.getZMT6_03(), HongKongResult.getZMT6_04(), HongKongResult.getZMT6_05(),
                    HongKongResult.getZMT6_06(), HongKongResult.getZMT6_07(), HongKongResult.getZMT6_08(), HongKongResult.getZMT6_09(), HongKongResult.getZMT6_10(),
                    HongKongResult.getZMT6_11(), HongKongResult.getZMT6_12(), HongKongResult.getZMT6_13(), HongKongResult.getZMT6_14(), HongKongResult.getZMT6_15(),
                    HongKongResult.getZMT6_16(), HongKongResult.getZMT6_17(), HongKongResult.getZMT6_18(), HongKongResult.getZMT6_19(), HongKongResult.getZMT6_20(),
                    HongKongResult.getZMT6_21(), HongKongResult.getZMT6_22(), HongKongResult.getZMT6_23(), HongKongResult.getZMT6_24(), HongKongResult.getZMT6_25(),
                    HongKongResult.getZMT6_26(), HongKongResult.getZMT6_27(), HongKongResult.getZMT6_28(), HongKongResult.getZMT6_29(), HongKongResult.getZMT6_30(),
                    HongKongResult.getZMT6_31(), HongKongResult.getZMT6_32(), HongKongResult.getZMT6_33(), HongKongResult.getZMT6_34(), HongKongResult.getZMT6_35(),
                    HongKongResult.getZMT6_36(), HongKongResult.getZMT6_37(), HongKongResult.getZMT6_38(), HongKongResult.getZMT6_39(), HongKongResult.getZMT6_40(),
                    HongKongResult.getZMT6_41(), HongKongResult.getZMT6_42(), HongKongResult.getZMT6_43(), HongKongResult.getZMT6_44(), HongKongResult.getZMT6_45(),
                    HongKongResult.getZMT6_46(), HongKongResult.getZMT6_47(), HongKongResult.getZMT6_48(), HongKongResult.getZMT6_49(),
                    HongKongResult.getZMDX6_D(), HongKongResult.getZMDS6_D(), HongKongResult.getZHDS6_D(),
                    HongKongResult.getZMDX6_X(), HongKongResult.getZMDS6_S(), HongKongResult.getZHDS6_S(),
                    HongKongResult.getZMSB6_R(), HongKongResult.getZMSB6_B(), HongKongResult.getZMSB6_G()};
        }
        return resultStrings;
    }
    public static String[] _6hk6_zm16Peilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultString = new String[]{
                HongKongResult.getZMDS1_D(), HongKongResult.getZMDS1_S(), HongKongResult.getZMDX1_D(), HongKongResult.getZMDX1_X(),
                HongKongResult.getZHDS1_D(), HongKongResult.getZHDS1_S(), HongKongResult.getZHDX1_D(), HongKongResult.getZHDX1_X(),
                HongKongResult.getZMSB1_R(), HongKongResult.getZMSB1_B(), HongKongResult.getZMSB1_G(),
                HongKongResult.getZMWDX1_D(), HongKongResult.getZMWDX1_X(),

                HongKongResult.getZMDS2_D(), HongKongResult.getZMDS2_S(), HongKongResult.getZMDX2_D(), HongKongResult.getZMDX2_X(),
                HongKongResult.getZHDS2_D(), HongKongResult.getZHDS2_S(), HongKongResult.getZHDX2_D(), HongKongResult.getZHDX2_X(),
                HongKongResult.getZMSB2_R(), HongKongResult.getZMSB2_B(), HongKongResult.getZMSB2_G(),
                HongKongResult.getZMWDX2_D(), HongKongResult.getZMWDX2_X(),

                HongKongResult.getZMDS3_D(), HongKongResult.getZMDS3_S(), HongKongResult.getZMDX3_D(), HongKongResult.getZMDX3_X(),
                HongKongResult.getZHDS3_D(), HongKongResult.getZHDS3_S(), HongKongResult.getZHDX3_D(), HongKongResult.getZHDX3_X(),
                HongKongResult.getZMSB3_R(), HongKongResult.getZMSB3_B(), HongKongResult.getZMSB3_G(),
                HongKongResult.getZMWDX3_D(), HongKongResult.getZMWDX3_X(),

                HongKongResult.getZMDS4_D(), HongKongResult.getZMDS4_S(), HongKongResult.getZMDX4_D(), HongKongResult.getZMDX4_X(),
                HongKongResult.getZHDS4_D(), HongKongResult.getZHDS4_S(), HongKongResult.getZHDX4_D(), HongKongResult.getZHDX4_X(),
                HongKongResult.getZMSB4_R(), HongKongResult.getZMSB4_B(), HongKongResult.getZMSB4_G(),
                HongKongResult.getZMWDX4_D(), HongKongResult.getZMWDX4_X(),

                HongKongResult.getZMDS5_D(), HongKongResult.getZMDS5_S(), HongKongResult.getZMDX5_D(), HongKongResult.getZMDX5_X(),
                HongKongResult.getZHDS5_D(), HongKongResult.getZHDS5_S(), HongKongResult.getZHDX5_D(), HongKongResult.getZHDX5_X(),
                HongKongResult.getZMSB5_R(), HongKongResult.getZMSB5_B(), HongKongResult.getZMSB5_G(),
                HongKongResult.getZMWDX5_D(), HongKongResult.getZMWDX5_X(),

                HongKongResult.getZMDS6_D(), HongKongResult.getZMDS6_S(), HongKongResult.getZMDX6_D(), HongKongResult.getZMDX6_X(),
                HongKongResult.getZHDS6_D(), HongKongResult.getZHDS6_S(), HongKongResult.getZHDX6_D(), HongKongResult.getZHDX6_X(),
                HongKongResult.getZMSB6_R(), HongKongResult.getZMSB6_B(), HongKongResult.getZMSB6_G(),
                HongKongResult.getZMWDX6_D(), HongKongResult.getZMWDX6_X(),
        };
        return resultString;
    }
    public static String[] _6hk6_wxPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultString = new String[]{HongKongResult.getWX_0(), HongKongResult.getWX_1(),
                HongKongResult.getWX_2(), HongKongResult.getWX_3(), HongKongResult.getWX_4()};
        return resultString;
    }
    public static String[] _6hk6_yxwsPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultString = new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_yx")){
            resultString = new String[]{HongKongResult.getYX_0(), HongKongResult.getYX_6(), HongKongResult.getYX_1(),
                    HongKongResult.getYX_7(), HongKongResult.getYX_2(), HongKongResult.getYX_8(), HongKongResult.getYX_3(),
                    HongKongResult.getYX_9(), HongKongResult.getYX_4(), HongKongResult.getYX_10(), HongKongResult.getYX_5(),
                    HongKongResult.getYX_11()};
        }else {
            resultString = new String[]{HongKongResult.getWS_0(), HongKongResult.getWS_5(),
                    HongKongResult.getWS_1(), HongKongResult.getWS_6(), HongKongResult.getWS_2(), HongKongResult.getWS_7(),
                    HongKongResult.getWS_3(), HongKongResult.getWS_8(), HongKongResult.getWS_4(), HongKongResult.getWS_9()};
        }
        return resultString;
    }
    public static String[] _6hk6_7sbPeilv(String resPeilv) {
        String[] resultString = new String[]{};
        try {
            JSONTokener jsonTokener = new JSONTokener(resPeilv);
            JSONObject fcTc = (JSONObject) jsonTokener.nextValue();
            JSONObject fctcRes = fcTc.getJSONObject("result");
             resultString = new String[]{
                    fctcRes.getString("7SB_R"), fctcRes.getString("7SB_B"), fctcRes.getString("7SB_G"),
                    fctcRes.getString("7SB_TIE")
            };
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resultString;
    }
    public static String[] _6hk6_zongxiaoPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultString = new String[]{HongKongResult.getZSX_2(), HongKongResult.getZSX_3(), HongKongResult.getZSX_4(),
                HongKongResult.getZSX_5(), HongKongResult.getZSX_6(), HongKongResult.getZSX_7(),
                HongKongResult.getZSXDS_D(), HongKongResult.getZSXDS_S()};
        return resultString;
    }
    public static String[] _6hk6_dpPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultString = new String[]{};
        if (MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx2")){
            resultString = new String[]{
                    HongKongResult.getLX2_0(), HongKongResult.getLX2_6(), HongKongResult.getLX2_1(), HongKongResult.getLX2_7(),
                    HongKongResult.getLX2_2(), HongKongResult.getLX2_8(), HongKongResult.getLX2_3(), HongKongResult.getLX2_9(),
                    HongKongResult.getLX2_4(), HongKongResult.getLX2_10(), HongKongResult.getLX2_5(), HongKongResult.getLX2_11()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx3")){
            resultString = new String[]{
                    HongKongResult.getLX3_0(), HongKongResult.getLX3_6(), HongKongResult.getLX3_1(), HongKongResult.getLX3_7(),
                    HongKongResult.getLX3_2(), HongKongResult.getLX3_8(), HongKongResult.getLX3_3(), HongKongResult.getLX3_9(),
                    HongKongResult.getLX3_4(), HongKongResult.getLX3_10(), HongKongResult.getLX3_5(), HongKongResult.getLX3_11()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx4")){
            resultString = new String[]{
                    HongKongResult.getLX4_0(), HongKongResult.getLX4_6(), HongKongResult.getLX4_1(), HongKongResult.getLX4_7(),
                    HongKongResult.getLX4_2(), HongKongResult.getLX4_8(), HongKongResult.getLX4_3(), HongKongResult.getLX4_9(),
                    HongKongResult.getLX4_4(), HongKongResult.getLX4_10(), HongKongResult.getLX4_5(), HongKongResult.getLX4_11()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lx5")){
            resultString = new String[]{
                    HongKongResult.getLX5_0(), HongKongResult.getLX5_6(), HongKongResult.getLX5_1(), HongKongResult.getLX5_7(),
                    HongKongResult.getLX5_2(), HongKongResult.getLX5_8(), HongKongResult.getLX5_3(), HongKongResult.getLX5_9(),
                    HongKongResult.getLX5_4(), HongKongResult.getLX5_10(), HongKongResult.getLX5_5(), HongKongResult.getLX5_11()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw2")){
            resultString = new String[]{
                    HongKongResult.getLW2_0(), HongKongResult.getLW2_5(), HongKongResult.getLW2_1(), HongKongResult.getLW2_6(),
                    HongKongResult.getLW2_2(), HongKongResult.getLW2_7(), HongKongResult.getLW2_3(), HongKongResult.getLW2_8(),
                    HongKongResult.getLW2_4(), HongKongResult.getLW2_9()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw3")){
            resultString = new String[]{
                    HongKongResult.getLW3_0(), HongKongResult.getLW3_5(), HongKongResult.getLW3_1(), HongKongResult.getLW3_6(),
                    HongKongResult.getLW3_2(), HongKongResult.getLW3_7(), HongKongResult.getLW3_3(), HongKongResult.getLW3_8(),
                    HongKongResult.getLW3_4(), HongKongResult.getLW3_9()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw4")){
            resultString = new String[]{
                    HongKongResult.getLW4_0(), HongKongResult.getLW4_5(), HongKongResult.getLW4_1(), HongKongResult.getLW4_6(),
                    HongKongResult.getLW4_2(), HongKongResult.getLW4_7(), HongKongResult.getLW4_3(), HongKongResult.getLW4_8(),
                    HongKongResult.getLW4_4(), HongKongResult.getLW4_9()
            };
        }else if(MainGlobalData.LOTTERY_SUBTITLE.equals("hk6_lw5")){
            resultString = new String[]{
                    HongKongResult.getLW5_0(), HongKongResult.getLW5_5(), HongKongResult.getLW5_1(), HongKongResult.getLW5_6(),
                    HongKongResult.getLW5_2(), HongKongResult.getLW5_7(), HongKongResult.getLW5_3(), HongKongResult.getLW5_8(),
                    HongKongResult.getLW5_4(), HongKongResult.getLW5_9()
            };
        }
        return resultString;
    }
    public static String[] _6hk6_lmPeilv(String resPeilv) {
        Gson gson=new Gson();
        HK6_1 HongKong = gson.fromJson(resPeilv, HK6_1.class);
        HK6_1.result HongKongResult = HongKong.getResult();
        String[] resultStrings = new String[]{HongKongResult.getLM3Z2_0(),HongKongResult.getLM3Z2_0_1(),
                HongKongResult.getLM2ZT_0(), HongKongResult.getLM2ZT_0_1(), HongKongResult.getLM3QZ(),
                HongKongResult.getLM2QZ(),HongKongResult.getLMTC(),HongKongResult.getLM4QZ(),
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",
                "","","","","","","","","","",""
        };
        return resultStrings;
    }
}
