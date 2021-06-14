package programsprac;

public class Prac2 {

	public static void main(String[] args)
	{
		int[] a = {1000,2000,3000,4000,5000};
		int sum = 0;
		
		for (int i = 0; i< a.length;i++)
		{
			if (a[i] > 1000)
			{
				sum = sum + ((a[i]-1000));
			}
		}
		sum = sum * 10/100;
		
		System.out.println(sum);
	}

}
