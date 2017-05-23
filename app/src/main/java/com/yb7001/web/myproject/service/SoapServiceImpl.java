package com.yb7001.web.myproject.service;


import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;
import org.xmlpull.v1.XmlPullParserException;

import java.io.IOException;

public class SoapServiceImpl extends BaseWCFService implements ISoapService{
    private static final String NameSpace = "http://tempuri.org/";
    public static final String URL = "http://58.64.202.165/Services/YbWCFServices.svc";
    private static final String SOAP_ACTION = "http://tempuri.org/IYbWCFServices/";
    private SoapPrimitive result;

    // 判断当前网络是否是net，true为net，false为wap
    public static boolean isGprsNet() {
        String proxyHost = android.net.Proxy.getDefaultHost();
        return proxyHost == null;
    }
    @Override
    public String validateLogin(String userId, String password) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodValidateLogin);
        soapObject.addProperty("userId", userId);
        soapObject.addProperty("password", password);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {
            trans.call(SOAP_ACTION + WCFConstants.getMethodValidateLogin, envelope);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString+ "";
        }
    }

    public String loadLotteryTypes(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLotteryTypes);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLotteryTypes, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadLotteryInfoService(String lotteryCode, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLotteryInfo);
        soapObject.addProperty("lotteryCode", lotteryCode);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLotteryInfo, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String registerService(String account, String password, String userEmail, String userTel) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodRegister);
        soapObject.addProperty("account", account);
        soapObject.addProperty("password", password);
        soapObject.addProperty("userEmail", userEmail);
        soapObject.addProperty("userTel", userTel);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodRegister, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String loadMoneyInfoService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadMoneyInfo);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadMoneyInfo, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String loadLotteryHistoryService(String lotteryCode, String searchStartTime, String searchEndTime, int pageSize, int pageIndex, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLotteryHistory);
        soapObject.addProperty("lotteryCode", lotteryCode);
        soapObject.addProperty("searchStartTime", searchStartTime);
        soapObject.addProperty("searchEndTime", searchEndTime);
        soapObject.addProperty("pageSize", pageSize);
        soapObject.addProperty("pageIndex", pageIndex);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLotteryHistory, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return null;
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String loadUserBankInfoService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserBankInfo);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserBankInfo, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String loadDepositService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadDeposit);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadDeposit, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";

        }
    }
    @Override
    public String bindUserBankService(String userName, String bankName, String bankNumber, String moneyPwd, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodBindUserBank);
        soapObject.addProperty("userName", userName);
        soapObject.addProperty("bankName", bankName);
        soapObject.addProperty("bankNumber", bankNumber);
        soapObject.addProperty("moneyPwd", moneyPwd);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodBindUserBank, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String bindUserInfoService(String userName, String userQQ, String userEmail, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodBindUserInfo);
        soapObject.addProperty("userName", userName);
        soapObject.addProperty("userQQ", userQQ);
        soapObject.addProperty("userEmail", userEmail);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodBindUserInfo, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String bindUserAddressService(String address, String realUserName, String userTel, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodBindUserAddress);
        soapObject.addProperty("address", address);
        soapObject.addProperty("realUserName", realUserName);
        soapObject.addProperty("userTel", userTel);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodBindUserAddress, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }
    @Override
    public String loadUserInfoService(String token) {
        System.out.println("====网络访问类型==========?" + isGprsNet());
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserInfo);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        System.out.println("=======soapObject======请求数据==" + soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserInfo, envelope);
            System.out.println("=============请求数据==" + trans.requestDump);

            System.out.println("=============响应数据==" + trans.responseDump);

            System.out.println("=============getServiceConnection==" + trans.getServiceConnection());

            System.out.println("请求成功------------Successful!");
            result = (SoapPrimitive)envelope.getResponse();
        } catch (IOException e) {
            System.out.println("抛出异常------------IOException");
            System.out.println("抛出异常------------IOException" + e.getMessage());
            e.printStackTrace();

        } catch (XmlPullParserException e) {
            System.out.println("抛出异常------------XmlPullParserException");
            e.printStackTrace();
        }

        System.out.println("=======result========" + result);
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.toString();
            return resultString + "";
        }
    }
    @Override
    public String loadLastNoticeService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLastNotice);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLastNotice, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadNoticesService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadNotices);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadNotices, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String updateLoginPwdService(String oldLoginPwd, String newLoginPwd, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodUpdateLoginPwd);
        soapObject.addProperty("oldLoginPwd", oldLoginPwd);
        soapObject.addProperty("newLoginPwd", newLoginPwd);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodUpdateLoginPwd, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String updateMoneyPwdService(String oldMoneyPwd, String newMoneyPwd, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodUpdateMoneyPwd);
        soapObject.addProperty("token", token);
        soapObject.addProperty("oldMoneyPwd", oldMoneyPwd);
        soapObject.addProperty("newMoneyPwd", newMoneyPwd);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodUpdateMoneyPwd, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadUserReportService(String startTime, String endTime, int pageSize, int pageIndx, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserReport);
        soapObject.addProperty("startTime", startTime);
        soapObject.addProperty("endTime", endTime);
        soapObject.addProperty("pageSize", pageSize);
        soapObject.addProperty("pageIndx", pageIndx);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserReport, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadUserBetsService(String isSettle, int pageSize, int pageIndx, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserBets);
        soapObject.addProperty("isSettle", isSettle);
        soapObject.addProperty("pageSize", Integer.toString(pageSize));
        soapObject.addProperty("pageIndx", Integer.toString(pageIndx));
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserBets, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadLotteryGamesService(String template, String lotteryPan, String token) {
        System.out.println("====网络访问类型==========?" + isGprsNet());
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLotteryGames);
        soapObject.addProperty("template",template);
        soapObject.addProperty("lotteryPan",lotteryPan);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        System.out.println("=======soapObject======请求数据==" + soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLotteryGames, envelope);
            System.out.println("=============请求数据==" + trans.requestDump);

            System.out.println("=============响应数据==" + trans.responseDump);
            System.out.println("=============getServiceConnection==" + trans.getServiceConnection());

            System.out.println("请求成功------------Successful!");
            result = (SoapPrimitive) envelope.getResponse();

        } catch (IOException e) {
            System.out.println("抛出异常------------IOException");
            System.out.println("抛出异常------------IOException" + e.getMessage());
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            System.out.println("抛出异常------------XmlPullParserException");
            e.printStackTrace();
        }

       // System.out.println("=======result========" + result);
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.toString();
            return resultString + "";

        }
    }

    @Override
    public String loadLotteryPeilvService(String lotteryCode, String games,String lottery_pan, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadLotteryPeilv);
        soapObject.addProperty("lotteryCode", lotteryCode);
        soapObject.addProperty("games", games);
        soapObject.addProperty("lottery_pan",lottery_pan);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadLotteryPeilv, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String saveUserBetService(String bet, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodSaveUserBet);
        soapObject.addProperty("bet", bet);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodSaveUserBet, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;
        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String cancelOrderService(String lotteryId, String orderId, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodCancelOrder);
        soapObject.addProperty("lotteryId", lotteryId);
        soapObject.addProperty("orderId", orderId);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodCancelOrder, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadUserMessages(int pageSize, int pageIndex, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserMessages);
        soapObject.addProperty("pageSize", pageSize);
        soapObject.addProperty("pageIndex",pageIndex);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {
            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserMessages, envelope);
            result = (SoapPrimitive) envelope.getResponse();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.toString();
            return resultString + "";
        }
    }

    @Override
    public String loadUserMessageService(String messageId, String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserMessage);
        soapObject.addProperty("messageId", messageId);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserMessage, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }
    }

    @Override
    public String loadUserAddressService(String token) {
        SoapObject soapObject = new SoapObject(NameSpace, WCFConstants.getMethodLoadUserAddress);
        soapObject.addProperty("token", token);
        SoapSerializationEnvelope envelope = new SoapSerializationEnvelope(SoapEnvelope.VER11); // 版本
        envelope.bodyOut = soapObject;
        envelope.dotNet = true;
        envelope.setOutputSoapObject(soapObject);
        HttpTransportSE trans = new HttpTransportSE(URL);
        trans.debug = true; // 使用调试功能
        try {

            trans.call(SOAP_ACTION + WCFConstants.getMethodLoadUserAddress, envelope);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (XmlPullParserException e) {
            e.printStackTrace();
        }
        SoapObject result = (SoapObject) envelope.bodyIn;

        if (result == null) {
            return "请求数据失败！";
        } else {
            String resultString=result.getProperty(0).toString();
            return resultString + "";
        }

    }
}
