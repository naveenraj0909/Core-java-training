package com.day7;

class MyThread1 extends Thread {
	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {

			}
		}
	}
}

public class ThreadExample {

	public static void main(String[] args) {
		MyThread1 t1 = new MyThread1();
		t1.setName("T1");
		t1.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println(t1.getState());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}

		System.out.println("Main end");
	}

}
