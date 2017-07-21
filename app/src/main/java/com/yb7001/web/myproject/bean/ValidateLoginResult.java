package com.yb7001.web.myproject.bean;


public class ValidateLoginResult {
    private String status;
    private String tip;
    private result result;

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

    public ValidateLoginResult.result getResult() {
        return result;
    }

    public void setResult(ValidateLoginResult.result result) {
        this.result = result;
    }

    public  static class result{
        public String lottery_pan;
        public String token;
        public String userName;
        public String useMoney;
        public String dongjieMoney;
        public String rebate;
        public String androidDownAddress;
        public String androidVersion;
        public String kefuQQ;
        public String kefuAddress;
        public String kefuTel;
        public String kefuEmail;
        public String appName;
        public String appIsStopBet;
        public String sysHelp;
        public String sysAddress;
        public String sysAbountUs;
        public String sysDepositUrl;

        public String getAndroidDownAddress() {
            return androidDownAddress;
        }

        public void setAndroidDownAddress(String androidDownAddress) {
            this.androidDownAddress = androidDownAddress;
        }

        public String getAndroidVersion() {
            return androidVersion;
        }

        public void setAndroidVersion(String androidVersion) {
            this.androidVersion = androidVersion;
        }

        public String getAppIsStopBet() {
            return appIsStopBet;
        }

        public void setAppIsStopBet(String appIsStopBet) {
            this.appIsStopBet = appIsStopBet;
        }

        public String getAppName() {
            return appName;
        }

        public void setAppName(String appName) {
            this.appName = appName;
        }

        public String getDongjieMoney() {
            return dongjieMoney;
        }

        public void setDongjieMoney(String dongjieMoney) {
            this.dongjieMoney = dongjieMoney;
        }

        public String getKefuAddress() {
            return kefuAddress;
        }

        public void setKefuAddress(String kefuAddress) {
            this.kefuAddress = kefuAddress;
        }

        public String getKefuEmail() {
            return kefuEmail;
        }

        public void setKefuEmail(String kefuEmail) {
            this.kefuEmail = kefuEmail;
        }

        public String getKefuQQ() {
            return kefuQQ;
        }

        public void setKefuQQ(String kefuQQ) {
            this.kefuQQ = kefuQQ;
        }

        public String getKefuTel() {
            return kefuTel;
        }

        public void setKefuTel(String kefuTel) {
            this.kefuTel = kefuTel;
        }

        public String getRebate() {
            return rebate;
        }

        public void setRebate(String rebate) {
            this.rebate = rebate;
        }

        public String getSysAbountUs() {
            return sysAbountUs;
        }

        public void setSysAbountUs(String sysAbountUs) {
            this.sysAbountUs = sysAbountUs;
        }

        public String getSysAddress() {
            return sysAddress;
        }

        public void setSysAddress(String sysAddress) {
            this.sysAddress = sysAddress;
        }

        public String getSysHelp() {
            return sysHelp;
        }

        public void setSysHelp(String sysHelp) {
            this.sysHelp = sysHelp;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getUseMoney() {
            return useMoney;
        }

        public void setUseMoney(String useMoney) {
            this.useMoney = useMoney;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

        public String getLottery_pan() {
            return lottery_pan;
        }

        public void setLottery_pan(String lottery_pan) {
            this.lottery_pan = lottery_pan;
        }

        public String getSysDepositUrl() {
            return sysDepositUrl;
        }

        public void setSysDepositUrl(String sysDepositUrl) {
            this.sysDepositUrl = sysDepositUrl;
        }
    }

}
