//Program to check whether given two array of Strings are equal or not

class CheckingTwoStringArrayEqual 
{
	public static void main(String[] args) 
	{
		String[] s1 = {"hello","world","to","the","mac","and","cheese"};
		String[] s2 = {"hello","world","to","the","mac","and","cheese"};
		
		checkTwoStringArrayEqual(s1,s2);
	}

	public static void checkTwoStringArrayEqual(String[] s1,String[] s2)
	{
		boolean flag = false;
		if (s1.length == s2.length)
		{
		for (int i = 0;i < s1.length ;i++ )
		{
			if (!s1[i].equals(s2[i]))
			{
				System.out.println("not equal");

				flag = true;
			}
		}
		}
		if (!flag)
		{
			System.out.println("is equal");
		}
	}
}