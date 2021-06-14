package arraylistss;

import java.util.*;
public class DisplayEmployees {

	public static void main(String[] args) 
	{
		List<Employees> l = new ArrayList<Employees>();
		
		l.add(new Employees("simha",89343.3,435734759));
		l.add(new Employees("mysure",89322.3,274723748));
		l.add(new Employees("satish",87734.3,535723748));
		
		
		Collections.sort(l,new Employees());
		System.out.println(l);
	}

}
