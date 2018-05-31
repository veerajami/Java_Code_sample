package Programs;

public class Triangle {

	public static void main(String[] args) {

		int size=10;
		for(int i=1;i<=size;i++) {
			for(int j=size;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=size;k++) {
				if(k==1||k==i||i==size)
				System.out.print(" *");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
	}

}
