class CompareTwoArrays 
{
	public static void main(String[] args) 
	{
		int[] a = {32,34,12,43,65};
		int[] b = {32,34,12,43,65};

		cmpTwoArray(a, b);
	}

	public static void cmpTwoArray(int[] a , int[] b)
	{
		boolean flag = false;

		if (a.length == b.length)
		{
			for (int i = 0;i < a.length ;i++ )
			{
				if (a[i] != b[i])
				{
					System.out.println("are not same");
					flag = true;
				}
			}
		}
		if (!flag)
		{
			System.out.println("are same");
		}
	}
}
