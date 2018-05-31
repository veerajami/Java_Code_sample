package interview.programs.practice;

public class palindrome {

	public static void main(String[] args) {

		
		for(int i=10;i<1000;i++)
		{
			int num=i,sum=0,temp=num;
			
			while(temp>0) {
				int r=temp%10;
				sum=(sum*10)+r;
				temp=temp/10;
			}
			 
			if(sum==num)
				System.out.print(num+",");
			
		}
		
		
	}
	}	
		
		
		
		
/*		int num=151,sum=0,temp=num;
		
		while(temp>0) {
			int r=temp%10;
			sum=(sum*10)+r;
			temp=temp/10;
		}
		 
		if(sum==num)
			System.out.println(num+" is a Palindrom");
		
		else
			System.out.println(num+" is a Palindrom");
	}
*/

