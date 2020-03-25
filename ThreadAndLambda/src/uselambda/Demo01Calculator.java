package uselambda;

/*
	Lambda表达式有参数有返回值的练习
	需求:
    	给定一个计算器Calculator接口，内含抽象方法calc可以将两个int数字相加得到和值
    	使用Lambda的标准格式调用invokeCalc方法，完成120和130的相加计算
*/

public class Demo01Calculator {

	public static void main(String[] args) {
		// 调用invokeCal方法，方法的参数是一个接口，可以使用匿名内部类
		invokeCal(120, 130, new Calculator() {
			@Override
			public int cal(int a, int b) {
				return (a + b);
			}
		});
		
		// 使用lambda表达式简化匿名内部类的写法
		invokeCal(120, 130, (int a, int b)-> (a + b));
		
		/*
			Lambda表达式:是可推导,可以省略
			凡是根据上下文推导出来的内容,都可以省略书写
			可以省略的内容:
				1.(参数列表):括号中参数列表的数据类型,可以省略不写
				2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
				3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
    			注意:要省略{},return,分号必须一起省略
		 */
		// 优化 省略lambda表达式
		invokeCal(120, 130, (a, b)->{
			return a + b;
		});
	}
	
    /*
    	定义一个方法
    	参数传递两个int类型的整数
    	参数传递Calculator接口
    	方法内部调用Calculator中的方法calc计算两个整数的和
     */
	public static void invokeCal(int a, int b, Calculator c) {
		int sum = c.cal(a, b);
		System.out.println(sum);
	}
	
}
