package kr.ci.himedia.thread03;

import java.io.IOException;

public class TerminateThread extends Thread{

	private boolean flag = false;
	
	public TerminateThread(String name) {
		super(name);
		
	}
	
	@Override
	public void run() {
		while(!flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " end");
	}
	
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {
		
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int input;
		while(true) {
			input = System.in.read();
			if(input == 'A')
				threadA.setFlag(true);
			else if (input =='B')
				threadB.setFlag(true);
			else if (input == 'C')
				threadC.setFlag(true);
			else if (input == 'M')
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			
		}
	System.out.println("main end");
	}
	
}












