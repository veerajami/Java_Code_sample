package interview.programs.practice;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,4,7};
		
		for(int i=0;i<arr.length;i++) 
			{
			for(int j=0;j<arr.length;j++) 
			{
				
				if(arr[i]<arr[j]) 
				{
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
			
		}
		
		for(int i:arr) {
			System.out.print(i+", ");
		}
			
	}

}
