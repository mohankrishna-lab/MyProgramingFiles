package javascriptpatterns;

public class Patterns5 
{

	public static void main(String[] args) 
	{	
		int rows = 4;
		int column = 3;
		
		for (int i = 1 ; i <= rows ; i++)
		{
			for (int j = 1; j <= rows;j++)
			{
				if (j <= column)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("*");
				}
			}
			column--;
			System.out.println();
		}
		
	}

}
