//Program to remove all the special char from a give string

class RemoveAllSpecialChar
{
	public static void main(String[] args) 
	{
		String s = "Hello@$%^hiBye@123";

		removeSpecialChar(s);
	}

	public static void removeSpecialChar(String s)
	{
		char[] ch = s.toCharArray();

		String str = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			if ((ch[i] >= '0' && ch[i] <= '9') || (ch[i] >= 'A' && ch[i] <= 'Z') || (ch[i] >= 'a' && ch[i] <= 'z'))
			{
				str = str + ch[i];
			}
		}
		System.out.println(str);
	}
}
