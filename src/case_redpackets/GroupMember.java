package case_redpackets;

import java.util.ArrayList;
import java.util.Random;

//普通成员
public class GroupMember extends User{

	public GroupMember() {
		super();
	}

	public GroupMember(String name, int money) {
		super(name, money);
	}
	
	public void receive(ArrayList<Integer> list) {
		//从多个红包中随机抽取一个
		//随机获取一个集合中的索引编号
		int index = new Random().nextInt(list.size());
		//根据索引，从集合中删除，并且得到被删除的红包给自己
		int delta = list.remove(index);
		//当前成员本来有多少钱
		int accountBalance = super.getMoney();
		//加法，重新设置回去
		accountBalance = accountBalance + delta;
		super.setMoney(accountBalance);
	}
	
}
