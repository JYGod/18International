package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YWDX1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YWDX1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YWDX1.result result) {
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
        private String YWDX1_D;
        private String YWDX1_X;

        public String getYWDX1_D() {
            return YWDX1_D;
        }

        public void setYWDX1_D(String YWDX1_D) {
            this.YWDX1_D = YWDX1_D;
        }

        public String getYWDX1_X() {
            return YWDX1_X;
        }

        public void setYWDX1_X(String YWDX1_X) {
            this.YWDX1_X = YWDX1_X;
        }
    }
}
