class ToPrintHelloWorld2 
{
	public static void main(String[] args) 
	{
		Sample.getInstance().getObject().print();
	}
}

class Demo
{
	public void print()
	{
		System.out.println("Hello World");
	}
}

class Test
{
	public Demo getObject()
	{
		return new Demo();
	}
}

class Sample
{
	public static Test getInstance()
	{
		Test t = new Test();

		return t;
	}
}
