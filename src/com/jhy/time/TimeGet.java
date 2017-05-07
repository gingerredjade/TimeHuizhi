package com.jhy.time;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;


/**
 * 该类负责使用Java新API获取年月日时分秒
 * @author PhantomJiang
 *
 */
public class TimeGet {

	public void getTimeByDate() {
		Date date = new Date();
		// 日期格式，精确到日
		DateFormat df1 = DateFormat.getDateInstance(); 
		System.out.println(df1.format(date));
		
		// 日期格式，精确到时分秒
		DateFormat df2 = DateFormat.getDateTimeInstance();
		System.out.println(df2.format(date));
		
		// 日期格式，只显示出时分秒
		DateFormat df6 = DateFormat.getTimeInstance();
		System.out.println(df6.format(date));
		
		// 日期格式，显示日期、周、上下午，时间（精确到秒）
		DateFormat df3 = DateFormat.getDateTimeInstance(DateFormat.FULL,DateFormat.FULL);
		System.out.println(df3.format(date));
		
		// 日期格式，显示日期、上下午，时间（精确到秒）
		DateFormat df4 = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.LONG);
		System.out.println(df4.format(date));
		
		// 日期格式，显示日期、上下午，时间（精确到分）
		DateFormat df5 = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
		System.out.println(df5.format(date));
		
		// 日期格式，显示日期，时间（精确到分）
		DateFormat df7 = DateFormat.getDateTimeInstance(DateFormat.MEDIUM,DateFormat.MEDIUM);
		System.out.println(df7.format(date));
		
	}
	
	public void getTimeByCalendar() {
		Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);//获取年份
        int month=cal.get(Calendar.MONTH);//获取月份 
        int day=cal.get(Calendar.DATE);//获取日 
        int hour=cal.get(Calendar.HOUR);//小时 
        int minute=cal.get(Calendar.MINUTE);//分            
        int second=cal.get(Calendar.SECOND);//秒 
        int WeekOfYear = cal.get(Calendar.DAY_OF_WEEK);//一周的第几天
        System.out.println("现在的时间是：公元"+year+"年"+month+"月"+day+"日      "+hour+"时"+minute+"分"+second+"秒       星期"+WeekOfYear);
	}
	
	public static void main(String[] args) {
		TimeGet tg = new TimeGet();
		tg.getTimeByDate();
        System.out.println("****************************");
        tg.getTimeByCalendar();
	}
}
