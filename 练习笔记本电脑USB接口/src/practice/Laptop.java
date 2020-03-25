package practice;

public class Laptop {

	public void powerOn() {
		System.out.println("电脑开机");
	}
	
	public void powerOff() {
		System.out.println("电脑关机");
	}
	
	public void useDevice(USB usb) {
		usb.open();
		
		if (usb instanceof Mouse) {
			Mouse mouse = (Mouse) usb;
			mouse.methodMouse();
		} else if (usb instanceof Keyboard) {
			Keyboard keyboard = (Keyboard) usb;
			keyboard.methodKeyboard();
		}
		
		usb.close();
	}
	
}
