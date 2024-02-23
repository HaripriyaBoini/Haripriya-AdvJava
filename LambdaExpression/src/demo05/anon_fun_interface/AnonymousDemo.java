package demo05.anon_fun_interface;

public class AnonymousDemo {

	public static void main(String[] args) {
		LivingBeing livingbeing = new LivingBeing() {

			@Override
			public void eat(String foodItem) {
				 System.out.println("livingbeing eats"+foodItem);
				
			}
			
		};
		livingbeing.eat("veg");
	}

}
