package com.yb7001.web.myproject.bean;


import java.util.List;

public class JiesuanBets {
    private String status;
    private String tip;
    private Result result;

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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result{
        private int total;
        private List<Rows>rows;
        private List<Footer>footer;

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public List<Rows> getRows() {
            return rows;
        }

        public void setRows(List<Rows> rows) {
            this.rows = rows;
        }

        public List<Footer> getFooter() {
            return footer;
        }

        public void setFooter(List<Footer> footer) {
            this.footer = footer;
        }

        public class Rows{
            private String orderId;
            private String lotteryId;
            private String lotteryName;
            private String betRecordBZ;
            private String openNumber;
            private String expectNumber;
            private String betMoney;
            private String account;
            private String returnPoint;
            private String reward;
            private String status;
            private String dateTime;
            private String lotteryPan;
            private String userId;
            private String betPeilv;

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getLotteryId() {
                return lotteryId;
            }

            public void setLotteryId(String lotteryId) {
                this.lotteryId = lotteryId;
            }

            public String getLotteryName() {
                return lotteryName;
            }

            public void setLotteryName(String lotteryName) {
                this.lotteryName = lotteryName;
            }

            public String getBetRecordBZ() {
                return betRecordBZ;
            }

            public void setBetRecordBZ(String betRecordBZ) {
                this.betRecordBZ = betRecordBZ;
            }

            public String getOpenNumber() {
                return openNumber;
            }

            public void setOpenNumber(String openNumber) {
                this.openNumber = openNumber;
            }

            public String getExpectNumber() {
                return expectNumber;
            }

            public void setExpectNumber(String expectNumber) {
                this.expectNumber = expectNumber;
            }

            public String getBetMoney() {
                return betMoney;
            }

            public void setBetMoney(String betMoney) {
                this.betMoney = betMoney;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getReturnPoint() {
                return returnPoint;
            }

            public void setReturnPoint(String returnPoint) {
                this.returnPoint = returnPoint;
            }

            public String getReward() {
                return reward;
            }

            public void setReward(String reward) {
                this.reward = reward;
            }

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDateTime() {
                return dateTime;
            }

            public void setDateTime(String dateTime) {
                this.dateTime = dateTime;
            }

            public String getLotteryPan() {
                return lotteryPan;
            }

            public void setLotteryPan(String lotteryPan) {
                this.lotteryPan = lotteryPan;
            }

            public String getUserId() {
                return userId;
            }

            public void setUserId(String userId) {
                this.userId = userId;
            }

            public String getBetPeilv() {
                return betPeilv;
            }

            public void setBetPeilv(String betPeilv) {
                this.betPeilv = betPeilv;
            }
        }

        public class Footer{
            private String orderId;
            private String betMoney;
            private String account;
            private String returnPoint;
            private String reward;

            public String getOrderId() {
                return orderId;
            }

            public void setOrderId(String orderId) {
                this.orderId = orderId;
            }

            public String getBetMoney() {
                return betMoney;
            }

            public void setBetMoney(String betMoney) {
                this.betMoney = betMoney;
            }

            public String getAccount() {
                return account;
            }

            public void setAccount(String account) {
                this.account = account;
            }

            public String getReturnPoint() {
                return returnPoint;
            }

            public void setReturnPoint(String returnPoint) {
                this.returnPoint = returnPoint;
            }

            public String getReward() {
                return reward;
            }

            public void setReward(String reward) {
                this.reward = reward;
            }
        }
    }
}
