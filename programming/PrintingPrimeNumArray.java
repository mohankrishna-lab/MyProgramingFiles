class PrintingPrimeNumArray
{
	public static void main(String[] args) 
	{
		int a[] = {3 , 5 , 6 , 8 , 11 , 12 };
		
		printPrimeNum(a);

	}

	public static void printPrimeNum(int[] a)
	{
		for (int i : a)
		{
			if (isPrime(i))
			{
				System.out.println(i);
			}
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
