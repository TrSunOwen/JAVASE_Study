package concept_of_interface;

/**
 * JAVA9的新特性,JDK1.8不能用
 * 问题描述：
 * 我们需要抽取一个公共方法，用来解决两个默认方法之间重复代码的问题
 * 但是这个共有方法不应该让实现类使用，应该是私有化的
 * 
 * @author Owen
 *
 */

public interface MyInterfacePrivateA {
	
	public default void methodDefault1() {
		System.out.println("默认方法1");
		methodSame();
	}
	
	public default void methodDefault2() {
		System.out.println("默认方法2");
		methodSame();
	}
	
	public default void methodSame() {
		System.out.println("AAA");
		System.out.println("BBB");
	}
	
}
