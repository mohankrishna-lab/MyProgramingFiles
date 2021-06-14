package programsprac;

public class PracP2 {

	public static void main(String[] args)
	{
		String s = "He is a very very good boy, isn't he?";
		
		
		String ss[] = s.split("[, ?@'?]+");
		
		for (int i = 0; i < ss.length; i++)
		{
			System.out.println(ss.length);
		}
	}

}
