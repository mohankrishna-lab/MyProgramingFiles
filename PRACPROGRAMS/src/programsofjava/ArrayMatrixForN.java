package programsofjava;

public class ArrayMatrixForN
{

	public static void main(String[] args) 
	{
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		print(a);
	}
	
	public static void print(int[][] a)
	{
		int i = 0;
		int j = 0;

		
		for (; i < 3 ; i ++)
		{
			for(;j < 3 ;j++)
			{
				System.out.print(a[i][j] + " ");
			}
			j--;
		}
	}

}
