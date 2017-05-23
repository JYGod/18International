package com.yb7001.web.myproject.peilv.PK10;

public class PK10_GDS {
    private String status;
    private String tip;
    private result result;

    public PK10_GDS.result getResult() {
        return result;
    }

    public void setResult(PK10_GDS.result result) {
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
        private String GDS_D;
        private String GDS_S;

        public String getGDS_D() {
            return GDS_D;
        }

        public void setGDS_D(String GDS_D) {
            this.GDS_D = GDS_D;
        }

        public String getGDS_S() {
            return GDS_S;
        }

        public void setGDS_S(String GDS_S) {
            this.GDS_S = GDS_S;
        }
    }
}
