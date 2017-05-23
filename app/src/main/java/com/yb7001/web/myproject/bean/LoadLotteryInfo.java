package com.yb7001.web.myproject.bean;


public class LoadLotteryInfo {
    private String status;
    private result result;
    private String tip;

    public LoadLotteryInfo.result getResult() {
        return result;
    }

    public void setResult(LoadLotteryInfo.result result) {
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
        private String closeTime;
        private String drawDate;
        private String drawNumber;
        private String drawTime;
        private String openTime;
        private String pnumber;
        private String status;

        public String getCloseTime() {
            return closeTime;
        }

        public void setCloseTime(String closeTime) {
            this.closeTime = closeTime;
        }

        public String getDrawDate() {
            return drawDate;
        }

        public void setDrawDate(String drawDate) {
            this.drawDate = drawDate;
        }

        public String getDrawNumber() {
            return drawNumber;
        }

        public void setDrawNumber(String drawNumber) {
            this.drawNumber = drawNumber;
        }

        public String getDrawTime() {
            return drawTime;
        }

        public void setDrawTime(String drawTime) {
            this.drawTime = drawTime;
        }

        public String getOpenTime() {
            return openTime;
        }

        public void setOpenTime(String openTime) {
            this.openTime = openTime;
        }

        public String getPnumber() {
            return pnumber;
        }

        public void setPnumber(String pnumber) {
            this.pnumber = pnumber;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }
}
