package concept_of_interface;

/**
 * 接口可以定义抽象方法
 * 格式：
 * public abstract 返回值类型 方法名称（参数列表）
 * 
 * 注意事项：
 * 1.接口中的抽象方法，修饰符必须是public abstract
 * 2.这两个关键字修饰符可以选择性省略
 * @author Owen
 *
 */

public interface MyInterfaceAbstract {

	//这是一个抽象方法
	public abstract void methodAbs1();
	
	//这也是抽象方法
	abstract void methodAbs2();
	
	//这也是抽象方法
	public void methodAbs3();
	
	//这也是抽象方法
	void methodAbs4();
	
}
