package interview.programs.practice;

public class Factorial {

	public static void main(String[] args) {
	
		int num=6;int fact=1;
		
		for(int i=num;i>0;i--)
		{
			fact*=i;
		}

		System.out.println(fact);
		
		
	}

}
