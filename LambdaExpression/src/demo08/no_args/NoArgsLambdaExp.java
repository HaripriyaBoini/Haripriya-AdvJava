package demo08.no_args;

public class NoArgsLambdaExp {

	public static void main(String[] args) {
		SimpleInterest si = () -> {
			double principal=1000;
			double rate=8.5;
			double time=10;
			
			double simpleInterest=principal*rate*time;
			System.out.println("simpleInterest "+simpleInterest);
		};
         si.calculateSi();
	}

}
