package demo08.sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> numbers =  new TreeSet<Integer>();
		numbers.add(0);
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		
		System.out.println(numbers);
		
		NavigableSet<Integer> reversenumbers = numbers.descendingSet();
		System.out.println(reversenumbers);
		System.out.println(numbers);
		
		NavigableSet<Integer> n = numbers.tailSet(3,false); // not includes 3 & print 4 5 6 
		System.out.println(n);
		
		Integer result = numbers.lower(3);// prints first lower than 3 ie, 2
		System.out.println(result);
		
		result = numbers.floor(3);  // returns its elem
		System.out.println(result);
		
		result = numbers.higher(3);
		System.out.println(result);
		
		result = numbers.ceiling(3);
		System.out.println(result);
		
		System.out.println(numbers);
		
		result = numbers.pollFirst();
		System.out.println(numbers);
		
	}

}
