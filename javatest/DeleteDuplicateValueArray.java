class DeleteDuplicateValueArray 
{
	public static void main(String[] args) 
	{
		int[] a = {2,4,5,7,2,67,6,5,4,4};
		int[] b = new int[a.length];

		for (int i = 0;i < a.length ;i++ )
		{
			b[i] = a[i];
		}

		int count = countDuplicate(b);

		int[] c = deleteDuplicateValues(a , count);

		for (int i = 0;i < c.length ;i++ )
		{
			System.out.println(c[i]);
		}
	}

	public static int[] deleteDuplicateValues(int[]  a , int count)
	{
		int[] c = new int[a.length - count];
		int l = 0;

		for (int i = 0;i < a.length ;i++ )
		{
			if (a[i] >= 0)
			{
					for (int j = i + 1;j < a.length ;j++ )
					{
						if (a[i] == a[j])
						{
							int k = j;
							while (k < a.length)
							{
								if (a[j] == a[k])
								{
									a[k] = -1;
								}
								k++;
							}
						}
					}
				
			}
		}

		for (int i =  0;i < a.length ;i++ )
		{
			if (a[i] >= 0)
			{
				c[l++] = a[i];
			}
		}
		return c;
	}

	public static int countDuplicate(int[] b)
	{
		int count = 0;

		for (int i = 0;i < b.length ;i++ )
		{
			if (b[i] >= 0)
			{
					for (int j = i + 1;j < b.length ;j++ )
					{
						if (b[i] == b[j])
						{
							int k = j;
							count++;

							while (k < b.length)
							{
								if (b[j] == b[k])
								{
									b[k] = -1;
								}
								k++;
							}
						}
					}
				
			}
		}
		return count;
	}
}
