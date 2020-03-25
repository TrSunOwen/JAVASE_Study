package dateformat;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * java.text.DateFormat
 * DateFormat是抽象类，无法直接创建使用，可以使用它的直接已知子类SimpleDateFormat
 * 作用：格式化（日期-->文本） 解析（文本-->日期）
 * 成员方法：	format(Date date)
 * 			parse(String source)
 * 构造方法：SimpleDateFormat(String pattern) 传递指定格式
 */

public class Demo01DateFormat {

	public static void main(String[] args) {
		demo01();
	}
	
	/*
	 * 使用DateFormat类中的方法format，把日期格式化为文本
	 * 使用步骤：
	 * 1.创建SimpleDateFormat对象，构造方法中传递指定格式
	 * 2.调用SimpleDateFormat对象中的方法format
	 */
	private static void demo01() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD HH:mm:ss");
		Date date= new Date();
		String d = sdf.format(new Date());
		System.out.println(date);
		System.out.println(d);
	}
	
}
