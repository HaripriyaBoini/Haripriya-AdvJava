package demo04.predicate;

import java.util.function.Predicate;

public class PredicateIntMethods {

	public static void main(String[] args) {
		//Defination 1
		Predicate<Integer> greaterThan10 =i -> i>10;
		
		//Defination 2
		Predicate<Integer> lowerThan20 = i -> i<20;
		
		boolean result = greaterThan10.and(lowerThan20).test(15);
		System.out.println(result);
		
		//first test for 'or'and then for 'and'
		result = greaterThan10.and(lowerThan20).negate().test(15);  //ie., !(25>10 & 25<20)
		System.out.println(result);
		
	}

}
