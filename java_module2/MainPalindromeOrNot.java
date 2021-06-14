import java.util.Scanner;
class PalindromeOrNot 
{
	public void check(int num) 
	{
		
		int temp=num;
		int  rev=0;
		int rem;
		for(int i=1;num>0;i++)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
	
		if (temp==rev)
		{
			System.out.println(temp+" is a palindrome");
		}
		else
	{
			System.out.println(temp+" is not a palindrome");
	}
	}

}
class MainPalindromeOrNot
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num=sc.nextInt();
		PalindromeOrNot p1=new PalindromeOrNot();
		
		p1.check(num);
	}
}
