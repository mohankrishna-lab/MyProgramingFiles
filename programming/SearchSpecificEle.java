class SearchSpecificEle 
{
	public static void main(String[] args) 
	{
		int a[] = {9,5,4,23,6,76,76,66,77};
		int key = 77;

		searchSpecificElement(a,key);
	}

	public static void searchSpecificElement(int[] a , int key)
	{
		int i;
		for (i = 0;i < a.length ;i++ )
		{
			if (a[i] == key)
			{
				System.out.println("found");
				break;
			}
		}
		if (a.length == i)
		{
			System.out.println("not found");
		}
	}
}
