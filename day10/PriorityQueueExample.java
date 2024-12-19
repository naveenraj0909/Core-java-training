package com.day10;
import java.util.PriorityQueue;

public class PriorityQueueExample {

	public static void main(String[] args) {
		PriorityQueue<Integer> pqueue = new PriorityQueue<>();
		pqueue.offer(20);
		pqueue.offer(40);
		pqueue.offer(60);
		pqueue.offer(10);
		pqueue.offer(50);
		pqueue.offer(20);
		
		System.out.println("---Priority Queue---");
		System.out.println(pqueue);
		
		pqueue.poll();
		System.out.println("----After poll()----");
		System.out.println(pqueue);

	}

}
