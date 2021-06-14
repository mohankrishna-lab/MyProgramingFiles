package programsofjava;

public class ArrayMatrix 
{
	public static void main(String[] args)
	{
		int[][] a = {{1,2,3}, {4,5,6}, {7,8,9}};
		
		print(a);
	}
	
	public static void print(int[][] a)
	{
			int i = 0;
			int k = 0;
			int l = i+1;
			for (int j = 0 ; j < 3 ; j++)
			{
				System.out.print(a[i][j]+" ");
				k  = j;
			}
			
			while(l < 3)
			{
				System.out.print(a[l++][k] + " ");
			}
			
			while (k > 0)
			{
				System.out.print(a[l - 1][--k] + " ");
			}
			
			while (k < 2)
			{
				System.out.print(a[l-2][k++] + " ");
			}
	}
}
