import java.util.Scanner;

class EvenOrOdd 
{
	public static void main(String[] args) 
	{

		if (checkEvenOrOdd(readNum()))
		{
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}
	public static int readNum()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		return sc.nextInt();
	}
	public static boolean checkEvenOrOdd(int num)
	{
		return (num & 1) == 0 ? true : false;
	}

}

