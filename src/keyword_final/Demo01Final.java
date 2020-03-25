package keyword_final;

/*
 * final关键字4种用法：
 * 1.修饰一个类
 * 2.修饰一个方法
 * 3.修饰一个局部变量
 * 4.修饰一个成员变量
 */

public class Demo01Final {
	
	public static void main(String[] args) {
		int num1 = 10;
		System.out.println(num1);
		num1 = 20;
		System.out.println(num1);
		
		//一旦使用final修饰局部变量，这个变量就无法更改
		//一次赋值，终生不变
		final int num2 = 200;
		System.out.println(num2);
		
		//错误写法
//		num2 = 250;
//		System.out.println(num2);
		//这也是错误写法
//		num2 = 200;
		
		//正确写法，只要保证唯一一次赋值即可
		final int num3;
		num3 = 30;
		
		//对于基本类型来说，不可变说的是变量中的数据不可改变
		//对于引用类型来说，不可变说的是变量中的地址值不可改变
		Student stu1 = new Student("xxs");
		System.out.println(stu1);//地址不同
		System.out.println(stu1.getName());//xxs
		
		stu1 = new Student("bbs");
		System.out.println(stu1);//地址不同
		System.out.println(stu1.getName());//bbs
		
		final Student stu2 = new Student("bbc");
		System.out.println(stu2.getName());//bbc
//		stu2 = new Student("cse");//错误写法！final的引用类型变量，其中的地址不可改变
		stu2.setName("erc");
		System.out.println(stu2.getName());//erc
	}
	
}
