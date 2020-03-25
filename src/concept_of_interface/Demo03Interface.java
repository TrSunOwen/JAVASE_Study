package concept_of_interface;

/**
 * 注意：不能通过接口实现类的对象来调用接口中的静态方法
 * 正确方法：通过接口名称，直接调用静态方法
 * 格式：
 * 接口名称.静态方法名（参数）;
 * @author Owen
 *
 */

public class Demo03Interface {

	public static void main(String[] args) {
//		//创建了实现类对象（错误写法）
//		MyInterfaceStaticImplement impl = new MyInterfaceStaticImplement();
//		//错误写法
//		impl.methodStatic();//无这个方法
		
		//正确调用方式
		MyInterfaceStatic.methodStatic();
	}
	
}
