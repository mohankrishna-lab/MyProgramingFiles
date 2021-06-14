class StaticMembers 
{
	public static void main(String[] args) 
	{
		System.out.println(StaticAccessor.x + StaticAccessor.y);
		StaticAccessor.print();
	}
}


class StaticAccessor
{
	static int x = 10;
	static int y = 10;

	public static void print()
	{
		System.out.println("hello world");
	}
}