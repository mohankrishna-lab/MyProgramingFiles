package collectionframework;

import java.util.*;

public class StringObjectsOfTreeSetDescOrder8 implements Comparator<String>
{
	public static void main(String[] args) 
	{
		Set<String> s = new TreeSet<String>(new StringObjectsOfTreeSetDescOrder8());
		s.add("hi");
		s.add("hello");
		s.add("world");
		s.add("bye");
		s.add("hola");
		s.add("good bye");
		s.add("shirt");
		s.add("kerala");
		
		System.out.println(s);
	}
	
	@Override
	public int compare(String s1, String s2)
	{
		return s2.compareTo(s1);
	}
}
