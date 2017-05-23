package com.yb7001.web.myproject.peilv.KL8;

/**
 * Created by jy on 16/12/27.
 */

public class KL8_WX {
    private String status;
    private String tip;
    private result result;

    public KL8_WX.result getResult() {
        return result;
    }

    public void setResult(KL8_WX.result result) {
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

    public static class result{
        private String WX_0;
        private String WX_1;
        private String WX_2;
        private String WX_3;
        private String WX_4;

        public String getWX_0() {
            return WX_0;
        }

        public void setWX_0(String WX_0) {
            this.WX_0 = WX_0;
        }

        public String getWX_1() {
            return WX_1;
        }

        public void setWX_1(String WX_1) {
            this.WX_1 = WX_1;
        }

        public String getWX_2() {
            return WX_2;
        }

        public void setWX_2(String WX_2) {
            this.WX_2 = WX_2;
        }

        public String getWX_3() {
            return WX_3;
        }

        public void setWX_3(String WX_3) {
            this.WX_3 = WX_3;
        }

        public String getWX_4() {
            return WX_4;
        }

        public void setWX_4(String WX_4) {
            this.WX_4 = WX_4;
        }
    }
}
