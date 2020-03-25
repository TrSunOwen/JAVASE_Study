package demo02.recursion;

/*
 * 用递归计算阶乘
 */

public class Demo03Recursion {

	public static void main(String[] args) {
		int result = cal(5);
		System.out.println(result); // 120
	}
	
	private static int cal(int i) {
		// 获得1的时候结束
		if (i == 1) {
			return 1;
		}
		
		// 获取下一个被乘的数字(n-1)
		return (i * cal(i-1));
	}
	
}
