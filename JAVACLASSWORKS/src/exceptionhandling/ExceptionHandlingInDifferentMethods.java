package exceptionhandling;

public class ExceptionHandlingInDifferentMethods 
{

	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		view();
		System.out.println("main method ends");
	}
	
	public static void view()
	{
		System.out.println("view method starts");
		try
		{
			print();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("view method ends");
	}
	
	public static void print()
	{
		System.out.println("print method starts");
		System.out.println(10/0);
		System.out.println("print method ends");
	}

}
