package keyword_final;

/*
 * 当final关键字用来修饰一个类的时候，格式：
 * public final class 类名称{}
 * 含义：当前这个类不能有任何子类！
 * 注意：final类无法进行覆盖重写（因为不能有任何子类！）但是可以覆盖重写final类的父类！
 */

public final class MyClass {

	public void method() {
		System.out.println("方法执行");
	}
	
}
