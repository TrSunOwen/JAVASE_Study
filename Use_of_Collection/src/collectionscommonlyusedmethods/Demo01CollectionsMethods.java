package collectionscommonlyusedmethods;

import java.util.ArrayList;
import java.util.Collections;

/*
 * static <T> boolean addAll(Collection<? super T> c, T... elements);
 * static void shuffle(List<?> list) 打乱顺序
 */

public class Demo01CollectionsMethods {

	public static void main(String[] args) {
		ArrayList<String> list01 = new ArrayList<>();
//		// 往集合里添加多个元素，这样很麻烦
//		list.add("a");
//		list.add("b");
//		list.add("c");
//		list.add("d");
		
		// static <T> boolean addAll(Collection<? super T> c, T... elements);
		Collections.addAll(list01, "a", "b", "c", "d");
		System.out.println(list01);
		
		// static void shuffle(List<?> list) 打乱顺序
		Collections.shuffle(list01);
		System.out.println(list01);
	}
	
}
