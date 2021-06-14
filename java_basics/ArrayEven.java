import java.util.Scanner;
class ArrayEven
{
	public static void main(String[] args) 
	{
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size as 10");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter a number");
		for(i=0;i<size;i++)
			{
			a[i]=sc.nextInt();
			}
			System.out.println("---------------------------------");
			for (i=0;i<a.length ;i++ )
			{
				evenValues(a[i]);
			}
			
	}
	public static void evenValues(int a)
	{

		if(a%2==0)
		{
			System.out.println(a);
			System.out.println("are even numbers");
		}
	}
}