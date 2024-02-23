package demo08.sets;

import java.util.HashSet;

public class HashSetUserDefClass {

	public static void main(String[] args) {
		HashSet<Product> productSet = new HashSet<Product>();
		productSet.add(new Product(123,"LG","TV"));
		Product p = new Product(120,"LG","TV");
		productSet.add(p);
		
		productSet.add(new Product(124,"LG","Microwave"));
		productSet.add(new Product(125,"LG","Watch"));
		productSet.add(new Product(122,"Apple","TV"));
		productSet.add(new Product(121,"Apple","Watch"));
		
		productSet.add(p);
		productSet.add(null);
		
		
		System.out.println(productSet);
		
		

	}

}
