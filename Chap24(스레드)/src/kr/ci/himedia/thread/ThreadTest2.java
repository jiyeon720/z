package kr.ci.himedia.thread;

class MyThread2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "시작");

		int i;
		for(i = 0; i<20; i++)
			System.out.print(i + "\t");

		System.out.println(Thread.currentThread() + "끝");	
		
	}
	
}

public class ThreadTest2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "시작");
		
		MyThread2 runnable = new MyThread2();
		Thread thread = new Thread(runnable);
		thread.start();
	
		
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();
		
		Runnable anonymousThread = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("anonymous running");
				
			}
		};
		
		anonymousThread.run();
		
		System.out.println(Thread.currentThread() + "끝");
		
		
		
		
	}
	
}
