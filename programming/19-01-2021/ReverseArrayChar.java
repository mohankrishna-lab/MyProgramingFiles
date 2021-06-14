//Program to reverse array of char's

class ReverseArrayChar
{
	public static void main(String[] args) 
	{
		char[] ch = {'a' , 'M' , 't' , 'K' , 'N' , 'z'};

		char[] ch1= reverseCharArray(ch);

		for (int i = 0;i < ch1.length ;i++ )
		{
			System.out.println(ch[i]);
		}
	}

	public static char[] reverseCharArray(char[] ch)
	{
		for (int i = 0;i < ch.length / 2 ;i++ )
		{
			char temp;

			temp = ch[i];

			ch[i] = ch[ch.length - 1 - i];

			ch[ch.length - 1 - i] = temp;
		}
		return ch;
	}
}
