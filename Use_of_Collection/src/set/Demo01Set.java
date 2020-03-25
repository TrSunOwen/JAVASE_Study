package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * java.util.Set 接口，继承了Collection接口
  	1.不许存储重复元素
  	2.没有索引，没有带索引的方法，也不能使用普通的for循环遍历
 * 
 * java.util.HashSet集合 implements Set接口
 * 	特点：This class implements the Set interface, backed by a hash table (actually a HashMap instance). 
  		It makes no guarantees as to the iteration order of the set; 
  		in particular, it does not guarantee that the order will remain constant over time. 
  		This class permits the null element.
  		是个无序的集合，存储的元素和取出的元素的顺序可能不一致
  		底层是个HashMap，查询速度很快
 * 
 */

public class Demo01Set {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		// 使用add方法添加元素
		set.add(1);
		set.add(3);
		set.add(2);
		set.add(1);
		
		// 使用迭代器遍历set集合
		Iterator<Integer> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()); // 1, 2, 3
		}
		
		System.out.println("-----");
		
		// 增强for循环遍历
		for (Integer i : set) {
			System.out.println(i);
		}
	}
	
}
