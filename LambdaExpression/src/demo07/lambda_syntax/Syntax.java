package demo07.lambda_syntax;
@FunctionalInterface 

interface Sayable{
	public String say(String sentence);
	
}

public class Syntax {

	public static void main(String[] args) {
		//syntax1
		 Sayable sayable1 = (String sentence) -> {
			 return "iam saying"+sentence;
		 };
		 System.out.println(sayable1.say(" hi"));
		 
		 //syntax2 dropping the parameter type
		 Sayable sayable2 = (sentence) -> {
			 return "hi"+sentence;
		 };
		 System.out.println(sayable2.say(" good aftnoon"));
		 
         //syntax 3 dropping the paranthesis for single param
		 Sayable sayable3 = sentence -> {
			 return  sentence+"how r u";
	};
	System.out.println(sayable3.say("hey "));

	//dropping the single stmt return keyword
	
	Sayable sayable4 = sentence -> sentence +"what happened";
	System.out.println(sayable4.say("oops"));
}
}
