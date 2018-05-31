package other;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		
		String str1;
		String str2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String1");
		str1=sc.nextLine();
		System.out.println("Enter String2");
		str2=sc.nextLine();
		
		System.out.println("With ==: "+str1==str2);
		System.out.println("With .equals: "+str1.equals(str2));
		
	}

}
