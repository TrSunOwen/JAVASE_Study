package Polymorphism;

/*
 * 代码中体现多态性：父类引用指向子类对象
 * 格式：
 * 父类名称 对象名 = new 子类名称();
 * 或者
 * 接口名称 对象名 = new 实现类名称();
 */

public class Demo01Poly {

	public static void main(String[] args) {
		//使用多态的写法 		父类名称 对象名 = new 子类名称();
		Fu obj = new Zi();
		
		obj.method();
//		obj.methodFu();
	}
	
}
