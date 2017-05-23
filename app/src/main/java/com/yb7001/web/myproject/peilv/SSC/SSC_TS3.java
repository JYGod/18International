package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_TS3 {
    private String status;
    private String tip;
    private result result;

    public SSC_TS3.result getResult() {
        return result;
    }

    public void setResult(SSC_TS3.result result) {
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
        private String TS3_0;
        private String TS3_1;
        private String TS3_2;
        private String TS3_3;
        private String TS3_4;

        public String getTS3_0() {
            return TS3_0;
        }

        public void setTS3_0(String TS3_0) {
            this.TS3_0 = TS3_0;
        }

        public String getTS3_1() {
            return TS3_1;
        }

        public void setTS3_1(String TS3_1) {
            this.TS3_1 = TS3_1;
        }

        public String getTS3_2() {
            return TS3_2;
        }

        public void setTS3_2(String TS3_2) {
            this.TS3_2 = TS3_2;
        }

        public String getTS3_3() {
            return TS3_3;
        }

        public void setTS3_3(String TS3_3) {
            this.TS3_3 = TS3_3;
        }

        public String getTS3_4() {
            return TS3_4;
        }

        public void setTS3_4(String TS3_4) {
            this.TS3_4 = TS3_4;
        }
    }
}
