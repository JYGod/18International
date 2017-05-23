package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM3 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM3.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM3.result result) {
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
        private String LM3;
        private String LM3_0;

        public String getLM3() {
            return LM3;
        }

        public void setLM3(String LM3) {
            this.LM3 = LM3;
        }

        public String getLM3_0() {
            return LM3_0;
        }

        public void setLM3_0(String LM3_0) {
            this.LM3_0 = LM3_0;
        }
    }
}
