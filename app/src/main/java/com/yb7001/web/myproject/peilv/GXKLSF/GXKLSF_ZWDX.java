package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_ZWDX {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_ZWDX.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_ZWDX.result result) {
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
        private String ZWDX_D;
        private String ZWDX_X;

        public String getZWDX_D() {
            return ZWDX_D;
        }

        public void setZWDX_D(String ZWDX_D) {
            this.ZWDX_D = ZWDX_D;
        }

        public String getZWDX_X() {
            return ZWDX_X;
        }

        public void setZWDX_X(String ZWDX_X) {
            this.ZWDX_X = ZWDX_X;
        }
    }
}
