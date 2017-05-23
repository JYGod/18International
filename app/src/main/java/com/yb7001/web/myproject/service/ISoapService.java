package com.yb7001.web.myproject.service;


public interface ISoapService {
    String validateLogin(String userId, String password);//验证用户登录----登录成功后会返回用户的基本信息
    String loadLotteryTypes(String token);
    String loadLotteryInfoService(String lotteryCode, String token);
    String registerService(String account, String password, String userEmail, String userTel);//用户注册
    String loadMoneyInfoService(String token);//获取用户可用金额, 冻结金额, 返点.

    //开奖记录查询：根据彩种编码 查询时间 分页查询
    String loadLotteryHistoryService(String lotteryCode, String searchStartTime, String searchEndTime, int pageSize, int pageIndex, String token);
    String loadUserBankInfoService(String token);//获取用户的绑定银行资料
    String loadDepositService(String token);//获取系统的提供的充值银行资料

    // 用户绑定银行
    String bindUserBankService(String userName, String bankName, String bankNumber, String moneyPwd, String token);

    // 绑定用户信息
    String bindUserInfoService(String userName, String userQQ, String userEmail, String token);

    // 绑定用户地址 - 用来收礼物的
    String bindUserAddressService(String address, String realUserName, String userTel, String token);

    String loadUserInfoService(String token);// 获取用户信息
    String loadLastNoticeService(String token);// 获取最新公告信息明细
    String loadNoticesService(String token);// 获取系统所有的公告
    String updateLoginPwdService(String oldLoginPwd, String newLoginPwd, String token);// 修改登录密码
    String updateMoneyPwdService(String oldMoneyPwd, String newMoneyPwd, String token);// 修改资金密码

    // 获取用户报表
    String loadUserReportService(String startTime, String endTime, int pageSize, int pageIndx, String token);
    String loadUserBetsService(String isSettle, int pageSize, int pageIndx, String token);// 获取用户投注记录
    String loadLotteryGamesService(String template, String lotteryPan, String token);// 获取所有玩法信息
    String loadLotteryPeilvService(String lotteryCode, String games,String lottery_pan, String token);// 获取彩种赔率

    /**
     *
     *<param name="bet">用户的投注信息，使用Jon格式传入，</param>
      eg: 		    0:{game: "ZDX", contents: "X", amount: 1, odds: 1.988}
                    1:{game: "DX3", contents: "D", amount: 1, odds: 1.988}
     					  drawNumber:"20161111-055"
     					  lottery:"CQSSC"
     game:玩法编码 从【获取所有玩法信息】取得
     /// contents:玩法内容 从【获取所有玩法信息】取得
     /// amount: 投注金额
     /// odds:投注是的赔率。 从【获取彩种赔率中】取得。
     /// lottery:彩种编码。从【获取所有的彩种信息】取得
     /// drawNumber:当前期号。从【获取彩种基本信息】取得
     */
    String saveUserBetService(String bet, String token);// 保存用户投注信息
    String cancelOrderService(String lotteryId, String orderId, String token);// 用户撤单
    String loadUserMessages(int pageSize, int pageIndex, String token);// 获取用户消息
    String loadUserMessageService(String messageId, String token);// 获取单条的用户信息

    String loadUserAddressService(String token);

}