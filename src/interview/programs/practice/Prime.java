package interview.programs.practice;

public class Prime {

	public static void main(String[] args) {
	
		
		
		boolean prime=false;
		for(int j=1;j<=20;j++) {
		for(int i=1;i<=j;i++)
		{
			if(j/i==1 && j==i)
			prime=true;

		}
		if(prime)
		System.out.println("The num "+j+" is a prime number");
		else
			System.out.println("The num "+j+" is not a prime number");
		
		}
	}

}
