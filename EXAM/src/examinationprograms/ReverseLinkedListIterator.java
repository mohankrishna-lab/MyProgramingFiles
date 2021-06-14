package examinationprograms;

import java.util.*;
public class ReverseLinkedListIterator
{

	public static void main(String[] args) 
	{
		List<Integer> l = new LinkedList<Integer>();
		
		l.add(32);
		l.add(45);
		l.add(65);
		l.add(1);
		l.add(43);
		l.add(66);
		
		Iterator<Integer> itr = l.iterator();
		
		while (itr.hasNext())
		{
			itr.next();
		}
	}

}
