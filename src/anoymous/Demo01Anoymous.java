package anoymous;

/*
 * 	创建对象的标准格式：
 * 	类名称 对象名 = new 类名称()
 * 
 * 	匿名对象就是只有右边的对象，没有左边的名字和赋值运算符
 * 
 * 	注意事项：匿名对象只能使用唯一的一次，下次再用不得不创建一个新对象
 * 	使用建议：如果确定有个对象只需要使用唯一一次，就可以用匿名对象
 */

public class Demo01Anoymous {
	
	public static void main(String[] args) {
		//左边的p1就是对象名字
		Person p1 = new Person();
		p1.name = "高圆圆";
		p1.showName();
		
		System.out.println("==========");
		
		//匿名对象
		new Person().name = "虎牙";
		new Person().showName();//? 出现null，因为不是同一个地址
		
	}
	
}