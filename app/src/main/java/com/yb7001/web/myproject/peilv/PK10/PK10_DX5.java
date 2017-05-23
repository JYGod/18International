package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX5 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX5.result getResult() {
        return result;
    }

    public void setResult(PK10_DX5.result result) {
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
        private String DX5_D;
        private String DX5_X;

        public String getDX5_D() {
            return DX5_D;
        }

        public void setDX5_D(String DX5_D) {
            this.DX5_D = DX5_D;
        }

        public String getDX5_X() {
            return DX5_X;
        }

        public void setDX5_X(String DX5_X) {
            this.DX5_X = DX5_X;
        }
    }
}
