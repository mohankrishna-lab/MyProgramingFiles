class PrimeFactorsNumSeries 
{
	public static void main(String[] args) 
	{
		String s = "11 22 33 3 4 21";

		primeFactorsNum(s);
	}
	
	public static void primeFactorsNum(String s)
	{
		String[] ss = s.split(" "); 

		for (int i = 0;i < ss.length ;i++ )
		{
			System.out.print("prime factors of " + Integer.parseInt(ss[i]) + " is ");
			for (int j = 1;j <= Integer.parseInt(ss[i]) ; j++ )
			{
				if (Integer.parseInt(ss[i]) % j == 0)
				{
					if (isPrime(j))
					{
						System.out.print(j + " ");
					}
				}
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int num)
	{
		if (num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for (int i = 2;i < num ;i++ )
			{
				if (num % i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}
}
