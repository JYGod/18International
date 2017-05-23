package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YFLSX4 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YFLSX4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YFLSX4.result result) {
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
        private String YFLSX4_F;
        private String YFLSX4_L;
        private String YFLSX4_S;
        private String YFLSX4_X;

        public String getYFLSX4_F() {
            return YFLSX4_F;
        }

        public void setYFLSX4_F(String YFLSX4_F) {
            this.YFLSX4_F = YFLSX4_F;
        }

        public String getYFLSX4_L() {
            return YFLSX4_L;
        }

        public void setYFLSX4_L(String YFLSX4_L) {
            this.YFLSX4_L = YFLSX4_L;
        }

        public String getYFLSX4_S() {
            return YFLSX4_S;
        }

        public void setYFLSX4_S(String YFLSX4_S) {
            this.YFLSX4_S = YFLSX4_S;
        }

        public String getYFLSX4_X() {
            return YFLSX4_X;
        }

        public void setYFLSX4_X(String YFLSX4_X) {
            this.YFLSX4_X = YFLSX4_X;
        }
    }
}
