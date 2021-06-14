package programsprac;

public class AnithaDeloite {

	public static void main(String[] args) 
	{
		System.out.println(itemId(32387634));
	}
	
	public static int itemId(int num)
	{
		int id = 0;
		while (num > 0)
		{
			int rem = num % 10;
			
			if (id == 0)
			{
				id = rem;
			}
			else if (id < rem)
			{
				id = rem;
			}
			
			num = num / 10;
		}
		
		return id;
	}

}
