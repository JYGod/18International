package com.yb7001.web.myproject.peilv.KL8;

/**
 * Created by jy on 16/12/27.
 */

public class KL8_DXDS {
    private String status;
    private String tip;
    private result result;

    public KL8_DXDS.result getResult() {
        return result;
    }

    public void setResult(KL8_DXDS.result result) {
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
        private String DXDS_XS;
        private String DXDS_XD;
        private String DXDS_DS;
        private String DXDS_DD;

        public String getDXDS_DD() {
            return DXDS_DD;
        }

        public void setDXDS_DD(String DXDS_DD) {
            this.DXDS_DD = DXDS_DD;
        }

        public String getDXDS_DS() {
            return DXDS_DS;
        }

        public void setDXDS_DS(String DXDS_DS) {
            this.DXDS_DS = DXDS_DS;
        }

        public String getDXDS_XD() {
            return DXDS_XD;
        }

        public void setDXDS_XD(String DXDS_XD) {
            this.DXDS_XD = DXDS_XD;
        }

        public String getDXDS_XS() {
            return DXDS_XS;
        }

        public void setDXDS_XS(String DXDS_XS) {
            this.DXDS_XS = DXDS_XS;
        }
    }
}
