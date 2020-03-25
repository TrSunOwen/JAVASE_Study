package case_redpackets;

import java.util.ArrayList;

//群主的类
public class GroupHolder extends User{
	
	public GroupHolder() {
		
	}

	public GroupHolder(String name, int money) {
		super(name, money);
	}
	
	public ArrayList<Integer> send(int totalMoney, int number){
		//首先需要一个集合来存储若干个红包的金额
		ArrayList<Integer> redList = new ArrayList<>();
		
		//首先看群主自己有多少钱
		int accountBalance = super.getMoney();//群主余额
		if (totalMoney > accountBalance) {
			System.out.println("余额不足");
			return redList;//返回空集合
		}
		
		//从群主余额里扣钱，也就是重新设置余额
		super.setMoney((accountBalance - totalMoney));
		
		//发红包需要平均拆分成number份
		int avg = (totalMoney / number);
		int mod = (totalMoney % number);//余数，也就是零头
		
		//除不尽的零头包在最后一个红包里
		//下面把红包一个个放到集合里
		for(int i = 0; i < (number - 1); i++) {
			redList.add(avg);
		}
		
		//最后一个红包
		int last = mod + avg;
		redList.add(last);
		
		return redList;
	}
	
}
