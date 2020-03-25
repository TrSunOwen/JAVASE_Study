package encapsulation02;

/*
 * 	当方法的局部变量和类的成名变量重名时，根据就近原则，优先使用局部变量。
 * 	如果需要访问本类中的成员变量，需要使用格式：this.成员变量名
 * 	口诀通过谁调用的方法，谁就是this。
 */

public class Person {
	String name;//我自己的名字
	
	//who是对方名字
	//name是自己的名字
	public void sayHello(String name) {
		System.out.println(name + "你好， 我是" + this.name);
//		System.out.println(this);//地址值
	}
}