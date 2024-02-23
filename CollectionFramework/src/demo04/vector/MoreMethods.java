package demo04.vector;

import java.util.ArrayList;
import java.util.function.Consumer;

public class MoreMethods {

	public static void main(String[] args) {
		
		 ArrayList<String> fruits = new ArrayList<String>();
	        fruits.add("Apples");
	        fruits.add("Bananas");
	        fruits.add("oranges");

	        System.out.println(fruits);

		ArrayList<String> veggies = new ArrayList<String>(3);
		veggies.add("tomatoes");
		veggies.add("onion");
		veggies.add("potatoes");
		veggies.add("spinach");
		
		System.out.println(veggies);
		System.out.println(veggies.get(2));
		for(int i=0;i<veggies.size();i++) {
			System.out.println(veggies.get(i));
		}
			boolean  result = veggies.equals(fruits);
			System.out.println(result);
			
			veggies.forEach(vegetable->System.out.println("iam buying"+vegetable));  
			
			//void forEach(Consumer<? super E> action) {
			//public interface Consumer<T> {

			//void accept(T t){}
			
			System.out.println(veggies.size());
			veggies.remove(2);
			System.out.println(veggies.size());
			
			if(veggies.contains("potato"))
			{
				System.out.println(veggies);
			}else {
					System.out.println("veggies doesnot have potatoes");
				}
			System.out.println(veggies);
			System.out.println(veggies.size());
			
			veggies.clear();
			System.out.println(veggies.size());
			
			if(veggies.isEmpty()) {
				System.out.println("the bag is empty");
				
			}
				
			
			
			
			
				
			
			
			
			
			
		
		

	}

}
