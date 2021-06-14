class SwapCasesString 
{
	public static void main(String[] args) 
	{
		String s = "heLLo WorLD";

		swapCasesString(s);
	}

	public static void swapCasesString(String s)
	{
		char[] ch = s.toCharArray();
		String ss = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				ss += (char)(ch[i] - 32);
			}
			else if (ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ss += (char)(ch[i] + 32);
			}
		}

		System.out.println(ss);
	}
}
