package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM5 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM5.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM5.result result) {
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
        private String LM5;
        private String LM5_0;

        public String getLM5() {
            return LM5;
        }

        public void setLM5(String LM5) {
            this.LM5 = LM5;
        }

        public String getLM5_0() {
            return LM5_0;
        }

        public void setLM5_0(String LM5_0) {
            this.LM5_0 = LM5_0;
        }
    }
}
