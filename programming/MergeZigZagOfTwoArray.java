class MergeZigZagOfTwoArray 
{
	public static void main(String[] args) 
	{
		int[] a = {10 , 12 , 7 , 34 , 86};

		int[] b ={84 , 55 , 96 , 22 , 8 , 6 , 7 , 9};

		int[] c = mergeZigZagArrays(a , b);
		
		for (int i = 0;i < c.length ;i++ )
		{
			System.out.println(c[i]);
		}
	}

	public static int[] mergeZigZagArrays(int[] a , int[] b)
	{
		int[] c =new int[a.length + b.length];

		int i;
		int j;
		int k;

		for (k = 0 ,i = 0, j = 0; i < a.length && j < b.length; i++ , j++ , k++)
		{
			c[k] = a[i];
			c[++k] = b[j];	
		}

		while (i < a.length)
		{
			c[k++] = a[i++];
		}
		while (j < b.length)
		{
			c[k++] = b[j++];
		}

		return c;

	}
}
