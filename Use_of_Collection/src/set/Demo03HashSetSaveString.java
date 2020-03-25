package set;

import java.util.HashSet;

/*
 * Set集合不允许存储重复的元素
 */

public class Demo03HashSetSaveString {

	public static void main(String[] args) {
		// 创建HashSet集合对象
		HashSet<String> set = new HashSet<>();
		String s1 = new String("abc");
		String s2 = new String("abc");
		set.add(s1);
		set.add(s2);
		set.add("通话");
		set.add("座机");
		set.add("abc");
		
		System.out.println(set); // [通话, abc, 座机]
	}
	
}
