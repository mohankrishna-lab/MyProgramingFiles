import java.util.Arrays;
class AnagramOrNot 
{
	public static void main(String[] args) 
	{
		String s1 = "listen";
		String s2 = "Silent";

		isAnagram(s1,s2);
	}

	public static void isAnagram(String s1 , String s2)
	{
		String ss1 = "";
		String ss2 = "";
		for (int i = 0;i < s1.length() ;i++ )
		{
			if (s1.charAt(i) != ' ')
			{
				ss1 += s1.charAt(i);
			}
		}

		for (int i = 0;i < s2.length() ;i++ )
		{
			if (s2.charAt(i) != ' ')
			{
				ss2 += s2.charAt(i);
			}
		}

		String str1 = ss1.toLowerCase();
		String str2 = ss2.toLowerCase();

		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1,ch2))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("not an anagram");
		}

	}


}
