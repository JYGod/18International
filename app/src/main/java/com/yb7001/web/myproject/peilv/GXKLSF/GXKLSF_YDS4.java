package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDS4 {
    private String status;
    private String tip;
    private result result;

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public GXKLSF_YDS4.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDS4.result result) {
        this.result = result;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class result {
        private String YDS4_D;
        private String YDS4_S;

        public String getYDS4_D() {
            return YDS4_D;
        }

        public void setYDS4_D(String YDS4_D) {
            this.YDS4_D = YDS4_D;
        }

        public String getYDS4_S() {
            return YDS4_S;
        }

        public void setYDS4_S(String YDS4_S) {
            this.YDS4_S = YDS4_S;
        }
    }
}
