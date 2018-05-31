package other;

public class Test1 {

	
	void m1(String str) {
		System.out.println("string");
	}
	
	void m1(int str) {
		System.out.println("int");
	}
	void m1(Object str) {
		System.out.println("Object");
	}
	public static void main(String[] args) {
		
		new Test1().m1(null);;
		
	}

}
