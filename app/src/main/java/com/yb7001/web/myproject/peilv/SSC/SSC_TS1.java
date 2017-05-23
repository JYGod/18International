package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_TS1 {
    private String status;
    private String tip;
    private result result;

    public SSC_TS1.result getResult() {
        return result;
    }

    public void setResult(SSC_TS1.result result) {
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
        private String TS1_0;
        private String TS1_1;
        private String TS1_2;
        private String TS1_3;
        private String TS1_4;

        public String getTS1_0() {
            return TS1_0;
        }

        public void setTS1_0(String TS1_0) {
            this.TS1_0 = TS1_0;
        }

        public String getTS1_1() {
            return TS1_1;
        }

        public void setTS1_1(String TS1_1) {
            this.TS1_1 = TS1_1;
        }

        public String getTS1_2() {
            return TS1_2;
        }

        public void setTS1_2(String TS1_2) {
            this.TS1_2 = TS1_2;
        }

        public String getTS1_3() {
            return TS1_3;
        }

        public void setTS1_3(String TS1_3) {
            this.TS1_3 = TS1_3;
        }

        public String getTS1_4() {
            return TS1_4;
        }

        public void setTS1_4(String TS1_4) {
            this.TS1_4 = TS1_4;
        }
    }
}
