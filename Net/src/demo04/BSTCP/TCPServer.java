package demo04.BSTCP;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
    创建BS版本TCP服务器
 */

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1.创建一个服务器ServerSocket对象,和系统要指定的端口号
		ServerSocket server = new ServerSocket(8080);
		
		// 2.使用ServerSocket对象中的方法accept,获取到请求的客户端（浏览器）Socket对象
		Socket socket = server.accept();
		
		// 3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
		InputStream is = socket.getInputStream();
		
		// 4.使用网络字节输入流InputStream对象中的方法read,读取客户端的请求信息
//		byte[] bytes = new byte[1024];
//		int len = 0;
//		while ((len = is.read(bytes)) != -1) {
//			System.out.println(new String(bytes, 0, len));
//		}
		
		// GET /Net/web/index.html HTTP/1.1;我们只需要/Net/web/index.html
		// 把is网络字节输入对象，转换为字符缓冲输入流
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		// 把客户端请求信息的第一行读取出来 GET /Net/web/index.html HTTP/1.1;
		String line = br.readLine();
		// 把读取的信息进行切割，留下/Net/web/index.html
		String[] arr = line.split(" ");
		// 把路径前面的/去掉。获得最终路径Net/web/index.html
		String htmlpath = arr[1].substring(1);
		
		// 创建一个本地的字节输入流，构造方法中绑定要读取的htmlpath
		FileInputStream fis = new FileInputStream(htmlpath);
		
		// 使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
		OutputStream os = socket.getOutputStream();
		
		// 写入HTTP协议响应头，固定写法
		os.write("HTTP/1.1 200 OK\r\n".getBytes());
		os.write("Content-Type:txt/html\r\n".getBytes());
		// 必须要写入空行，否则浏览器不解析
		os.write("\r\n".getBytes());
		
		// 一读一写复制文件,把服务读取的html文件回写到客户端
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = fis.read(bytes)) != -1) {
			os.write(bytes, 0, len);
		}
		
		// 释放资源
		fis.close();
		socket.close();
		server.close();
	}
	
}
