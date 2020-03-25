package oop;

public class Demo01PhoneOne {
	public static void main(String[] args) {
		//根据Phone类，创建给一个名为one的对象
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
	}
}
