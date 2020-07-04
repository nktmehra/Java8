package Java8;

interface interf1{
	public int arithmeticOperations(int a, int b);
}
public class LambdaExample2 {

	public static void main(String[] args) {

		add();
		subtract();
		multiply();
		divide();
	}
	
	
	 static void add() {
		
		interf1 addition = (a,b)->{return(a+b);};
		System.out.println("Addition of two numbers are - "+addition.arithmeticOperations(10, 20));
	}
	
	static void subtract() {
		interf1 subtraction = (a,b)->(a-b);
		System.out.println("Subtraction of two numbers are - "+subtraction.arithmeticOperations(546, 125));
	}
	
	static void multiply() {
		interf1 multiplication =(a,b)->(a*b);
		System.out.println("Multiplication of two numbers are - "+multiplication.arithmeticOperations(548,856));
	}
	
	static void divide() {
		interf1 division =(a,b)->(a/b);
		System.out.println("Division of two numbers are - "+division.arithmeticOperations(786, 2));
	}

}
