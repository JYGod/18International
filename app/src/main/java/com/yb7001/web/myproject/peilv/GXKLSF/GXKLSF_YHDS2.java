package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YHDS2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YHDS2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YHDS2.result result) {
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
        private String YHDS2_S;
        private String YHDS2_D;

        public String getYHDS2_D() {
            return YHDS2_D;
        }

        public void setYHDS2_D(String YHDS2_D) {
            this.YHDS2_D = YHDS2_D;
        }

        public String getYHDS2_S() {
            return YHDS2_S;
        }

        public void setYHDS2_S(String YHDS2_S) {
            this.YHDS2_S = YHDS2_S;
        }
    }
}
