package pracprogramss;

class Test
{
	public Test(int d)
	{
		System.out.println("hi " + d);
	}
}

class Test1 extends Test
{
	public Test1(double d)
	{
		super(11);
		System.out.println(d);
	}
}

class Test2 extends Test1
{
	public Test2(char d)
	{
		super(11.1);
		System.out.println(d);
	}
}
public class ConstructCalling 
{
	public static void main(String[] args) 
	{
		Test2 t = new Test2('c');
	}

}
