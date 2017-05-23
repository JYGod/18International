package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YWDX4 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YWDX4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YWDX4.result result) {
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
        private String YWDX4_D;
        private String YWDX4_X;

        public String getYWDX4_D() {
            return YWDX4_D;
        }

        public void setYWDX4_D(String YWDX4_D) {
            this.YWDX4_D = YWDX4_D;
        }

        public String getYWDX4_X() {
            return YWDX4_X;
        }

        public void setYWDX4_X(String YWDX4_X) {
            this.YWDX4_X = YWDX4_X;
        }
    }
}
