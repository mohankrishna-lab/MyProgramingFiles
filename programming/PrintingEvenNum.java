import java.util.Scanner;

class PrintingEvenNum 
{
	public static void main(String[] args) 
	{
		int[] a = readArray();
		printEvenNum(a);
	}

	public static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size = sc.nextInt();
		System.out.println("enter elements into an array");

		int[] a = new int[size];
		for (int i = 0;i < a.length ;i++ )
		{
			a[i] = sc.nextInt();
 		}
		return a;
	}

	public static void printEvenNum(int[] a)
	{
		System.out.println("even numbers are:");
		for (int i : a )
		{
			if (i % 2 == 0)
			{
				System.out.println(i);
			}
		}
	}
}
