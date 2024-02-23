package demo3.func_methods;

import java.util.function.Function;

public class FunctMethods {
public static void main(String[] args) {
	Function<Integer,Double> half = number -> number/2.0;
	
	//half = half.andThen(number -> number*number)
	
	half = half.compose(number ->number*number);
	
	System.out.println(half.apply(20));
}
}
