import java.util.Scanner;

class Palindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the min num");
		int min = sc.nextInt();

		System.out.println("enter the max num");
		int max = sc.nextInt();
			
		System.out.println("palindrome numbers are: ");
		System.out.println("---------------------------------------");

		printPalindrome(min , max);
	}

	public static void printPalindrome(int min , int max)
	{
		for (int i = min;i <= max ;i++ )
		{
			if (isPalindrome(i))
			{
				System.out.println(i);
			}
		}
	}

	public static boolean isPalindrome(int num)
	{
		int temp = num;
		int rev = 0;
		
		while (num > 0)
		{
			int rem = num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}

		return temp == rev ? true:false;
		
	}
}
