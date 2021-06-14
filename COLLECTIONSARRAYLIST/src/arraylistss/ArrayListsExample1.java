package arraylistss;

import java.util.*;

public class ArrayListsExample1 
{
	public static void main(String[] args) 
	{
		ArrayList al = new ArrayList();
		
		al.add(80);
		al.add('a');
		al.add("hello");
		al.add("is contains");
		al.add(80.56);
		al.add(786);
		al.add("hi");
		//System.out.println(al);
		
		
		
		List l = new ArrayList();
		
		l.add("hi");
		l.add("this is me");
		l.add(786);
		
		l.addAll(al);
		
		System.out.println(l);
		l.retainAll(al);
		
		System.out.println(l);
		System.out.println(l.indexOf("hello"));
		l.remove("is contains");
		System.out.println(l);
	}
}

class Demo
{
	int a = 90;
	int b = 70;
	
	@Override
	public String toString()
	{
		return a + " " + b;
	}
}
