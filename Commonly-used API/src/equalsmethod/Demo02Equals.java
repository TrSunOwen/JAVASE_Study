package equalsmethod;

import java.util.ArrayList;

public class Demo02Equals {

	public static void main(String[] args) {
		/*
		 * Person类默认继承Object类，可以使用Object类的equals方法
		 */
		Person p1 = new Person("xxs", 19);
		Person p2 = new Person("bbc", 17);
		
//		System.out.println(p1);
//		System.out.println(p2);
		
//		p1 = p2;
		ArrayList<String> list = new ArrayList<>();
		boolean b = p1.equals(p1);
		System.out.println(b);
	}
	
}
