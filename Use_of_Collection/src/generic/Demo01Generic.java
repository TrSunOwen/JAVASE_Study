package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {

	public static void main(String[] args) {
//		show01();//不使用泛型
		show02();
	}
	
	//创建集合对象，不使用泛型。
	//好处：集合不使用泛型，默认的类型急速object类型，可以存储任意类型的数据
	//弊端：不安全，引发异常
	private static void show01() {
		ArrayList list = new ArrayList();
		list.add("avg");
		list.add(5);
		
		//使用迭代器遍历list集合
		Iterator it = list.iterator();
		//使用迭代器中的方法hasNext和next遍历集合
		while (it.hasNext()) {
			//取出元素也是object类型
			Object obj = it.next();
			System.out.println(obj);
			
			//想要使用String类特有方法，length获取字符串长度。但是不能使用，因为是多态 obj = "avg"
			//需要向下转型！
			//但是抛出异常java.lang.ClassCastException；因为不能把Integer转为String
			String s = (String) obj;
			System.out.println(s.length());
		}
	}
	
	/*
	 * 创建集合对象，使用泛型
	 * 好处1：避免类型转换的麻烦
	 * 好处2：把运行期异常（代码运行后抛出的异常）提升到了编译期异常
	 * 弊端：泛型是什么类型，只能存储什么类型的数据
	 */
	private static void show02() {
		ArrayList<String> list = new ArrayList<>();
		list.add("abc");
		list.add("ddccc");
//		list.add(1);//会报错
		
		//使用迭代器遍历list集合
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s + "-->" + s.length());
		}
	}
}
