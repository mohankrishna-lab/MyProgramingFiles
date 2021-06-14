package examinationprograms;

import java.util.ArrayList;
import java.util.List;

public class ReverseElementsArrayList {

	public static void main(String[] args) 
	{
		List<Integer> l = new ArrayList<Integer>();
		
		l.add(12);
		l.add(31);
		l.add(2);
		l.add(98);
		l.add(66);
		l.add(45);
		
		for (int i = 0; i < l.size()/2;i++)
		{	
			l.set(l.size()-1-i, l.set(i, l.get(l.size()-1-i)));
		}
		
		System.out.println(l);
	}

}
