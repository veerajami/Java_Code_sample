import java.util.Hashtable;
import java.util.Map;

public class ComparatorDemo {

	int num;
	public ComparatorDemo(int num) {
		
		this.num=num;
	}
	
	

	public static void main(String[] args) {
		
		
		
/*		Object[] obj=new Object[2];
		obj[0]=10;
		obj[1]="vin";
		obj[2]=30.0;
		
		for(int i=0;i<=2;i++)
		{
			System.out.println(obj[i]);
		}*/
		
		
		Map m=new Hashtable<>();
		m.put(1, "vin");
		m.get(1);
		
/*		
 * 
 * List lst=new ArrayList();
		lst.add(new ComparatorDemo(159));
		lst.add(new ComparatorDemo(131));
		lst.add(new ComparatorDemo(145));
		lst.add(new ComparatorDemo(120));
		Comparator<ComparatorDemo> cmp=(o1,o2) ->
			{				
				return o1.num>o2.num?1:o1.num<o2.num?-1:0;
			};
		
		System.out.println("Before :"+lst);
		
		Collections.sort(lst, cmp);
		
		System.out.println("after:"+lst);
		
*/
		
	}

	
/*	public String toString() {
		
		return "num ="+this.num;
	} */
	
}

	