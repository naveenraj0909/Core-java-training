package com.day7;

class MyThread3 extends Thread {
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

public class ThreadExample2 {

	public static void main(String[] args) throws InterruptedException {
		MyThread3 t3 = new MyThread3();
		t3.setName("T3");
		t3.start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		t3.join();

		System.out.println("Main End");

	}

}
