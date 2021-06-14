package programsprac;

public class CustomException extends Exception
{
	private String s;

	public CustomException(String s) {
		super();
		this.s = s;
	}
	
	public CustomException()
	{	
	}
	
	@Override
	public String getMessage()
	{
		return s;
	}
}
