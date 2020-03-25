package uselambda;

/*
	需求:
    	给定一个厨子Cook接口，内含唯一的抽象方法makeFood，且无参数、无返回值。
    	使用Lambda的标准格式调用invokeCook方法，打印输出“吃饭啦！”字样
*/

public class Demo01Cook {

	public static void main(String[] args) {
		// 调用invokeCook方法，参数是Cook接口，传递Cook接口的匿名内部类对象
		invokeCook(new Cook() {
			@Override
			public void makeFood() {
				System.out.println("吃饭了！");
			}
		});
		
		// 使用lambda表达式简化匿名内部类的书写
		invokeCook(()->{
			System.out.println("吃饭了！");
		});
		
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
		invokeCook(()->System.out.println("吃饭了！"));
	}
	
	// 定义一个方法，参数传递Cook接口，方法内部调用Cook接口中的方法makeFood
	public static void invokeCook(Cook cook) {
		cook.makeFood();
	}
	
}
