package date;

import java.util.Date;

public class Demo02Date {

	public static void main(String[] args) {
		demo01();
		demo02();
		demo03();
	}
	
	/*
	 * Date类的空参数构造方法
	 * Date() 获取当前系统的日期和时间
	 */
	private static void demo01() {
		Date date = new Date();
		System.out.println(date); //Tue Feb 18 14:57:22 GMT+08:00 2020
	}
	
	/*
	 * Date(long date)把毫秒转成对应的日期
	 */
	private static void demo02() {
		Date date = new Date(1582009287223L);
		System.out.println(date);
	}
	
	/*
	 * getTime()方法：当前日期距离1970.1.1 0点时刻的毫秒数
	  *  相当于System.out.println(System.currentTimeMillis())方法
	 */
	private static void demo03() {
		Date date = new Date();
		System.out.println(date.getTime());
	}
	
}
