class RemovingDuplicateElementsArray
{
	public static void main(String[] args) 
	{
		int[] a = {5,89,66,66,5,89,6,4,5,32,45,5,5,5};

		removeDuplicateElementsArray(a);
	}

	public static void removeDuplicateElementsArray(int[] a)
	{
		int p = 0;
		
		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = i + 1;j < a.length ;j++ )
			{
				if (a[i] == a[j] && a[i] >= 0)
				{
					int k = j;
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

		int count = orginalValues(a);

		int[] b = new int[count];
		for (int i = 0;i < a.length ;i++ )
		{
		if (a[i] != -1)
		{
			b[p++] = a[i];
		}
		}
		
		for (int i = 0;i < b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

	public static int orginalValues(int[] a)
	{
		int count = 0;
		for (int i = 0;i < a.length ;i++ )
		{
			if (a[i] != -1)
			{
				count++;
			}
		}
		return count;
	}
}
