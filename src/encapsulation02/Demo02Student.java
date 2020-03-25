package encapsulation02;

public class Demo02Student {
	
	public static void main(String[] args) {
		Student stu1 = new Student();//无参构造
		
		System.out.println("----------------");
		
		Student stu2 = new Student("xx", 19);//全参构造
		System.out.println("姓名：" + stu2.getName() + "\n年龄：" + stu2.getAge());
		
		System.out.println("----------------");
		
		//如果需要改变对象中的成员变量内容，仍然需要setXxx方法
		stu2.setAge(20);
		System.out.println("姓名：" + stu2.getName() + "\n年龄：" + stu2.getAge());
	}
	
}
