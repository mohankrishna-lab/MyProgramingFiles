// WAP to print all palindrome numbers of an array


class PrintingPalindromeNum
{
	public static void main(String[] args) 
	{
		int[] num = {153 , 33 , 44 , 6565 , 7887 , 9879 , 9999};
		printPalindromeNum(num);
	}

	public static void printPalindromeNum(int[] num)
	{
		System.out.println("palindrome numbers in array is:");
		for (int i : num )
		{
			if (isPalindrome(i))
			{
				System.out.println(i);
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

		if (temp == rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
