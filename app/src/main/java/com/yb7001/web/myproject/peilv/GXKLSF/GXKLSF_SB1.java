package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_SB1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_SB1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_SB1.result result) {
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
        private String SB1_B;
        private String SB1_G;
        private String SB1_R;

        public String getSB1_B() {
            return SB1_B;
        }

        public void setSB1_B(String SB1_B) {
            this.SB1_B = SB1_B;
        }

        public String getSB1_G() {
            return SB1_G;
        }

        public void setSB1_G(String SB1_G) {
            this.SB1_G = SB1_G;
        }

        public String getSB1_R() {
            return SB1_R;
        }

        public void setSB1_R(String SB1_R) {
            this.SB1_R = SB1_R;
        }
    }
}
