package demo10.more_than_one_arg;

public class morethanoneArgsLambdaExp {

	public static void main(String[] args) {
		SimpleInterest si =  (principal,rate,time) -> {
			
			
			
			double simpleInterest=principal*rate*time;
			System.out.println("simpleInterest "+simpleInterest);
		};
         si.calculateSi(20000,8.5,10);
	}

}
