package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YFLSX2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YFLSX2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YFLSX2.result result) {
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
        private String YFLSX2_F;
        private String YFLSX2_L;
        private String YFLSX2_S;
        private String YFLSX2_X;

        public String getYFLSX2_F() {
            return YFLSX2_F;
        }

        public void setYFLSX2_F(String YFLSX2_F) {
            this.YFLSX2_F = YFLSX2_F;
        }

        public String getYFLSX2_L() {
            return YFLSX2_L;
        }

        public void setYFLSX2_L(String YFLSX2_L) {
            this.YFLSX2_L = YFLSX2_L;
        }

        public String getYFLSX2_S() {
            return YFLSX2_S;
        }

        public void setYFLSX2_S(String YFLSX2_S) {
            this.YFLSX2_S = YFLSX2_S;
        }

        public String getYFLSX2_X() {
            return YFLSX2_X;
        }

        public void setYFLSX2_X(String YFLSX2_X) {
            this.YFLSX2_X = YFLSX2_X;
        }
    }
}
