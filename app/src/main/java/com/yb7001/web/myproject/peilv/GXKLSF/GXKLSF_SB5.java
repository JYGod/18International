package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_SB5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_SB5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_SB5.result result) {
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
        private String SB5_B;
        private String SB5_G;
        private String SB5_R;

        public String getSB5_B() {
            return SB5_B;
        }

        public void setSB5_B(String SB5_B) {
            this.SB5_B = SB5_B;
        }

        public String getSB5_G() {
            return SB5_G;
        }

        public void setSB5_G(String SB5_G) {
            this.SB5_G = SB5_G;
        }

        public String getSB5_R() {
            return SB5_R;
        }

        public void setSB5_R(String SB5_R) {
            this.SB5_R = SB5_R;
        }
    }
}
