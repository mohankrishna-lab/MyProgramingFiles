class PanagramString 
{
	public static void main(String[] args) 
	{
		String s = "the quick brown fox jumps over a lazy dog";

		if (isPanagram(s))
			System.out.println("yes");
		else
			System.out.println("nope");
	}

	public static boolean isPanagram(String s)
	{
		boolean[] b = new boolean[26];

		for (int i = 0;i < s.length() ;i++ )
		{
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				b[s.charAt(i) - 'a'] = true;
			}

			else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')
			{
				b[s.charAt(i) - 'A'] = true;
			}
		}

		for (int i = 0;i < b.length ;i++ )
		{
			if (!b[i])
			{
				return false;
			}
		}
		return true;
	}
}
