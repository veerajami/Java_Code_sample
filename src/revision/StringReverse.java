package revision;

public class StringReverse {

	public static void main(String[] args) {
		
		String str="Veera Jami";
		StringBuffer sb=new StringBuffer(str);
		String str2="";
		
		System.out.println("##############Method 1################");
		System.out.println(sb.reverse());
		System.out.println("##############Method 2#############");
		char arr[]=str.toCharArray();
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]);
			str2+=str.charAt(i);
		
		}
		
		System.out.println(str2);
		
	}

}
