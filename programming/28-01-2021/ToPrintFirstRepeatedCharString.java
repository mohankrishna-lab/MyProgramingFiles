//Program to print first repeated char in a given string

class ToPrintFirstRepeatedCharString
{
	public static void main(String[] args) 
	{
		String s = "jspidersqspiders";

		printFirstRepetedChar(s);
	}

	public static void printFirstRepetedChar(String s)
	{
		char[] ch = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			boolean flag = false;

			for (int j = i + 1;j < ch.length ;j++ )
			{
				if (ch[i] == ch[j])
				{
					flag = true;
				}
			}
			if (flag)
			{
				System.out.println(ch[i]);
				break;
			}
		}
	}
}
