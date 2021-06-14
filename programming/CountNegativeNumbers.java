class CountNegativeNumbers 
{
	public static void main(String[] args) 
	{
		String s = "10 -1 -5 20 15 -3 100";

		countNegativeNum(s);
	}

	public static void countNegativeNum(String s)
	{
		String[] str = s.split(" ");

		int count = 0;

		for (String ss: str)
		{
			if (Integer.parseInt(ss) < 0)
			{
				count++;
			}
		}

		System.out.println(count);
	}
}
