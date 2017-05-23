package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM2 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM2.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM2.result result) {
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
        private String LM2;
        private String LM2_0;

        public String getLM2() {
            return LM2;
        }

        public void setLM2(String LM2) {
            this.LM2 = LM2;
        }

        public String getLM2_0() {
            return LM2_0;
        }

        public void setLM2_0(String LM2_0) {
            this.LM2_0 = LM2_0;
        }
    }
}
