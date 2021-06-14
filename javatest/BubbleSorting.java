class BubbleSorting 
{
	public static void main(String[] args) 
	{
		int[] a = {2,5,7,6,10,9};

		bubbleSort(a);
	}

	public static void bubbleSort(int[] a)
	{
		for (int i = 0;i < a.length-1 ;i++ )
		{
			if (a[i] >= a[i + 1])
			{
				int key = a[i];
				a[i] = a[i + 1];
				a[i + 1] = key;
			}
		}

		for (int i = 0;i < a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}
}
