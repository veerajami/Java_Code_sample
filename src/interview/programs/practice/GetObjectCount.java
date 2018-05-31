package interview.programs.practice;

public class GetObjectCount {

	public static void main(String[] args) {
		
		A a=new A();
		A aa=new A();
		A aaa=new A();

	}

}
class A{
	static int counter;
	public A() {
		counter+=1;
		getCount();
	}
	public void getCount() {
		System.out.println("Objects Created : "+counter);
	}
	
}