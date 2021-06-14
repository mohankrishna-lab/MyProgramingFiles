import java.util.Arrays;

class SortingAnArrayUsingPredefineMethods  
{
	public static void main(String[] args) 
	{
		int[] a = {78,4,5,6,7,3,4,5,6,7,8,1,10};
		int[]  b= {78,4,5,6,7,3,4,5,6,7,8,1,10};

		if (Arrays.equals(a,b))
		{
			System.out.println("yes");
		}

		sortAnArray(a);
	}

	public static void sortAnArray(int[] a)
	{
		Arrays.sort(a);
		for (int i = 0;i < a.length ;i++ )
		{
			System.out.println(a[i]);
		}
	}
}
