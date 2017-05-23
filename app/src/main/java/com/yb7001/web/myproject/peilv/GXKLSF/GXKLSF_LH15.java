package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_LH15 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_LH15.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_LH15.result result) {
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
        private String LH15_L;
        private String LH15_H;

        public String getLH15_H() {
            return LH15_H;
        }

        public void setLH15_H(String LH15_H) {
            this.LH15_H = LH15_H;
        }

        public String getLH15_L() {
            return LH15_L;
        }

        public void setLH15_L(String LH15_L) {
            this.LH15_L = LH15_L;
        }
    }
}
