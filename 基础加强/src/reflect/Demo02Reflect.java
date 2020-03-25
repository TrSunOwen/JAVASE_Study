package reflect;

import java.lang.reflect.Field;

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

public class Demo02Reflect {

	public static void main(String[] args) throws Exception {
		
		// 获取Person的Class对象
		Class personClass = Person.class;
		
		// 获取成员变量们
		Field[] fields = personClass.getFields();
		for (Field field : fields) {
			System.out.println(field);
		}
		
		System.out.println("---------------------");
		
		Field a = personClass.getField("a");
		System.out.println(a);
		
		// 获取成员变量a的值
		Person p = new Person();
		Object value1 = a.get(p);
		System.out.println(value1); // null
		// 设置成员变量a的值
		a.set(p, "张三");
		System.out.println(p);
		
		System.out.println("===================");
		
		// Field	 getDeclaredField(String name) 获取所有的成员变量
		Field[] dfs = personClass.getDeclaredFields();
		for (Field df : dfs) {
			System.out.println(df);
		}
		
		System.out.println("===================");
		
		// Field	 getDeclaredField(String name) 获取指定名称的成员变量
		Field b = personClass.getDeclaredField("b"); // protected的b，无法被访问
		// 忽略访问权限修饰符的安全检查
		b.setAccessible(true); // 暴力反射
		Object value2 = b.get(p);
		System.out.println(value2); // null
	}
	
}
