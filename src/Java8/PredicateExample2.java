package Java8;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PredicateExample2 {

	public static void main(String[] args) {

		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Ankit", 2));
		elist.add(new Employee("Hemen", 3));
		elist.add(new Employee("Aditya", 1));
		elist.add(new Employee("Ajay", 7));
		Predicate<Employee> p =e->(e.id>2);
		for(Employee e1 : elist) {
			if(p.test(e1)) {
				System.out.println(e1);
			}
		}
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(62);
		list.add(25);
		list.add(74);
		list.add(35);
		list.add(26);
		Predicate<Integer> p1 = i->(i>20);
		Predicate<Integer> p2 = i->(i%2==0);
		for(int i1 : list) {
			if(p1.negate().test(i1)) {
				System.out.println(i1);
			}
		}
		System.out.println();
		for(int i1 : list) {
			if(p1.and(p2).test(i1)) {
				System.out.println(i1);
			}
		}
		System.out.println();
		for(int i1 : list) {
			if(p1.or(p2).test(i1)) {
				System.out.println(i1);
			}
		}
	}
	
	


}
