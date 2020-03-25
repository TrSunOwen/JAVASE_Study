package encapsulation01;

public class Demo03Person {
	public static void main(String[] args) {
		Person person = new Person();
		person.show();
		
		System.out.println("-----------------");
		
		person.name = "XXS";
//		person.age = 22;//直接访问private内容，错误写法！
		person.setAge(-22);
		person.show();
	}
}
