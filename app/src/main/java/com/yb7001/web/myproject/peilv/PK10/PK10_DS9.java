package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS9 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS9.result getResult() {
        return result;
    }

    public void setResult(PK10_DS9.result result) {
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
        private String DS9_D;
        private String DS9_S;

        public String getDS9_D() {
            return DS9_D;
        }

        public void setDS9_D(String DS9_D) {
            this.DS9_D = DS9_D;
        }

        public String getDS9_S() {
            return DS9_S;
        }

        public void setDS9_S(String DS9_S) {
            this.DS9_S = DS9_S;
        }
    }
}
