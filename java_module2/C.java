class A 
{
	int x=30;
	public  void m1() 
	{
		System.out.println("Hello");
	}
}
class B
{
	int y=70;
	public void m2()
	{
		System.out.println("world");
	}
}
class C
{
	public static void main(String[] args)
	{
		A a1=new A();
		B b1=new B();
		System.out.println(a1.x);
		a1.m1();
		System.out.println(b1.y);
		b1.m2();
						

	}
}
