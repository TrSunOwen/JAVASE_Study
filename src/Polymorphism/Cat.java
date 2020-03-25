package Polymorphism;

public class Cat extends Animal{

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
	
}
