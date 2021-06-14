class ReverseStringWords 
{
	public static void main(String[] args) 
	{
		String s = "this is a class";

		reverseStringByWords(s);
	}
	public static void reverseStringByWords(String s)
	{
		String[] str = toSplit(s);

		String ss = "";

		for (String s1 : str)
		{
			for (int i = s1.length() - 1;i >= 0 ;i-- )
			{
				ss = ss + s1.charAt(i);
			}
			ss = ss + " ";
		}

		System.out.println(ss);
	}

	public static String[] toSplit(String s)
	{

		int count = countSpaces(s);
		String[] str = new String[count + 1];
		int k = 0;

		for (int i = 0;i < str.length ;i++ )
		{
			for (int j = 0;j < s.length() ;j++ )
			{
				if (s.charAt(i) == 0)
				{
					j++;
					break;
				}
				else
				{
					str[i] = str[i] + s.charAt(j);
				}
			}	
		}
		return str;
	}

	public static int countSpaces(String s)
	{
		int count = 0;

		for (int i = 0;i < s.length() ;i++ )
		{
			if (s.charAt(i) == ' ')
			{
				count++;
			}
		}

		return count;
	}
}
