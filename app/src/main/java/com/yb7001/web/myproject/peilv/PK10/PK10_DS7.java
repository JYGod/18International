package com.yb7001.web.myproject.peilv.PK10;



public class PK10_DS7 {
    private String status;
    private String tip;
    private result result;

    public PK10_DS7.result getResult() {
        return result;
    }

    public void setResult(PK10_DS7.result result) {
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
        private String DS7_D;
        private String DS7_S;

        public String getDS7_D() {
            return DS7_D;
        }

        public void setDS7_D(String DS7_D) {
            this.DS7_D = DS7_D;
        }

        public String getDS7_S() {
            return DS7_S;
        }

        public void setDS7_S(String DS7_S) {
            this.DS7_S = DS7_S;
        }
    }
    }
