package interview.programs.practice;

public class Program2 {

	public static void main(String[] args) {
		
		int counter=1;
		for(int i=0;i<=3;i++) {
			for(int j=i;j>=0;j--) {
				System.out.print(counter+" ");
				counter++;
			}
			System.out.println();
		}

	}

}
