package demo02.recursion;

/*
 * 递归遍历文件夹里所有的文件
 */

import java.io.File;

public class Demo04Recursion {

	public static void main(String[] args) {
		File file = new File("F:\\Java\\JavaWorkspace\\File");
		getAllFiles(file);
	}
	
	private static void getAllFiles(File dir) {
		System.out.println(dir); // 打印被遍历的目录名称
		File[] list = dir.listFiles();
		for (File file: list) {
			if (file.isDirectory()) {
				// 如果是文件夹，则继续递归
				getAllFiles(file);
			} else {
				// 否则直接打印输出
				System.out.println(file);
			}
		}
	}
	
}
