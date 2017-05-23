package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YFLSX1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YFLSX1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YFLSX1.result result) {
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
        private String YFLSX1_F;
        private String YFLSX1_L;
        private String YFLSX1_S;
        private String YFLSX1_X;

        public String getYFLSX1_F() {
            return YFLSX1_F;
        }

        public void setYFLSX1_F(String YFLSX1_F) {
            this.YFLSX1_F = YFLSX1_F;
        }

        public String getYFLSX1_L() {
            return YFLSX1_L;
        }

        public void setYFLSX1_L(String YFLSX1_L) {
            this.YFLSX1_L = YFLSX1_L;
        }

        public String getYFLSX1_S() {
            return YFLSX1_S;
        }

        public void setYFLSX1_S(String YFLSX1_S) {
            this.YFLSX1_S = YFLSX1_S;
        }

        public String getYFLSX1_X() {
            return YFLSX1_X;
        }

        public void setYFLSX1_X(String YFLSX1_X) {
            this.YFLSX1_X = YFLSX1_X;
        }
    }
}
