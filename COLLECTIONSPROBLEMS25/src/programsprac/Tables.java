package programsprac;

public class Tables {

	public static void main(String[] args)
	{
		/*for (int i = 17; i <= 20; i++)
		{
			for (int j = 1; j <= 20; j++)
			{
				System.out.println(i + "*" + j + "=" + i*j);
			}
			
			System.out.println("====================");
		}*/
		
		for (int i = 1; i <= 5; i++)
		{
			boolean flaga = true;
			boolean flagb = false;
			for (int j = 1; j <=5; j++)
			{
				if (i%2==0 && j%2==0)
				{
					System.out.print("*");
				}
				else if (j == 3 && i%2 != 0 && flaga)
				{
					System.out.print("*");
					flagb = true;
					flaga = false;
				}
				else if((j == 1 || j == 5) && flagb)
				{
					System.out.print("*");
					flaga = true;
				}
				else
				{
					System.out.print(" ");
				}
		
			}
			System.out.println();
		}
	}

}
