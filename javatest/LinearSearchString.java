class LinearSearchString 
{
	public static void main(String[] args) 
	{
		String s = "hello World";

		char ch = 'W';

		linearSearch(s , ch);
	}

	public static void linearSearch(String s , char ch)
	{
		for (int i = 0; i < s.length() ;i++ )
		{
			if (s.charAt(i) == ch)
			{
				System.out.println("found");

				return;
			}
		}

		System.out.println("not found");
	}
}
