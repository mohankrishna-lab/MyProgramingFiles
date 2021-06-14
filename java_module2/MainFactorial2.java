import java.util.Scanner;
class Factorial 
{
	public int factorialOfANumber(int num) 
	{
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}
}
class MainFactorial2
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int num1=sc.nextInt();
		Factorial f=new Factorial();
        int num2=f.factorialOfANumber(num1);
		System.out.println(num1+" factorial is "+num2);
	}
}