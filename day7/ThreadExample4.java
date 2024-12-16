package com.day7;

class TwoTable implements Runnable{
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.out.println(i + " * 2 = "+ (i*2));
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}

class FiveTable extends Thread{
	@Override
	public void run() {
		for(int i = 1;i<=10;i++) {
			System.err.println(i + " * 5 = "+ (i*5));
			try {
				Thread.sleep(3000);
			}
			catch(InterruptedException e) {
			}
		}
	}
}
public class ThreadExample4 {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1= new Thread(new TwoTable());
		t1.setName("Two");
		System.out.println("Tables of 2.");
		t1.start();
		
		t1.join();
		System.out.println("------------");
		System.out.println("Tables of 5.");
		
		FiveTable t2 = new FiveTable();
		t2.setName("Five");
		t2.start();
		
	}

}
