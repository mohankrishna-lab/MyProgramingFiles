import java.util.Arrays;
import java.util.Scanner;

class AnagramString 
{
	public static void main(String[] args) 
	{
		String s1 = readString();
		String s2 = readString();
		isAnagramString(s1,s2);
	}

	public static String readString()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first string");
		String s1 = sc.nextLine();
		return s1;
	}

	public static void isAnagramString(String s1,String s2)
	{
		String str1 = "";
		String str2 = "";
		for (int i = 0;i < s1.length() ;i++ )
		{
			if (s1.charAt(i) != ' ')
			{
				str1 += s1.charAt(i);
			}
		}

		for (int i = 0;i < s2.length() ;i++ )
		{
			if (s2.charAt(i) != ' ')
			{
				str2 += s2.charAt(i);
			}
		}

		String ss1 = str1.toLowerCase();
		String ss2 = str2.toLowerCase();

		char[] ch1 = ss1.toCharArray();
		char[] ch2 = ss2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		if (Arrays.equals(ch1,ch2))
		{
			System.out.println("is Anagram");
		}
		else
			System.out.println("not anagram");
	}
}
