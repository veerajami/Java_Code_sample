package interview.programs.practice;

import java.util.Scanner;

public class PrimeInGivenRange {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter End Range");
		int end=sc.nextInt();
		for(int i=1;i<=end;i++) {
			for(int j=2;j<=i;j++) {
				
				if(i%j==0&&j!=i)
					break;
				
				if(i==j)
					System.out.print(i+", ");
				
			}
			
			
		}

	}

}
