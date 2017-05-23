package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_ZDS {
    private String status;
    private String tip;
    private result result;

    public SSC_ZDS.result getResult() {
        return result;
    }

    public void setResult(SSC_ZDS.result result) {
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
        private String ZDS_D;
        private String ZDS_S;

        public String getZDS_D() {
            return ZDS_D;
        }

        public void setZDS_D(String ZDS_D) {
            this.ZDS_D = ZDS_D;
        }

        public String getZDS_S() {
            return ZDS_S;
        }

        public void setZDS_S(String ZDS_S) {
            this.ZDS_S = ZDS_S;
        }
    }
}
