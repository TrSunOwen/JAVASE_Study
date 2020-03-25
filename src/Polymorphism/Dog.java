package Polymorphism;

public class Dog extends Animal{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("狗吃骨头");
	}
	
	public void guard() {
		System.out.println("狗能看家");
	}
	
}
