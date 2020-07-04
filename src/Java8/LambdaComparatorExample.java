package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LambdaComparatorExample {

	public static void main(String[] args) {
		sortIntegers();
		sortEmployee();
	}
	
	static void sortIntegers() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(25);
		list.add(52);
		list.add(41);
		list.add(36);
		Comparator<Integer> c = (I1,I2)->(I1>I2)?-1:(I1<I2)?1:0;
		Collections.sort(list,c);
		System.out.println(list);
	}
	
	static void sortEmployee() {
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Ankit", 2));
		elist.add(new Employee("Hemen", 3));
		elist.add(new Employee("Aditya", 1));
		elist.add(new Employee("Ajay", 7));
		Comparator<Employee> c = (e1,e2)->(e1.id>e2.id)?-1:(e1.id<e2.id)?1:0;
		Collections.sort(elist,c);
		System.out.println(elist);
		System.out.println();
		Collections.sort(elist, (e1,e2)->-e1.name.compareTo(e2.name));
		System.out.println(elist);
		System.out.println();
		
	}


}
