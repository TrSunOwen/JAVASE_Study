package democopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
文件复制练习:一读一写

明确:
    数据源: src\democopy\test.jpg
    数据的目的地: F:\test.jpg

文件复制的步骤:
    1.创建一个字节输入流对象,构造方法中绑定要读取的数据源
    2.创建一个字节输出流对象,构造方法中绑定要写入的目的地
    3.使用字节输入流对象中的方法read读取文件
    4.使用字节输出流中的方法write,把读取到的字节写入到目的地的文件中
    5.释放资源
*/

public class Demo01Copy {

	public static void main(String[] args) throws IOException {
		long t1 = System.currentTimeMillis();
		
		// 创建一个字节输入流对象,构造方法中绑定要读取的数据源
		FileInputStream fis = new FileInputStream("src\\democopy\\test.jpg");
		// 创建一个字节输出流对象,构造方法中绑定要写入的目的地
		FileOutputStream fos = new FileOutputStream("F:\\test.jpg");
		// 一次读取一个字节写入一个字节的方式
//		int len = 0;
//		while ((len = fis.read()) != -1) {
//			// 边读边写
//			fos.write(len);
//		}
		
		// 使用缓冲数组
		byte[] bytes = new byte[1024];
		int len = 0;
		while ((len = fis.read(bytes)) != -1) {
			fos.write(bytes, 0, len);
		}
		
		// 释放资源，先关写的，后关读的
		fos.close();
		fis.close();
		
		long t2 = System.currentTimeMillis();
		
		System.out.println("复制花费时间为：" + (t2 - t1) + "毫秒！"); // 52毫秒
	}
	
}
