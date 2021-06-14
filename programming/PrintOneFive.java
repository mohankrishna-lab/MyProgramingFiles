class PrintOneFive 
{
	public static void main(String[] args) 
	{
		print(1);
	}

	public static void print(int num)
	{
		if (num > 5)
		{
			return;
		}
		else
		{
			System.out.println(num);
			System.out.println("bye");
			print(num+1);
			System.out.println("hi");
		}
	}
}
