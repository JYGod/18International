package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDX5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDX5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDX5.result result) {
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
        private String YDX5_D;
        private String YDX5_X;

        public String getYDX5_D() {
            return YDX5_D;
        }

        public void setYDX5_D(String YDX5_D) {
            this.YDX5_D = YDX5_D;
        }

        public String getYDX5_X() {
            return YDX5_X;
        }

        public void setYDX5_X(String YDX5_X) {
            this.YDX5_X = YDX5_X;
        }
    }
}
