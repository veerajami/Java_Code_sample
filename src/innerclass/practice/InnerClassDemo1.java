package innerclass.practice;



/*class  {

	public static void main(String[] args) {
		
		Demo d=new Demo();
		Demo1 d1=d.new Demo1();
		Demo.Demo2 d2=new Demo.Demo2();
		
	}
	
	}*/

public class InnerClassDemo1{
	
public class Demo1{
		
		public void print() {
			System.out.println("print inside Demo1");
		}
	}

public	static class Demo2{
		public void print() {
			System.out.println("print inside Demo2");
		}
		public static void disp() {
			System.out.println("disp inside Demo2");
			
		}
		
	}

	
}