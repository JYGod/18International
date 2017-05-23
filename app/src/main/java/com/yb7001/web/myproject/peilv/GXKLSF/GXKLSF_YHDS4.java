package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YHDS4 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YHDS4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YHDS4.result result) {
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
        private String YHDS4_S;
        private String YHDS4_D;

        public String getYHDS4_D() {
            return YHDS4_D;
        }

        public void setYHDS4_D(String YHDS4_D) {
            this.YHDS4_D = YHDS4_D;
        }

        public String getYHDS4_S() {
            return YHDS4_S;
        }

        public void setYHDS4_S(String YHDS4_S) {
            this.YHDS4_S = YHDS4_S;
        }
    }
}
