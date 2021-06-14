package javascriptpatterns;

public class Patterns1 
{

	public static void main(String[] args) 
	{
		int rows = 5;
		int a = 1;
		
		for (int i = 1 ;i <= rows ; i++ )
		{
			for (int j = 1; j <= a ; j++)
			{
				System.out.print(j);
			}
			System.out.println();
			a++;
		}
	}

}
