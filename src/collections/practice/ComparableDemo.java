package collections.practice;

public class ComparableDemo {

	public static void main(String[] args) {
		
		

	}

}

class Employee implements Comparable{
	
	int id;
	String name;
	public Employee(String name,int id) {
		this.id=id;
		this.name=name;
	}
	@Override
	public int compareTo(Object o) {
		
		return 0;
	}
	
}