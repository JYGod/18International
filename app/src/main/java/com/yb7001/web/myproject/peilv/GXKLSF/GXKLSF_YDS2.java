package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDS2 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDS2.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDS2.result result) {
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
        private String YDS2_D;
        private String YDS2_S;

        public String getYDS2_D() {
            return YDS2_D;
        }

        public void setYDS2_D(String YDS2_D) {
            this.YDS2_D = YDS2_D;
        }

        public String getYDS2_S() {
            return YDS2_S;
        }

        public void setYDS2_S(String YDS2_S) {
            this.YDS2_S = YDS2_S;
        }
    }
}
