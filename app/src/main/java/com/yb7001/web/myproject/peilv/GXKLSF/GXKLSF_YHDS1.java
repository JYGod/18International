package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YHDS1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YHDS1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YHDS1.result result) {
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
        private String YHDS1_S;
        private String YHDS1_D;

        public String getYHDS1_D() {
            return YHDS1_D;
        }

        public void setYHDS1_D(String YHDS1_D) {
            this.YHDS1_D = YHDS1_D;
        }

        public String getYHDS1_S() {
            return YHDS1_S;
        }

        public void setYHDS1_S(String YHDS1_S) {
            this.YHDS1_S = YHDS1_S;
        }
    }
}
