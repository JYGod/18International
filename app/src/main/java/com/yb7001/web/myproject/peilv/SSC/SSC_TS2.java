package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_TS2 {
    private String status;
    private String tip;
    private result result;

    public SSC_TS2.result getResult() {
        return result;
    }

    public void setResult(SSC_TS2.result result) {
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

    public static class result{
        private String TS2_0;
        private String TS2_1;
        private String TS2_2;
        private String TS2_3;
        private String TS2_4;

        public String getTS2_0() {
            return TS2_0;
        }

        public void setTS2_0(String TS2_0) {
            this.TS2_0 = TS2_0;
        }

        public String getTS2_1() {
            return TS2_1;
        }

        public void setTS2_1(String TS2_1) {
            this.TS2_1 = TS2_1;
        }

        public String getTS2_2() {
            return TS2_2;
        }

        public void setTS2_2(String TS2_2) {
            this.TS2_2 = TS2_2;
        }

        public String getTS2_3() {
            return TS2_3;
        }

        public void setTS2_3(String TS2_3) {
            this.TS2_3 = TS2_3;
        }

        public String getTS2_4() {
            return TS2_4;
        }

        public void setTS2_4(String TS2_4) {
            this.TS2_4 = TS2_4;
        }
    }
}
