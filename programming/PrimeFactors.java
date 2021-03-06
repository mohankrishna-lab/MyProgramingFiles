//Program to print prime factors of a given number

import java.util.Scanner;

class PrimeFactors 
{
	public static void main(String[] args) 
	{
		int num = readNum();

		isPrime(num);
		
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();

	}

	public static void isPrime(int num1)
	{
		int num2 = factors(num1);

		while (num2 > 0)
		{
			int rem = num2 % 10;
			int count = 0;

			for (int i = 1;i <= rem ;i++ )
			{
				if (rem % i == 0)
				{
					count++;
				}
			}

			if (count == 2)
			{
				System.out.println(rem + " is one of the prime factor of given number");
			}
			num2 /= 10;
		}
	}

	public static int factors(int num)              
	{
		int fact=0;	
		
		for (int i = 1;i <= num ;i++ )
		{
			if (num % i == 0)
			{
			fact = fact * 10 + i;
			}
		}
		return fact;
		
	}
}



