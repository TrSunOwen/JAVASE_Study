package encapsulation02;

public class Demo01Person {
	public static void main(String[] args) {
		Person person = new Person();
		//设置我自己的名字
		person.name = "王思聪";
		person.sayHello("王健林");
		
//		System.out.println(person);//地址值
	}
}
