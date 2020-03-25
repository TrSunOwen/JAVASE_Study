package collectionscommonlyusedmethods;

/*
 * - java.utils.Collections是集合工具类，用来对集合进行操作。部分方法如下：
        public static <T> void sort(List<T> list):将集合中元素按照默认规则排序。
        Sorts the specified list into ascending order, according to the natural ordering of its elements.

    注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则

    Comparable接口的排序规则:
        自己(this)-参数:升序
 */

import java.util.ArrayList;
import java.util.Collections;

public class Demo02Sort {

	public static void main(String[] args) {
		ArrayList<Person> list02 = new ArrayList<>();
		list02.add(new Person("张三", 18));
		list02.add(new Person("李四", 11));
		list02.add(new Person("王五", 28));
		
		System.out.println(list02); // [Person [name=张三, age=18], Person [name=李四, age=11], Person [name=王五, age=28]]
		 
		Collections.sort(list02);
		System.out.println(list02); // [Person [name=李四, age=11], Person [name=张三, age=18], Person [name=王五, age=28]]
	}
	
}
