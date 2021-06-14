package exceptionhandling;

public class NotEligibleForMarriageException extends Exception
{
	String s;
	public NotEligibleForMarriageException(String s)
	{
		this.s = s;
	}
	
	@Override
	public String getMessage()
	{
		return s;
	}
}
