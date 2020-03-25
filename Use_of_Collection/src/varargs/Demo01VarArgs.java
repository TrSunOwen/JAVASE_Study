package varargs;

/*
 * 可变参数
 * 使用前提：当方法的参数列表数据类型已经确定但是参数的个数不确定的时候，就可以使用可变参数
 * 使用格式：
 * 		定义方法时使用
  		修饰符 返回值类型 方法名 （数据类型...变量名）{}
 * 可变参数的原理：
  		底层就是一个数组根据传递参数个数的不同，会创建不同长度的数组来存储这些参数
 		传递的参数个数，可以是任意个，甚至可以是0个
 * 可变参数注意事项：
 		1.一个方法的参数列表只能有一个可变参数
 		2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾	
 * 可变参数特殊（终极）写法：
 		public static void method(Object...obj){}
 * 	
 */

public class Demo01VarArgs {

	public static void main(String[] args) {
		int i = add(10, 20, 30, 40, 50);
		System.out.println(i);
//		method("abc", 5.5, 1, 3, 4, 6); // 正确
	}
	
	// 可变参数特殊（终极）写法
	public static void method(Object...obj) {
		
	}
	
	/*
	 * 可变参数注意事项：
 		1.一个方法的参数列表只能有一个可变参数
 		2.如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
	 */
//	public static void method(int...a,String...b) { // 一个方法的参数列表只能有一个可变参数
//		
//	}
	
//	public static void method(String a, double b, int...c) {  // 如果方法的参数有多个，那么可变参数必须写在参数列表的末尾
//		
//	}
	
	/*
	 * 定义计算0-n整数和的方法
	 * 已知：计算整数的和，数据类型已经确定int
	 * 但是参数的个数不确定，不知道要计算几个整数的和
	 * add();就会创建一个长度为0的数组, new int[0]
	 * add(10, 20, 30, 40, 50);就会创建一个长度为5的数组, new int[10, 20, 30, 40, 50]
	 */
	public static int add (int...arr) {
//		System.out.println(arr); // [I@15db9742 说明底层是一个数组
//		System.out.println(arr.length); // 5 说明长度为5的数组
		// 定义一个初始化的变量，让它记录累加求和
		int sum = 0;
		// 遍历数组中每个元素，累加
		for (int i : arr) {
			sum = sum + i;
		}
		// 返回求和结果
		return sum;
	}
	
//	// 定义一个方法，计算两个整数的和
//	public static int add(int a, int b) {
//		return (a + b);
//	}
	
//	// 定义一个方法，计算三个整数的和
//	public static int add(int a, int b, int c) {
//		return (a + b + c);
//	}
	
}
