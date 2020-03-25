package demo01.file;

import java.io.File;

public class Demo04File {

	public static void main(String[] args) {
		show01();
	}
	
	private static void show01() {
		/*
        	public boolean exists() ：此File表示的文件或目录是否实际存在。
        	用于判断构造方法中的路径是否存在
            	存在:true
            	不存在:false
	     */
		File f1 = new File("F:\\Java\\JavaWorkspace\\File\\aa\\address.txt");
		System.out.println(f1.exists()); // true
		
		File f2 = new File("Demo01File.java");
		System.out.println(f2.exists()); // true
		
		File f3 = new File("Demo02File.java");
		System.out.println(f3.exists()); // false
		
		File f4 = new File("F:\\Java\\JavaWorkspace\\Demo01File.java");
		System.out.println(f4.exists()); // true
	}
	
}
