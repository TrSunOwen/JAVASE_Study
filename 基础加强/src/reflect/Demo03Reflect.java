package reflect;

import java.lang.reflect.Constructor;

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

public class Demo03Reflect {

	public static void main(String[] args) throws Exception {
		
		// 获取Person的Class对象
		Class personClass = Person.class;
		
		/*
		 * Constructor<T>	getConstructor(Class<?>... parameterTypes)
		Constructor<?>[]	getConstructors()
		Constructor<T>	getDeclaredConstructor(Class<?>... parameterTypes)
		Constructor<?>[]	getDeclaredConstructors()
		newInstance() 创建对象
		如果使用空参数构造方法创建对象，操作可以简化：Class对象的newInstance方法
		 */
		Constructor con1 = personClass.getConstructor(String.class, int.class);
		System.out.println(con1); // public domain.Person(java.lang.String,int)
		// 创建对象
		Object person = con1.newInstance("张三", 23);
		System.out.println(person); // Person [name=张三, age=23, a=null, b=null, c=null, d=null]
		
		Object obj  = personClass.newInstance();
		System.out.println(obj); // Person [name=null, age=0, a=null, b=null, c=null, d=null]
		
	}
	
}
