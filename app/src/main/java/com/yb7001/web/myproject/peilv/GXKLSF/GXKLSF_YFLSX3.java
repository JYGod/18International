package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YFLSX3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YFLSX3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YFLSX3.result result) {
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
        private String YFLSX3_F;
        private String YFLSX3_L;
        private String YFLSX3_S;
        private String YFLSX3_X;

        public String getYFLSX3_F() {
            return YFLSX3_F;
        }

        public void setYFLSX3_F(String YFLSX3_F) {
            this.YFLSX3_F = YFLSX3_F;
        }

        public String getYFLSX3_L() {
            return YFLSX3_L;
        }

        public void setYFLSX3_L(String YFLSX3_L) {
            this.YFLSX3_L = YFLSX3_L;
        }

        public String getYFLSX3_S() {
            return YFLSX3_S;
        }

        public void setYFLSX3_S(String YFLSX3_S) {
            this.YFLSX3_S = YFLSX3_S;
        }

        public String getYFLSX3_X() {
            return YFLSX3_X;
        }

        public void setYFLSX3_X(String YFLSX3_X) {
            this.YFLSX3_X = YFLSX3_X;
        }
    }
}
