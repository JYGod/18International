package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YWDX2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YWDX2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YWDX2.result result) {
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
        private String YWDX2_D;
        private String YWDX2_X;

        public String getYWDX2_D() {
            return YWDX2_D;
        }

        public void setYWDX2_D(String YWDX2_D) {
            this.YWDX2_D = YWDX2_D;
        }

        public String getYWDX2_X() {
            return YWDX2_X;
        }

        public void setYWDX2_X(String YWDX2_X) {
            this.YWDX2_X = YWDX2_X;
        }
    }
}
