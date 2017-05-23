package com.yb7001.web.myproject.bean;

/**
 * Created by jy on 17/1/10.
 */

public class LoadMoneyInfo {
    private String status;
    private String tip;
    private result result;

    public LoadMoneyInfo.result getResult() {
        return result;
    }

    public void setResult(LoadMoneyInfo.result result) {
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

    public static class result{
        private String useMoney;
        private String dongjieMoney;
        private String rebate;

        public String getDongjieMoney() {
            return dongjieMoney;
        }

        public void setDongjieMoney(String dongjieMoney) {
            this.dongjieMoney = dongjieMoney;
        }

        public String getRebate() {
            return rebate;
        }

        public void setRebate(String rebate) {
            this.rebate = rebate;
        }

        public String getUseMoney() {
            return useMoney;
        }

        public void setUseMoney(String useMoney) {
            this.useMoney = useMoney;
        }
    }
}
