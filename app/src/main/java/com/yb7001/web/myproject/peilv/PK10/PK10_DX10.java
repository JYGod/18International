package com.yb7001.web.myproject.peilv.PK10;

/**
 * Created by jy on 16/12/20.
 */

public class PK10_DX10 {
    private String status;
    private String tip;
    private result result;

    public PK10_DX10.result getResult() {
        return result;
    }

    public void setResult(PK10_DX10.result result) {
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
        private String DX10_D;
        private String DX10_X;

        public String getDX10_D() {
            return DX10_D;
        }

        public void setDX10_D(String DX10_D) {
            this.DX10_D = DX10_D;
        }

        public String getDX10_X() {
            return DX10_X;
        }

        public void setDX10_X(String DX10_X) {
            this.DX10_X = DX10_X;
        }
    }
}
