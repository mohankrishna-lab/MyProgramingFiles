import java.util.Scanner;

class HappyNumber 
{
	public static void main(String[] args) 
	{
		int num = readNum();

		if (isHappyNumber(num))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number to check happy number or not");
		return sc.nextInt();
	}

	public static boolean isHappyNumber(int num)
	{
		

		while (num > 4)
		{
			int square = 0;
			while (num > 0)
			{
				square = square + (int)Math.pow(num % 10 , 2);
				num /= 10;
			}
			num = square;
			
		}
		return num == 1 ? true : false;
		
	}
}
