class OneArrayIntoAnother 
{
	public static void main(String[] args) 
	{
		int[] a = {5,6,7,8,9};
		copy(a);
	}

	public static void copy(int[] a)
	{
		int[] b = new int[a.length];
		int p = 0;
		
		for (int i = 0;i < a.length ;i++ )
		{
			b[p++] = a[i];
		}
		for (int i = 0;i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}
}
