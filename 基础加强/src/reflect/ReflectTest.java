package reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/*
 * 需求：写一个“框架”，在不能改变该类的任何代码的前提下，可以帮我们创建任意类的对象，并且执行其中任意方法
 * 实现：
 * 	1.配置文件
 * 	2.反射
 * 步骤：
 * 	1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
 * 	2.在程序中去加载读取配置文件
 * 	3.使用反射技术来加载类文件进内存，并且去创建对象，执行方法
 */

public class ReflectTest {

	public static void main(String[] args) throws Exception {
		
		// 可以创建任意类的对象，并且执行其中任意方法
		/*
		 * 前提：不能改变该类的任何代码
		 */
//		Person p = new Person();
//		p.eat();
		
		// 1.加载配置文件
		// 创建Properties对象
		Properties pro = new Properties();
		// 加载配置文件，转换为一个集合
		// 获取class目录下的配置文件
		ClassLoader cl = ReflectTest.class.getClassLoader();
		InputStream is = cl.getResourceAsStream("properties"); // 把文件变成流，对文件里面的内容进行流操作
		pro.load(is);
		
		String className = pro.getProperty("className");
		String methodName = pro.getProperty("methodName");
		
		// 3.加载该类进内存
		Class cls = Class.forName(className);
		// 4.创建对象
		Object obj  = cls.newInstance();
		// 5.获取方法对象
		Method method = cls.getMethod(methodName);
		// 6.执行方法
		method.invoke(obj);
	}
	
}
