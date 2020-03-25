package demo02.recursion;

/*
 * 搜索文件夹里所有.java文件
 */

import java.io.File;

public class Demo05Recursion {

	public static void main(String[] args) {
		File file = new File("F:\\Java\\JavaWorkspace\\File");
		find(file);
	}
	
	private static void find(File dir) {
		File[] list = dir.listFiles();
		for (File file: list) {
			if (file.isDirectory()) {
				// 如果是文件夹，则继续递归
				find(file);
			} else {
				// 否则就是文件，开始寻找是否.java后缀；String类中有个boolean endWith()方法
				String s = file.getName();
				if (s.endsWith(".java")) {
					System.out.println(file);					
				}
			}
		}
	}
	
}
