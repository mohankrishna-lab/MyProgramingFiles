package stackpakage;

import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MainLaptops {

	public static void main(String[] args) 
	{
		SortedSet<Laptops> s = new TreeSet<Laptops>(new Laptops());
		
		s.add(new Laptops(98.9,"dell","red"));
		s.add(new Laptops(87.3,"asus","green"));
		s.add(new Laptops(89.9,"hp","white"));
		s.add(new Laptops(87.3,"toshiba","pink"));
		s.add(new Laptops(87.66,"mini","green"));
		
		System.out.println("name\t\tprice\t\tcolor");
		
		java.util.Iterator<Laptops> itr = s.iterator();
		
		while(itr.hasNext())
		{
			Laptops l = itr.next();
			System.out.println(l);
		}
	}

}
