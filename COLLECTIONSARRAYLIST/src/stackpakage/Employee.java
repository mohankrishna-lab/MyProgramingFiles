package stackpakage;

import java.util.*;
import java.util.Map.Entry;
public class Employee 
{
	
	public static void main(String[] args)
	{		
		Map<Integer , String> m = new LinkedHashMap<Integer, String>();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter how many entries you are going to add");
		
		int num = sc.nextInt();
		
		for (int i = 1; i <= num; i++)
		{
			System.out.println("enter emp id");
			int id = sc.nextInt();
			System.out.println("enter emp name");
			String name = sc.next();
			
			m.put(id, name);
		}
		
		Iterator<Entry<Integer, String>> itr = m.entrySet().iterator();
		
		
		//display(itr);
		//checkId(m,sc);
		//deleteEntry(itr,sc,m);
		//displayEmpNames(itr);
		displayEmpId(itr);
		
	}
	
	public static void checkId(Map<Integer, String> m, Scanner sc)
	{
		System.out.println("enter id to check");
		int id1 = sc.nextInt();
		
		if (m.containsKey(id1))
		{
			System.out.println("id\tname");
			System.out.println(id1 + "\t" + m.get(id1));
		}
	}
	
	public static void display(Iterator<Entry<Integer, String>> itr)
	{
		System.out.println("id\tname");
		System.out.println("------------------------");
		while (itr.hasNext())
		{
			Entry<Integer, String> i= itr.next();
			System.out.print(i.getKey() + "\t");
			System.out.print(i.getValue());
			System.out.println();
		}
	}
	
	public static void deleteEntry(Iterator<Entry<Integer, String>> itr, Scanner sc,Map<Integer, String> m)
	{
		System.out.println("enter the id to delete entry");
		
		int id = sc.nextInt();
		
		if (m.containsKey(id))
		{
			m.remove(id);
		}
		else
		{
			System.out.println("that " + id + "does't exits");
		}
		
		
		itr = m.entrySet().iterator();
		
		while (itr.hasNext())
		{
			Entry<Integer, String> i = itr.next();
			
			System.out.println("id\tname");
			System.out.println(i.getKey()+ "\t" + i.getValue());
		}
	}
	
	public static void displayEmpNames(Iterator<Entry<Integer, String>> itr)
	{
		System.out.println("name");
		System.out.println("------------");
		while (itr.hasNext())
		{
			Entry<Integer, String> i = itr.next();
			System.out.println(i.getValue());
		}
	}
	
	public static void displayEmpId(Iterator<Entry<Integer, String>> itr)
	{
		System.out.println("id");
		System.out.println("--");
		while (itr.hasNext())
		{
			Entry<Integer, String> i = itr.next();
			System.out.println(i.getKey());
		}
	}
}
