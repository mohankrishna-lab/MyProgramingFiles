class LowerToUpperUpperToLower
{
	public static void main(String[] args) 
	{
		String s = "heLLoWorlD";

		System.out.println(lowerToUpperToLower(s));
	}
	
	public static String lowerToUpperToLower(String s)
	{
		char[] ch = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= 'a' && ch[i] <= 'z')
			{
				ch[i] = (char)(ch[i] - 32);
			}
			else if(ch[i] >= 'A' && ch[i] <= 'z')
			{
				ch[i] = (char)(ch[i] + 32);
			}
		}
		return new String(ch);
	}
}
