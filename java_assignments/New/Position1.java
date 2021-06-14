import java.util.Scanner;
class Position1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
        int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter number");
		int num=sc.nextInt();
		for(int i=0;i<a.length;i++)
			if(a[i]==num)
		{
			System.out.println("position of given number in array is "+i);
		}
		
	}
}
