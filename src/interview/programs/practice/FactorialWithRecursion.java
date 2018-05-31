package interview.programs.practice;

public class FactorialWithRecursion {

	public static void main(String[] args) {
		
		int value=6;
		
		System.out.println(factorial(value));
	}

	public static int factorial(int num) {
		if(num==0)
			return 1;
		
		return num*factorial(num-1);
	}
}
