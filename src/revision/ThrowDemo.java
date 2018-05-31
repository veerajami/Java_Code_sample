package revision;

public class ThrowDemo {

	public static void main(String[] args) {
		
		
		try {
		
			
			
			throw new MyExp("unable to devide");
		}
		
		catch(MyExp exp) {
		exp.printStackTrace();
		}
		
		
	}

}

class MyExp extends Throwable{
	
	
	public MyExp(String str)
	{
		super(str);
	}
	
	
}