class DuplicateElement 
{
	public static void main(String[] args) 
	{
		int[] a = {1,1,1,1,2};
		firstUniqueNumbers(a);
	}

	public static void firstUniqueNumbers(int[] a)
	{
		for (int i = 0;i < a.length ;i++ )
		{
			if (a[i] >= 0)
			{
				for (int j = i + 1;j < a.length ;j++ )
				{
					if (a[i] == a[j] && a[j] >= 0)
					{
						a[j] = -1;
						System.out.println(a[i]);
						int k =j;
					}
					while (k < a.length)
					{
						if (a[k] == a[j])
						{
							a[k] = -1;
						}
						k++;
					}
				}
			}
		}
	}
}
