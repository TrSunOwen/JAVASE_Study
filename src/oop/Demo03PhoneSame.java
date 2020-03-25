package oop;

public class Demo03PhoneSame {
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
		
		//将one中保存的对象地址值赋值给two
		Phone two = one;
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
