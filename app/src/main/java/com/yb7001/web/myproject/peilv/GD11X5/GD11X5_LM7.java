package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM7 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM7.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM7.result result) {
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
        private String LM7;
        private String LM7_0;

        public String getLM7() {
            return LM7;
        }

        public void setLM7(String LM7) {
            this.LM7 = LM7;
        }

        public String getLM7_0() {
            return LM7_0;
        }

        public void setLM7_0(String LM7_0) {
            this.LM7_0 = LM7_0;
        }
    }
}
