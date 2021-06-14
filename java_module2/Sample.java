class Demo1 
{
	static int x=10;
	public static void m1() 
	{
		System.out.println("Hello");
	}
}


class Demo2 
{
	static int y=20;
	public static void m2() 
	{
		System.out.println(" World");
	}
}
class Demo3 
{
	
	public static void main(String[] args) 
	{
		System.out.println(Demo1.x);
		Demo1.m1();
		System.out.println(Demo2.y);
		Demo2.m2();
	}
}
