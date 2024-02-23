package demo06.lambda_funct_interface;

import demo05.anon_fun_interface.LivingBeing;

public class LambdaDemo {

	
		public static void main(String[] args) {
			LivingBeing livingbeing = 

			
				(String foodItem) -> {
					 System.out.println("livingbeing eats  "+foodItem);
					
				};
				
		
			livingbeing.eat("veg");
		}

	}


