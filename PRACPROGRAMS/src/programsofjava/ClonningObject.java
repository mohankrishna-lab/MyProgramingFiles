package programsofjava;

public class ClonningObject
{
	@Override
	public Object clone()
	{
		return new ClonningObject();
	}
}
