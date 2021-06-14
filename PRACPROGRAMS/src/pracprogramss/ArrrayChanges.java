package pracprogramss;

public class ArrrayChanges
{

	public static void main(String[] args)
	{
		
		int[] a = {5,6,7,8,9,10,1,2,3};
		
		for (int i = 0; i < a.length; i++)
		{
			System.out.println(a[i]);
		}
		
		arrayWillChange(a);
		
		System.out.println("===============================================");
		
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
		
	}
	
	public static void arrayWillChange(int[] a)
	{
		a[0] = 1;
		a[a.length - 1] = 10;
		a[3] = 89;
	}

}
