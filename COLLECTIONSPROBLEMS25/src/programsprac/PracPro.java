package programsprac;

import java.util.Scanner;

public class PracPro {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		boolean zero = false;
		boolean one = false;
		
		
		while (a > 0)
		{
			int rem = a % 10;
			
			if (rem == 1)
			{
				zero = true;
			}
			else
			{
				one = true;
			}
			
			a /= 10;
		}
		
		boolean yes = zero && one;
		
		if (yes)
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
		
	}

}
