package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Employee1 {

	public static void main(String[] args) {

		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(63);
		list.add(25);
		list.add(74);
		list.add(35);
		list.add(26);

		System.out.println(list.toString());
		Comparator<Integer> c = (I1,I2)->(I1>I2)?1:(I1<I2)?-1:0;
		Collections.sort(list, c);
		
		ArrayList<Employee> elist = new ArrayList<Employee>();
		elist.add(new Employee("Ankit", 2));
		elist.add(new Employee("Hemen", 3));
		elist.add(new Employee("Aditya", 1));
		elist.add(new Employee("Ajay", 7));
		System.out.println(elist.toString());
		Comparator<Employee> c1 = (e1,e2)->(e1.id>e2.id)?1:(e1.id<e2.id)?-1:0;
		Collections.sort(elist, c1);
		System.out.println(elist.toString());
		Comparator<Employee> c2 = (e1,e2)->e1.name.compareTo(e2.name);
		Collections.sort(elist, c2);
		System.out.println(elist.toString());
		
	}
	

}
