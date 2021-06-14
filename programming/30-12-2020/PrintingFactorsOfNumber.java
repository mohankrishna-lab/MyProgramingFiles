// To Print Factors Of The Given Number

import java.util.Scanner;

class PrintingFactorsOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		System.out.println("factors of " + num + " is:");
		printFactors(num);
	}
	public static void printFactors(int num)
	{
		for (int i = 1;i <= num ;i++ )
		{
			if(num % i == 0)
			{
				System.out.println(i);
			}
		}
	}
}
