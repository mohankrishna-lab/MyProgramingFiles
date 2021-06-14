package arraylistss;

public class StudentNotFoundException extends RuntimeException
{
	private String s;
	
	public StudentNotFoundException(String s)
	{
		this.s = s;
	}
	
	@Override
	public String getMessage()
	{
		return s;
	}
}
