package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDX1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDX1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDX1.result result) {
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
        private String YDX1_D;
        private String YDX1_X;

        public String getYDX1_D() {
            return YDX1_D;
        }

        public void setYDX1_D(String YDX1_D) {
            this.YDX1_D = YDX1_D;
        }

        public String getYDX1_X() {
            return YDX1_X;
        }

        public void setYDX1_X(String YDX1_X) {
            this.YDX1_X = YDX1_X;
        }
    }
}
