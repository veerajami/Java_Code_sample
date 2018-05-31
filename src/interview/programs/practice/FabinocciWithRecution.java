package interview.programs.practice;

public class FabinocciWithRecution {

	static int a=0,b=1,c;
	public static void main(String[] args) {
		System.out.print(a+", "+b+", ");
		int count=10;
		fabinocci(count-2);
	}

	static public void fabinocci(int count) {
		

		if(count>0)
		{
			c=a+b;
			a=b;b=c;
			System.out.print(c+", ");
			fabinocci(count-1);
		}
	}
}
