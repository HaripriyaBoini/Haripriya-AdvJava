package demo07.deques;

import java.util.ArrayDeque;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		ArrayDeque<Double> temparetures = new ArrayDeque<Double>();
		temparetures.add(29.0);
		temparetures.add(25.4);
		temparetures.addFirst(98.2);
		temparetures.add(31.0);
		temparetures.add(38.7);
		System.out.println(temparetures);
		
		temparetures.offerLast(99.9);
		System.out.println(temparetures);
		
		temparetures.offerFirst(32.9);
		System.out.println(temparetures);
		
		Double result = temparetures.getLast();
		System.out.println(result);
		
		
		 result = temparetures.peekLast();
		System.out.println(result);
		
		result = temparetures.peek();
		System.out.println(result);
		
		 result = temparetures.peekFirst();
		 System.out.println(result);
		//System.out.println(result);
		
		System.out.println(temparetures);
		
		result = temparetures.pollFirst();
		System.out.println(result);
		System.out.println(temparetures);
		
		result = temparetures.removeFirst();
		System.out.println(temparetures);
		
	}

}
