package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX8 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX8.result getResult() {
        return result;
    }

    public void setResult(PK10_DX8.result result) {
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
        private String DX8_D;
        private String DX8_X;

        public String getDX8_D() {
            return DX8_D;
        }

        public void setDX8_D(String DX8_D) {
            this.DX8_D = DX8_D;
        }

        public String getDX8_X() {
            return DX8_X;
        }

        public void setDX8_X(String DX8_X) {
            this.DX8_X = DX8_X;
        }
    }
}
