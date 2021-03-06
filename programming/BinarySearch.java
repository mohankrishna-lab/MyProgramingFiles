class BinarySearch 
{
	public static void main(String[] args) 
	{
		int a[] = {7 ,8,9,10,40,90,140};
		int key = 90;
		BinrySearch(a,key);
	}

	public static void BinrySearch(int[] a , int key)
	{
		int low = 0;
		int high = a.length - 1;

		while (low <= high)
		{
			int mid = (low + high)/2;

			if (a[mid] == key)
			{
				System.out.println("found");
				return;
			}
			else if (key > a[mid])
			{
				low = mid + 1;
			}
			else
			{
				high = mid - 1;
			}
		}
		System.out.println("not found");
	}
}
