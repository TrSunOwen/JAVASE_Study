package extend;

/**
 * this关键字用来访问本类内容，用法有3种
 * 
 * 1.在本类的成员方法中，访问本类的成员变量
 * 2.在本类的成员方法中，访问本类的另一个成员方法
 * 3.在本类的构造方法中，访问本类的另一个构造方法
 * 在第三种方法中要注意：
 * A.this(...)调用也必须是构造方法的第一个语句
 * B.super和this两种构造调用不能同时使用，因为super和this必须都是第一个语句
 * 
 * @author Owen
 *
 */

public class Zi extends Fu{
	
	int num = 20;
	
	public Zi() {
//		super();//这一行不再赠送
		this(123);//本类的无参构造，调用本类的有参构造
//		this(1, 2);//错误写法，必须写为第一个语句
	}
	
	public Zi(int n) {
		
	}
	
	public Zi(int n, int m) {
		
	}
	
	public void showNum() {
		int num = 10;
		System.out.println(num);//局部变量
		System.out.println(this.num);//本类中的成员变量
		System.out.println(super.num);//父类中的成员变量
	}
	
	public void methodA() {
		System.out.println("AAA");
	}
	
	public void methodB() {
		this.methodA();
		System.out.println("BBB");
	}
	
}
