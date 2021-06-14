class UppercaseStringToLowercaseString 
{
	public static void main(String[] args) 
	{
		String s = "HELLOWORLD";

		System.out.println(toLowercaseString(s));
	}
	
	public static String toLowercaseString(String s)
	{
		char[] ch = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= 'A' && ch[i] <= 'Z')
			{
				ch[i] = (char)(ch[i] + 32);
			}
		}
		return new String(ch);
	}
}
