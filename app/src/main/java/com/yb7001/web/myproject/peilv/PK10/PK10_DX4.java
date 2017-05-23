package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX4 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX4.result getResult() {
        return result;
    }

    public void setResult(PK10_DX4.result result) {
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
        private String DX4_D;
        private String DX4_X;

        public String getDX4_D() {
            return DX4_D;
        }

        public void setDX4_D(String DX4_D) {
            this.DX4_D = DX4_D;
        }

        public String getDX4_X() {
            return DX4_X;
        }

        public void setDX4_X(String DX4_X) {
            this.DX4_X = DX4_X;
        }
    }
}
