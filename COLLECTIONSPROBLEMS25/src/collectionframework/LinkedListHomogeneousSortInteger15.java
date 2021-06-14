package collectionframework;

import java.util.LinkedList;
import java.util.Collections;
import java.util.List;

public class LinkedListHomogeneousSortInteger15 
{
	public static void main(String[] args)
	{
		List<Integer> l = new LinkedList<Integer>();
		l.add(65);
		l.add(12);
		l.add(23);
		l.add(99);
		l.add(45);
		l.add(56);
		l.add(33);
		l.add(66);
		
		System.out.println("before sorting");
		System.out.println(l);
		
		Collections.sort(l);
		System.out.println("after sorting");
		System.out.println(l);
	}
}
