package democopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * 用缓冲流复制文件
 */

public class Demo02Copy {

	public static void main(String[] args) throws IOException {
		long t1 = System.currentTimeMillis();
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src\\democopy\\test.jpg"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\test.jpg"));
		
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = bis.read(bytes)) != -1) {
			bos.write(bytes, 0, len);
		}
		
		long t2 = System.currentTimeMillis();
		System.out.println("耗时： " + (t2-t1) + "毫秒"); //1毫秒
	}
	
}
