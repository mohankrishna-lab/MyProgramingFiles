class SumOfDigitsUsingRecursion
{
	public static void main(String[] args) 
	{
		int sum = sod(456);

		System.out.println(sum);
	}

	public static int sod(int num)
	{
		if (num <=0)
		{
			return 0;
		}
		else
		{
			return num % 10 + sod(num / 10);
		}
	}
}
