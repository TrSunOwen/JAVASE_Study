package practice;

public class Main {

	public static void main(String[] args) {
		//创建笔记本电脑
		Laptop laptop = new Laptop();
		//开机
		laptop.powerOn();
		
		//准备一个鼠标供电脑使用
//		Mouse mouse = new Mouse();
		//首先进行向上转型
		USB usbMouse = new Mouse();
		//参数是USB类型，正好传递进去USB鼠标
		laptop.useDevice(usbMouse);
		
		//创建一个USB键盘
		Keyboard keyboard = new Keyboard();//不使用多态写法
		//方法参数是USB类型，传递进去的是实现类对象
		laptop.useDevice(keyboard);//正确写法！也发生了向上转型
		//使用子类对象，匿名对象，也可以
//		laptop.useDevice(new Keyboard());
		
		//关机
		laptop.powerOff();
	}
	
}
