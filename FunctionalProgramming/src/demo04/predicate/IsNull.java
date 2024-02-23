package demo04.predicate;

import java.util.function.Predicate;

public class IsNull implements Predicate<String> {

	@Override
	public boolean test(String str) {
		
		return str == null;
		
	}

}
