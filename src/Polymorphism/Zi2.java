package Polymorphism;

public class Zi2 extends Fu2{

	int num = 20;

	@Override
	public void showNum() {
		System.out.println(num);
	}

	@Override
	public void method() {
		System.out.println("子类方法");
	}
	
	public void methodZi() {
		System.out.println("子类特有方法");
	}
	
}
