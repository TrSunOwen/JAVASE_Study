package case_redpackets;

import java.util.ArrayList;

public class MainMethod {
	
	public static void main(String[] args) {
		GroupHolder groupHolder = new GroupHolder("群主", 100);
		
		GroupMember member1 = new GroupMember("成员A", 8);
		GroupMember member2 = new GroupMember("成员B", 20);
		GroupMember member3 = new GroupMember("成员C", 22);
		
		groupHolder.show();//100
		member1.show();//0
		member2.show();//0
		member3.show();//0
		
		System.out.println("=========================");
		
		//群主总共发20块，分成3个红包
		ArrayList<Integer> redList = groupHolder.send(20, 3);
		
		//三个普通成员去收红包
		member1.receive(redList);
		member2.receive(redList);
		member3.receive(redList);
		
		groupHolder.show();//80
		//6, 6, 8
		member1.show();//?
		member2.show();//?
		member3.show();//?
	}
	
}
