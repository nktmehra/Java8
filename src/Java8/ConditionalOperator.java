package Java8;

public class ConditionalOperator {

	public static void main(String[] args) {
		conditionalOperator();

	}

	static void conditionalOperator() {
		int x = (10 > 20) ? 5 : (40 < 100) ? 1000000 : 10;
		System.out.println(x);
	}

}
