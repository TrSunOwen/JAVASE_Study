package collectionscommonlyusedmethods;

/*
 *  注意:
         sort(List<T> list)使用前提
         被排序的集合里边存储的元素,必须实现Comparable,重写接口中的方法compareTo定义排序的规则
   
     Comparable接口的排序规则:
         自己(this)-参数:升序
 */

public class Person implements Comparable<Person> {

	private String name;
	private int age;
	
	public Person() {
		
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 重写排序规则
	@Override
	public int compareTo(Person p) {
//		// TODO Auto-generated method stub
//		return 0; // 默认认为元素都是相同的
		// 自定义比较的规则：比较两个人的年龄(this,参数Person)
		return (this.getAge() - p.getAge()); // 升序排序
//		return (p.getAge() - this.getAge()); // 反之，降序排序
	}
	
}
