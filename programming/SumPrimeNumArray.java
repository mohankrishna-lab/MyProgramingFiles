class SumPrimeNumArray
{
	public static void main(String[] args) 
	{
		int a[] = {3 , 5 , 6 , 8 , 11 , 12 };
		
		sumPrimeNum(a);

	}

	public static void sumPrimeNum(int[] a)
	{
		int sum = 0;
		for (int i : a)
		{
			if (isPrime(i))
			{
				sum += i;
			}
		}

		System.out.println("sum of prime numbers is : " + sum);
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
