//Program to print num of occurance of each char in a given string

class NumOfOccuranceEachChar
{
	public static void main(String[] args) 
	{
		String s= "Welcome";

		numOfOccuranceChar(s);
	}

	public static void numOfOccuranceChar(String s)
	{
		char[] ch = s.toCharArray();

		for (int i = 0 ;i < ch.length ;i++ )
		{
			int k = 0;
			int count = 1;
			for (int j = i+1;j < ch.length ;j++ )
			{
			if (ch[i] == ch[j] && ch[i] != '0')
			{
				count++;
				ch[j] = '0';
			}
			}
			if (ch[i] != '0')
			{
				System.out.println(ch[i] + " - " + count + " times" );
			}
		}
	}
}
