package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM8 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM8.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM8.result result) {
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
        private String LM8;
        private String LM8_0;

        public String getLM8() {
            return LM8;
        }

        public void setLM8(String LM8) {
            this.LM8 = LM8;
        }

        public String getLM8_0() {
            return LM8_0;
        }

        public void setLM8_0(String LM8_0) {
            this.LM8_0 = LM8_0;
        }
    }
}
