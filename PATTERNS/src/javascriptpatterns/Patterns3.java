package javascriptpatterns;

public class Patterns3 {

	public static void main(String[] args)
	{	
		int rows = 4;
		int a = 1;
		int b = 1;
		
		for (int i = 1 ; i <= rows;i++)
		{
			for (int j = 1;j <= a;j++)
			{
				System.out.print(b++);
			}
			System.out.println();
			a++;
		}
	}

}
