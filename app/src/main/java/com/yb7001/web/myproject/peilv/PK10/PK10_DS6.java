package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DS6 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS6.result getResult() {
        return result;
    }

    public void setResult(PK10_DS6.result result) {
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
        private String DS6_D;
        private String DS6_S;

        public String getDS6_D() {
            return DS6_D;
        }

        public void setDS6_D(String DS6_D) {
            this.DS6_D = DS6_D;
        }

        public String getDS6_S() {
            return DS6_S;
        }

        public void setDS6_S(String DS6_S) {
            this.DS6_S = DS6_S;
        }
    }

    }
