package kr.ci.himedia.thread03;
/*
 * 1부터 50,
 * 51부터 100까지의 합을 구하는 두개의 Thread를 만들어 그 결과를 출력하시오.
 */
public class JoinTest2 extends Thread{

	int start, end, total;
	
	public JoinTest2(int start, int end) {
		this.start = start;
		this.end = end;
	}
	
	@Override
		public void run() {
		int i;
		for(i=start; i<=end; i++)
			total +=i;
		}
	

	
	public static void main(String[] args) {
		System.out.println(Thread.currentThread() + " start");
		
		JoinTest2 jt1 = new JoinTest2(1, 50);
		JoinTest2 jt2 = new JoinTest2(51, 100);
		
		jt1.start();
		jt2.start();
		
		try {	
			jt1.join();				//main 스레드는 not running 상태로 됨 
			jt2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("jt1.total = " + jt1.total);
		System.out.println("jt2.total = " + jt2.total);
		
		int sum = jt1.total + jt2.total;		//main 스레드는 jt1,jt2 실행이 끝날때까지 기다림  
		System.out.println("sum = " + sum);
		
		System.out.println(Thread.currentThread() + " end");
		
		
		
	}
}
















