package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM4 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM4.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM4.result result) {
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
        private String LM4;
        private String LM4_0;

        public String getLM4() {
            return LM4;
        }

        public void setLM4(String LM4) {
            this.LM4 = LM4;
        }

        public String getLM4_0() {
            return LM4_0;
        }

        public void setLM4_0(String LM4_0) {
            this.LM4_0 = LM4_0;
        }
    }
}
