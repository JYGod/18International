package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_LH {
    private String status;
    private String tip;
    private result result;

    public SSC_LH.result getResult() {
        return result;
    }

    public void setResult(SSC_LH.result result) {
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
        private String LH_L;
        private String LH_H;
        private String LH_T;

        public String getLH_H() {
            return LH_H;
        }

        public void setLH_H(String LH_H) {
            this.LH_H = LH_H;
        }

        public String getLH_L() {
            return LH_L;
        }

        public void setLH_L(String LH_L) {
            this.LH_L = LH_L;
        }

        public String getLH_T() {
            return LH_T;
        }

        public void setLH_T(String LH_T) {
            this.LH_T = LH_T;
        }
    }
}
