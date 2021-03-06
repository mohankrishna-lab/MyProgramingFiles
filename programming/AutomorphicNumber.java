//Program to check whether the given num is automorphic or not

import java.util.Scanner;

class AutomorphicNumber 
{
	public static void main(String[] args) 
	{
		int num =  readNum();

		if (isAutomorphic(num))
		{
			System.out.println(num + " is a automorphic number");
		}
		else
		{
			System.out.println(num + " is not a automorphic number");
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number to check whether it is a automorphic number");
		return sc.nextInt();
	}

	public static boolean isAutomorphic(int num)
	{
		int squareNum = (int)Math.pow(num , 2);

		int count = numCount(num);

		int lastNum = 0;

		for (int i = 1;i <= count ;i++ )
		{
			int rem = squareNum % 10;

			lastNum = lastNum * 10 + rem;
		}

		return lastNum == num ? true : false;

	}

	public static int numCount(int num)
	{
		int count = 0;

		while (num > 0)
		{
			count++;
			num /= 10;
		}
		return count;
	}
}
