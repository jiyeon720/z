package kr.ci.himedia.thread;

/*
 * ● 20 미만의 짝수 출력 (0,2,4~18)
 * ● 10 미만의 수 출력 (9~1)
 * ● 
 */

public class MultiThreadTest {

	public static void main(String[] args) {

		Runnable tesk1 = () -> {

			for(int i=0; i<20; i+=2) {		// 20미만 짝수 출력
				System.out.print(i + " ");

				try {
					Thread.sleep(1000);		// 1000밀리세컨드 = 1초 씩 쉬면서 결과 나옴
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

		Runnable tesk2 = () -> {
			for(int i=9; i>0; i-=1) {		// 10미만 짝수 출력
				System.out.print("(" + i + ")" + " ");

				try {
					Thread.sleep(500);		// 500밀리세컨드 = 0.5초 씩 쉬면서 결과 나옴
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}

			}


		};


		Thread thread = new Thread(tesk1);
		thread.start();
		System.out.println();

		Thread thread2 = new Thread(tesk2);
		thread2.start();


	}


}
