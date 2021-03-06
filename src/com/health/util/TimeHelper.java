package com.health.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class TimeHelper {
	public static final long MILLSEC_DAY = 1000 * 60 * 60 * 24;
	public static final String FORMAT = "yyyy/MM/dd HH:mm:ss";
	public static final String DATE_FORMAT = "yyyy/MM/dd";
	private static DateFormat formater = new SimpleDateFormat(FORMAT,Locale.CHINA);
	private static DateFormat Date_formater = new SimpleDateFormat(DATE_FORMAT,Locale.CHINA);

	/**
	 * 获取当前时间的字符串格式，示例：2013-11-25 10:43:52
	 * 
	 * @return
	 */
	public static String getCurrentTime() {
		return formater.format(new Date()).toString();
	}

	public static Date getCurrentDate() {
		return new Date();
	}

	/***
	 * 求beforeDays前的格式化日期
	 * 
	 * @param beforeDays
	 * @return
	 */
	public static String getBeforeTime(int beforeDays) {
		Date current = new Date();
		long longTime = current.getTime();
		Date beforeDate = new Date(longTime - MILLSEC_DAY * beforeDays);
		return formater.format(beforeDate).toString();
	}

	public static long parseTime(String stime) throws ParseException {
		return formater.parse(stime).getTime();
	}

	/***
	 * 长整型时间转化为字符串格式
	 * 
	 * @param lTime
	 * @return
	 */
	public static String getStringTime(long lTime) {
		return formater.format(new Date(lTime)).toString();
	}
	/***
	 * 长整型时间转化为字符串格式日期
	 * @param time
	 * @return
	 */
	public static String getStringDate(long time) {
		return Date_formater.format(new Date(time)).toString();
		
	}
}
