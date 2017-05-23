package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX3 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX3.result getResult() {
        return result;
    }

    public void setResult(PK10_DX3.result result) {
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
        private String DX3_D;
        private String DX3_X;

        public String getDX3_D() {
            return DX3_D;
        }

        public void setDX3_D(String DX3_D) {
            this.DX3_D = DX3_D;
        }

        public String getDX3_X() {
            return DX3_X;
        }

        public void setDX3_X(String DX3_X) {
            this.DX3_X = DX3_X;
        }
    }
}
