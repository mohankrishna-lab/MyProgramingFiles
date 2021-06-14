package programsprac;

public class CustomExceptionMain {

	public static void main(String[] args) 
	{
		System.out.println("custom exception");
		try {
		print();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	public static void print() throws Exception
	{
		throw new CustomException("hi");
	}

}
