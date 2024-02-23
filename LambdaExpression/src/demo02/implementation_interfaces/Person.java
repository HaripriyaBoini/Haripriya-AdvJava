package demo02.implementation_interfaces;

public class Person implements LivingBeing {

	@Override
	public void eat(String foodItem) {
		System.out.println("person eats"+foodItem);
	}

	@Override
	public void say(String sentence) {
		System.out.println("hi hello"+sentence);
		
	}

}