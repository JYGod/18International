package com.yb7001.web.myproject.bean;

import java.util.List;

public class BetResult {
    private String status;
    private String tip;
    private Result result;

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

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public class Result{
        private String message;
        private List<String> ids;
        private List<String> odds;
        private String status;
        private Account account;

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<String> getIds() {
            return ids;
        }

        public void setIds(List<String> ids) {
            this.ids = ids;
        }

        public List<String> getOdds() {
            return odds;
        }

        public void setOdds(List<String> odds) {
            this.odds = odds;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Account getAccount() {
            return account;
        }

        public void setAccount(Account account) {
            this.account = account;
        }

        public class Account{
            private String balance;
            private String betting;
            private String freeze;

            public String getBalance() {
                return balance;
            }

            public void setBalance(String balance) {
                this.balance = balance;
            }

            public String getBetting() {
                return betting;
            }

            public void setBetting(String betting) {
                this.betting = betting;
            }

            public String getFreeze() {
                return freeze;
            }

            public void setFreeze(String freeze) {
                this.freeze = freeze;
            }
        }
    }
}
