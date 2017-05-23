package com.yb7001.web.myproject.peilv.SSC;

/**
 * Created by jy on 16/12/21.
 */

public class SSC_ZDX {
    private String status;
    private String tip;
    private result result;

    public SSC_ZDX.result getResult() {
        return result;
    }

    public void setResult(SSC_ZDX.result result) {
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
        private String ZDX_X;
        private String ZDX_D;

        public String getZDX_D() {
            return ZDX_D;
        }

        public void setZDX_D(String ZDX_D) {
            this.ZDX_D = ZDX_D;
        }

        public String getZDX_X() {
            return ZDX_X;
        }

        public void setZDX_X(String ZDX_X) {
            this.ZDX_X = ZDX_X;
        }
    }
}
