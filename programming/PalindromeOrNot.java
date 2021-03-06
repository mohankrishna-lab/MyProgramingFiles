import java.util.Scanner;

class PalindromeOrNot 
{
	public static void main(String[] args) 
	{
		int num = readNum();
		if (isPalindrome(num))
		{
			System.out.println(num + " is palindrome");
		}
		else
		{
			System.out.println(num + " is not palindrome");
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
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
		return temp == rev ? true : false;
	}
}
