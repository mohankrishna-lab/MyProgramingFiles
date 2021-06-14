class RemoveWhiteSpaces 
{
	public static void main(String[] args) 
	{
		String s = "  this  is  a  class";

		toRemoveWhiteSpaces(s);
	}

	public static void toRemoveWhiteSpaces(String s)
	{
		char[] ch = s.toCharArray();
		String ss = "";
		String s2 = "";
		int i = 0;

		for (;i < ch.length ;i++ )
		{
			boolean flag = false;
			if (ch[i] >= 'a' && ch[i] <= 'z' || ch[i] >= 'A' && ch[i] <= 'Z')
			{
				flag = true;
			}
			if (flag)
			{
				break;

			}
		}

		for (;i < ch.length ;i++ )
		{
			ss = ss + ch[i];
		}
		
		s2 = ss;
		char ch1[] = s2.toCharArray();
		String s3 = "";
		for (int j = 0;j < ch.length - 2 ;j++ )
		{
			if (ch1[j] >= 'a' && ch1[j] <= 'z' || ch1[j] >= 'A' && ch1[j] <= 'Z')
			{
				s3 = s3 + ch1[j];
			}
			else
			{
				s3 = s3 + ch1[j++];
			}
			
		}

		System.out.println(s3);
	}
}
