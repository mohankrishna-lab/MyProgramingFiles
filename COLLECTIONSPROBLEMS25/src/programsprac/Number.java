package programsprac;

public class Number {

	public static void main(String[] args) {
		System.out.println(more20(41));
	}
	public static boolean more20(int num)
	{
		if (0 == (num-1) % 20 || 0 == (num-2) % 20)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
