package oop;

/**
 * 定义一个类，用来模拟“学生”实物，其中有两个组成部分
 * 	属性
 * 		姓名
 * 		年龄
 * 	行为
 * 		吃饭
 * 		睡觉
 * 		上学
 * 
 * 对应到java的类中：
 * 	成员变量（属性）
 * 		String name;
 * 		int age;
 * 
 * 	成员方法（行为）无static关键字
 * 		public void eat(){};
 * 		public void sleep(){};
 * 		public void study(){};
 * 	
 * 注意事项：
 * 	1.成员变量是直接定义在类中的，在方法外面
 * 	2.成员方法不要写static关键字
 * @author Owen
 *
 */

public class Student {
	//成员变量
	String name;//姓名
	int age;//年龄
	
	//成员方法
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void study() {
		System.out.println("学习");
	}
}
