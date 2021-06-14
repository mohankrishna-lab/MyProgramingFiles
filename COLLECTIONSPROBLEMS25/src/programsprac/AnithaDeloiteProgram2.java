package programsprac;

public class AnithaDeloiteProgram2 {

	public static void main(String[] args) 
	{
		System.out.println(printMemory(7));
	}
	
	public static int printMemory(int num)
	{
		int reqSize = 0;
		if (num % 2 == 0)
		{
			reqSize = num / 2;
		}
		else
		{
			num = num + 1;
			reqSize = num /2;
		}
		return reqSize;
	}

}
