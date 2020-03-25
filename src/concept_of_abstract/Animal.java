package concept_of_abstract;

/**
 * 抽象方法：加上abstract关键字，然后去掉大括号，直接分号结束
 * 抽象类：抽象方法所在的类必须是抽象类，在class之前写上abstract即可
 * 
 * 如何使用抽象类和抽象方法：
 * 1.不能直接创建new抽象类对象
 * 2.必须用一个子类来继承抽象父类
 * 3.子类必须覆盖重写抽象父类中所以的抽象方法
 * 覆盖重写（实现）：去掉抽象方法的abstract关键字然后补上方法体大括号
 * 4.创建子类对象进行使用
 * 
 * @author Owen
 *
 */

public abstract class Animal {

	//这是一个抽象方法，代表eat，但是具体吃什么，怎么吃（大括号的内容）不确定
	public abstract void eat();
	
	//普通成员方法
	public void normalMethod() {
		
	}
	
}
