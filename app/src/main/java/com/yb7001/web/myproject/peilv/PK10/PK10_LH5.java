package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_LH5 {
    private String status;
    private String tip;
    private result result;

    public PK10_LH5.result getResult() {
        return result;
    }

    public void setResult(PK10_LH5.result result) {
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
        private String LH5_L;
        private String LH5_H;

        public String getLH5_H() {
            return LH5_H;
        }

        public void setLH5_H(String LH5_H) {
            this.LH5_H = LH5_H;
        }

        public String getLH5_L() {
            return LH5_L;
        }

        public void setLH5_L(String LH5_L) {
            this.LH5_L = LH5_L;
        }
    }
}
