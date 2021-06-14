import java.util.Scanner;
class ArrayExample3
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

			
			
		
			int sum=perfectNumber(a[i]);
				
			if (sum==a[i])
			{
				System.out.println("-------------------------------------");
				System.out.println(a[i]+" is perfect number");

			}
			else{
				System.out.println("-------------------------------------");
				System.out.println(a[i]+" is not a perfect number");
			}
		}			
		
			



		
	}
	public static int perfectNumber(int a) 
	{
		int sum=0;
		for (int i=1;i<a ;i++ )
		{
		
		if (a%i==0)
		{
			sum=sum+i;
		}
		}
		return sum;
	}
}
