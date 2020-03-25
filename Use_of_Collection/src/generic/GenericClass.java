package generic;

/*
  * 定义含有泛型的类，模拟ArrayList
 */

public class GenericClass<E> {
	
	private E name;

	public E getName() {
		return name;
	}

	public void setName(E name) {
		this.name = name;
	}
	
}
