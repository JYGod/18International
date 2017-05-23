package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_LH4 {
    private String status;
    private String tip;
    private result result;

    public PK10_LH4.result getResult() {
        return result;
    }

    public void setResult(PK10_LH4.result result) {
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
        private String LH4_L;
        private String LH4_H;

        public String getLH4_H() {
            return LH4_H;
        }

        public void setLH4_H(String LH4_H) {
            this.LH4_H = LH4_H;
        }

        public String getLH4_L() {
            return LH4_L;
        }

        public void setLH4_L(String LH4_L) {
            this.LH4_L = LH4_L;
        }
    }
}
