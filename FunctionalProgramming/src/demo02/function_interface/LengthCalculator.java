package demo02.function_interface;

import java.util.function.Function;

public class LengthCalculator implements Function<String,Integer>{
	
	@Override
	public Integer apply(String str) {
		return str.length();
	}
}

	


