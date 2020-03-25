package oop;

public class Demo02PhoneOne2 {
	public static void main(String[] args) {
		Phone one = new Phone();
		System.out.println(one.brand);
		System.out.println(one.price);
		System.out.println(one.color);
		
		one.brand = "Apple";
		one.price = 4699;
		one.color = "Gold";
		
		System.out.println("--------");
		
		System.out.println(one.brand);
		System.out.println(one.price);
		System.out.println(one.color);
		
		System.out.println("--------");
		
		one.call("Jobs");
		one.sendMessage();
		
		System.out.println("=============");
		
		Phone two = new Phone();
		System.out.println(two.brand);
		System.out.println(two.price);
		System.out.println(two.color);
		
		two.brand = "三星";
		two.price = 5999;
		two.color = "Blue";
		
		System.out.println("--------");
		
		System.out.println(two.brand);
		System.out.println(two.price);
		System.out.println(two.color);
		
		System.out.println("--------");
		
		two.call("Korean");
		two.sendMessage();
	}
}
