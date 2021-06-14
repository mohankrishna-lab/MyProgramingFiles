package exceptionhandling;

public class MarriageB 
{

	public static void main(String[] args) 
	{
		EligibleOrNot e1 = new EligibleOrNot();
		try
		{
		e1.validateAge(17, 'm');
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		
		}
		try 
		{
			e1.validateAge(45, 'f');
		} 
		catch (NotEligibleForMarriageException e) 
		{
			System.out.println(e.getMessage());
		}
	}

}
