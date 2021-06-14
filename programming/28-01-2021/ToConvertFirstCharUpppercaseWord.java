//Program to convert first char of each word in a sentence to uppercase

class ToConvertFirstCharUpppercaseWord
{
	public static void main(String[] args) 
	{
		String s = "hi guys how are you doing";

		System.out.println(toConvertFirstCharUpper(s));
	}

	public static String toConvertFirstCharUpper(String s)
	{
		char[] ch = s.toCharArray();

		ch[0] = (char)(ch[0] - 32);

		for (int i = 0;i < ch.length ;i++ )
		{
			if(ch[i] == ' ')
			{
				ch[i +1] = (char)(ch[i + 1] - 32);
			}
		}
		return new String(ch);
	}
}
