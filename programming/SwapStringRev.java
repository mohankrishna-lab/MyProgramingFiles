class SwapStringRev
{
	public static void main(String[] args) 
	{
		String s = "hi guys how are you";

		swapString(s);
	}

	public static void swapString(String s)
	{
		String[] str = s.split(" ");
		for (int i = 0;i < str.length / 2 ;i++ )
		{
			String temp = str[i];

			str[i] = str[str.length - 1 - i];
			str[str.length - 1 - i] = temp;
		}

		for (String ss : str )
		{
			System.out.print(ss + " ");
		}
	}
}
