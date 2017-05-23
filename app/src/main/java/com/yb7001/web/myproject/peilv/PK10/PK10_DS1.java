package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS1 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS1.result getResult() {
        return result;
    }

    public void setResult(PK10_DS1.result result) {
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

    public static class  result{
        private String DS1_D;
        private String DS1_S;

        public String getDS1_D() {
            return DS1_D;
        }

        public void setDS1_D(String DS1_D) {
            this.DS1_D = DS1_D;
        }

        public String getDS1_S() {
            return DS1_S;
        }

        public void setDS1_S(String DS1_S) {
            this.DS1_S = DS1_S;
        }
    }
}
