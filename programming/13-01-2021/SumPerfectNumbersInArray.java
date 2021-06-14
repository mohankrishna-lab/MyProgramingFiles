//Program to find sum of all the perfect numbers of an array

class SumPerfectNumbersInArray 
{
	public static void main(String[] args) 
	{
		int[] num = {3 , 6 , 9 , 24 , 28 , 255 , 455};

		sumPerfectNum(num);
	}

	public static void sumPerfectNum(int[] num)
	{
		int sum = 0;
		for (int i : num )
		{
			if (isPerfectNum(i))
			{
				sum += i;
			}
		}
		System.out.println("sum of perfect numbers in an array is: " + sum);
		
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
