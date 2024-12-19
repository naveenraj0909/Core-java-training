package com.day10;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(10);

		System.out.println("---Queue---");
		System.out.println(queue);
		
		queue.poll(); // First In First Out. So it will remove first element 10
		System.out.println(queue);
		queue.poll();
		System.out.println(queue);
		
		
	}

}
