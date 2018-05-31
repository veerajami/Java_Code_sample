package exception.practice;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionDemo1 {
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Keyword");
		String str=sc.nextLine();
	
								try {
									throw new ThrowedException("Input Invalid");
								} catch (ThrowedException e) {
									// TODO Auto-generated catch block
									e.printStackTrace();
								}
		
		
		
	}

}

class ThrowedException extends Exception{
	
	public ThrowedException(String str)
	{
		super(str);
	}
}