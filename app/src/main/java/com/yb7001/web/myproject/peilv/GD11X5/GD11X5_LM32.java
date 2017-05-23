package com.yb7001.web.myproject.peilv.GD11X5;

/**
 * Created by jy on 16/12/31.
 */

public class GD11X5_LM32 {
    private String status;
    private String tip;
    private result result;

    public GD11X5_LM32.result getResult() {
        return result;
    }

    public void setResult(GD11X5_LM32.result result) {
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
        private String LM32;
        private String LM32_0;

        public String getLM32() {
            return LM32;
        }

        public void setLM32(String LM32) {
            this.LM32 = LM32;
        }

        public String getLM32_0() {
            return LM32_0;
        }

        public void setLM32_0(String LM32_0) {
            this.LM32_0 = LM32_0;
        }
    }
}
