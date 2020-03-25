package encapsulation01;

/**
 *	面向对象的三大特征：封装、继承、多态
 *	封装性：
 *	1.方法就是一种封装
 *	2.关键字private也是一种封装
 *
 * 	封装就是将一些细节信息隐藏起来，对外界不可见。
 * @author Owen
 *
 */

public class Demo02Method {
	public static  void main(String[] args) {
		int[] array = {5, 10, 400, 5000};
		
		int max = getMax(array);
		System.out.println("最大值为：" + max);
	}
	
	//给我一个数组，我还你一个最大值
	public static int getMax(int[] array) {
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		return max;
	}
}
