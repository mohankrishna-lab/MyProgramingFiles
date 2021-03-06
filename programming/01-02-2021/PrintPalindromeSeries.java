//Program to read series of numbers & print only palindromes

import java.util.Scanner;
class PrintPalindromeSeries
{
	public static void main(String[] args) 
	{
		String s = readSeries();

		System.out.println("-------------------------------------------------------");

		printPalindrome(s);
	}

	public static String readSeries()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter series of numbers in string to check palindrome");

		String s = sc.nextLine();

		return s;
	}

	public static void printPalindrome(String s)
	{
		String[] ss = s.split(" ");

		for (String str : ss)
		{
			int num = Integer.parseInt(str);
			if (isPalindrome(num))
			{
				System.out.println(num);
			}
		}
	}

	public static boolean isPalindrome(int num)
	{
		int rev = 0;
		int temp = num;

		while (num > 0)
		{
			int rem = num % 10;

			rev = rev * 10 + rem;

			num /= 10;
		}

		if (rev == temp)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
