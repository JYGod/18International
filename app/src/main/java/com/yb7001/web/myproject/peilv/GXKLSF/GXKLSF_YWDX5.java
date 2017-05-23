package com.yb7001.web.myproject.peilv.GXKLSF;

/**
 * Created by jy on 16/12/31.
 */

public class GXKLSF_YWDX5 {
    private String status;
    private String tip;
    private result result;

    public GXKLSF_YWDX5.result getResult() {
        return result;
    }

    public void setResult(GXKLSF_YWDX5.result result) {
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
        private String YWDX5_D;
        private String YWDX5_X;

        public String getYWDX5_D() {
            return YWDX5_D;
        }

        public void setYWDX5_D(String YWDX5_D) {
            this.YWDX5_D = YWDX5_D;
        }

        public String getYWDX5_X() {
            return YWDX5_X;
        }

        public void setYWDX5_X(String YWDX5_X) {
            this.YWDX5_X = YWDX5_X;
        }
    }
}
