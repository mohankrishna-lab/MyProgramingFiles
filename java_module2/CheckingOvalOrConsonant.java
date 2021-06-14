class OvalOrConsonant 
{
	public static void check(char ch) 
	{
		if ( ch== 'A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
		{
			System.out.println(ch+ " is a oval");
		}
		else
		{
			System.out.println(ch + " is an consonant");
		}
	}
}
class CheckingOvalOrConsonant
 {

	public static void main(String[] args)
	{
		char ch='a';
		OvalOrConsonant.check(ch);
	}
}
