package collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo {

	public static void main(String[] args) {
		
		List lst=new ArrayList();
		
		lst.add(567);
		lst.add(15);
		lst.add(309);
		lst.add(794);
		System.out.println(lst);
/*		Collections.sort(lst);
		System.out.println(lst);
		*/
		/*Comparator<Integer> comp=(o1, o2)-> {
			
			return o1%10>o2%10?1:o1%10<o2%10?-1:0;
			
		};*/
		
		Comparator<Integer> comp=new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
			
				return o1>o2?1:o1<o2?-1:0;
				
			}
		};
		
		Collections.sort(lst, comp);
		System.out.println(lst);
	}

}

/*class Comp implements Comparator<Integer>{

	


	@Override
	public int compare(Integer o1, Integer o2) {
	
		return o1%10>o2%10?1:o1%10<o2%10?-1:0;
		
	}
	
}
*/