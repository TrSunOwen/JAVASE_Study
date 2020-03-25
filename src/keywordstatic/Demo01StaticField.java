package keywordstatic;

/*
 * 	如果一个成员变量使用了static关键字，那么这个变量不在属于对象自己，而是属于所在的类。多个对象共享同一份数据
 */

public class Demo01StaticField {
	
	public static void main(String[] args) {
		Student one = new Student("郭靖", 19);
		one.room = "101教室";
		System.out.println(one.getName() + ", " + one.getAge() + ", " + one.room + ", " + one.getId());
		
		Student two = new Student("黄蓉", 16);
		System.out.println(two.getName() + ", " + two.getAge() + ", " + two.room + ", " + two.getId());
	}
	
}