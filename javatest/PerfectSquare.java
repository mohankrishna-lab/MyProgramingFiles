class PerfectSquare 
{
	public static void main(String[] args) 
	{
		int[] a = {4,16,625,343,546,145,133};

		isPerfectSquare(a);
	}

	public static void isPerfectSquare(int[] a)
	{
		for (int i = 0;i < a.length ;i++ )
		{
			if (isPerfect(a[i]))
			{
				System.out.println(a[i]);
			}
		}
	}

	public static boolean isPerfect(int num)
	{
		for (int i = 1;i <= num ;i++ )
		{
				if (i * i == num)
				{
					return true;
				}
		}
		return false;
	}
}
