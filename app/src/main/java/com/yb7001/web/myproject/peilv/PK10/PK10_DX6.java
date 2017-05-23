package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX6 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX6.result getResult() {
        return result;
    }

    public void setResult(PK10_DX6.result result) {
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
        private String DX6_D;
        private String DX6_X;

        public String getDX6_D() {
            return DX6_D;
        }

        public void setDX6_D(String DX6_D) {
            this.DX6_D = DX6_D;
        }

        public String getDX6_X() {
            return DX6_X;
        }

        public void setDX6_X(String DX6_X) {
            this.DX6_X = DX6_X;
        }
    }
}
