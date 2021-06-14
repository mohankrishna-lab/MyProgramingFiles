//Program to print all the prime numbers between 1 to N

import java.util.Scanner;

class PrimeNumbers
{
	public static void main(String[] args) 
	{
		int num = readNum();

		System.out.println("prime numbers from 1 to " + num + " are:");
		System.out.println();

		if (num <= 1)
		{
			System.out.println("is neither prime nor not prime");
		}
		else
		{
			int pCount=0;
			int nPCount=0;
		
		for (int i = 2;i <= num ;i++ )
		{
			if (isPrime(i))
			{

				System.out.println(i + " is a prime");
			}
		}
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto how many numbers to check prime or not");
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
