class MergeTwoArraysOne 
{
	public static void main(String[] args) 
	{
		int[] a = {1,3,4,56,78,32,78};
		int[] b = {67,89,234,567,789,3433,224,5667};

		int c[] = mergeTwoArrays(a,b);

		for (int i = 0;i < c.length ;i++ )
		{
			System.out.println(c[i]);
		}
	}

	public static int[] mergeTwoArrays(int[] a , int[] b)
	{
		int[] c = new int[a.length + b.length];

		int k = 0;
		

		for (int i = 0;i < a.length;i++ )
		{
			c[k++] = a[i];
		}

		for (int j = 0;j < b.length ;j++ )
		{
			c[k++] = b[j];
		}
		return c;
	}
}
