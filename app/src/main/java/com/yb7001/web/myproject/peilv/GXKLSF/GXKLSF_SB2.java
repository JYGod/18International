package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_SB2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_SB2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_SB2.result result) {
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
        private String SB2_B;
        private String SB2_G;
        private String SB2_R;

        public String getSB2_B() {
            return SB2_B;
        }

        public void setSB2_B(String SB2_B) {
            this.SB2_B = SB2_B;
        }

        public String getSB2_G() {
            return SB2_G;
        }

        public void setSB2_G(String SB2_G) {
            this.SB2_G = SB2_G;
        }

        public String getSB2_R() {
            return SB2_R;
        }

        public void setSB2_R(String SB2_R) {
            this.SB2_R = SB2_R;
        }
    }
}
