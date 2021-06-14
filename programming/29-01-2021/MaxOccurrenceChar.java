//Program to find max occurrence of a given char

class MaxOccurrenceChar
{
	public static void main(String[] args) 
	{
		String s = "welcome to jspiders";

		maxOccurrence(s);
	}

	public static void maxOccurrence(String s)
	{
		char[] ch = s.toCharArray();

		int maxCount = 0;
		char ch1= ' ';

		for (int i = 0;i < ch.length ;i++ )
		{
			int count = 0;
			for (int j = i + 1;j < ch.length ;j++ )
			{
				if (ch[i] == ch[j] && ch[i] != ' ')
				{
					count++;
				}
			}
			if (maxCount < count)
			{
				maxCount = count;
				ch1 = ch[i];
			}
		}
		System.out.println(ch1);
	}
}
