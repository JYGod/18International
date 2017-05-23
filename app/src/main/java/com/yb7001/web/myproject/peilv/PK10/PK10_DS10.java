package com.yb7001.web.myproject.peilv.PK10;



public class PK10_DS10 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS10.result getResult() {
        return result;
    }

    public void setResult(PK10_DS10.result result) {
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
        private String DS10_D;
        private String DS10_S;

        public String getDS10_D() {
            return DS10_D;
        }

        public void setDS10_D(String DS10_D) {
            this.DS10_D = DS10_D;
        }

        public String getDS10_S() {
            return DS10_S;
        }

        public void setDS10_S(String DS10_S) {
            this.DS10_S = DS10_S;
        }
    }
}
