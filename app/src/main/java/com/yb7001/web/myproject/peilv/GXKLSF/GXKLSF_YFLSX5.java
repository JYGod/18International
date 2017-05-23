package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YFLSX5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YFLSX5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YFLSX5.result result) {
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
        private String YFLSX5_F;
        private String YFLSX5_L;
        private String YFLSX5_S;
        private String YFLSX5_X;

        public String getYFLSX5_F() {
            return YFLSX5_F;
        }

        public void setYFLSX5_F(String YFLSX5_F) {
            this.YFLSX5_F = YFLSX5_F;
        }

        public String getYFLSX5_L() {
            return YFLSX5_L;
        }

        public void setYFLSX5_L(String YFLSX5_L) {
            this.YFLSX5_L = YFLSX5_L;
        }

        public String getYFLSX5_S() {
            return YFLSX5_S;
        }

        public void setYFLSX5_S(String YFLSX5_S) {
            this.YFLSX5_S = YFLSX5_S;
        }

        public String getYFLSX5_X() {
            return YFLSX5_X;
        }

        public void setYFLSX5_X(String YFLSX5_X) {
            this.YFLSX5_X = YFLSX5_X;
        }
    }
}
