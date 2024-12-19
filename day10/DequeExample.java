package com.day10;

import java.util.Deque;
import java.util.LinkedList;

public class DequeExample {

	public static void main(String[] args) {
		Deque<Integer> deque = new LinkedList<>();

		deque.offer(10);
		deque.offer(20);
		deque.offer(30);
		deque.offer(40);
		deque.offer(10);
		
		deque.offerFirst(80);
		deque.offerLast(100); 

		System.out.println("---DeQue---");
		System.out.println(deque);

		deque.poll(); // First In First Out. So it will remove first element
		System.out.println(deque);
		deque.pollFirst();
		System.out.println(deque);
		deque.pollLast();
		System.out.println(deque);

	}

}
