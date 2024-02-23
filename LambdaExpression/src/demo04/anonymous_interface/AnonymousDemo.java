package demo04.anonymous_interface;

public class AnonymousDemo {

	public static void main(String[] args) {
		LivingBeing livingbeing = new LivingBeing() {
			@Override
			public void eat(String foodItem) {
				System.out.println("person eats"+foodItem);
			}
			
			@Override
			public void say(String sentence) {
				System.out.println("hi"+sentence);
			}
		
		};
		livingbeing.eat("veggies");
		livingbeing.say("hi ");
	}
}
	

	


