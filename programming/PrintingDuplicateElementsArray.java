class PrintingDuplicateElementsArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5,7,8,9,10,5,6,6};

		printDuplicateEleArray(a);
	}
	
	public static void printDuplicateEleArray(int[] a)
	{
		boolean flag = true;
		int[] b = new int[a.length];
		int k = 0;
		
		for (int i = 0;i < a.length ;i++ )
		{
			int count = 0;
			int temp = a[i];

			for (int j = 0;j < a.length ;j++ )
			{
				if (a[j] == temp)
				{
					count++;
				}
			}

			if (count > 1)
			{
				for (;k < a.length ;i++ )
				{
					b[k++] = a[i];

					break;
				}
			}

		}
		for (int i = 1;i < b.length ;i++ )
		{
			System.out.println(b[i]);
		}
	}
}
