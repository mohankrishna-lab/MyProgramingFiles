package arraylistss;

import java.util.*;

public class RemoveAnElementPosArray 
{

	public static void main(String[] args)
	{
		List<Integer> l = new ArrayList<Integer>(Arrays.asList(78 ,98, 12, 43, 89, 66, 73));
		
		removeElement(l);
	}
	
	public static void removeElement(List<Integer> l)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the position to remove");
		
		int pos = sc.nextInt();
		
		l.remove(pos);
		
		for (Integer i : l)
		{
			System.out.print(i + " ");
		}
	}

}
