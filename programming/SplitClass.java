class SplitClass 
{
	public static void main(String[] args) 
	{
		String s = "hi guys how are you";

		String[] str = s.split("\\s");

		for (String ss : str )
		{
			System.out.println(ss);
		}
	}
}
