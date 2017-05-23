package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YHDS3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YHDS3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YHDS3.result result) {
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
        private String YHDS3_S;
        private String YHDS3_D;

        public String getYHDS3_D() {
            return YHDS3_D;
        }

        public void setYHDS3_D(String YHDS3_D) {
            this.YHDS3_D = YHDS3_D;
        }

        public String getYHDS3_S() {
            return YHDS3_S;
        }

        public void setYHDS3_S(String YHDS3_S) {
            this.YHDS3_S = YHDS3_S;
        }
    }
}
