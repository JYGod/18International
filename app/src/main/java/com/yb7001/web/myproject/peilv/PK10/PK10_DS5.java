package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS5 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS5.result getResult() {
        return result;
    }

    public void setResult(PK10_DS5.result result) {
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


    public static class result {
        private String DS5_D;
        private String DS5_S;

        public String getDS5_D() {
            return DS5_D;
        }

        public void setDS5_D(String DS5_D) {
            this.DS5_D = DS5_D;
        }

        public String getDS5_S() {
            return DS5_S;
        }

        public void setDS5_S(String DS5_S) {
            this.DS5_S = DS5_S;
        }
    }

}
