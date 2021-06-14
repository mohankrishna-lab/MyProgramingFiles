package javascriptpatterns;

public class Patterns4
{

	public static void main(String[] args) 
	{
		int rows = 5;
		int a = 1;
		int b = 0;
		
		for (int i = 1; i <= rows ; i++)
		{
			for (int j = 1 ; j <= a ; j++)
			{
				if (b == 0)
				{
					System.out.print(b);
					b++;
				}
				else
				{
					System.out.print(b);
					b--;
				}
			}
			System.out.println();
			a++;
		}
	}

}
