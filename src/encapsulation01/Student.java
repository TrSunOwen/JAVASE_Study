package encapsulation01;

public class Student {
	private String name;//姓名
	private int age;//年龄
	private boolean male;//行别，是不是男的？
	
	public void setMale(boolean b) {
		male = b;
	}
	
	public boolean isMale() {//注意，此处为is，不是set，为特例！
		return male;
	}
	
	public void setName(String str) {
		name = str;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int num) {
		age = num;
	}
	
	public int getAge() {
		return age;
	}
	
}
