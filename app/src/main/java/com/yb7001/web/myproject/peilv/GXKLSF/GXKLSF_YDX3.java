package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDX3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDX3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDX3.result result) {
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

    public static class result {
        private String YDX3_D;
        private String YDX3_X;

        public String getYDX3_D() {
            return YDX3_D;
        }

        public void setYDX3_D(String YDX3_D) {
            this.YDX3_D = YDX3_D;
        }

        public String getYDX3_X() {
            return YDX3_X;
        }

        public void setYDX3_X(String YDX3_X) {
            this.YDX3_X = YDX3_X;
        }
    }
}
