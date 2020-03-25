package oop;

/*
 * 通常情况下，一个类并不能直接使用，需要根据类创建一个对象才能使用
 * 	1.导包：也就是指出需要使用的类，在什么位置
 * 		对于和当前类属于同一个包的情况，省略导包语句
 * 	2.创建，格式：
 * 		类名称 对象名 = new 类名称()；
 * 		Student stu = new Student();
 * 	3.使用：分为两种情况：
 * 		使用成员变量：对象名.成员变量名
 * 		使用成员方法：对象名.成员方法名（参数）
 * 		也就是，想用谁，就用对象名.谁
 * 
 */
public class Demo02Student {
	public static void main(String[] args) {
		//1.导包，此处省略
		//2.创建
		Student stu = new Student();
		//3.使用
		System.out.println(stu.age);
		System.out.println(stu.name);
		
		//改变对象当中成员变量的数值内容
		stu.age = 20;
		stu.name = "xxs";
		
		System.out.println("------");
		
		System.out.println(stu.age);
		System.out.println(stu.name);
		
		System.out.println("------");
		
		//4.使用对象的成员方法
		stu.sleep();
		stu.study();
	}
}
