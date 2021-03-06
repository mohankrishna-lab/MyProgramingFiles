// Program to print all the perfect numbers between 1 to N

import java.util.Scanner;

class PerfectNumbers 
{
	public static void main(String[] args) 
	{
		int num = readNum();

		System.out.println("the perfect numbers form 1 to " + num + " are:");
		System.out.println();

		for (int i = 1;i <= num ;i++ )
		{
			if (isPerfect(i))
			{
				System.out.println(i + " is a perfect Number");
			}
		}
		
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto how many numbers to check perfect number");
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
