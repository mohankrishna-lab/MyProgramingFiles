class ReplaceSpacesCommas 
{
	public static void main(String[] args) 
	{
		String s = "this is a class";

		replaceSpacesWithCommas(s);
	}
	public static void replaceSpacesWithCommas(String s)
	{
		String[] str = s.split(" ");

		String ss = "";

		for (String s1 : str)
		{
			ss = ss + s1 + ",";
		}
		
		String s1 = "";
		char[] ch = ss.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			if (i != ch.length - 1)
			{
				s1 = s1 + ch[i];
			}
		}


		System.out.println(s1);
	}
}
