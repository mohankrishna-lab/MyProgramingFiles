package programsprac;

public class PracProg {

	public static void main(String[] args) 
	{
		int n = 31;
		int cof = 0;
		int a = count(n);
		cof = cof + (int)Math.pow(5, a);
		a--;

		while (cof < n)
		{
			
			if (cof + (int)Math.pow(5, a) > n)
			{
				a--;
			}
			else
			{
				cof = cof + (int)Math.pow(5, a);
				if (a == 1)
				{
					a--;
				}
				else if (a == 0)
				{
					break;
				}
			}
				
		}
		
		
		if (cof == n)
		{
			System.out.println("passed");
		}
		else
		{
			System.out.println("fails");
		}
	}
	
	public static int count(int n)
	{
		int count = 0;
		while (n > 0)
		{
			count++;
			n /= 10;
		}
		return count;
	}
}
