package concept_of_interface;

/**
 * 1.接口的默认方法可以通过接口实现类对象，直接调用
 * 2.接口的默认方法也可以被接口实现类进行覆盖重写
 * 
 * @author Owen
 *
 */

public class Demo02Interface {
	
	public static void main(String[] args) {
		MyInterfaceDefaultA a = new MyInterfaceDefaultA();
		a.methodAbs();
		//调用默认方法，如果实现类中没有，会向上找接口
		a.methodDefault();
		
		MyInterfaceDefaultB b = new MyInterfaceDefaultB();
		b.methodAbs();
		b.methodDefault();
	}
	
}
