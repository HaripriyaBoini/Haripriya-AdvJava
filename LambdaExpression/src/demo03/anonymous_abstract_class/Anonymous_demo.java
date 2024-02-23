package demo03.anonymous_abstract_class;

public class Anonymous_demo {

	public static void main(String[] args) {
		LivingBeing livingbeing = new LivingBeing() {
		
		@Override
		void eat(String foodItem) {
			System.out.println("person  eat"+foodItem);
		}
			
			void say(String sentence) {
				System.out.println("person says"+sentence);
			}
	};
	       livingbeing.eat("veggies");
           livingbeing.say("hi");
}
}
