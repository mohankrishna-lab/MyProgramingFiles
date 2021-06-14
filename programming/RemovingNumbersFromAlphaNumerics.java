class RemovingNumbersFromAlphaNumerics 
{
	public static void main(String[] args) 
	{
		String s = "hello123";
		toRemoveNumeric(s);
	}
	public static void toRemoveNumeric(String s)
	{
		char[] ch = s.toCharArray();
		String str = "";

		for (int i = 0;i < ch.length ;i++ )
		{
			if (!(ch[i] >='0' && ch[i] <= '9'))
			{
				str = str + ch[i];
			}
		}
		System.out.println(str);
	}
}
