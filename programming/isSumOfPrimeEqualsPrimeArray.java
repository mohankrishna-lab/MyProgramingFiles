class isSumOfPrimeEqualsPrimeArray
{
	public static void main(String[] args) 
	{
		int a[] = {3 , 5 , 6 , 8 , 11 , 12 };
		
		isSumOfPrimeEqualsPrime(a);

	}

	public static void isSumOfPrimeEqualsPrime(int[] a)
	{
		int sum = 0;
		for (int i : a)
		{
			if (isPrime(i))
			{
				sum += i;
			}
		}

		if (isPrime(sum))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	public static boolean isPrime(int a)
	{
		for (int i = 2;i < a;i++ )
		{
		if (a % i == 0)
		{
			return false;
		}
		}
		return true;
		
	}
}
