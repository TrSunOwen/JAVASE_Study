package generic;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 泛型通配符：
  		?：代表任意数据类型
      使用方法：
  		不能创建对象使用
  		只能作为方法的参数使用
 */

public class Demo05Generic {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(2);
		
		ArrayList<String> list02 = new ArrayList<>();
		list02.add("a");
		list02.add("b");
		
		printArray(list01);
		printArray(list02);
	}
	
	/*
	 * 定义一个方法，让他能遍历所有ArrayList集合
	     这时候我们不知道数据的类型，可以使用泛型的通配符?接收数据类型 
	 */
	public static void printArray(ArrayList<?> list) {
		//使用迭代器遍历集合
		Iterator<?> it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			System.out.println(obj);
		}
	}
	
}
