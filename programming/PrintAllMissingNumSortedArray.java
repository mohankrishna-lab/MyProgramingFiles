class PrintAllMissingNumSortedArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5,13,20,25,28};

		//printAllMissingNumArray(a);

		printMissingNum(a);
	}

	public static void printAllMissingNumArray(int[] a)
	{
		for (int i = 0;i < a.length - 1 ;i++ )
		{
			int j = a[i];

			while (j < a[i + 1] -1)
			{
				System.out.println(++j);
			}
		}
	}

	public static void printMissingNum(int[] a)
	{
		for (int i = 0;i < a.length -1 ;i++ )
		{
			for (int j = a[i] +1;j < a[i + 1] ;j++)
			{
				if (a[i] != j)
				{
					System.out.println(j);
				}
				
			}
		}
	}
}
