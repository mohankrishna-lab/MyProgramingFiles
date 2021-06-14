import java.util.Scanner;
class Addition2
{
	public int add(int a,int b)
	{
		return a+b;
	}
}
class Subraction2
{
	public int sub(int a,int b)
	{
		return a-b;
	}
}
class Multiplication2
{
	public int mul(int a,int b)
	{
		return a*b;
	}
}
class Quotient2
{
	public  int quo(int a,int b)
	{
		return a/b;
	}
}
class Remainder2
{
	public int rem(int a,int b)
	{
		return a%b;
	}
}

class Calculator2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num1 value");
		int num1=sc.nextInt();
		System.out.println("enter the num2 value");
        int num2=sc.nextInt();
		System.out.println("choose your choice:\n1.Addition\n2.Subraction\n3.mutiplication\n4.quotient\n5.Remainder");
		System.out.println("-----------------------------------------------------------------");
		int choice=sc.nextInt();
		Addition a=new Addition();
		Subraction s=new Subraction();
		Multiplication m=new Multiplication();
		Quotient q=new Quotient();
		Remainder r=new Remainder();
		switch(choice)
		{
			case 1:int sum=a.add(num1,num2);
			     System.out.println("addition of " + num1 + " and " + num2+ " is: " + sum);
			      break;
			case 2:int sub=s.sub(num1,num2);
				System.out.println("difference of " + num1 + " and " + num2 + " is " + sub);
				break;
			case 3:int mul=m.mul(num1,num2);
				System.out.println("product of " + num1 + " and " + num2 + " is: " + mul);
				break;
			case 4:int quo=q.quo(num1,num2);
				System.out.println("quotient of " + num1 +" and " + num2 + " is: " + quo);
				break;
			case 5:int rem=r.rem(num1,num2);
				System.out.println("remainder of " + num1 + " and " + num2 + " is: " + rem);
				break;
				default:System.out.println("please check your choice");
		}
	}
}


