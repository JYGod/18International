package com.yb7001.web.myproject.peilv.PK10;



public class PK10_DS8 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS8.result getResult() {
        return result;
    }

    public void setResult(PK10_DS8.result result) {
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
        private String DS8_D;
        private String DS8_S;

        public String getDS8_D() {
            return DS8_D;
        }

        public void setDS8_D(String DS8_D) {
            this.DS8_D = DS8_D;
        }

        public String getDS8_S() {
            return DS8_S;
        }

        public void setDS8_S(String DS8_S) {
            this.DS8_S = DS8_S;
        }
    }
}
