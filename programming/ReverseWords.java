class ReverseWords 
{
	public static void main(String[] args) 
	{
		String s = "hi guys how are you";

		String[] str = reverseWords(s);

		for (String ss : str )
		{
			System.out.print(ss + " ");
		}
	}

	public static String[] reverseWords(String s)
	{
		String[] ss = s.split(" ");

		for (int i = 0;i < ss.length ;i++ )
		{
			ss[i] = reverse(ss[i]);
		}
		return ss;
	}
	public static String reverse(String s)
	{
		String str = "";

		for (int i = s.length() - 1;i >= 0 ;i-- )
		{
			str = str + s.charAt(i);
		}
		return str;
	}
}
