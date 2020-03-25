package standardstudentclass;

/*
 * 一旦使用static修饰成员方法，那么这就成了静态方法
 * 静态方法不属于对象，而属于类的！
 * 如果没有static关键字那么必须首先创建对象，然后通过对象才能使用
 * 如果有static关键字，那么不需要创建对象，直接就能通过类名称来使用它
 * 
 * 无论是成员变量还是成员方法，如果有了static，都推荐使用类名称来调用
 * 静态变量：类名称.静态变量
 * 静态方法：类名称.静态方法（）
 * 
 * 注意：
 * 1.静态不能直接访问非静态
 * 	因为在内存中先有静态内容，后有非静态内容
 * 	“先人不知道后人，但是后人知道前人”
 * 2.静态方法中不能写this
 * 	this代表当前对象，通过谁调用的方法，谁就是当前对象
 */

public class Demo02StaticMethod {
	
	public static void main(String[] args) {
		MyClass obj = new MyClass();//首先创建对象
		//然后才能使用没有static关键字的内容
		obj.method();
		
		//对于静态方法来说，可以通过对象名进行调用，也可以直接通过类名称调用
		obj.methodStatic();//正确但是不推荐,这种写法在编译后也会被javac翻译成“类名称.静态方法名”
		MyClass.methodStatic();//正确，推荐！
		
		//对于本类当中的静态方法，可以省略类名称
		myMethod();
		Demo02StaticMethod.myMethod();//完全等效!
	}
	
	public static void myMethod() {
		System.out.println("自己的方法！");
	}
	
}
