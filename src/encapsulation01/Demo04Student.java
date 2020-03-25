package encapsulation01;

public class Demo04Student {
	public static void main(String[] args) {
		Student stu = new Student();
		stu.setName("luhan");
		stu.setAge(20);
		stu.setMale(true);
		
		System.out.println("姓名：" + stu.getName() + "\n" + "年龄：" + stu.getAge() + "\n" + "是否为男性：" + stu.isMale());
	}
}
