// Program to print all strong numbers between 1 to N

import java.util.Scanner;

class StrongNumbers 
{
	public static void main(String[] args) 
	{
		int num = readNum();

		System.out.println("Strong numbers form 1 to " + num + " are:");
		System.out.println();

		for (int i = 1;i<= num ;i++ )
		{
			if (isSpecial(i))
			{
				System.out.println(i + " is a special number");
			}
			
		}
	}


	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto how many numbers to check ");
		return sc.nextInt();
	}

	public static boolean isSpecial(int num)
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
