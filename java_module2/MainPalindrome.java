import java.util.Scanner;
class Palindrome 
{
	public void checkPalindrome(int num) 
	{
		int rev=0;
		int rem;
		int temp;
		temp=num;

		while(num>0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		if(rev==temp)
		{
			System.out.println(temp+" is palindrome");
		}
		else
		{
			System.out.println(temp+" is not a palindrome");
		}		
	}
}

class MainPalindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
        int num=sc.nextInt();
		Palindrome p=new Palindrome();
		p.checkPalindrome(num);
	}
}
