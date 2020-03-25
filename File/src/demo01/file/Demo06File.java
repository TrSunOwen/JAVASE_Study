package demo01.file;

import java.io.File;

/*
	File类遍历(文件夹)目录功能
    	- public String[] list() ：返回一个String数组，表示该File目录中的所有子文件或目录。
    	- public File[] listFiles() ：返回一个File数组，表示该File目录中的所有的子文件或目录。

	注意:
    	list方法和listFiles方法遍历的是构造方法中给出的目录
    	如果构造方法中给出的目录的路径不存在,会抛出空指针异常
    	如果构造方法中给出的路径不是一个目录,也会抛出空指针异常
*/

public class Demo06File {

	public static void main(String[] args) {
		File dir = new File("F:\\Java\\JavaWorkspace\\File");
//		String[] arr01 = dir.list();
//		for (String name : arr01) {
//			System.out.println(name);
//		}
		
		File[] arr02 = dir.listFiles();
		for (File file : arr02) {
			System.out.println(file);
		}
	}
	
}
