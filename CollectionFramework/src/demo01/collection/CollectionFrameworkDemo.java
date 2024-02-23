package demo01.collection;

import java.util.ArrayList;

public class CollectionFrameworkDemo {

	public static void main(String[] args) {
		 ArrayList<String> fruits = new ArrayList<String>();
	        fruits.add("Apples");
	        fruits.add("Bananas");
	        fruits.add("oranges");

	        System.out.println(fruits);

	        fruits.add(1, "Watermelon");
	        System.out.println(fruits);

	        fruits.set(2, "grapes");
	        System.out.println(fruits);

	        String removedFruitName = fruits.remove(2);
	        System.out.println(fruits);
	        System.out.println(removedFruitName);

	        boolean areGrapesRemoved = fruits.remove("grapes");
	       // System.out.println(fruits);
	        if (areGrapesRemoved) {
	            System.out.println("Fruit is removed");
	        } else {
	            System.out.println("Fruit is not removed");
	        }

	        System.out.println(fruits);

	        ArrayList<String> moreFruits = new ArrayList<String>();
	        moreFruits.add("Grapes");
	        moreFruits.add("Bananas");

	        moreFruits.add("Watermelon");
	        moreFruits.add("PineApple");
	        moreFruits.add("Apples");
	        moreFruits.add(null);

	        System.out.println(moreFruits);
	        fruits.addAll(moreFruits);
	        System.out.println(fruits);

	        if (fruits.contains(null)) {
	            fruits.remove(null);

	            fruits.removeIf(fruit -> fruit .startsWith("A"));

	            System.out.println(fruits);
	            fruits.add("Apples");

	            System.out.println("------------------------------------------");
	            System.out.println(fruits);
	            fruits.retainAll(moreFruits);               //A-B=B

	            fruits.removeAll(moreFruits);
	            System.out.println(fruits);//A-B=A

	            fruits.clear();
	            System.out.println(fruits);
	        }
			 
	}

}
