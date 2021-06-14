class ZigZag 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = {10,20,30};

		int c[] = makeZigZag(a,b);

		for (int i = 0;i < c.length ;i++ )
		{
			System.out.println(c[i]);
		}
	}

	public static int[] makeZigZag(int[] a , int[] b)
	{
		int c[] = new int[a.length + b.length];
		int i = 0;
		int j = 0;

		for (;i < a.length && i < b.length ;i++ )
		{
			c[j++] = a[i];
			c[j++] = b[i];
		}

		while (i < a.length)
		{
			c[j++] = a[i++];
		}

		while (i < b.length)
		{
			c[j++] = b[i++];
		}

		return c;
	}
}
