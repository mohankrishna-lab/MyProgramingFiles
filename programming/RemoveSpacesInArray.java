class RemoveSpacesInArray
{
	public static void main(String[] args) 
	{
		
		String s = "hello world is good";

		System.out.println(toRemoveSpace(s));
	}

	public static String toRemoveSpace(String s)
	{
		char[] ch = s.toCharArray();

		String str = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != ' ')
			{
				str = str + ch[i];	
			}
			
		}
		return str;
	}
}
