package uselambda;

import java.util.Arrays;
import java.util.Comparator;

/*
	Lambda表达式有参数有返回值的练习
	需求:
    	使用数组存储多个Person对象
    	对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序
*/

public class Demo01Arrays {

	public static void main(String[] args) {
		// 创建数组存储多个Person对象
		Person[] arr = {
			new Person("小明", 18),
			new Person("小红", 38),
			new Person("小绿", 27)
		};
		
		// 遍历数组
		for (Person p : arr) {
			System.out.println(p);
		}
		
		System.out.println("--------------------------");
		
		// 对数组中的Person对象使用Arrays的sort方法通过年龄进行升序排序(前边-后边)
		Arrays.sort(arr, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				return (o1.getAge() - o2.getAge());
			}
		});
		
		// 遍历数组
		for (Person p : arr) {
			System.out.println(p);
		}
		
		// 使用lambda表达式简化匿名内部类，将上面的代码改写
		Arrays.sort(arr, (Person o1, Person o2)-> {
			return (o1.getAge() - o2.getAge());
		});
		
		/*
			Lambda表达式:是可推导,可以省略
			凡是根据上下文推导出来的内容,都可以省略书写
			可以省略的内容:
    			1.(参数列表):括号中参数列表的数据类型,可以省略不写
    			2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
    			3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
        		注意:要省略{},return,分号必须一起省略
		 */
		// 优化 省略lambda表达式
		Arrays.sort(arr, (o1, o2)->(o1.getAge() - o2.getAge()));
		
		// 遍历数组
		for (Person p : arr) {
			System.out.println(p);
		}
	}
	
}
