package concept_of_interface;

/**
 * 接口使用步骤：
 * 1.接口不能直接使用，必须先有一个实现类来实现该接口
 * 2.格式：public class 实现类名称 implements 接口名称
 * 3.接口的实现类必须覆盖重写接口中所有的抽象方法
 *   实现方法：去掉abstract关键字，加上方法体大括号
 * 4.创建实现类的对象，进行使用
 * @author Owen
 *
 */

public class Demo01Interface {
	
	public static void main(String[] args) {
		//创建实现类的对象使用
		MyInterfaceAbstractImplement imp = new MyInterfaceAbstractImplement();
		imp.methodAbs1();
		imp.methodAbs2();
		imp.methodAbs3();
		imp.methodAbs4();
	}

}
