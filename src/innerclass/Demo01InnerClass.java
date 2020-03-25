package innerclass;

/*
 * 如果一个事物的内部包含另一个事物，那么就是一个类内部包含另一个类
 * 例如：身体和心脏的关系；汽车和发动机的关系
 * 
 * 分类：
 * 1.成员内部类
 * 2.局部内部类（包含匿名内部类）
 * 
 * 成员内部类定义格式：
 * 修饰符 class 类名称{
 * 	修饰符 class 类名称{
 * 
 * 	}
 * }
 * 
 * 注意：内部类用外部类可以随意访问；但是外部类用内部类必须借助内部类对象
 * 
 * ================================================================
 * 如何使用成员内部类？两种方式：
 * 1.间接方式：在外部类的方法中，使用内部类；然后main只是调用外部类的方法
 * 2.直接方式：公式
 * 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
 */

public class Demo01InnerClass {

	public static void main(String[] args) {
		//间接方式
		Body body = new Body();//外部类对象
		//通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
		body.methodBody();
		
		System.out.println("===========");
		
		//直接方式
		Body.Heart heart = new Body().new Heart();
		heart.beat();
	}
	
}
