package innerclass;

/*
 * 如果接口的实现类或者父类的子类只需要使用唯一的一次，那么这种情况下就可以省略掉该类的定义，而改为使用【匿名内部类】
 * 
 * 匿名内部类定义格式：
 * 接口名称 对象名 = new 接口名称() {
 * 		覆盖重写所有抽象方法
 * };
 * 
 * 注意事项：
 * 对格式进行解析"new 接口名称() {...}"
 * 1.new代表创建对象的动作
 * 2.接口名称就是匿名内部类需要实现哪些接口
 * 3.{...}这才是匿名内部类的内容
 * 
 * 另外需要注意几点：
 * 1.匿名内部类在【创建对象】的时候只能使用唯一一次。如果希望多次创建对象，而且类的内容一样的话，那么就必须使用单独定义的实现类。
 * 2.匿名对象，在【调用方法】的时候只能调用唯一一次。如果希望同一个对象，调用多次方法，那么必须给对象取个名字。
 * 3.匿名内部类是省略了【实现类/子类】，匿名对象是省略了【对象名称】。强调：匿名内部类和匿名对象不是一回事！！！
 */

public class DemoMain2 {

	public static void main(String[] args) {
//		MyInterfaceImpl impl = new MyInterfaceImpl();
//		impl.method();
		
		//使用匿名内部类，但不是匿名对象，对象名称就叫ObjA
		MyInterface objA = new MyInterface() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法1A！");
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法2A！");
			}
		};
		objA.method1();
		objA.method2();
		
		System.out.println("=====================");
		
		//使用了匿名内部类，而且省略了对象名称，也是匿名对象
		new MyInterface() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法1B！");
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法2B！");
			}
		}.method1();
		//因为匿名对象无法调用第二次方法，所以需要再创建一个匿名内部类的匿名对象
		new MyInterface() {
			@Override
			public void method1() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法1B！");
			}
			
			@Override
			public void method2() {
				// TODO Auto-generated method stub
				System.out.println("匿名内部类实现了方法2B！");
			}
		}.method2();
	}
	
}
