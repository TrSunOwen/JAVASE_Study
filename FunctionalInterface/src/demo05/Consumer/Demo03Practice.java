package demo05.Consumer;

import java.util.function.Consumer;

/*
	练习:
    	字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
    	要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
    	将打印性别的动作作为第二个Consumer接口的Lambda实例，
    	将两个Consumer接口按照顺序“拼接”到一起。
*/

public class Demo03Practice {

	// 定义一个方法,参数传递String类型的数组和两个Consumer接口,泛型使用String
	public static void method(String[] arr, Consumer<String> con1, Consumer<String> con2) {
		for (String msg : arr) {
			con1.andThen(con2).accept(msg);
		}
	}
	
	public static void main(String[] args) {
		 // 定义一个字符串类型的数组
        String[] arr = { "迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男" };
        
        method(arr, 
        		(msg)->{
        			 // 消费方式:对message进行切割,获取姓名,按照指定的格式输出
        			String name = msg.split(",")[0];
        			System.out.println("姓名：" + name);
        		}, 
        		(msg)->{
        			// 消费方式:对message进行切割,获取年龄,按照指定的格式输出
        			String age = msg.split(",")[1];
        			System.out.println("年龄：" + age);
        		});
	}
	
}
