package encapsulation01;
/**
 * 	一旦使用private进行修饰，那么本类当中仍然可以随意访问
 * 	但是超出本类范围之外就不能直接访问了
 * 
 * 	间接访问private成员变量，就是定义一对set和get方法
 * 	必须叫setXXX或者getXXX
 * 	对于set来说，不能有返回值，参数类型与成员变量对应
 * 	对于get来说，不能有参数，返回值类型与成员变量对应
 * @author Owen
 *
 */
public class Person {
	String name;//姓名
	private int age;//年龄
	
	public void show() {
		System.out.println("My name is " + name + ", and my age is " + age + ".");
	}
	
	//这个成员方法专门用于向age设置数据
	public void setAge(int num) {
		if (num < 100 && num >=0) {
			this.age = num;			
		} else {
			System.out.println("数据不合理！");
		}
	}
	
	//这个成员方法专门获取age数据
	public  int getAge() {
		return age;
	}
}
