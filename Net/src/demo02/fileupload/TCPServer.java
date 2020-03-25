package demo02.fileupload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
文件上传案例服务器端:读取客户端上传的文件,保存到服务器的硬盘,给客户端回写"上传成功"

明确:
    数据源:客户端上传的文件
    目的地:服务器的硬盘 D:\\upload\\test.jpg 

实现步骤:
    1.创建一个服务器ServerSocket对象,和系统要指定的端口号
    2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
    3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
    4.判断d:\\upload文件夹是否存在,不存在则创建
    5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
    6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
    7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
    8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
    9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
    10.释放资源(FileOutputStream,Socket,ServerSocket)
*/

public class TCPServer {

	public static void main(String[] args) throws IOException {
		// 1.创建一个服务器ServerSocket对象,和系统要指定的端口号
		ServerSocket server = new ServerSocket(8888);
		
		// 2.使用ServerSocket对象中的方法accept,获取到请求的客户端Socket对象
		Socket socket = server.accept();
		
		// 3.使用Socket对象中的方法getInputStream,获取到网络字节输入流InputStream对象
		InputStream is = socket.getInputStream();
		
		// 4.判断D:\\upload文件夹是否存在,不存在则创建
		File file = new File("D:\\upload");
		if (!file.exists()) {
			file.mkdir();
		}
		
		// 5.创建一个本地字节输出流FileOutputStream对象,构造方法中绑定要输出的目的地
		FileOutputStream fos = new FileOutputStream(file + "\\test.jpg");
		
		// 6.使用网络字节输入流InputStream对象中的方法read,读取客户端上传的文件
		int len = 0;
		byte[] bytes = new byte[1024];
		while ((len = is.read(bytes)) != -1) {
			// 7.使用本地字节输出流FileOutputStream对象中的方法write,把读取到的文件保存到服务器的硬盘上
			fos.write(bytes, 0, len);
		}
		
		// 注意，运行之后发现程序没有停止。根本原因就是is.read方法读取客户端上传的文件，永远读取不到文件结束的标记，因为-1根本不会在上面的
		// while循环里被读到，也就是结束标记根本没被读取，因此8，9，10不会被执行，一直等在那边，也不会给客户端回写上传成功。这种现象叫做阻塞
		/*
    	解决:上传完文件,给服务器写一个结束标记
    	void shutdownOutput() 禁用此套接字的输出流。
    	对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
		 */
		
		// 8.使用Socket对象中的方法getOutputStream,获取到网络字节输出流OutputStream对象
		// 9.使用网络字节输出流OutputStream对象中的方法write,给客户端回写"上传成功"
		socket.getOutputStream().write("上传成功！".getBytes());
		
		// 10.释放资源(FileOutputStream,Socket,ServerSocket)
		fos.close();
		socket.close();
		server.close();
	}
	
}
