package demo11.returningvalue;

public class returning_valueLambdaExp {

	public static void main(String[] args) {
		SimpleInterest si =  (principal,rate,time) -> {
			
			
			
			double simpleInterest=principal*rate*time;
			System.out.println("simpleInterest "+simpleInterest);
		
		return simpleInterest;
		};
         double s =si.calculateSi(20000,8.5,10);
         System.out.println("return back"+s);
	}

}
