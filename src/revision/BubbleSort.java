package revision;

public class BubbleSort {

	public static void main(String[] args) {
	
		int arr[]= {8,3,4,7,9};
		
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr.length;j++)
		{
			if(arr[i]<arr[j])
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
		

		
		
	}
		
 
	}

}
