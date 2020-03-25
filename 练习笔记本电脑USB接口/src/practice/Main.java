package practice;

public class Main {

	public static void main(String[] args) {
		Laptop laptop = new Laptop();
		
		laptop.powerOn();
		
		System.out.println();
		
		USB usbMouse = new Mouse();
		laptop.useDevice(usbMouse);
		
		System.out.println();
		
		USB usbKeyboard = new Keyboard();
		laptop.useDevice(usbKeyboard);
		
		System.out.println();
		
		laptop.powerOff();
	}
	
}
