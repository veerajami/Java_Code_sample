package interview.programs.practice;

public class Amstrng {

	public static void main(String[] args) {
		
		int num=153;
		int temp=num;
		int val=0;
		
		while(temp>0) {
			int a=temp%10;
			val+=a*a*a;
			temp=temp/10;
		}
		
		if(val==num)
			System.out.println("Given number "+num+" is an Amstrong number");
		else
			System.out.println("Given number "+num+" is not an Amstrong number");
	}

}
