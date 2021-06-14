class ReverseNumRecursion
{
	public static void main(String[] args) 
	{
		int num = rnr(56);
		//int rev = -(num * 9);
		System.out.println(num);
	}

	public static int rnr(int num)
	{
		if (num <= 0)
		{
			return -45;
		}
		else
		{
			return (num % 10) * 10+ rnr(num / 10);
		}
	}
}
