package demo08.sets;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Double> temparetures = new TreeSet<Double>();
		temparetures.add(34.2);
		temparetures.add(24.1);
		temparetures.add(22.2);
		temparetures.add(10.8);
		temparetures.add(19.5);
		
		
		System.out.println(temparetures);
		
		//temparetures.add(null);  ->get null pointerexception
		
	}

}
