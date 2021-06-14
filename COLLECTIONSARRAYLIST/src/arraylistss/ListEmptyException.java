package arraylistss;

public class ListEmptyException extends RuntimeException
{
	private String s;
	
	public ListEmptyException(String s)
	{
		this.s = s;
	}
	
	@Override
	public String getMessage()
	{
		return s;
	}
}
