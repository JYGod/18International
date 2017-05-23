package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_SB3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_SB3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_SB3.result result) {
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
        private String SB3_B;
        private String SB3_G;
        private String SB3_R;

        public String getSB3_B() {
            return SB3_B;
        }

        public void setSB3_B(String SB3_B) {
            this.SB3_B = SB3_B;
        }

        public String getSB3_G() {
            return SB3_G;
        }

        public void setSB3_G(String SB3_G) {
            this.SB3_G = SB3_G;
        }

        public String getSB3_R() {
            return SB3_R;
        }

        public void setSB3_R(String SB3_R) {
            this.SB3_R = SB3_R;
        }
    }
}
