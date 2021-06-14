class SmallestPrimeNumArray
{
	public static void main(String[] args) 
	{
		int a[] = {3 , 5 , 6 , 8 , 11 , 12 };
		
		SmallestPrimeNum(a);

	}

	public static void SmallestPrimeNum(int[] a)
	{
		int small = 0;
		for (int i : a)
		{
			if (isPrime(i))
			{
				if (small == 0)
				{
					small = i;
				}
				else
				{
					if (i < small)
					{
						small = i;
					}
				}
			}
		}

		if (small != 0)
		{
			System.out.println("smallest number in array is : " + small);
		}
		else
		{
			System.out.println("there is no prime number in array");
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
