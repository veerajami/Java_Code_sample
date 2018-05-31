package thread.practice;

class Count{
	int counter;
	
	public synchronized void setCounter() {
		for(int i=0;i<20000;i++)
		counter++;
	}
}


public class SynchronizedDemo {

	public static void main(String[] args) throws Exception{
	

		Count c=new Count();
		Thread t1=new Thread(()->{
					c.setCounter();
						});
		Thread t2=new Thread(()->{
									c.setCounter();		
									});
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		
		
		System.out.println(c.counter);
	}

}
