package Polymorphism;

/*
 * 如何知道一个父类引用的对象本来是什么子类？
 * 格式：
 * 对象名 instanceof 类型
 * 这将会的达到一个boolean结果，也就是判断前面的对象能不能当做后面类型的实例
 */

public class Demo05Instanceof {

	public static void main(String[] args) {
		Animal animal = new Cat();//本来是一只猫
		animal.eat();//猫吃鱼
		
		//如果调用子类特有方法，必须向下转型
		//判断父类引用animal本来是不是Dog
		if (animal instanceof Dog) {
			Dog dog = (Dog) animal;
			dog.guard();
		}
		//判断父类引用animal本来是不是Cat
		if (animal instanceof Cat) {
			Cat cat = (Cat) animal;
			cat.catchMouse();
		}
	}
	
}
