package Java8;

public class Employee {
	

	public String name;
	public int id;
	
	public Employee(String name, int id) {
		this.name  = name;
		this.id = id;
	}
	
	public String toString() {
		return "Name: "+name+ "| id: "+id;
	}
	

}
