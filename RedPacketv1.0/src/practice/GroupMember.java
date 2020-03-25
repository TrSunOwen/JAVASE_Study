package practice;

import java.util.ArrayList;
import java.util.Random;

/**
 * 抢红包的群成员
 * @author Owen
 *
 */

public class GroupMember extends User{

	public GroupMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GroupMember(String name, int accountBalance) {
		super(name, accountBalance);
		// TODO Auto-generated constructor stub
	}
	
	public void receive(ArrayList<Integer> list) {
		//随机生成数组里头的索引，随机拿红包
		int index = new Random().nextInt(list.size());
		int delta = list.remove(index);//一边拿红包，一边删
		
		int accountBalance = super.getAccountBalance();
		super.setAccountBalance(accountBalance + delta);//设定抢完红包后的群成员的最新余额
	}
	
}
