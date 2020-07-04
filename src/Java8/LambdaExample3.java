package Java8;

interface interf2{
	public int sqaure(int a);
}
public class LambdaExample3 {

	public static void main(String[] args) {
		squareIt();
	}
	
	static void squareIt() {
		interf2 square = a->a*a;
		System.out.println("Square of the number is - "+square.sqaure(12));
	}
	
}
