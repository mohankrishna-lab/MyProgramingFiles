class CommonElementsOfTwoArray 
{
	public static void main(String[] args) 
	{
		int[] a = {5,6,7,2,3,1};
		int[] b = {7,4,3,2,1,10,67};
		
		commonElementsInTwoArray(a,b);
	}
	public static void commonElementsInTwoArray(int[] a , int[] b)
	{
		for (int i = 0;i < a.length ;i++ )
		{
			for (int j = 0;j < b.length ;j++ )
			{
				if (a[i]  == b[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}
