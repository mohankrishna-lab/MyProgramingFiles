import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter a number");
		int num1=sc.nextInt();
		System.out.println("enter another number");
		int num2=sc.nextInt();
		System.out.println("1.Addition\n2.Subraction\n3.Mutiplication\n4.Quotient\n5.Remainder");
		System.out.println("--------------------------------------------------------------------");
		System.out.println("enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
			case 1:int sum=add(num1,num2);
			System.out.println("sum="+sum);
			        break;
			case 2:int diff=subraction(num1,num2);
			System.out.println("difference="+diff);
			         break;
			case 3:int mul=multiplication(num1,num2);
			System.out.println("product="+mul);
			         break;
			case 4:float quo=quotient(num1,num2);
			System.out.println("Quotient="+quo);
					break;
			case 5:int rem=remainder(num1,num2);
			System.out.println("remainder="+rem);
					break;
					default : 
						System.out.println("please check your choice");
		}
	}
	public static int add(int num1,int num2)
	{
		return num1+num2;
	}
	public static int subraction(int num1,int num2)
	{
		return num1-num2;
	}
	public static int multiplication(int num1,int num2)
	{
		return num1*num2;
	}
	public static float quotient(int num1,int num2)
	{
		return num1/num2;
	}
	public static int remainder(int num1,int num2)
	{
		return num1%num2;
	}
}
