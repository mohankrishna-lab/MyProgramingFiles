import java.util.Scanner;
class PrimeNumbers 
{
	public void checkPrimeNumbers(int num) 
	{
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		 if(count==2)
			System.out.println(num);
	}
}

class PrintingPrimeNumbers
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size of the array");
		int size=sc.nextInt();
		int num[]=new int[size];
		System.out.println("enter numbers into the array");
		for(int i=0;i<num.length;i++)
		num[i]=sc.nextInt();
		PrimeNumbers p=new PrimeNumbers();
		System.out.println("prime numbers in given array are:");
		for(int i=0;i<num.length;i++)
			p.checkPrimeNumbers(num[i]);
	   
	}
}

