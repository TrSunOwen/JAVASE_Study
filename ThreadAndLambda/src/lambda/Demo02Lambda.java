package lambda;

/*
	Lambda表达式的标准格式:
    	由三部分组成:
        	a.一些参数
        	b.一个箭头
        	c.一段代码
    	格式:
        	(参数列表) -> {一些重写方法的代码};
    	解释说明格式:
        	():接口中抽象方法的参数列表,没有参数,就空着;有参数就写出参数,多个参数使用逗号分隔
        	->:传递的意思,把参数传递给方法体{}
        	{}:重写接口的抽象方法的方法体
*/

public class Demo02Lambda {

	public static void main(String[] args) {
		// 匿名内部类的方式实现多线程
		new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "新线程创建了！");	
			}
		}).start();
		
		// 使用Lambda表达式实现多线程
		new Thread(()-> {
				System.out.println(Thread.currentThread().getName() + "新线程创建了！");	
			}
		).start();
		
		/*
			Lambda表达式:是可推导,可以省略
			凡是根据上下文推导出来的内容,都可以省略书写
			可以省略的内容:
	    		1.(参数列表):括号中参数列表的数据类型,可以省略不写
	    		2.(参数列表):括号中的参数如果只有一个,那么类型和()都可以省略
	    		3.{一些代码}:如果{}中的代码只有一行,无论是否有返回值,都可以省略({},return,分号)
	        	注意:要省略{},return,分号必须一起省略
		 */
		// 优化省略lambda
		new Thread(()-> 
				System.out.println(Thread.currentThread().getName() + "新线程创建了！")
				
		).start();
	}
	
}
