package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDS5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDS5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDS5.result result) {
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
        private String YDS5_D;
        private String YDS5_S;

        public String getYDS5_D() {
            return YDS5_D;
        }

        public void setYDS5_D(String YDS5_D) {
            this.YDS5_D = YDS5_D;
        }

        public String getYDS5_S() {
            return YDS5_S;
        }

        public void setYDS5_S(String YDS5_S) {
            this.YDS5_S = YDS5_S;
        }
    }
}
