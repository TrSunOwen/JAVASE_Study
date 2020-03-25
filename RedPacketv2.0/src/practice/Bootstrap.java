package practice;

import red.OpenMode;

/*
 * 场景说明：
 * 红包发出去之后，所有人都有红包可得，最后一个红包给群主自己。
 * 
 * 大多数代码都是现成的，我们只需要做填空题
 * 需要做的事情有：
 * 1.设置程序标题，通过构造方法的字符串参数
 * 2.设置群主名称
 * 3.设置分发策略（平均or随机）
 * 
 * 红包分发的策略：
 * 1.普通红包（平均）:totalMoney/totalCount，余数放在最后一个红包中
 * 2.手气红包（随机）：最少1分钱，最多不超过平均数的2倍。应该越发越少
 */

public class Bootstrap {

	public static void main(String[] args) {
		MyRed red = new MyRed("抢红包v2.0");
		// 设置群主名称
		red.setOwnerName("撕葱");
		
//		//普通红包
//		OpenMode normal = new NormalMode();
//		red.setOpenWay(normal);
//		
		//手气红包
		OpenMode random = new RandomMode();
		red.setOpenWay(random);
	}
	
}
