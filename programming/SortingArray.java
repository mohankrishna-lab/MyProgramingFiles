class SortingArray 
{
	public static void main(String[] args) 
	{
		int[] a = {3,2,1};

		int[] b = sort(a);

		for (int i = 0;i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}

	public static int[] sort(int[] a)
	{
		int[] b = new int[a.length];

		for (int i = 0;i < b.length ;i++ )
		{
			int j = 0;
			int small = 0;
			for (;j < a.length ;j++ )
			{
				if (small == 0)
				{
					small = a[j];
				}
				else if (small > a[j])
				{
					small = a[j];
				}
			}

			b[i] = small;
			
			for (int k = 0;k < a.length ;k++ )
			{
				if (a[k] == small)
				{
					a[k] = 2342355;
				}
			}
		}

		return b;
	}
}
