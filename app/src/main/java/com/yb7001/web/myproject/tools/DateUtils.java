package com.yb7001.web.myproject.tools;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DateUtils {

	/**
	 * 时间戳转为时间(年月日，时分秒)
	 *
	 * @param cc_time 时间戳
	 * @return
	 */
	public static String getStrTime(String cc_time) {
		String re_StrTime = null;
		//同理也可以转为其它样式的时间格式.例如："yyyy-MM-dd HH:mm"
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss");
		// 例如：cc_time=1291778220
		long lcc_time = Long.valueOf(cc_time);
		re_StrTime = sdf.format(new Date(lcc_time));
		return re_StrTime;
	}

	public static String getDeltTime(String closeTime){
		long minute;
		long second;
		long delt;
		String re_StrTime=null;
		String closeTime_s= DateUtils.getStrTime(closeTime);
		String currentTime=DateUtils.getCurrentTime();
		long currentTime_s=DateUtils.getTimeStamp(currentTime);
		delt=Long.parseLong(closeTime)-currentTime_s;
		 delt=delt/1000;
		 minute=delt/60;
		 second=delt-minute*60;
		String minuteString,secondString;
		if (minute<10){
			minuteString="0"+String.valueOf(minute);
		}else {
			minuteString=String.valueOf(minute);
		}
		if (second<10){
			secondString="0"+String.valueOf(second);
		}else {
			secondString=String.valueOf(second);
		}
		re_StrTime=minuteString+":"+secondString;
		return re_StrTime;
	}



	/**
	 * 时间转换为时间戳
	 *
	 * @param timeStr 时间 例如: 2016-03-09
	 * @return
	 */
	public static long getTimeStamp(String timeStr) {
		String format="yyyy-MM-dd  HH-mm-ss";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(format);
		Date date = null;
		try {
			date = simpleDateFormat.parse(timeStr);
			long timeStamp = date.getTime();
			return timeStamp;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return 0;
	}
	/**
	 * 获取当前时间
	 *
	 * @return
	 */
	public static String getCurrentTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH-mm-ss");
		return sdf.format(new java.util.Date());
	}

}