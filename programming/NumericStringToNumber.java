class NumericStringToNumber 
{
	public static void main(String[] args) 
	{
		String s = "1234";

		System.out.println(numericToNumber(s));
	}

	public static int numericToNumber(String s)
	{
		int num = 0;

		char[] ch = s.toCharArray();

		for (int i = 0;i < ch.length ;i++ )
		{
			num = num * 10 +ch[i] - 48;
		}
		return num;
	}
}
