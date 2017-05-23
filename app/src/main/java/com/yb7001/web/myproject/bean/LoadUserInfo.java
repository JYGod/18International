package com.yb7001.web.myproject.bean;



public class  LoadUserInfo {
    private String status;
    private String tip;
    private result result;

    public LoadUserInfo.result getResult() {
        return result;
    }

    public void setResult(LoadUserInfo.result result) {
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
        private String userName;
        private String userQQ;
        private String userEmail;

        public String getUserEmail() {
            return userEmail;
        }

        public void setUserEmail(String userEmail) {
            this.userEmail = userEmail;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getUserQQ() {
            return userQQ;
        }

        public void setUserQQ(String userQQ) {
            this.userQQ = userQQ;
        }
    }

}
