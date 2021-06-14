package programsprac;

import java.util.*;
public class PracProgram {

	public static void main(String[] args)
	{
		Scanner sc =  new Scanner(System.in);
		
		int ecount=0;
		int ocount=0;
		int a = sc.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < a; i++)
		{
			b[i] = sc.nextInt();
		}
		
		
		for (int i = 0; i < b.length; i++)
		{
			if (b[i] % 2 == 0)
			{
				ecount++;
			}
			else
			{
				ocount++;
			}
		}
		
		System.out.println(ecount + " " + ocount);
	}

}
