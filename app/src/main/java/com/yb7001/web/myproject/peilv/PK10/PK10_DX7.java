package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX7 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX7.result getResult() {
        return result;
    }

    public void setResult(PK10_DX7.result result) {
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
        private String DX7_D;
        private String DX7_X;

        public String getDX7_D() {
            return DX7_D;
        }

        public void setDX7_D(String DX7_D) {
            this.DX7_D = DX7_D;
        }

        public String getDX7_X() {
            return DX7_X;
        }

        public void setDX7_X(String DX7_X) {
            this.DX7_X = DX7_X;
        }
    }
}
