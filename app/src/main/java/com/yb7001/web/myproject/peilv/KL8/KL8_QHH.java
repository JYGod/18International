package com.yb7001.web.myproject.peilv.KL8;

/**
 * Created by jy on 16/12/27.
 */

public class KL8_QHH {
    private String status;
    private String tip;
    private result result;

    public KL8_QHH.result getResult() {
        return result;
    }

    public void setResult(KL8_QHH.result result) {
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
        private String QHH_Q;
        private String QHH_H;
        private String QHH_T;

        public String getQHH_H() {
            return QHH_H;
        }

        public void setQHH_H(String QHH_H) {
            this.QHH_H = QHH_H;
        }

        public String getQHH_Q() {
            return QHH_Q;
        }

        public void setQHH_Q(String QHH_Q) {
            this.QHH_Q = QHH_Q;
        }

        public String getQHH_T() {
            return QHH_T;
        }

        public void setQHH_T(String QHH_T) {
            this.QHH_T = QHH_T;
        }
    }
}
