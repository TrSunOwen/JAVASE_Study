package waitandnotify;

/*
	消费者(吃货)类:是一个线程类,可以继承Thread
	设置线程任务(run):吃包子
	对包子的状态进行判断
		false:没有包子
		吃货调用wait方法进入等待状态
		true:有包子
		吃货吃包子
		吃货吃完包子
		修改包子的状态为false没有
		吃货唤醒包子铺线程,生产包子
*/

public class ChiHuo extends Thread{

	// 1.需要在成员位置创建一个包子变量
	private Baozi bz;
	
	public ChiHuo(Baozi bz) {
		super();
		this.bz = bz;
	}

	// 设置线程任务(run):吃包子
	@Override
	public void run() {
		while (true) {
			// 必须同时同步技术保证两个线程只能有一个在执行
			synchronized (bz) {
				// 对包子的状态进行判断
				if (bz.flag == false) {
					// 吃货调用wait方法进入等待状态
					try {
						bz.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				
				// 被唤醒之后执行代码，吃包子
				System.out.println("吃货正在吃：" + bz.pi + bz.xian + "包子");
				// 吃货吃完包子，修改包子的状态为false没有
				bz.flag = false;
				// 吃货唤醒包子铺线程,生产包子
				bz.notify();
				System.out.println("吃货已经把:"+bz.pi+bz.xian+"的包子吃完了,包子铺开始生产包子");
				System.out.println("----------------------------------------------------");
			}
		}
	}	
	
}
