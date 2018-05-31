package interview.programs.practice;

public class fabinci {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		
		while(a<20)
		{
			System.out.print(a+",");
			
			c=a+b;
			a=b;
			b=c;
		}
		

	}

}
