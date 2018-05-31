package other;

class A{
	public static  void demo() {
		System.out.println("Ademo method");
	}
}
class B extends A{
	
	public static  void demo() {
		System.out.println("Bdemo method");
	}
	public static  void disp() throws Exception{
		System.out.println("Bdisp method");
	}
}

class C extends B{
	public static  void disp() {
		System.out.println("cdisp method");
	}
	public static  void print() {
		System.out.println("Cprint method");
		
	}
}
public class InheritanceDemo{


	
	public static void main(String[] args) {
		
/*		String s="vin";
		switch(s) {
		case "vin":System.out.println("itsvinod");
					break;
		}*/
		A a=new A();
		A a1=new B();
		a1.demo();
		
		A a2=new C();
		
		B b=(B)new A();
		
	
	}
	
	public static final void demo() {
		System.out.println("e demo");
	}
	

}
