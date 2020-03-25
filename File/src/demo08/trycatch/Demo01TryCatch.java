package demo08.trycatch;

/*
在jdk1.7之前使用try catch finally 处理流中的异常
格式:
    try{
        可能会产出异常的代码
    }catch(异常类变量 变量名){
        异常的处理逻辑
    }finally{
        一定会指定的代码
        资源释放
    }
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01TryCatch {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("src\\democopy\\test.jpg");
			fos = new FileOutputStream("F:\\test.jpg");

			byte[] bytes = new byte[1024];
			int len = 0;
			while ((len = fis.read(bytes)) != -1) {
				fos.write(bytes, 0, len);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

		}
	}
	
}
