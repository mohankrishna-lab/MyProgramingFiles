class A 
{
	static int x=30;
	public static void m1() 
	{
		System.out.println("Hello");
	}
}
class B
{
	static int y=90;
	public static void m2() 
	{
		System.out.println(" World!");
	}
}
class C 
{
	
	public static void main(String[] args) 
	{
		System.out.println(A.x+B.y);
		A.m1();
		System.out.println(A.x-B.y);
		B.m2();

	}
}
