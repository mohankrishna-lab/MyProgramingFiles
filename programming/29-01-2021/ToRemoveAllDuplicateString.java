//Program to remove all duplicate from a given string

class ToRemoveAllDuplicateString
{
	public static void main(String[] args) 
	{
		String s = "welcome";

		removeAllDuplicateString(s);
	}

	public static void removeAllDuplicateString(String s)
	{
		char[] ch = s.toCharArray();

		String str = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			for (int j = i + 1;j < ch.length ;j++ )
			{
				if (ch[i] == ch[j])
				{
					ch[j] = '0';
				}
			}
		}

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != '0')
			{
				str += ch[i];
			}
		}

		System.out.println(str);
	}
}
