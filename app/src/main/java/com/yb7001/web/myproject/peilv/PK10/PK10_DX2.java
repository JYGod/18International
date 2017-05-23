package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DX2 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX2.result getResult() {
        return result;
    }

    public void setResult(PK10_DX2.result result) {
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
        private String DX2_D;
        private String DX2_X;

        public String getDX2_D() {
            return DX2_D;
        }

        public void setDX2_D(String DX2_D) {
            this.DX2_D = DX2_D;
        }

        public String getDX2_X() {
            return DX2_X;
        }

        public void setDX2_X(String DX2_X) {
            this.DX2_X = DX2_X;
        }
    }
}
