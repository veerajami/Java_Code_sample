package thread.practice;


class A extends Thread{
	public void disp() {
		for(int i=0; i<6;i++) {
		System.out.println("Hi");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	public void run() {
		disp();
	
	}
}

class B extends Thread{
	public void disp() {
		for(int i=0; i<6;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	}
	public void run() {
		disp();
	
	}
}

public class ThreadDemo1 {

	public static void main(String[] args) {
		
		A a=new A();
		B b=new B();
		a.start();
		b.start(); 
		

	}

}
