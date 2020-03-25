package oop;

public class Demo05PhoneReturn {
	public static void main(String[] args) {
		Phone two = getPhone();
		System.out.println(two.brand);
		System.out.println(two.color);
		System.out.println(two.price);
	}
	
	public static Phone getPhone() {
		Phone one = new Phone();
		one.brand = "Apple";
		one.price = 66.6;
		one.color = "Blue";
		return one;
	}
}
