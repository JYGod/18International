package com.yb7001.web.myproject.peilv.PK10;


public class PK10_LH1 {
    private String status;
    private String tip;
    private result result;

    public PK10_LH1.result getResult() {
        return result;
    }

    public void setResult(PK10_LH1.result result) {
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
        private String LH1_L;
        private String LH1_H;

        public String getLH1_H() {
            return LH1_H;
        }

        public void setLH1_H(String LH1_H) {
            this.LH1_H = LH1_H;
        }

        public String getLH1_L() {
            return LH1_L;
        }

        public void setLH1_L(String LH1_L) {
            this.LH1_L = LH1_L;
        }
    }
}
