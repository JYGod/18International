package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM30 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM30.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM30.result result) {
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
        private String LM30;
        private String LM30_0;

        public String getLM30() {
            return LM30;
        }

        public void setLM30(String LM30) {
            this.LM30 = LM30;
        }

        public String getLM30_0() {
            return LM30_0;
        }

        public void setLM30_0(String LM30_0) {
            this.LM30_0 = LM30_0;
        }
    }
}
