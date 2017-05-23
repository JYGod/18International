package com.yb7001.web.myproject.bean;



public class BankInfo {

    private String status;
    private String tip;
    private Result result;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result{
        private String bankName;
        private String bankNumber;
        private String bankUser;
        private String moneyPwd;

        public String getBankName() {
            return bankName;
        }

        public void setBankName(String bankName) {
            this.bankName = bankName;
        }

        public String getBankNumber() {
            return bankNumber;
        }

        public void setBankNumber(String bankNumber) {
            this.bankNumber = bankNumber;
        }

        public String getBankUser() {
            return bankUser;
        }

        public void setBankUser(String bankUser) {
            this.bankUser = bankUser;
        }

        public String getMoneyPwd() {
            return moneyPwd;
        }

        public void setMoneyPwd(String moneyPwd) {
            this.moneyPwd = moneyPwd;
        }
    }
}
