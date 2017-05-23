package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS2 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS2.result getResult() {
        return result;
    }

    public void setResult(PK10_DS2.result result) {
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
        private String DS2_D;
        private String DS2_S;

        public String getDS2_D() {
            return DS2_D;
        }

        public void setDS2_D(String DS2_D) {
            this.DS2_D = DS2_D;
        }

        public String getDS2_S() {
            return DS2_S;
        }

        public void setDS2_S(String DS2_S) {
            this.DS2_S = DS2_S;
        }
    }
}
