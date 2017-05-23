package com.yb7001.web.myproject.bean;

import java.util.List;


public class LoadUserBets {
    private String status;
    private String tip;
    private result result;

    public LoadUserBets.result getResult() {
        return result;
    }

    public void setResult(LoadUserBets.result result) {
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
        private List<Rows>rows;
        private List<Footer>footer;
        private int total;

        public List<Footer> getFooter() {
            return footer;
        }

        public void setFooter(List<Footer> footer) {
            this.footer = footer;
        }

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
        private String id;
        private String userId;
        private String userTypeName;
        private String chongzhi;
        private String tixian;
        private String returnPoint;
        private String betMoney;
        private String betAcount;
        private String dateTime;

        public String getBetAcount() {
            return betAcount;
        }

        public void setBetAcount(String betAcount) {
            this.betAcount = betAcount;
        }

        public String getBetMoney() {
            return betMoney;
        }

        public void setBetMoney(String betMoney) {
            this.betMoney = betMoney;
        }

        public String getChongzhi() {
            return chongzhi;
        }

        public void setChongzhi(String chongzhi) {
            this.chongzhi = chongzhi;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getReturnPoint() {
            return returnPoint;
        }

        public void setReturnPoint(String returnPoint) {
            this.returnPoint = returnPoint;
        }

        public String getTixian() {
            return tixian;
        }

        public void setTixian(String tixian) {
            this.tixian = tixian;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserTypeName() {
            return userTypeName;
        }

        public void setUserTypeName(String userTypeName) {
            this.userTypeName = userTypeName;
        }
    }

    public class Footer{
        private String id;
        private String userId;
        private String userTypeName;
        private String chongzhi;
        private String tixian;
        private String returnPoint;
        private String betMoney;
        private String betAcount;
        private String dateTime;

        public String getBetAcount() {
            return betAcount;
        }

        public void setBetAcount(String betAcount) {
            this.betAcount = betAcount;
        }

        public String getBetMoney() {
            return betMoney;
        }

        public void setBetMoney(String betMoney) {
            this.betMoney = betMoney;
        }

        public String getChongzhi() {
            return chongzhi;
        }

        public void setChongzhi(String chongzhi) {
            this.chongzhi = chongzhi;
        }

        public String getDateTime() {
            return dateTime;
        }

        public void setDateTime(String dateTime) {
            this.dateTime = dateTime;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getReturnPoint() {
            return returnPoint;
        }

        public void setReturnPoint(String returnPoint) {
            this.returnPoint = returnPoint;
        }

        public String getTixian() {
            return tixian;
        }

        public void setTixian(String tixian) {
            this.tixian = tixian;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getUserTypeName() {
            return userTypeName;
        }

        public void setUserTypeName(String userTypeName) {
            this.userTypeName = userTypeName;
        }
    }

}
