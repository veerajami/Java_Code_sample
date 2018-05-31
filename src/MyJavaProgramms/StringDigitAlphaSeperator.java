package MyJavaProgramms;

import java.util.Arrays;

public class StringDigitAlphaSeperator {

	public static void main(String[] args) {
		
		String s1="abc1       23 @ # & * e f g ";
		String s2="V2";
		StringBuffer alphabets=new StringBuffer();
		StringBuffer digits=new StringBuffer();
		StringBuffer speacials=new StringBuffer();
		
		
		
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			if(Character.isAlphabetic(c))
			alphabets.append(c);
				
			else if(Character.isDigit(c))
				digits.append(c);
			else if(!Character.isSpace(c))
				speacials.append(c);
			
		
			
		}
		
		System.out.println(alphabets);
		System.out.println(digits);
		System.out.println(speacials);
	//	System.out.println(Integer.parseInt(s2));
		System.out.println(Integer.getInteger(s2));
		System.out.println(String.valueOf(true));
		
	}

}
