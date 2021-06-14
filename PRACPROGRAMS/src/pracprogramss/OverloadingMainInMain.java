package pracprogramss;

public class OverloadingMainInMain
{

	public static void main(String[] args)
	{
		System.out.println("hi");	
		main();
	}
	
	public static void main()
	{
		System.out.println("hiii");
	}

}
