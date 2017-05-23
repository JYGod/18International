package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDX2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDX2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDX2.result result) {
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
        private String YDX2_D;
        private String YDX2_X;

        public String getYDX2_D() {
            return YDX2_D;
        }

        public void setYDX2_D(String YDX2_D) {
            this.YDX2_D = YDX2_D;
        }

        public String getYDX2_X() {
            return YDX2_X;
        }

        public void setYDX2_X(String YDX2_X) {
            this.YDX2_X = YDX2_X;
        }
    }
}
