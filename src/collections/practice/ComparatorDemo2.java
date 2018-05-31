package collections.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo2 {

	public static void main(String[] args) {
		
		List<Integer> lst=new ArrayList<>();

		lst.add(2300);
		lst.add(3498);
		lst.add(8767);
		lst.add(2398);
		lst.add(5732);
/*		Comparator<Integer> c= (Integer o1,Integer o2)->{
								return o1%1000>o2%1000?1:o1%1000<o2%1000?-1:0;
								};*/
								
		Collections.sort(lst, (o1,o2)->{
			return o1%1000>o2%1000?1:o1%1000<o2%1000?-1:0;
			});
		System.out.println(lst);
		List<Student> lst2=new ArrayList<>();
		lst2.add(new Student(257,"vinod"));
		lst2.add(new Student(238,"prakash"));
		lst2.add(new Student(241,"satish"));
		lst2.add(new Student(254,"tiru"));
	
		System.out.println(lst2);
		Collections.sort(lst2,(s1,s2)->{
										return s1.rollnum>s2.rollnum?1:s1.rollnum<s2.rollnum?-1:0;
											});
		System.out.println(lst2);
		
		
	}

}

class Student {
	
	int rollnum;
	String name;
	
	public Student(int rollnum,String name) {
		this.rollnum=rollnum;
		this.name=name;
	}
	
	public String toString() {
		return "rollnum="+rollnum+", name="+name;
	}
/*
	@Override
	public int compareTo(Student o) {
		
		return this.rollnum>o.rollnum?1:this.rollnum<o.rollnum?-1:0;
	}*/
	
	
	
	
	
	
	
}
