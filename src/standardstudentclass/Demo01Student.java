package standardstudentclass;

public class Demo01Student {
	
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("迪丽热巴");
		stu1.setAge(20);
		System.out.println("姓名：" + stu1.getName() + "\n年龄：" + stu1.getAge());
		System.out.println("===============");
		
		Student stu2 = new Student("古力娜扎", 22);
		System.out.println("姓名：" + stu2.getName() + "\n年龄：" + stu2.getAge());
		System.out.println("===============");
		stu2.setAge(24);
		System.out.println("姓名：" + stu2.getName() + "\n年龄：" + stu2.getAge());
	}
	
}
