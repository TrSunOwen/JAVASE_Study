package concept_of_abstract;

public class Zi extends Fu{
	
	public Zi() {
//		super();//super起了作用，但是默认可以不写super语句
		System.out.println("子类构造方法执行");
	}

	@Override
	public void eat() {
		System.out.println("吃饭");
	}

}
