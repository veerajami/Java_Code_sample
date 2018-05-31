package interview.programs.practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		
		int num=10;
		
		for(int i=2;i<num;i++) {
			
			if(num%i==0) {
				System.out.println("Given number "+num+" is not a Prime");
				break;
			}
		
			if(num==i+1) 
				System.out.println("Given number "+num+" is a Prime");
			
		}
	}

}
