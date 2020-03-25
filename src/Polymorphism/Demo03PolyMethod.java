package Polymorphism;

/*
 * 在多态代码中，成员方法的访问规则是：
 * 看new的是谁，优先用谁，没有则向上找
 * 
 * 口诀：编译看左边，运行看右边
 * 
 * 对比一下：
 * 成员变量：编译看左边，运行还看左边
 */

public class Demo03PolyMethod {

	public static void main(String[] args) {
		Fu obj = new Zi();
		
		obj.method();//父子都有，先用子
		obj.methodFu();//子类没有，父类有，向上找到父类
		
		//编译看左边，左边是Fu，Fu当中没有methodZi方法，所以编译报错
		
//		obj.methodZi();//错误写法！
	}
	
}
