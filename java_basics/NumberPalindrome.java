import java.util.Scanner; 
class NumberPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any value");
		int num=sc.nextInt();
		int temp=num;
		
		boolean b=checkPalindrome(num);
		if(b)
			{
		System.out.println(temp+" is palindrome");
			}
			else
		{
				System.out.println(temp+" is not palindrome");
			}

	}
	public static boolean checkPalindrome(int num)
	{
		int rem;
		int rev=0;
		int temp=num;
		while(num>0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if(rev==temp)
		{
			return true;
		}
		else
		{
			return false;
		}

	}
}
