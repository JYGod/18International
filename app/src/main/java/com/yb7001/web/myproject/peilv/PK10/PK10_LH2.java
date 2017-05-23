package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_LH2 {
    private String status;
    private String tip;
    private result result;

    public PK10_LH2.result getResult() {
        return result;
    }

    public void setResult(PK10_LH2.result result) {
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
        private String LH2_L;
        private String LH2_H;

        public String getLH2_H() {
            return LH2_H;
        }

        public void setLH2_H(String LH2_H) {
            this.LH2_H = LH2_H;
        }

        public String getLH2_L() {
            return LH2_L;
        }

        public void setLH2_L(String LH2_L) {
            this.LH2_L = LH2_L;
        }
    }
}
