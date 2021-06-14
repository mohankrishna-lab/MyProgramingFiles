package arraylistss;

import java.util.*;
public class PenSort
{

	public static void main(String[] args) 
	{
		List<Pen> l = new ArrayList<Pen>();
		
		l.add(new Pen("cello",98.9));
		l.add(new Pen("flair",98.9));
		l.add(new Pen("max",98.9));
		l.add(new Pen("papersoft",98.9));
		
		Collections.sort(l,new Pen());
		
		System.out.println(l);
	}

}
