import java.util.Scanner;

class PrimeOrNot 
{
	public static void main(String[] args) 
	{
		int num = readNum();
		if (num <= 1)
		{
			System.out.println("it is neither prime nor not prime");
		}
		else
		{
		if (isPrime(num))
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num + " is a not prime number");
		}
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();
	}

	public static boolean isPrime(int num)
	{
		for (int i = 2;i < num ;i++ )
		{
			if (num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
