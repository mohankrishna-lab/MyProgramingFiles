//Program to check for a specific string in a given array of Strings

class CheckingSpecificStringArray 
{
	public static void main(String[] args) 
	{
		String[] s = {"hello","world","to","the","mac","and","cheese"};
		String key = "mac";

		checkSpecificStringArray(s,key);
	}

	public static void checkSpecificStringArray(String[] s,String key)
	{
		boolean flag = false;
		for (int i = 0;i < s.length ;i++ )
		{
			if (s[i].equals(key))
			{
				System.out.println("found");

				flag = true;

				break;
			}
		}

		if (!flag)
		{
			System.out.println("not found");
		}
	}
}
