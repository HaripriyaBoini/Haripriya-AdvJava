package demo07.lambda_syntax;
interface Addable{
	int add(int num1,int num2);
}
public class syntax2 {

	public static void main(String[] args) {
		Addable addable = (int num1,int num2) -> {
			return num1+num2;
		};
		System.out.println(addable.add(10,20));
		System.out.println(addable.add(110,120));
	}

}
