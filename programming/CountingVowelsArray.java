//Program to count the number of vowels & consonants from a given array of characters

class CountingVowelsArray
{
	public static void main(String[] args) 
	{
		char[] ch = {'m' , 'M' , 'A' , 'a' , 'O' , 'p' , 'i' , 'E'}; 
		countVowels(ch);
	}

	public static void countVowels(char[] ch)
	{
		int count = 0;
		for (char c : ch)
		{
			if (isVowel(c))
			{
				count++;
			}
		}
		System.out.println("the vowels in the array are: " + count);

	}

	public static boolean isVowel(char ch)
	{
		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
}
