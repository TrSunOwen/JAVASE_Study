package oop;

public class Demo04PhoneParam {
	public static void method(Phone param) {
		System.out.println(param.brand);
		System.out.println(param.price);
		System.out.println(param.color);
	}
	
	public static void main(String[] args) {
		Phone one = new Phone();
		one.brand = "Apple";
		one.price = 8388.0;
		one.color = "Gold";
		
		method(one);//传递进去的参数就是地址值
	}
}
