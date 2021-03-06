class ToPrintHelloWorld 
{
	public static void main(String[] args) 
	{
		System.out.println("one way");

		Demo d = new Demo();

		d.print();

		System.out.println("another way");

		Test t = new Test();

		Demo d1 = t.getObject();
		d1.print();

		System.out.println("whole new way");

		new Test().getObject().print();
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
