class A
{
	int a = 10;
	int b = 20;

	public void m1()
	{
		System.out.println("hi A");
	}
}

class B extends A
{
	int c = 20;
	int d = 40;

	public void m2()
	{
		System.out.println("hello B");
	}
}


class SimpleInheritance 
{
	public static void main(String[] args) 
	{
		A a1 = new A();
		B b1 = new B();
		a1.m1();
		System.out.println(a1.a);
		System.out.println(a1.b);
		b1.m1();
		b1.m2();
		System.out.println(b1.a);
		System.out.println(b1.b);
		System.out.println(b1.c);
		System.out.println(b1.d);
		
	}

}
