package generic;

/*
 * 测试含有泛型的接口
 */

public class Demo04GenericInterface {

	public static void main(String[] args) {
		//创建GenericInterfaceImpl1对象
		GenericInterfaceImpl1 gii1 = new GenericInterfaceImpl1();
		gii1.method("字符串");
		
		//创建GenericInterfaceImpl2对象
		GenericInterfaceImpl2<Integer> gii2 = new GenericInterfaceImpl2<>();
		gii2.method(7);
		
		GenericInterfaceImpl2<Double> gii21 = new GenericInterfaceImpl2<>();
		gii21.method(7.774);
	}
	
}
