class ReverseString 
{
	public static void main(String[] args) 
	{
		String s = "worldhi";

		swapChars(s);
	}

	public static void swapChars(String s)
	{
		String ss = "";

		for (int i = s.length() - 1;i >= 0;i-- )
		{
			ss += s.charAt(i);
		}

		System.out.println(ss);
	}
}
