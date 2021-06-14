//Program to print count even and odd numbers in an array

import java.util.Scanner;

class ArrayCountingEvenOdd 
{
	public static void main(String[] args) 
	{
		int[] a = readArray();

		countEvenOdd(a);
	}

	public static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		System.out.println("enter elements into an array");

		int[] a = new int[size];
		for (int i = 0;i < a.length ;i++ )
		{
			a[i] = sc.nextInt();
 		}
		return a;
	}

	public static void countEvenOdd(int[] a)
	{
		int eCount = 0;
		int oCount = 0;

		for (int i : a)
		{
			if (i % 2 == 0)
			{
				eCount++;
			}
			else
			{
				oCount++;
			}
		}

		System.out.println("even count= " + eCount);
		System.out.println("odd count= " + oCount);
	}
}
