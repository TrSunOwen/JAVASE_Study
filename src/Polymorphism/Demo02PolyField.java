package Polymorphism;

/*
 * 访问成员变量的两种方式：
 * 1.直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
 * 2.间接通过成员方法访问成员变量：看该方法属于谁，优先用谁，没有则向上找
 */

public class Demo02PolyField {

	public static void main(String[] args) {
		//直接通过对象名称访问成员变量：看等号左边是谁，优先用谁，没有则向上找
		Fu2 obj = new Zi2();
		System.out.println(obj.num);
		
		System.out.println("=====");
		
		//间接通过成员方法访问成员变量
		obj.showNum();
	}
	
}
