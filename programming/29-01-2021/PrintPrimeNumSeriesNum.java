//Program to print all the prime numbers in a series of given numbers

class PrintPrimeNumSeriesNum
{
	public static void main(String[] args) 
	{
		String s = "5 7 12 2 65";

		printPrimeNum(s);
	}

	public static void printPrimeNum(String s)
	{
		String[] str = s.split(" ");

		for (String ss : str)
		{
			if (isPrime(Integer.parseInt(ss)))
			{
				System.out.println(ss + " is prime");
			}
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
