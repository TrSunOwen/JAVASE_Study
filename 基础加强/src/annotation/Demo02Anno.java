package annotation;

import java.util.Date;

/**
 * @Override：检测被该注解标注的方法是否继承自父类（接口）的
 * @Deprecated: 该注解标注的内容，已经过时
 * @SupperessWarnings(): 压制警告
 * @SupperessWarnings("all"): 压制所有警告
 * 
 * @author Owen
 *
 */
@SuppressWarnings("all")
public class Demo02Anno {

	@Override
	public String toString() {
		return super.toString();
	}
	
	@Deprecated
	public void show1() {
		// 有缺陷
	}
	
	@MyAnnotation
	public void show2() {
		// 替代show1方法
		
		Date date = new Date();
		date.getMonth();
	}
	
}
