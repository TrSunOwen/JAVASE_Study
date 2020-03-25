package getthreadname;

/*
	获取线程的名称:
    	1.使用Thread类中的方法getName()
        String getName() 返回该线程的名称。
    	2.可以先获取到当前正在执行的线程,使用线程中的方法getName()获取线程的名称
        static Thread currentThread() 返回对当前正在执行的线程对象的引用。
*/
public class MyThread extends Thread{
	
	// 重写run方法
	@Override
	public void run() {
		// 获取线程名称
//		String name = getName();
//		System.out.println(name);
		
//		Thread t = Thread.currentThread();
//		System.out.println(t);
		// 以下为结果
//		Thread[Thread-0,5,main]
//		Thread[Thread-2,5,main]
//		Thread[Thread-1,5,main]
		
		System.out.println(Thread.currentThread().getName()); // Thread-0 Thread-2 Thread-1
	}

	
	
}
