class DeletingElementArray 
{
	public static void main(String[] args) 
	{
		int[] a = {6 , 8 , 9 , 5 , 7 , 8 , 9 , 10};

		int pos = 3;
		
		int[] b = deleteElementArray(a , pos);

		for (int i = 0 ;i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}

	public static int[] deleteElementArray(int[] a , int pos)
	{
		int[] b = new int[a.length - 1];

		int i;

		for (i = 0;i < pos ;i++ )
		{
			b[i] = a[i];
		}

		for (; i < a.length - 1;i++ )
		{
			b[i] = a[i + 1];
		}

		return b;
	}
}
