class CopyingArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5 , 50 , 500 , 3 , 30 , 300};

		int[] b = copyArray(a);

		for (int i = 0;i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}

	public static int[] copyArray(int[] a)
	{
		int[] b = new int[a.length];
		for (int i = 0;i < a.length  ;i++ )
		{
			b[i] = a[i];
		}

		return b;
	}
}
