import java.util.Scanner;
class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any string");
		String s1=sc.next();
		checkStringPalindrome(s1);
	}
	public static void checkStringPalindrome(String s1)
	{
		String s2="";
		for (int i=s1.length()-1;i>=0 ; i--)
		{
			s2=s2+s1.charAt(i);
		}
		if(s2.equals(s1))
		{
			System.out.println(s1+" is palindrome");
		}
		else
		{
			System.out.println(s1+" is not palindrome");
		}
	}
}
