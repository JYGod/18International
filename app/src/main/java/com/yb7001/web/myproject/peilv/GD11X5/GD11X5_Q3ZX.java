package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_Q3ZX {
    private String status;
    private String tip;
    private result result;

    public GD11X5_Q3ZX.result getResult() {
        return result;
    }

    public void setResult(GD11X5_Q3ZX.result result) {
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
        private String Q3ZX;
        private String Q3ZX_0;

        public String getQ3ZX() {
            return Q3ZX;
        }

        public void setQ3ZX(String q3ZX) {
            Q3ZX = q3ZX;
        }

        public String getQ3ZX_0() {
            return Q3ZX_0;
        }

        public void setQ3ZX_0(String q3ZX_0) {
            Q3ZX_0 = q3ZX_0;
        }
    }
}
