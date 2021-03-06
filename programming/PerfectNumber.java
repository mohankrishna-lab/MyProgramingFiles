import java.util.Scanner;

class PerfectNumber 
{
	public static void main(String[] args) 
	{
		int num=readNum();
		if (isPerfect(num))
		{
			System.out.println(num + " is perfect number");
		}
		else
		{
			System.out.println(num + " is not perfect number");
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();
	}

	public static boolean isPerfect(int num)
	{
		int sum = 0;
		for (int i = 1;i < num ;i++ )
		{
			if (num % i == 0)
			{
				sum += i;
			}
		}
		return sum == num ? true : false;
	}
}

