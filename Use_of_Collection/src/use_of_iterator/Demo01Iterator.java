package use_of_iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
 * java.util.Iterator接口
 * 迭代器（对集合进行遍历）
 * 2个常用方法：
  		boolean hasNext()
  		E next()
 * 
 *  Iterator迭代器,是一个接口,我们无法直接使用,需要使用Iterator接口的实现类对象,获取实现类的方式比较特殊
    Collection接口中有一个方法,叫iterator(),这个方法返回的就是迭代器的实现类对象
    Iterator<E> iterator() 返回在此 collection 的元素上进行迭代的迭代器。
    
    迭代器使用步骤：
    1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
    2.使用Iterator接口中的方法hasNext()来判断还有没有下一个元素
    3.使用Iterator接口中的方法next()来取出集合中的下一个元素
 */

public class Demo01Iterator {
	
	public static void main(String[] args) {
		//创建一个集合对象Collection
		Collection<String> coll = new ArrayList<>();
		coll.add("ym");
		coll.add("kb");
		coll.add("md");
		coll.add("jms");
		coll.add("ai");
		
		/*
        	1.使用集合中的方法iterator()获取迭代器的实现类对象,使用Iterator接口接收(多态)
	 		注意:
            	Iterator<E>接口也是有泛型的,迭代器的泛型跟着集合走,集合是什么泛型,迭代器就是什么泛型
		 */
		//多态 	接口				实现类对象
		Iterator<String> it = coll.iterator();
//		boolean b = it.hasNext();
//		System.out.println(b);//true
//		String s = it.next();
//		System.out.println(s);//ym
//		
//		b = it.hasNext();
//		System.out.println(b);//true
//		s = it.next();
//		System.out.println(s);//kb
//		
//		b = it.hasNext();
//		System.out.println(b);//true
//		s = it.next();
//		System.out.println(s);//md
//		
//		b = it.hasNext();
//		System.out.println(b);//true
//		s = it.next();
//		System.out.println(s);//jms
//		
//		b = it.hasNext();
//		System.out.println(b);//true
//		s = it.next();
//		System.out.println(s);//ai
//		
//		b = it.hasNext();
//		System.out.println(b);//false
//		s = it.next();
//		System.out.println(s);//java.util.NoSuchElementException
		
		/*
        	发现使用迭代器取出集合中元素的代码,是一个重复的过程
        	所以我们可以使用循环优化
        	不知道集合中有多少元素,使用while循环
        	循环结束的条件,hasNext方法返回false
		 */
		while (it.hasNext()) {
			String e = it.next();
			System.out.println(e);
		}
	}
	
}
