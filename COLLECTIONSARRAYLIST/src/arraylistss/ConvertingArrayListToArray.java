package arraylistss;

import java.util.*;

public class ConvertingArrayListToArray {

	public static void main(String[] args) 
	{
		Integer[] a = convertToArray(getListObject());
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
	
	public static List<Integer> getListObject()
	{
		Integer[] a = {98,56,34,21,43,2,45};
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(a));
		
		return l;
	}
	
	public static Integer[] convertToArray(List<Integer> l)
	{
		Object[] obj = l.toArray();
	
		Integer[] a = new Integer[obj.length];
		int i = 0;
		
		for (Object o : obj)
		{
			int b=(Integer)(o);
			a[i++] = b;
		}
		
		return a;
	}

}
