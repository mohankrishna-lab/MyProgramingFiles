//Print Digits Of The Given Number

import java.util.Scanner;

class PrintingEvenDigits 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int num = sc.nextInt();
		System.out.println("Even Digits in " + num + " is:");
		printEvenDigits(num);
	}
	public static void printEvenDigits(int num)
	{
		
		while(num > 0)
		{
		int rem = num % 10;
		if (rem % 2 == 0)
		{
			System.out.println(rem);
		}
		num /= 10;
		}
	}
}
