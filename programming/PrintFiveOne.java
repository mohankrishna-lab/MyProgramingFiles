class PrintFiveOne 
{
	public static void main(String[] args) 
	{
		print(5);
	}

	public static void print(int num)
	{
		if (num < 1)
		{
			return;
		}
		else
		{
			System.out.println(num);
			System.out.println("bye");
			print(num-1);
			System.out.println("hi");
		}
	}
}
