class StringArrayUniqueElements 
{
	public static void main(String[] args) 
	{
		String[] s = {"hello" , "world" , "maybe" , "duplicate" , "hello"};

		uniqueStringElements(s);
	}

	public static void uniqueStringElements(String[] s)
	{
		boolean flag = false;
		
		for (int i = 0;i < s.length ;i++ )
		{
			System.out.println("hello");
			if (!(s[i].equals("null")))
			{
			for (int j = i + 1;j < s.length ;j++ )
			{
				if (s[i].equals(s[j]) && !(s[j].equals(null)))
				{
					s[j] = "null";
					flag = true;
					break;
				}
			}
			}
			if (!flag && !(s[i].equals("null")))
			{
				System.out.println(s[i]);
			}
		}
	}
}
