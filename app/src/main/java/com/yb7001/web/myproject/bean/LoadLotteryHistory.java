package com.yb7001.web.myproject.bean;


import java.util.List;

public class LoadLotteryHistory {
    private String status;
    private String tip;
    private result result;

    public LoadLotteryHistory.result getResult() {
        return result;
    }

    public void setResult(LoadLotteryHistory.result result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public class result{
        private List<Rows> rows;
        private int total;

        public List<Rows> getRows() {
            return rows;
        }

        public void setRows(List<Rows> rows) {
            this.rows = rows;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }
    }

    public class Rows{
        private String openExpectNumber;
        private String openTime;
        private String openNo1;
        private String openNo2;
        private String openNo3;
        private String openNo4;
        private String openNo5;
        private String openNo6;
        private String openNo7;
        private String openNo8;
        private String openNo9;
        private String openNo10;
        private String openNo11;
        private String openNo12;
        private String openNo13;
        private String openNo14;
        private String openNo15;
        private String openNo16;
        private String openNo17;
        private String openNo18;
        private String openNo19;
        private String openNo20;
        private String openNoName1;
        private String openNoName2;
        private String openNoName3;
        private String openNoName4;
        private String openNoName5;
        private String openNoName6;
        private String openNoName7;
        private String openTotal;
        private String openTotalDanShuang;
        private String openTotalDaXiao;
        private String openTotalWeiDaXiao;
        private String open1DanShuang;
        private String open1DaXiao;
        private String open1ZhiHe;
        private String open1WeiDaXiao;
        private String open1WeiDanShuang;
        private String open1Other;
        private String open2DanShuang;
        private String open2DaXiao;
        private String open2ZhiHe;
        private String open2WeiDaXiao;
        private String open2WeiDanShuang;
        private String open2Other;
        private String open3DanShuang;
        private String open3DaXiao;
        private String open3ZhiHe;
        private String open3WeiDaXiao;
        private String open3WeiDanShuang;
        private String open3Other;
        private String open4DanShuang;
        private String open4DaXiao;
        private String open4WeiDaXiao;
        private String open4WeiDanShuang;
        private String open4Other;
        private String open5DanShuang;
        private String open5DaXiao;
        private String open5WeiDaXiao;
        private String open5WeiDanShuang;
        private String open5Other;
        private String open6DanShuang;
        private String open6DaXiao;
        private String open6WeiDaXiao;
        private String open6WeiDanShuang;
        private String open6Other;
        private String open7DanShuang;
        private String open7DaXiao;
        private String open7HeDaXiao;
        private String open7HeDanShuang;
        private String open7WeiDaXiao;
        private String open7WeiDanShuang;
        private String open7Other;
        private String open1_2Total;
        private String open1_2DanShuang;
        private String open1_2DaXiao;
        private String open1_3Total;
        private String open1_3DanShuang;
        private String open1_3DaXiao;
        private String longhu1;
        private String longhu2;
        private String longhu3;
        private String longhu4;
        private String longhu5;
        private String qiansan;
        private String zhongsan;
        private String housan;
        private String sebo;
        private String qsebo;
        private String wuxing;
        private String shengXiao;
        private String lhcTmDaXiao;
        private String lhcTmDanShuang;
        private String lhcTmHeDanShuang;
        private String lhcTmHeDaXiao;
        private String lhcTmWeiDaXiao;
        private String other;
        private String qianhouhe;
        private String danshuanghe;

        public String getDanshuanghe() {
            return danshuanghe;
        }

        public void setDanshuanghe(String danshuanghe) {
            this.danshuanghe = danshuanghe;
        }

        public String getHousan() {
            return housan;
        }

        public void setHousan(String housan) {
            this.housan = housan;
        }

        public String getLhcTmDanShuang() {
            return lhcTmDanShuang;
        }

        public void setLhcTmDanShuang(String lhcTmDanShuang) {
            this.lhcTmDanShuang = lhcTmDanShuang;
        }

        public String getLhcTmDaXiao() {
            return lhcTmDaXiao;
        }

        public void setLhcTmDaXiao(String lhcTmDaXiao) {
            this.lhcTmDaXiao = lhcTmDaXiao;
        }

        public String getLhcTmHeDanShuang() {
            return lhcTmHeDanShuang;
        }

        public void setLhcTmHeDanShuang(String lhcTmHeDanShuang) {
            this.lhcTmHeDanShuang = lhcTmHeDanShuang;
        }

        public String getLhcTmHeDaXiao() {
            return lhcTmHeDaXiao;
        }

        public void setLhcTmHeDaXiao(String lhcTmHeDaXiao) {
            this.lhcTmHeDaXiao = lhcTmHeDaXiao;
        }

        public String getLhcTmWeiDaXiao() {
            return lhcTmWeiDaXiao;
        }

        public void setLhcTmWeiDaXiao(String lhcTmWeiDaXiao) {
            this.lhcTmWeiDaXiao = lhcTmWeiDaXiao;
        }

        public String getLonghu1() {
            return longhu1;
        }

        public void setLonghu1(String longhu1) {
            this.longhu1 = longhu1;
        }

        public String getLonghu2() {
            return longhu2;
        }

        public void setLonghu2(String longhu2) {
            this.longhu2 = longhu2;
        }

        public String getLonghu3() {
            return longhu3;
        }

        public void setLonghu3(String longhu3) {
            this.longhu3 = longhu3;
        }

        public String getLonghu4() {
            return longhu4;
        }

        public void setLonghu4(String longhu4) {
            this.longhu4 = longhu4;
        }

        public String getLonghu5() {
            return longhu5;
        }

        public void setLonghu5(String longhu5) {
            this.longhu5 = longhu5;
        }

        public String getOpen1_2DanShuang() {
            return open1_2DanShuang;
        }

        public void setOpen1_2DanShuang(String open1_2DanShuang) {
            this.open1_2DanShuang = open1_2DanShuang;
        }

        public String getOpen1_2DaXiao() {
            return open1_2DaXiao;
        }

        public void setOpen1_2DaXiao(String open1_2DaXiao) {
            this.open1_2DaXiao = open1_2DaXiao;
        }

        public String getOpen1_2Total() {
            return open1_2Total;
        }

        public void setOpen1_2Total(String open1_2Total) {
            this.open1_2Total = open1_2Total;
        }

        public String getOpen1_3DanShuang() {
            return open1_3DanShuang;
        }

        public void setOpen1_3DanShuang(String open1_3DanShuang) {
            this.open1_3DanShuang = open1_3DanShuang;
        }

        public String getOpen1_3DaXiao() {
            return open1_3DaXiao;
        }

        public void setOpen1_3DaXiao(String open1_3DaXiao) {
            this.open1_3DaXiao = open1_3DaXiao;
        }

        public String getOpen1_3Total() {
            return open1_3Total;
        }

        public void setOpen1_3Total(String open1_3Total) {
            this.open1_3Total = open1_3Total;
        }

        public String getOpen1DanShuang() {
            return open1DanShuang;
        }

        public void setOpen1DanShuang(String open1DanShuang) {
            this.open1DanShuang = open1DanShuang;
        }

        public String getOpen1DaXiao() {
            return open1DaXiao;
        }

        public void setOpen1DaXiao(String open1DaXiao) {
            this.open1DaXiao = open1DaXiao;
        }

        public String getOpen1Other() {
            return open1Other;
        }

        public void setOpen1Other(String open1Other) {
            this.open1Other = open1Other;
        }

        public String getOpen1WeiDanShuang() {
            return open1WeiDanShuang;
        }

        public void setOpen1WeiDanShuang(String open1WeiDanShuang) {
            this.open1WeiDanShuang = open1WeiDanShuang;
        }

        public String getOpen1WeiDaXiao() {
            return open1WeiDaXiao;
        }

        public void setOpen1WeiDaXiao(String open1WeiDaXiao) {
            this.open1WeiDaXiao = open1WeiDaXiao;
        }

        public String getOpen1ZhiHe() {
            return open1ZhiHe;
        }

        public void setOpen1ZhiHe(String open1ZhiHe) {
            this.open1ZhiHe = open1ZhiHe;
        }

        public String getOpen2DanShuang() {
            return open2DanShuang;
        }

        public void setOpen2DanShuang(String open2DanShuang) {
            this.open2DanShuang = open2DanShuang;
        }

        public String getOpen2DaXiao() {
            return open2DaXiao;
        }

        public void setOpen2DaXiao(String open2DaXiao) {
            this.open2DaXiao = open2DaXiao;
        }

        public String getOpen2Other() {
            return open2Other;
        }

        public void setOpen2Other(String open2Other) {
            this.open2Other = open2Other;
        }

        public String getOpen2WeiDanShuang() {
            return open2WeiDanShuang;
        }

        public void setOpen2WeiDanShuang(String open2WeiDanShuang) {
            this.open2WeiDanShuang = open2WeiDanShuang;
        }

        public String getOpen2WeiDaXiao() {
            return open2WeiDaXiao;
        }

        public void setOpen2WeiDaXiao(String open2WeiDaXiao) {
            this.open2WeiDaXiao = open2WeiDaXiao;
        }

        public String getOpen2ZhiHe() {
            return open2ZhiHe;
        }

        public void setOpen2ZhiHe(String open2ZhiHe) {
            this.open2ZhiHe = open2ZhiHe;
        }

        public String getOpen3DanShuang() {
            return open3DanShuang;
        }

        public void setOpen3DanShuang(String open3DanShuang) {
            this.open3DanShuang = open3DanShuang;
        }

        public String getOpen3DaXiao() {
            return open3DaXiao;
        }

        public void setOpen3DaXiao(String open3DaXiao) {
            this.open3DaXiao = open3DaXiao;
        }

        public String getOpen3Other() {
            return open3Other;
        }

        public void setOpen3Other(String open3Other) {
            this.open3Other = open3Other;
        }

        public String getOpen3WeiDanShuang() {
            return open3WeiDanShuang;
        }

        public void setOpen3WeiDanShuang(String open3WeiDanShuang) {
            this.open3WeiDanShuang = open3WeiDanShuang;
        }

        public String getOpen3WeiDaXiao() {
            return open3WeiDaXiao;
        }

        public void setOpen3WeiDaXiao(String open3WeiDaXiao) {
            this.open3WeiDaXiao = open3WeiDaXiao;
        }

        public String getOpen3ZhiHe() {
            return open3ZhiHe;
        }

        public void setOpen3ZhiHe(String open3ZhiHe) {
            this.open3ZhiHe = open3ZhiHe;
        }

        public String getOpen4DanShuang() {
            return open4DanShuang;
        }

        public void setOpen4DanShuang(String open4DanShuang) {
            this.open4DanShuang = open4DanShuang;
        }

        public String getOpen4DaXiao() {
            return open4DaXiao;
        }

        public void setOpen4DaXiao(String open4DaXiao) {
            this.open4DaXiao = open4DaXiao;
        }

        public String getOpen4Other() {
            return open4Other;
        }

        public void setOpen4Other(String open4Other) {
            this.open4Other = open4Other;
        }

        public String getOpen4WeiDanShuang() {
            return open4WeiDanShuang;
        }

        public void setOpen4WeiDanShuang(String open4WeiDanShuang) {
            this.open4WeiDanShuang = open4WeiDanShuang;
        }

        public String getOpen4WeiDaXiao() {
            return open4WeiDaXiao;
        }

        public void setOpen4WeiDaXiao(String open4WeiDaXiao) {
            this.open4WeiDaXiao = open4WeiDaXiao;
        }

        public String getOpen5DanShuang() {
            return open5DanShuang;
        }

        public void setOpen5DanShuang(String open5DanShuang) {
            this.open5DanShuang = open5DanShuang;
        }

        public String getOpen5DaXiao() {
            return open5DaXiao;
        }

        public void setOpen5DaXiao(String open5DaXiao) {
            this.open5DaXiao = open5DaXiao;
        }

        public String getOpen5Other() {
            return open5Other;
        }

        public void setOpen5Other(String open5Other) {
            this.open5Other = open5Other;
        }

        public String getOpen5WeiDanShuang() {
            return open5WeiDanShuang;
        }

        public void setOpen5WeiDanShuang(String open5WeiDanShuang) {
            this.open5WeiDanShuang = open5WeiDanShuang;
        }

        public String getOpen5WeiDaXiao() {
            return open5WeiDaXiao;
        }

        public void setOpen5WeiDaXiao(String open5WeiDaXiao) {
            this.open5WeiDaXiao = open5WeiDaXiao;
        }

        public String getOpen6DanShuang() {
            return open6DanShuang;
        }

        public void setOpen6DanShuang(String open6DanShuang) {
            this.open6DanShuang = open6DanShuang;
        }

        public String getOpen6DaXiao() {
            return open6DaXiao;
        }

        public void setOpen6DaXiao(String open6DaXiao) {
            this.open6DaXiao = open6DaXiao;
        }

        public String getOpen6Other() {
            return open6Other;
        }

        public void setOpen6Other(String open6Other) {
            this.open6Other = open6Other;
        }

        public String getOpen6WeiDanShuang() {
            return open6WeiDanShuang;
        }

        public void setOpen6WeiDanShuang(String open6WeiDanShuang) {
            this.open6WeiDanShuang = open6WeiDanShuang;
        }

        public String getOpen6WeiDaXiao() {
            return open6WeiDaXiao;
        }

        public void setOpen6WeiDaXiao(String open6WeiDaXiao) {
            this.open6WeiDaXiao = open6WeiDaXiao;
        }

        public String getOpen7DanShuang() {
            return open7DanShuang;
        }

        public void setOpen7DanShuang(String open7DanShuang) {
            this.open7DanShuang = open7DanShuang;
        }

        public String getOpen7DaXiao() {
            return open7DaXiao;
        }

        public void setOpen7DaXiao(String open7DaXiao) {
            this.open7DaXiao = open7DaXiao;
        }

        public String getOpen7HeDanShuang() {
            return open7HeDanShuang;
        }

        public void setOpen7HeDanShuang(String open7HeDanShuang) {
            this.open7HeDanShuang = open7HeDanShuang;
        }

        public String getOpen7HeDaXiao() {
            return open7HeDaXiao;
        }

        public void setOpen7HeDaXiao(String open7HeDaXiao) {
            this.open7HeDaXiao = open7HeDaXiao;
        }

        public String getOpen7Other() {
            return open7Other;
        }

        public void setOpen7Other(String open7Other) {
            this.open7Other = open7Other;
        }

        public String getOpen7WeiDanShuang() {
            return open7WeiDanShuang;
        }

        public void setOpen7WeiDanShuang(String open7WeiDanShuang) {
            this.open7WeiDanShuang = open7WeiDanShuang;
        }

        public String getOpen7WeiDaXiao() {
            return open7WeiDaXiao;
        }

        public void setOpen7WeiDaXiao(String open7WeiDaXiao) {
            this.open7WeiDaXiao = open7WeiDaXiao;
        }

        public String getOpenExpectNumber() {
            return openExpectNumber;
        }

        public void setOpenExpectNumber(String openExpectNumber) {
            this.openExpectNumber = openExpectNumber;
        }

        public String getOpenNo10() {
            return openNo10;
        }

        public void setOpenNo10(String openNo10) {
            this.openNo10 = openNo10;
        }

        public String getOpenNo11() {
            return openNo11;
        }

        public void setOpenNo11(String openNo11) {
            this.openNo11 = openNo11;
        }

        public String getOpenNo12() {
            return openNo12;
        }

        public void setOpenNo12(String openNo12) {
            this.openNo12 = openNo12;
        }

        public String getOpenNo13() {
            return openNo13;
        }

        public void setOpenNo13(String openNo13) {
            this.openNo13 = openNo13;
        }

        public String getOpenNo14() {
            return openNo14;
        }

        public void setOpenNo14(String openNo14) {
            this.openNo14 = openNo14;
        }

        public String getOpenNo15() {
            return openNo15;
        }

        public void setOpenNo15(String openNo15) {
            this.openNo15 = openNo15;
        }

        public String getOpenNo16() {
            return openNo16;
        }

        public void setOpenNo16(String openNo16) {
            this.openNo16 = openNo16;
        }

        public String getOpenNo17() {
            return openNo17;
        }

        public void setOpenNo17(String openNo17) {
            this.openNo17 = openNo17;
        }

        public String getOpenNo18() {
            return openNo18;
        }

        public void setOpenNo18(String openNo18) {
            this.openNo18 = openNo18;
        }

        public String getOpenNo19() {
            return openNo19;
        }

        public void setOpenNo19(String openNo19) {
            this.openNo19 = openNo19;
        }

        public String getOpenNo1() {
            return openNo1;
        }

        public void setOpenNo1(String openNo1) {
            this.openNo1 = openNo1;
        }

        public String getOpenNo20() {
            return openNo20;
        }

        public void setOpenNo20(String openNo20) {
            this.openNo20 = openNo20;
        }

        public String getOpenNo2() {
            return openNo2;
        }

        public void setOpenNo2(String openNo2) {
            this.openNo2 = openNo2;
        }

        public String getOpenNo3() {
            return openNo3;
        }

        public void setOpenNo3(String openNo3) {
            this.openNo3 = openNo3;
        }

        public String getOpenNo4() {
            return openNo4;
        }

        public void setOpenNo4(String openNo4) {
            this.openNo4 = openNo4;
        }

        public String getOpenNo5() {
            return openNo5;
        }

        public void setOpenNo5(String openNo5) {
            this.openNo5 = openNo5;
        }

        public String getOpenNo6() {
            return openNo6;
        }

        public void setOpenNo6(String openNo6) {
            this.openNo6 = openNo6;
        }

        public String getOpenNo7() {
            return openNo7;
        }

        public void setOpenNo7(String openNo7) {
            this.openNo7 = openNo7;
        }

        public String getOpenNo8() {
            return openNo8;
        }

        public void setOpenNo8(String openNo8) {
            this.openNo8 = openNo8;
        }

        public String getOpenNo9() {
            return openNo9;
        }

        public void setOpenNo9(String openNo9) {
            this.openNo9 = openNo9;
        }

        public String getOpenNoName1() {
            return openNoName1;
        }

        public void setOpenNoName1(String openNoName1) {
            this.openNoName1 = openNoName1;
        }

        public String getOpenNoName2() {
            return openNoName2;
        }

        public void setOpenNoName2(String openNoName2) {
            this.openNoName2 = openNoName2;
        }

        public String getOpenNoName3() {
            return openNoName3;
        }

        public void setOpenNoName3(String openNoName3) {
            this.openNoName3 = openNoName3;
        }

        public String getOpenNoName4() {
            return openNoName4;
        }

        public void setOpenNoName4(String openNoName4) {
            this.openNoName4 = openNoName4;
        }

        public String getOpenNoName5() {
            return openNoName5;
        }

        public void setOpenNoName5(String openNoName5) {
            this.openNoName5 = openNoName5;
        }

        public String getOpenNoName6() {
            return openNoName6;
        }

        public void setOpenNoName6(String openNoName6) {
            this.openNoName6 = openNoName6;
        }

        public String getOpenNoName7() {
            return openNoName7;
        }

        public void setOpenNoName7(String openNoName7) {
            this.openNoName7 = openNoName7;
        }

        public String getOpenTime() {
            return openTime;
        }

        public void setOpenTime(String openTime) {
            this.openTime = openTime;
        }

        public String getOpenTotal() {
            return openTotal;
        }

        public void setOpenTotal(String openTotal) {
            this.openTotal = openTotal;
        }

        public String getOpenTotalDanShuang() {
            return openTotalDanShuang;
        }

        public void setOpenTotalDanShuang(String openTotalDanShuang) {
            this.openTotalDanShuang = openTotalDanShuang;
        }

        public String getOpenTotalDaXiao() {
            return openTotalDaXiao;
        }

        public void setOpenTotalDaXiao(String openTotalDaXiao) {
            this.openTotalDaXiao = openTotalDaXiao;
        }

        public String getOpenTotalWeiDaXiao() {
            return openTotalWeiDaXiao;
        }

        public void setOpenTotalWeiDaXiao(String openTotalWeiDaXiao) {
            this.openTotalWeiDaXiao = openTotalWeiDaXiao;
        }

        public String getOther() {
            return other;
        }

        public void setOther(String other) {
            this.other = other;
        }

        public String getQianhouhe() {
            return qianhouhe;
        }

        public void setQianhouhe(String qianhouhe) {
            this.qianhouhe = qianhouhe;
        }

        public String getQiansan() {
            return qiansan;
        }

        public void setQiansan(String qiansan) {
            this.qiansan = qiansan;
        }

        public String getQsebo() {
            return qsebo;
        }

        public void setQsebo(String qsebo) {
            this.qsebo = qsebo;
        }

        public String getSebo() {
            return sebo;
        }

        public void setSebo(String sebo) {
            this.sebo = sebo;
        }

        public String getShengXiao() {
            return shengXiao;
        }

        public void setShengXiao(String shengXiao) {
            this.shengXiao = shengXiao;
        }

        public String getWuxing() {
            return wuxing;
        }

        public void setWuxing(String wuxing) {
            this.wuxing = wuxing;
        }

        public String getZhongsan() {
            return zhongsan;
        }

        public void setZhongsan(String zhongsan) {
            this.zhongsan = zhongsan;
        }
    }



}
