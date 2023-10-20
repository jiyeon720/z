package kr.ci.himedia.thread;

class MyThread extends Thread{

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + "시작");

		int i;
		for(i = 0; i<20; i++)
			System.out.print(i + "\t");

		System.out.println(Thread.currentThread() + "끝");	
	}
}
public class ThreadTest {


	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread() + "시작");
		
		MyThread thread = new MyThread();
		thread.start();
		
		MyThread thread2 = new MyThread();
		thread2.start();
		
		System.out.println(Thread.currentThread() + "끝");
		
		
	}


}










