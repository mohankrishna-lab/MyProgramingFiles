class CountWordCountChar 
{
	public static void main(String[] args) 
	{
		String s = "hi guys how are you";

		countWords(s);
	}

	public static void countWords(String s)
	{
		String[] str = s.split(" ");

		System.out.println("words in  string are " + str.length);

		for (String ss : str)
		{
			System.out.println("charcters in " + ss + " is " + ss.length());
		}
	}
}
