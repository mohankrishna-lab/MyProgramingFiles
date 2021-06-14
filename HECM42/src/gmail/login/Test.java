package gmail.login;

public class Test
{
	public static void main(String[] args)
	{
		System.out.println("hello world");
		
		int[] a = {3,4,5,6,3,2,4,6,8};
		printArrays(a);
	}
	public static void printArrays(int[] a)
	{
		for (int i = 0; i < a.length; i++)
		{
			if (isPrime(a[i])) 
			{
				System.out.println(a[i]);
			}
		}
	}
	
	public static boolean isPrime(int num)
	{
		int count = 0;
		if (num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for (int i = 2;i < num;i++)
			{
			if (num % i == 0)
			{
				count++;
			}
			}
			if (count < 1)
			{
				return true;
			}
			else
				return false;
		}
		
	}
}
