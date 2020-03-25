package generic;

import java.util.ArrayList;
import java.util.Collection;

/*
 * 泛型的上限限定: ? extends E 代表使用的泛型只能是E类型的子类或其本身
 * 泛型的下限限定: ? super E 代表使用的泛型只能是E类型的父类或其本身
 */

public class Demo06Generic {

	public static void main(String[] args) {
		Collection<Integer> list01 = new ArrayList<>();
		Collection<String> list02 = new ArrayList<>();
		Collection<Number> list03 = new ArrayList<>();
		Collection<Object> list04 = new ArrayList<>();
		
		getElement1(list01);
//		getElement1(list02);//报错
		getElement1(list03);
//		getElement1(list04);//报错
		
//		getElement2(list01);//报错
//		getElement2(list02);//报错
		getElement2(list03);
		getElement2(list04);

	}
	
	//泛型的上限：此时的泛型?，必须是Number类型或者Number类型的子类
	public static void getElement1(Collection<? extends Number> collection) {
		
	}
	//泛型的下限：此时的泛型?，必须是Number类型或者Number类型的父类
	public static void getElement2(Collection<? super Number> collection) {
		
	}
	
}
