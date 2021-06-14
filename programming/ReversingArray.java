class  ReversingArray
{
	public static void main(String[] args) 
	{
		int[] a = {4 , 6 , 7, 8 , 9 , 10};

		System.out.println("the array is");

		for (int i = 0;i < a.length ;i++ )
		{
			System.out.println(a[i]);
		}

		int[] b = reverseArray(a);

		System.out.println("the reverse array is");

		for (int i = 0; i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
		
	}

	public static int [] reverseArray(int[] a)
	{
		for (int i  = 0; i < a.length/2 ;i++ )
		{
			int temp;

			temp = a[i];

			a[i] = a[a.length - 1 - i];

			a[a.length - 1 - i] = temp;

		}

		return a;
	}
}
