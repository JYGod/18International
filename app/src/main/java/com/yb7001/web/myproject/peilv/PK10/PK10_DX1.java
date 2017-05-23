package com.yb7001.web.myproject.peilv.PK10;


public class PK10_DX1 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX1.result getResult() {
        return result;
    }

    public void setResult(PK10_DX1.result result) {
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
        private String DX1_D;
        private String DX1_X;

        public String getDX1_D() {
            return DX1_D;
        }

        public void setDX1_D(String DX1_D) {
            this.DX1_D = DX1_D;
        }

        public String getDX1_X() {
            return DX1_X;
        }

        public void setDX1_X(String DX1_X) {
            this.DX1_X = DX1_X;
        }
    }
}
