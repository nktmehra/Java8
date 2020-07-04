package Java8;

interface interf{
	public void m1();
}

public class LambdaExample1 {

	public static void main(String[] args) {
		hello();
	}
	
	static void hello() {
	
		interf i = ()->System.out.println("Hello");
	}
}

