package com.yb7001.web.myproject.peilv.KL8;

/**
 * Created by jy on 16/12/27.
 */

public class KL8_ZHT {
    private String status;
    private String tip;
    private result result;

    public KL8_ZHT.result getResult() {
        return result;
    }

    public void setResult(KL8_ZHT.result result) {
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
        private String ZHT_810;

        public String getZHT_810() {
            return ZHT_810;
        }

        public void setZHT_810(String ZHT_810) {
            this.ZHT_810 = ZHT_810;
        }
    }
}
