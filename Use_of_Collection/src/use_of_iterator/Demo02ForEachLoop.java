package use_of_iterator;

import java.util.ArrayList;

/*
 * 增强for循环：底层使用仍然是迭代器。但是使用了for循环的格式，简化了迭代器的书写
 * public interface Collection<E >extends Iterable<E>
 * Iterable<E> implementing this interface allows an object to be the target of the "for-each loop" statement
 * 
 * 增强for循环:用来遍历集合和数组
    	格式:
        	for(集合/数组的数据类型 变量名: 集合名/数组名){
            sout(变量名);
        	}
 */

public class Demo02ForEachLoop {

	public static void main(String[] args) {
		demo01();
		demo02();
	}
	
	//使用增强for循环遍历数组
	private static void demo01() {
		int [] arr = {1, 2, 3, 4, 5};
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	//使用增强for循环遍历集合
	private static void demo02() {
		ArrayList<String> list = new ArrayList<>();
		list.add("xxsb");
		list.add("xxsc");
		list.add("xxsd");
		list.add("xxse");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
