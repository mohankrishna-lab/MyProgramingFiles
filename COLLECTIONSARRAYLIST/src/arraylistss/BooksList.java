package arraylistss;

import java.util.*;
public class BooksList
{

	public static void main(String[] args) 
	{
		List<Books> l = new ArrayList<Books>();
		
		l.add(new Books("java",897.43,"ramya reddy"));
		l.add(new Books("c",1000,"ramya"));
		l.add(new Books("c++",1000.54,"ramya naidu"));
		l.add(new Books("python",764,"ramya sree"));
		
		Collections.sort(l,new Books());
		
		System.out.println(l);
	}

}
