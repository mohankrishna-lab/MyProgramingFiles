class LargestPerfectNumberArray 
{
	public static void main(String[] args) 
	{
		int[] num = {3 , 6 , 9 , 24 , 28 , 255 , 455};

		largestPerfectNum(num);
	}

	public static void largestPerfectNum(int[] num)
	{
		int largest = 0;
		for (int i : num )
		{
			if (isPerfectNum(i))
			{
				if (largest == 0)
				{
					largest = i;
				}
				else
				{
					if (i > largest)
					{
						largest = i;
					}
				}
			}
		}

		if (largest != 0)
		{
			System.out.println("the largest number in the array is : " + largest);
		}
		else
		{
			System.out.println("there is no perfect numbers");
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
