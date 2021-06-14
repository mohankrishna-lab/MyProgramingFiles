import java.util.Scanner;

class ReverseTheNumber 
{
	public static void main(String[] args) 
	{
		int num = readNum();
		int a = reverseNum(num);
		System.out.println("reverse of the given number is:" + a);
	}

	
	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();
	}


	public static int reverseNum(int num)
	{
		int rev = 0;
		while (num > 0)
		{
			int rem;
			rem = num % 10;
			rev = rev * 10 + rem;
			num /= 10;
		}
		return rev;
	}
}
