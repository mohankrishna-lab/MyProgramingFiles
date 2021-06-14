//Program to print sum and average of an array

import java.util.Scanner;

class  ArraySumAndAverage
{
	public static void main(String[] args) 
	{
		int[] a = readArray();

		sumAndAverage(a);
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

	public static void sumAndAverage(int[] a)
	{
		int sum = 0;

		for (int i : a )
		{
			sum += i;
		}
		System.out.println("sum of array a: " + sum);
		System.out.println("average of arrary a: " + (sum / a.length));
	}
}
