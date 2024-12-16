package com.day7;

class MyThread extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName()+" is running");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class OwnThreadExample {

	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		t1.setName("T1");
		t1.start();
		System.out.println("MAIN END");
		System.out.println("Hello");
		
		MyThread t2 = new MyThread();
		t2.setName("T2");
		t2.start();

	}

}
