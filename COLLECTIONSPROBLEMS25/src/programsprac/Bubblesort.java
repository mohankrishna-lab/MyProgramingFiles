package programsprac;

public class Bubblesort 
{
	public static void main(String[] args)
	{
		int a[]= {4,5,23,45,11,8,1};
	
		for (int i = 0;i < a.length -1; i++)
		{
			for (int j = i+1;j <a.length;j++)
			{
				if (a[i] > a[j])
				{
					int temp = a[i];
					a[i]=a[j];
					a[j] = temp;
				}
					
			}
		}
		
		for (int i = 0;i <a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
