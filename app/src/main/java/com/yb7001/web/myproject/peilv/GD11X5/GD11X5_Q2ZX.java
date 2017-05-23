package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_Q2ZX {
    private String status;
    private String tip;
    private result result;

    public GD11X5_Q2ZX.result getResult() {
        return result;
    }

    public void setResult(GD11X5_Q2ZX.result result) {
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
        private String Q2ZX;
        private String Q2ZX_0;

        public String getQ2ZX() {
            return Q2ZX;
        }

        public void setQ2ZX(String q2ZX) {
            Q2ZX = q2ZX;
        }

        public String getQ2ZX_0() {
            return Q2ZX_0;
        }

        public void setQ2ZX_0(String q2ZX_0) {
            Q2ZX_0 = q2ZX_0;
        }
    }
}
