package interview.programs.practice;

public class Program4 {

	public static void main(String[] args) {
/*		for(int i=4;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}*/
		int counter=0;
		for(int i=1;i<=4;i++) {
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}
			int value=counter+i;
			for(int j=i;j>=1;j--)
			{
				
				System.out.print(value);
				counter++;
				value--;
			}
			System.out.println();
		}

	}

}
