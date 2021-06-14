class FactorialNum 
{
	public static void main(String[] args) 
	{
		int num = 5;

		int fac = fact(num);

		System.out.println(fac);
	}

	public static int fact(int num)
	{
		int fac = 1;
		if (num == 0 || num == 1)
		{
			return 1;
		}
		else
		{
			return fac = num * fact(num - 1);
		} 
	}
}
