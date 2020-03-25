package practice;

import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args) {
		//创建群主
		GroupHolder holder = new GroupHolder("群主", 100);
		
		//创建群成员
		GroupMember member1 = new GroupMember("成员1", 30);
		GroupMember member2 = new GroupMember("成员2", 20);
		GroupMember member3 = new GroupMember("成员3", 15);
		
		//显示一下抢红包前每个人余额状况
		holder.show();
		member1.show();
		member2.show();
		member3.show();
		
		System.out.println("==========================");//分割线！
		
		ArrayList<Integer> redPacket = holder.send(50, 3);//群主开始发红包
		//成员开始收红包
		member1.receive(redPacket);
		member2.receive(redPacket);
		member3.receive(redPacket);
		
		//显示一下抢红包后每个人余额状况
		holder.show();
		member1.show();
		member2.show();
		member3.show();
	}
	
}
