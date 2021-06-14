class LinearSearch
{
	public static void main(String[] args) 
	{
		int[] a = {32 , 45 , 67 , 9 ,45};

		int key = 9;

		linearSearching(a , key , 0);
	}

	public static void linearSearching(int[] a , int key, int i)
	{
		if (a.length <= i)
		{
			System.out.println("not found");
			return;
		}
		else
		{
			if (a[i] == key)
			{
				System.out.println("found");
			}
			else
			{
				linearSearching(a , key , i + 1);
			}
		}
	}
}
