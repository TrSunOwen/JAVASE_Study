package practice;

import java.util.ArrayList;

import red.OpenMode;

public class NormalMode implements OpenMode{

	@Override
	public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
		ArrayList<Integer> list = new ArrayList<>();
		
		int avg = totalMoney / totalCount; //平均值
		int mod = totalMoney % totalCount; //零头
		
		//注意：(totalCount-1)代表最后一个先留着
		for (int i = 0; i < (totalCount - 1); i++) {
			list.add(avg);
		}
		
		//有零头，需要放在最后一个红包中
		list.add(avg + mod);
		
		return list;
	}

}
