package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDX4 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDX4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDX4.result result) {
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
        private String YDX4_D;
        private String YDX4_X;

        public String getYDX4_D() {
            return YDX4_D;
        }

        public void setYDX4_D(String YDX4_D) {
            this.YDX4_D = YDX4_D;
        }

        public String getYDX4_X() {
            return YDX4_X;
        }

        public void setYDX4_X(String YDX4_X) {
            this.YDX4_X = YDX4_X;
        }
    }
}
