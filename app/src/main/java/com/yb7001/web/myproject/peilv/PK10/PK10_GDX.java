package com.yb7001.web.myproject.peilv.PK10;


public class PK10_GDX {
    private String status;
    private String tip;
    private result result;

    public PK10_GDX.result getResult() {
        return result;
    }

    public void setResult(PK10_GDX.result result) {
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
        private String GDX_D;
        private String GDX_X;

        public String getGDX_D() {
            return GDX_D;
        }

        public void setGDX_D(String GDX_D) {
            this.GDX_D = GDX_D;
        }

        public String getGDX_X() {
            return GDX_X;
        }

        public void setGDX_X(String GDX_X) {
            this.GDX_X = GDX_X;
        }
    }
}
