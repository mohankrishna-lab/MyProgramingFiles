class Demo1 
{
	public static void main(String[] args) 
	{
		A a1=new A(1,2,3);
		System.out.println(a1.x);
		System.out.println(a1.y);
		System.out.println(a1.z);

		A a2=new A(10,20,m1());
		System.out.println(a2.x);
		System.out.println(a2.y);
		System.out.println(a2.z);
	}
	public static int m1()
	{
		int a=10;
		int b=40;
		System.out.println("hi");

		return a+b;
	}
}
class A
{
	int x;
	int y;
	int z;
	public A(int a,int b,int c)
	{
		x=a;
		y=b;
		z=c;
	}
	
}
