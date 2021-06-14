//Program to print all palidrome numbers between 1 to N

import java.util.Scanner;

class PalindromeNumbers 
{
	public static void main(String[] args) 
	{
		int num = readNum();

		System.out.println("palindrome numbers form 1 to " + num + " are:");
		System.out.println();

		for (int i = 1;i<=num ;i++ )
		{
			if (isPalindrome(i))
			{
				System.out.println(i + " is palindrome");
			}
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter upto how many numbers to check palindrome");
		return sc.nextInt();
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
		return rev == temp ? true : false;
	}
}
