package com.yb7001.web.myproject.peilv.PK10;



public class PK10_DS4 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS4.result getResult() {
        return result;
    }

    public void setResult(PK10_DS4.result result) {
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
        private String DS4_D;
        private String DS4_S;

        public String getDS4_D() {
            return DS4_D;
        }

        public void setDS4_D(String DS4_D) {
            this.DS4_D = DS4_D;
        }

        public String getDS4_S() {
            return DS4_S;
        }

        public void setDS4_S(String DS4_S) {
            this.DS4_S = DS4_S;
        }
    }
}
