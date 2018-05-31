package interview.programs.practice;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		int a,b,c;
		a=0;b=1;c=0;
		
		while(c<=20)
		{
			System.out.print(c+", ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
