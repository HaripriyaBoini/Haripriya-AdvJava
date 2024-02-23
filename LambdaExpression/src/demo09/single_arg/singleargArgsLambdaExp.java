package demo09.single_arg;

public class singleargArgsLambdaExp {

	public static void main(String[] args) {
		SimpleInterest si =  principal -> {

			double rate=8.5;
			double time=10;
			
			double simpleInterest=principal*rate*time;
			System.out.println("simpleInterest "+simpleInterest);
		};
         si.calculateSi(20000);
	}

}
