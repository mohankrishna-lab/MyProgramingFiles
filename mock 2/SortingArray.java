class SortingArray 
{
	public static void main(String[] args) 
	{
		int[] num = {9 , 5 , 3 , 4 ,7 , 1};

		sortArray(num);
	}

	public static void sortArray(int[] num)
	{
		for (int j = 0;j < num.length ;j++ )
		{
			for (int i = j + 1;i < num.length ;i++ )
			{
				if (num[j] > num[i])
				{
					int temp = num[j];
					num[j] = num[i];
					num[i] = temp;
				}
			}
		}
		for (int i = 0;i < num.length ;i++ )
		{
			System.out.println(num[i]);
		}	
	}
}
