package anoymous;

import java.util.Scanner;

public class Demo02Anoymous {
	
	public static void main(String[] args) {
		//普通使用方式
//		Scanner input = new Scanner(System.in);
//		int num = input.nextInt();
		
		//匿名对象的方式
//		int num = new Scanner(System.in).nextInt();
		
		methodParam(new Scanner(System.in));
		Scanner sc = methodReturn();
		int num = sc.nextInt();
		System.out.println(num);
	}
	
	public static void methodParam(Scanner sc) {
		int num = sc.nextInt();
		System.out.println(num);
	}
	
	public static Scanner methodReturn() {
		return new Scanner(System.in);
	}
	
}