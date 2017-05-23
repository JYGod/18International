package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YHDS5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YHDS5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YHDS5.result result) {
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
        private String YHDS5_S;
        private String YHDS5_D;

        public String getYHDS5_D() {
            return YHDS5_D;
        }

        public void setYHDS5_D(String YHDS5_D) {
            this.YHDS5_D = YHDS5_D;
        }

        public String getYHDS5_S() {
            return YHDS5_S;
        }

        public void setYHDS5_S(String YHDS5_S) {
            this.YHDS5_S = YHDS5_S;
        }
    }
}
