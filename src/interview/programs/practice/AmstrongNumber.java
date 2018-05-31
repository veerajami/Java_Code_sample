package interview.programs.practice;

public class AmstrongNumber {

	public static void main(String[] args) {
		
	
	
		for(int i=0;i<=1000;i++) {
			
			int val=0;
			int num=i;
			
			while(num>0) {
				int digit=num%10;
				val+=digit*digit*digit;
				num=num/10;
			}
			
			if(val==i)
			{	System.out.println(i+", ");}
			
		}

	}

}






