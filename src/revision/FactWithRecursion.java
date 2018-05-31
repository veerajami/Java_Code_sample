package revision;

public class FactWithRecursion {

	public static void main(String[] args) {
		
		int num=4;
		System.out.println(fact(num));
	}

	static int fact(int i)
	{
		if(i==1)
			return 1;
		else
			return i*fact(i-1);
	}

	
}
