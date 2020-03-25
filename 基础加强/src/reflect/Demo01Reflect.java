package reflect;

import domain.Person;
import domain.Student;

public class Demo01Reflect {

	/*
	 * 获取Class对象的三种方式
			1.Class.forName("全类名") 将字节码文件加载进内存，返回Class对象
				多用于配置文件，将类名定义在配置文件中。读取文件，加载类
				
			2.类名.class: 通过类名的属性class获取
				多用于参数的传递
			
			3.对象.getClass(): Object中的方法
				多用于对象的获取字节码的方式
				
	 * Class对象功能：
	 		1.获取功能：获取成员变量们，构造方法们，成员方法们，获取类名
	 		Field	 getField(String name)
	 		Field[]	getFields()
	 		Field	 getDeclaredField(String name)
	 		Field[]	getDeclaredFields()
	 		
	 		Constructor<T>	getConstructor(Class<?>... parameterTypes)
	 		Constructor<?>[]	getConstructors()
	 		Constructor<T>	getDeclaredConstructor(Class<?>... parameterTypes)
	 		Constructor<?>[]	getDeclaredConstructors()
	 		
	 		Method	 getMethod(String name, Class<?>... parameterTypes)
	 		Method[]	getMethods()
	 		Method	 getDeclaredMethod(String name, Class<?>... parameterTypes)
	 		Method[]	getDeclaredMethods()
	 		
	 		String	getName()
	 */
	public static void main(String[] args) throws Exception {
		
		// 1.Class.forName("全类名")
		Class cl1 = Class.forName("domain.Person");
		System.out.println(cl1);
		
		// 2.类名.class: 通过类名的属性class获取
		Class cl2 = Person.class;
		System.out.println(cl2);
		
		// 3.对象.getClass(): Object中的方法
		Person p = new Person();
		Class cl3 = p.getClass();
		System.out.println(cl3);
		
		// == 去比较三个对象。说明都是指向了同一个对象
		System.out.println(cl1 == cl2); // true
		System.out.println(cl3 == cl2); // true
		System.out.println(cl3 == cl2); // true
		
		// 一个字节码文件对应一个class
		Class c = Student.class;
		System.out.println(c == cl1); // false
	}
	
}
