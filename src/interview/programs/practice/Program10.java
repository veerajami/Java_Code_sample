package interview.programs.practice;

public class Program10 {

	public static void main(String[] args) {
		
		for(int i=0;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=i;k>=0;k--)
			{
				if(k==i || k==0 || i==4)
				System.out.print("1 ");
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}

	}

}
