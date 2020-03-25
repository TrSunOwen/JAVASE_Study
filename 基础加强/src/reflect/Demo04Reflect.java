package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import domain.Person;

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
 		Field	 getField(String name) 获取指定名称的public修饰的成员变量
 		Field[]	getFields() 获取所有public修饰的成员变量
 		Field	 getDeclaredField(String name) 获取指定名称的成员变量
 		Field[]	getDeclaredFields() 获取所有的成员变量
 		setAccessible(true) 忽略访问权限修饰符的安全检查，暴力反射
 		
 		Constructor<T>	getConstructor(Class<?>... parameterTypes)
 		Constructor<?>[]	getConstructors()
 		Constructor<T>	getDeclaredConstructor(Class<?>... parameterTypes)
 		Constructor<?>[]	getDeclaredConstructors()
 		newInstance()
 		
 		Method	 getMethod(String name, Class<?>... parameterTypes)
 		Method[]	getMethods()
 		Method	 getDeclaredMethod(String name, Class<?>... parameterTypes)
 		Method[]	getDeclaredMethods()
 		
 		String	getName()
 		
 * Field：成员变量
 		操作：
 			1.设置值set方法
 			2.获取值get方法
 */

public class Demo04Reflect {

	public static void main(String[] args) throws Exception {
		
		// 获取Person的Class对象
		Class personClass = Person.class;
		
		/*
		 *	Method	 getMethod(String name, Class<?>... parameterTypes)
 			Method[]	getMethods()
 			Method	 getDeclaredMethod(String name, Class<?>... parameterTypes)
 			Method[]	getDeclaredMethods()
 			获取方法名称 String getName()
			获取成员方法们
		 */
		Person p = new Person();
		// 获取指定成员方法
		Method eat_method1 = personClass.getMethod("eat");
		// 方法的执行
		eat_method1.invoke(p); // eat!
		
		Method eat_method2 = personClass.getMethod("eat", String.class);
		// 方法的执行
		eat_method2.invoke(p, "orange"); // eat orange!
		
		System.out.println("------------");
		
		// 获取所有public修饰的方法，连Object类里的方法都有
		Method[] methods  = personClass.getMethods();
		for (Method method : methods) {
			String name = method.getName(); // 获取方法名称 String getName()
			System.out.println(name);
			System.out.println(method);
//			method.setAccessible(true); // 支持暴力反射
		}
		
		System.out.println("------------------------------");
		
		/*
		 * 获取类名
		 */
		String className = personClass.getName();
		System.out.println(className); // domain.Person
		
	}
	
}
