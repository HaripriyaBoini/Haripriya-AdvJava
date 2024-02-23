package demo07.deques;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Double> percentages = new LinkedList<Double>();
		percentages.add(89.1);
		System.out.println(percentages);
		
		percentages.addLast(63.1);
		System.out.println(percentages);
		
		percentages.offer(78.2);
		System.out.println(percentages);
		
		//percentages.clear();
		
		Double result = percentages.getFirst();
		System.out.println(result);
		
		System.out.println(percentages);
		
		result = percentages.peek();
		System.out.println(result);
		
		result = percentages.peekFirst();           //peekFirst returns null but remove returns an exception
		System.out.println(result);
		
		result = percentages.pollFirst();
		System.out.println(result);
		
		System.out.println(percentages);
		
		result = percentages.removeLast();
		System.out.println(percentages);
		
		percentages.pollLast();
		System.out.println(percentages);
		
	}
}
