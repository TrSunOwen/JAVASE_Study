package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
	Map集合遍历的第二种方式:使用Entry对象遍历

	Map集合中的方法:
   		Set<Map.Entry<K,V>> entrySet() 返回此映射中包含的映射关系的 Set 视图。

	实现步骤:
    	1.使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
    	2.遍历Set集合,获取每一个Entry对象
    	3.使用Entry对象中的方法getKey()和getValue()获取键与值
*/

public class Demo03EntrySet {

	public static void main(String[] args) {
		// 创建Map对象集合
		Map<String, Integer> map = new HashMap<>();
		map.put("赵丽颖",168);
		map.put("杨颖",165);
		map.put("林志玲",178);
		
		// 使用Map集合中的方法entrySet(),把Map集合中多个Entry对象取出来,存储到一个Set集合中
		// 遍历Set集合,获取每一个Entry对象
		Set<Map.Entry<String, Integer>> set = map.entrySet();
		Iterator<Map.Entry<String, Integer>> it = set.iterator();
		while (it.hasNext()) {
			Map.Entry<String, Integer> entry01 = it.next();
			// 使用Entry对象中的方法getKey()和getValue()获取键与值
			String key = entry01.getKey();
			Integer value = entry01.getValue();
			System.out.println(key + "=" + value);
		}
		
		System.out.println("----------");
		
		// 使用增强for循环
		for (Map.Entry<String, Integer> entry02 : set ) {
			String key = entry02.getKey();
			Integer value = entry02.getValue();
			System.out.println(key + "=" + value);
		}
	}
	
}
