package com.yb7001.web.myproject.peilv.PK10;



public class PK10_DX9 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX9.result getResult() {
        return result;
    }

    public void setResult(PK10_DX9.result result) {
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
        private String DX9_D;
        private String DX9_X;

        public String getDX9_D() {
            return DX9_D;
        }

        public void setDX9_D(String DX9_D) {
            this.DX9_D = DX9_D;
        }

        public String getDX9_X() {
            return DX9_X;
        }

        public void setDX9_X(String DX9_X) {
            this.DX9_X = DX9_X;
        }
    }
}
