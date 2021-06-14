import java.util.Arrays;
import java.util.BitSet;
import java.util.List;

public class A 
{
	
	public static void main(String[] args) 
	{
		int a = 1;
		int b = 2;
		int c = 3;
		a |= 4;
		b >>= 1;
		c <<= 1;
		a ^= c;
		System.out.println(a + " " + b + " " + c);
	}
	
	public int test()
	{
		try {
			return 1;
		}
		catch(Exception e)
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}
}
