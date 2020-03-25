package collectionscommonlyusedmethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 * static <T> void	sort(List<T> list, Comparator<? super T> c)
 * Sorts the specified list according to the order induced by the specified comparator.
 * Comparator和Comparable的区别
   		Comparable:自己(this)和别人(参数)比较,自己需要实现Comparable接口,重写比较的规则compareTo方法
        Comparator:相当于找一个第三方的裁判,比较两个
     Comparator的排序规则:
        o1-o2:升序，反之降序
 */

public class Demo03Sort {

	public static void main(String[] args) {
		ArrayList<Integer> list01 = new ArrayList<>();
		list01.add(1);
		list01.add(3);
		list01.add(2);
		System.out.println(list01); // [1, 3, 2]
		
		Collections.sort(list01, new Comparator<Integer>() {
			// 重写比较的规则
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 - o2); // 升序
//				return (o2 - o1); // 降序
			}
		});
		System.out.println(list01);// [1, 2, 3]
		
		ArrayList<Student> list02 = new ArrayList<>();
		list02.add(new Student("a小明", 37));
		list02.add(new Student("小黄", 27));
		list02.add(new Student("小蓝", 17));
		list02.add(new Student("d大蓝", 37));
		
		System.out.println(list02); 
		// [Student [name=a小明, age=37], Student [name=小黄, age=27], Student [name=小蓝, age=17], Student [name=d大蓝, age=37]]
		
//		Collections.sort(list02, new Comparator<Student>() {
//			@Override
//			public int compare(Student o1, Student o2) {
//				// 按照年龄升序 
//				return (o1.getAge() - o2.getAge());
//			}
//		});
		
		//组合式（拓展内容）
		Collections.sort(list02, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// 按照年龄升序 
				int result = (o1.getAge() - o2.getAge());
				// 如果两个人年龄相同，再使用姓名的第一个字比较
				if (result == 0) {
					result = o1.getName().charAt(0) - o2.getName().charAt(0);
				}
				return result;
			}
		});
		System.out.println(list02);
		// [Student [name=小蓝, age=17], Student [name=小黄, age=27], Student [name=a小明, age=37], Student [name=d大蓝, age=37]]
	}
	
}
