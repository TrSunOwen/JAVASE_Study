package oop;

/**
 * 手机
 * 	属性：品牌，颜色，价格
 * 	行为：打电话， 发短信
 * @author Owen
 *
 */

public class Phone {
	//成员变量
	String brand;
	String color;
	double price;
	
	//成员方法
	public void call(String who) {
	System.out.println("给" + who + "打电话");
	}
	
	public void sendMessage() {
		System.out.println("群发短信");
	}
}
