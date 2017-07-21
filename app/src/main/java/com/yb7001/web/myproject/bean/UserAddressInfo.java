package com.yb7001.web.myproject.bean;



public class UserAddressInfo {

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

    public class Result {
        private String address;
        private String userTel;
        private String realUserName;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getUserTel() {
            return userTel;
        }

        public void setUserTel(String userTel) {
            this.userTel = userTel;
        }

        public String getRealUserName() {
            return realUserName;
        }

        public void setRealUserName(String realUserName) {
            this.realUserName = realUserName;
        }
    }
}
