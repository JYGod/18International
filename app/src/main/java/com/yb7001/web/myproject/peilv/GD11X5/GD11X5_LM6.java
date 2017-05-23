package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM6 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM6.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM6.result result) {
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
        private String LM6;
        private String LM6_0;

        public String getLM6() {
            return LM6;
        }

        public void setLM6(String LM6) {
            this.LM6 = LM6;
        }

        public String getLM6_0() {
            return LM6_0;
        }

        public void setLM6_0(String LM6_0) {
            this.LM6_0 = LM6_0;
        }
    }
}
