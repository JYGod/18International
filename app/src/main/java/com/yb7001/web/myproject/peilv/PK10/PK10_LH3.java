package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_LH3 {
    private String status;
    private String tip;
    private result result;

    public PK10_LH3.result getResult() {
        return result;
    }

    public void setResult(PK10_LH3.result result) {
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
        private String LH3_L;
        private String LH3_H;

        public String getLH3_H() {
            return LH3_H;
        }

        public void setLH3_H(String LH3_H) {
            this.LH3_H = LH3_H;
        }

        public String getLH3_L() {
            return LH3_L;
        }

        public void setLH3_L(String LH3_L) {
            this.LH3_L = LH3_L;
        }
    }
}
