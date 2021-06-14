package programsprac;

public class ExceptionPropagation 
{

	public static void main(String[] args) 
	{
		System.out.println("main method starts");
		try
		{
			m1();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println("main method ends");
	}
	
	public static void m1() throws Exception
	{
		System.out.println("m1 method starts");
		m2();
		System.out.println("m2 method ends");
	}
	
	public static void m2() throws Exception
	{
		System.out.println("m2 method starts");
		throw new Exception("this is exception propagration using throws key word");
	}

}
