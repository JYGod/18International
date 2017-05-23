package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_SB4 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_SB4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_SB4.result result) {
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
        private String SB4_B;
        private String SB4_G;
        private String SB4_R;

        public String getSB4_B() {
            return SB4_B;
        }

        public void setSB4_B(String SB4_B) {
            this.SB4_B = SB4_B;
        }

        public String getSB4_G() {
            return SB4_G;
        }

        public void setSB4_G(String SB4_G) {
            this.SB4_G = SB4_G;
        }

        public String getSB4_R() {
            return SB4_R;
        }

        public void setSB4_R(String SB4_R) {
            this.SB4_R = SB4_R;
        }
    }
}
