package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS3 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS3.result getResult() {
        return result;
    }

    public void setResult(PK10_DS3.result result) {
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
         private String DS3_D;
         private String DS3_S;

        public String getDS3_D() {
            return DS3_D;
        }

        public void setDS3_D(String DS3_D) {
            this.DS3_D = DS3_D;
        }

        public String getDS3_S() {
            return DS3_S;
        }

        public void setDS3_S(String DS3_S) {
            this.DS3_S = DS3_S;
        }
    }
}
