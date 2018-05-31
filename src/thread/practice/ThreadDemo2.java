package thread.practice;

class X implements Runnable{
	public void disp() {
		for(int i=0;i<=100;) {
			i=i+2;
		}
	}
	public void run() {
		
	}
}

public class ThreadDemo2 {

	public static void main(String[] args) throws InterruptedException {

		Thread t1=new Thread(()-> {
			for(int i=0; i<6;i++) {
			System.out.println("Hi");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	});
		Thread t2=new Thread(()-> {
			for(int i=0; i<6;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
	});
		
		Thread t3=new Thread(()->{
			System.out.println("print");
		});
		
		
		Thread t4=new Thread() {
			public void run() {
				
			}
		};
		
		
		t1.start();
		Thread.sleep(500);
		t2.start();

	}

}
