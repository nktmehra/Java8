package Java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalLambdaExample2 {

	public static void main(String[] args) {
		ArrayList<Employee> elist = new ArrayList<>();
		elist.add(new Employee("Ankit", 2));
		elist.add(new Employee("Hemen", 3));
		elist.add(new Employee("Aditya", 1));
		elist.add(new Employee("Ajay", 7));
		
		Predicate<Employee> p = e->{
			String name =e.name;
			if(name.length()>5) {
				System.out.println("Employee Name(Predicate) - "+name);
				System.out.println("**************************");
			};
			return false;
		};
		
		Function<Employee,Integer> f = e->
		{
			int id = e.id;
			if(e.id%2!=0) {
				System.out.println("Employee Name(Function) - "+e.name);
				System.out.println("**************************");
			}
			
			return id;
		};
		
		Consumer<Employee> c = e->
		{
			System.out.println("Employee Id (Consumer)- "+e.id);
			System.out.println("**************************");
		};
		
		for(Employee e1 : elist) {
			p.test(e1);
			f.apply(e1);
			c.accept(e1);
		}
	}
			
		

	

}
