package practice;

import java.util.ArrayList;
import java.util.Random;

import red.OpenMode;

public class RandomMode implements OpenMode{

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList<>();
		
		// 随机分配，有可能多，有可能少。
		Random r = new Random();
		int leftMoney = totalMoney;
		int leftCount = totalCount;
		
		for (int i = 0; i < totalCount - 1; i++) {
			int money = 1 + r.nextInt(leftMoney / leftCount * 2);
			list.add(money);
			
			leftMoney -= money;
			leftCount--;
		}
		
		//最后一个红包不需要随机，直接放进去即可
		list.add(leftMoney);
		
		return list;
	}

}
