package thread.practice;


class Value{
	int value;
	boolean valSet=false;
	
	public synchronized void set(int value) {
		while(valSet) {
			try {wait();}catch(Exception e) {};
		}
		this.value=value;
		valSet=true;
		System.out.println("Set : "+value);
		notify();
	}
	
	public synchronized void get() {
		while(!valSet) {
			try {wait();}catch(Exception e) {};
		}
		System.out.println("Get : "+value);
		valSet=false;
		notify();
	}
	
}

class Producer implements Runnable{
	
	Value v;
	
	public Producer(Value v) {
		this.v=v;
		Thread t1=new Thread(this,"producer Thread");
		t1.start();
		
	}
	public void run() {
		int i=0;
		while(true){
		
			v.set(i++);
			try {Thread.sleep(1000);}catch(Exception e) {};
			
		}
		
	}
	
}

class Consumer implements Runnable{
	Value v;
	public Consumer(Value v) {
		this.v=v;
		Thread t1=new Thread(this,"consumer Thread");
		t1.start();
		
	}
	
	public void run() {
		int i=0;
		while(true){
			v.get();
			try {Thread.sleep(500);}catch(Exception e) {};
			
		}
	}
}
public class InterThreadDemo1 {

	public static void main(String[] args) {
		Value val=new Value();
		Producer p=new Producer(val);
		Consumer c=new Consumer(val);

	}

}
