package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDS1 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDS1.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDS1.result result) {
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
        private String YDS1_D;
        private String YDS1_S;

        public String getYDS1_D() {
            return YDS1_D;
        }

        public void setYDS1_D(String YDS1_D) {
            this.YDS1_D = YDS1_D;
        }

        public String getYDS1_S() {
            return YDS1_S;
        }

        public void setYDS1_S(String YDS1_S) {
            this.YDS1_S = YDS1_S;
        }
    }
}
