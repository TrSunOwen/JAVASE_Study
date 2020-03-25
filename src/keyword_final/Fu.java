package keyword_final;

/*
 * 当final关键字用来修饰方法的时候，这个方法就是最终方法，不能被覆盖重写了
 * 格式：
 * 修饰符 final 返回值类型 方法名称（参数列表）{}
 * 
 * 注意事项：
 * 对于类和方法来说，abstract和final不能同时使用，因为矛盾
 */

public class Fu {

	public final void method() {
		System.out.println("父类方法");
	}
	
}
