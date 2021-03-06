class SmallestPrimeNumSeries
{
	public static void main(String[] args) 
	{
		String s = "11 2 3 1 5 6 8 9 7 22 21 27";

		smallestPrime(s);
	}

	public static void smallestPrime(String s)
	{
		String[] ch = s.split(" ");

		int smallestPrime = 0;

		for (int i  = 0;i < ch.length ;i++ )
		{
			if (isPrime(Integer.parseInt(ch[i])))
			{
				if (smallestPrime == 0)
				{	
					smallestPrime = Integer.parseInt(ch[i]);
				}
				else if (smallestPrime > Integer.parseInt(ch[i]))
					{
						smallestPrime = Integer.parseInt(ch[i]);
					}
			}
		}

		System.out.println(smallestPrime);
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
