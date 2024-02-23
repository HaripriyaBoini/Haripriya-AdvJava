package demo06.queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Integer> numbers = new PriorityQueue<Integer>();
		numbers.add(5);
		numbers.add(1);
		numbers.add(3);
		numbers.add(10);
		numbers.add(6);
		System.out.println(numbers);
		
		numbers.offer(9);
		System.out.println(numbers);
		
		Integer i = numbers.peek();
		System.out.println(i);
		System.out.println(numbers);
		
		//numbers.clear();  --->displays null
		i = numbers.poll();
		System.out.println(i);
		System.out.println(numbers);
		
		//numbers.clear();  --->displays exceptionerror
		i=numbers.remove();
		System.out.println(i);
		System.out.println(numbers);
		
		
	}

}
