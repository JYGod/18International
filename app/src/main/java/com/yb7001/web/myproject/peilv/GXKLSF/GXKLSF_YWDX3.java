package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YWDX3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YWDX3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YWDX3.result result) {
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
        private String YWDX3_D;
        private String YWDX3_X;

        public String getYWDX3_D() {
            return YWDX3_D;
        }

        public void setYWDX3_D(String YWDX3_D) {
            this.YWDX3_D = YWDX3_D;
        }

        public String getYWDX3_X() {
            return YWDX3_X;
        }

        public void setYWDX3_X(String YWDX3_X) {
            this.YWDX3_X = YWDX3_X;
        }
    }
}
