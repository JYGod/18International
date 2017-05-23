package com.yb7001.web.myproject.peilv.KL8;

/**
 * Created by jy on 16/12/27.
 */

public class KL8_DSH {
    private String status;
    private String tip;
    private result result;

    public KL8_DSH.result getResult() {
        return result;
    }

    public void setResult(KL8_DSH.result result) {
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
        private String DSH_D;
        private String DSH_S;
        private String DSH_T;

        public String getDSH_D() {
            return DSH_D;
        }

        public void setDSH_D(String DSH_D) {
            this.DSH_D = DSH_D;
        }

        public String getDSH_S() {
            return DSH_S;
        }

        public void setDSH_S(String DSH_S) {
            this.DSH_S = DSH_S;
        }

        public String getDSH_T() {
            return DSH_T;
        }

        public void setDSH_T(String DSH_T) {
            this.DSH_T = DSH_T;
        }
    }
}
