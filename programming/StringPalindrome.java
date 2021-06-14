class StringPalindrome 
{
	public static void main(String[] args) 
	{
		String s = "leyuuel";

		if (isPalindrome(s))
		{
			System.out.println("yes");
		}
		else
			System.out.println("no");
	}

	public static boolean isPalindrome(String s)
	{
		String rev = "";

		for (int i = 0;i < s.length()/2 ;i++ )
		{
			if (s.charAt(i) != s.charAt(s.length() - 1 - i))
			{
				return false;
			}
		}
		return true;
	}
}
