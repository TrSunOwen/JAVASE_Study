package concept_of_interface;

/**
 * 接口中也可定义”成员变量“，但必须使用public static final修饰
 * 从效果上来看，其实是接口的【常量】
 * 格式：
 * public static final 数据类型 常量名称 = 数据值;
 * 注意：
 * 一旦使用final关键字修饰，说明不可以改变
 * 接口中的常量，可以省略public static final，注意：不写也照样是这样
 * 接口中的常量，必须进行赋值，不能不赋值
 * 接口中常量的名称，使用完全大写字母，下划线分割
 * @author Owen
 *
 */

public interface MyInterfaceConstant {
	
	//这其实是个常量，一旦赋值，就不可以修改
	public static final int NUM_OF_IT = 10;
	
}
