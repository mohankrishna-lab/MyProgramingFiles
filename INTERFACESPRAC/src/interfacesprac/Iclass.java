package interfacesprac;

public class Iclass implements Itr3
{
	
	@Override
	public void print(int x)
	{
		System.out.println("x is " + x);
	}
	
	@Override
	public void disp(int a , int b)
	{
		System.out.println("a+b=" + (a+b));
	}
	
	@Override
	public void print()
	{
		System.out.println("hi world");
	}
}
