package standardstudentclass;

public class Demo03StaticStudent {
	
	public static void main(String[] args) {
		//首先设置一下教室，这是静态的东西，应该通过类名称进行调用
		Student2.room = "101";
		
		Student2 one = new Student2("xxs", 10);
		System.out.println(one.getAge());
		System.out.println(one.getName());
		System.out.println(Student2.room);
		
		System.out.println("===========");
		
		Student2 two = new Student2("bba", 19);
		System.out.println(two.getAge());
		System.out.println(two.getName());
		System.out.println(Student2.room);
	}
	
}
