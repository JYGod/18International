package com.yb7001.web.myproject.service;


public class BaseWCFService {
    protected static final String NameSpace = "http://tempuri.org/";
    protected static final String URL = "http://58.64.202.166:8080/YBService/YbWCFServices.svc";
    protected static final String SOAP_ACTION = "http://tempuri.org/IAndroidService/ValidateLogin";
    protected static final String Method = "ValidateLogin";
    // 判断当前网络是否是net，true为net，false为wap
    public static boolean isGprsNet() {
        String proxyHost = android.net.Proxy.getDefaultHost();
        return proxyHost == null;
    }

}
