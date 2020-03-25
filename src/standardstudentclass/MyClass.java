package standardstudentclass;

/*
 * 一旦使用static修饰成员方法，那么这就成了静态方法
 * 静态方法不属于对象，而属于类的！
 * 如果没有static关键字那么必须首先创建对象，然后通过对象才能使用
 * 如果有static关键字，那么不需要创建对象，直接就能通过类名称来使用它
 * 
 * 无论是成员变量还是成员方法，如果有了static，都推荐使用类名称来调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法（）
 * 
 * 注意：
 * 1.静态不能直接访问非静态
 * 	因为在内存中先有静态内容，后有非静态内容
 * 	“先人不知道后人，但是后人知道前人”
 * 2.静态方法中不能写this
 * 	this代表当前对象，通过谁调用的方法，谁就是当前对象
 */

public class MyClass {
	
	int num;//成员变量
	static int numStatic;//静态变量
	
	//成员方法
	public void method() {
		System.out.println("这是一个普通的成员方法！");
		//成员方法可以访问成员变量
		System.out.println(num);
		//成员方法可以访问静态变量
		System.out.println(numStatic);
	}
	
	//静态
	public static void methodStatic() {
		System.out.println("这是一个静态方法！");
		//静态方法无法访问非静态变量【重点！】
//		System.out.println(num);//错误写法
		//静态方法访问静态变量
		System.out.println(numStatic);
		
		//静态方法中不能使用this关键字
//		System.out.println(this);//错误写法！
	}
	
}
