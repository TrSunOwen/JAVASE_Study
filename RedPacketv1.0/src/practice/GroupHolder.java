package practice;

import java.util.ArrayList;

/**
 * 发红包的群主
 * @author Owen
 *
 */

public class GroupHolder extends User{

	public GroupHolder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupHolder(String name, int accountBalance) {
		super(name, accountBalance);
		// TODO Auto-generated constructor stub
	}
	
	public ArrayList<Integer> send(int amount, int number){
		ArrayList<Integer> redPacket = new ArrayList<>();//建立一个红包数组，用于存储红包的数据
		
		int accountBalance = super.getAccountBalance();//得到群主账户的余额
		
		if (amount > accountBalance) {
			System.out.println("余额不足！");
			return redPacket;
		} else {
			super.setAccountBalance(accountBalance - amount);//重新设定群主发完红包后的余额
			
			int avg = (amount / number);//整除后的每份金额
			int mod = (amount % number);//零头，可能为0，也可能不是0
			int last = avg + mod;//万一除不尽，则最后一份红包金额会大一些，平均金额+零头。以此保证红包都发完
			
			//处理有零头前的红包
			for (int i = 0; i < (number - 1); i++) {
				redPacket.add(avg);
			}
			//处理最后一个带零头的红包，哪怕零头为0（也就是正好被整除），这种写法也是很精准的
			redPacket.add(last);
			
			return redPacket;
		}
	}
	
}
