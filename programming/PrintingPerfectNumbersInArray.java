class PrintingPerfectNumbersInArray 
{
	public static void main(String[] args) 
	{
		int[] num = {3 , 6 , 9 , 24 , 28 , 255 , 455};

		printPerfectNum(num);
	}

	public static void printPerfectNum(int[] num)
	{
		for (int i : num )
		{
			if (isPerfectNum(i))
			{
				System.out.println(i);
			}
		}
		
	}

	public static boolean isPerfectNum(int num)
	{
		int sum = 0;
		for (int i = 1;i < num;i++ )
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}

		if (sum == num)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
