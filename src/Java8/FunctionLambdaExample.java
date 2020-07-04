package Java8;

import java.util.function.Function;

public class FunctionLambdaExample {

	public static void main(String[] args) {
		String str = "jasdkjkdjsk";
		Function<String,Integer> f =s->s.length();
		System.out.println(f.apply(str));
	}

}
