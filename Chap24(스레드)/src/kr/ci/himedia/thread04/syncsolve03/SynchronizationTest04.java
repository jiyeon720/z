package kr.ci.himedia.thread04.syncsolve03;

class Bank {
	private int money = 10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	// 예금하다 
	public void deposit(int save) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m + save);
	}
	// 인출하다 
	public void withdraw(int minus) {
		int m = this.getMoney();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m - minus);
		
	}
}

class Lee extends Thread{
	@Override
	public void run() {
		synchronized (SynchronizationTest04.myBank) {
			System.out.println("입금 시작");
			SynchronizationTest04.myBank.deposit(3000);
			System.out.println("3000원 입금 : " + SynchronizationTest04.myBank.getMoney());
		}
	}
}

class Kim extends Thread{
	@Override
	public void run() {
		synchronized (SynchronizationTest04.myBank) {
			System.out.println("출금 시작");
			SynchronizationTest04.myBank.withdraw(1000);
			System.out.println("1000원 출금 : " + SynchronizationTest04.myBank.getMoney());
		}
	}
}

public class SynchronizationTest04 {
	
	public static Bank myBank = new Bank();		//공유 자원 
	
	public static void main(String[] args) throws InterruptedException {
		
		Lee threadLee = new Lee();
		threadLee.start();
		
		Thread.sleep(200);
		
		Kim threadKim = new Kim();
		threadKim.start();
		
		
		
	}

}
















