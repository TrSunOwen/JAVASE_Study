package Polymorphism;

/*
 * 向上转型一定是安全的，没有问题的。但是有个弊端：
 * 一旦向上转型为父类，就无法调用子类特有方法
 * 
 * 解决方案：用对象的向下转型【还原】
 * 
 * 对象向下转型：
 * 子类名称 对象名 = （子类名称）父类对象；
 * 含义：将父类对象还原成原来的子类对象
 */

public class Demo04Main {

	public static void main(String[] args) {
		//对象的向上转型就是：父类引用指向子类对象
		Animal animal = new Cat();//本来创建的时候是一只猫，却被当成了animal
		animal.eat();//猫吃鱼
		
//		animal.catchMouse();//一旦向上转型为父类，就无法调用子类特有方法
		
		//向下转型，进行【还原】动作
		Cat cat = (Cat) animal;
		cat.catchMouse();//猫捉老鼠
		
		//下面是错误的向下转型
		//本来new的时候是只猫，现在非要当成狗
//		Dog dog = (Dog) animal;//错误写法，编译不会报错，但是有运行异常（类转换异常）
	}
	
}
