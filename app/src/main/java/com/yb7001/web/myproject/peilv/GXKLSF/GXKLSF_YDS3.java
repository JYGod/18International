package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YDS3 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YDS3.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YDS3.result result) {
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
        private String YDS3_D;
        private String YDS3_S;

        public String getYDS3_D() {
            return YDS3_D;
        }

        public void setYDS3_D(String YDS3_D) {
            this.YDS3_D = YDS3_D;
        }

        public String getYDS3_S() {
            return YDS3_S;
        }

        public void setYDS3_S(String YDS3_S) {
            this.YDS3_S = YDS3_S;
        }
    }
}
