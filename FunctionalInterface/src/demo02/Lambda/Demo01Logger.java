package demo02.Lambda;

/*
 * 日志案例
 * 发现以下代码存在性能浪费问题
 * 调用showLog方法，传递的第二个参数是一个拼接后的字符串，先把字符串拼接好，再调用showLog方法
 * 如果传递等级不是1级，则不传递，感觉被浪费了拼接的字符串
 */

public class Demo01Logger {

	// 定义一个根据日志的级别，显示日志的方法
	public static void showLog(int level, String message) {
		// 对日志的等级进行判断，如果是1级别，输出日志
		if (level == 1) {
			System.out.println(message);
		}
	}
	
	public static void main(String[] args) {
		// 定义三个日志信息
		String msg1 = "Hello";
		String msg2 = "World";
		String msg3 = "Java";
		
		// 调用showLog方法，传递日志级别和日志信息
		showLog(1, msg1 + msg2 + msg3);
	}
	
}
