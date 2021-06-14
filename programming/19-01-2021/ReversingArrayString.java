//Program to reverse array of Strings

class ReversingArrayString
{
	public static void main(String[] args) 
	{
		String[] s = {"hello " , "world" , "are" , "you" , "ok" , "in" , "world"};

		String s1[] = reverseArrayString(s);
		
		for (int i = 0;i < s1.length ;i++ )
		{
			System.out.println(s[i]);
		}	
	}

	public static String[] reverseArrayString(String[] s)
	{
			for (int i = 0;i < s.length / 2 ;i++ )
			{
				String temp;

				temp = s[i];

				s[i] = s[s.length - 1 - i];
				
				s[s.length - 1 - i] = temp;
			}
			return s;
	}
}
