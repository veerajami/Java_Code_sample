package collections.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class CollectionsMethods {
	
	public static void main(String[] args) {
		
Collection lst=new ArrayList();
		lst.add(2);
		lst.addAll(lst);
		lst.contains(2);
		lst.containsAll(lst);
		lst.clear();
		lst.isEmpty();
		lst.iterator();
		lst.remove(2);
		lst.removeAll(lst);
		lst.retainAll(lst);
		lst.size();
		lst.toArray();
		List lst1=new ArrayList<>();
		lst1.addAll(0, lst);
		lst1.add(1, 3);
		lst1.remove(0);
		lst1.remove(3);//removes at index level
Set s=new HashSet<>();
		s.add(2);
		s.add(3);
		s.add("vin");
		s.add(2);

		for (Object o : s) {
	
			System.out.println(o);
		}
		
		
Queue q=new PriorityQueue<>();
		q.poll();
		q.peek();
		q.add(2);
		q.addAll(lst1);
		q.offer(2);
	
LinkedList llst=new LinkedList<>();
	llst.addFirst(2);
	llst.addLast(3);
	llst.removeFirst();
	llst.removeLast();
	llst.getFirst();
	llst.getLast();
	llst.get(0);//get with index
	llst.indexOf(3);
	llst.clone();
	llst.element();
	llst.lastIndexOf(lst1);
	llst.offer(9);
	llst.offerFirst(5);
	llst.offerLast(7);
	llst.peek();
	llst.peekFirst();
	llst.peekLast();
	llst.poll();
	llst.pollLast();
	llst.pop();
	llst.set(0, 8);
	//llst.sort(c);
	llst.subList(1, 3);
	
	}
	
	

}
