class Unique 
{
	public static void main(String[] args) 
	{
		int[] a = {7,7,6,5,43,5,6,2,1,7};
		uniqueNumbers(a);
	}

	public static void uniqueNumbers(int[] a)
	{
		for (int i = 0;i < a.length ;i++ )
		{
			boolean flag = false;
			if (a[i] >= 0)
			{
				for (int j = i + 1;j < a.length ;j++ )
				{
					if (a[i] == a[j] && a[j] >= 0)
					{
						a[j] = -1;
						flag =true;
					}
				}
			}
			if (!flag && a[i] >= 0)
			{
				System.out.println(a[i]);
			}
		}
	}
}
