class StringPractise 
{
	public static void main(String[] args) 
	{
		String s = "world";

		char ch[] = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			System.out.println(ch[i]);
		}
		String s1 = new String(ch);

		System.out.println(s1);

		System.out.println(s1.length());

		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());

		String s2 = "123";

		System.out.println(Integer.parseInt(s2));

		System.out.println(s.charAt(1));

		System.out.println(s.equals(s1));
	}
}
