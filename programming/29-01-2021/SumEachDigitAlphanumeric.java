//Program to find sum of each digit in a given alphanumeric string

class SumEachDigitAlphanumeric
{
	public static void main(String[] args) 
	{
		String s = "Hello123";

		sumEachAlphanumeric(s);
	}

	public static void sumEachAlphanumeric(String s)
	{
		char[] ch = s.toCharArray();

		int sum = 0;

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] >= '0' && ch[i] <= '9')
			{
				sum += (ch[i] - 48);
			}
		}
		System.out.println(sum);
	}
}
