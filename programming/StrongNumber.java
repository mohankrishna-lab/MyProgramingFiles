import java.util.Scanner;

class StrongNumber
{
	public static void main(String[] args) 
	{
		int num = readNum();

		if (isStrong(num))
		{
			System.out.println(num + " is strong number");
		}
		else
		{
			System.out.println(num + " is not strong number");
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();

	}


	public static boolean isStrong(int num)
	{
		int sum = 0;
		int temp = num;
		while (num > 0)
		{
			int rem = num % 10;
			sum += factorial(rem);
			num /= 10;
		}
		return temp == sum ? true : false;
	}


	public static int factorial(int num)
	{
		int fact = 1;
		if (num == 0 || num == 1)
		{
			return fact;
		}
		else
		{
			for (int i = num;i>=1 ;i-- )
			{
				fact *= i;
			}
			return fact;
		}
	}
}
