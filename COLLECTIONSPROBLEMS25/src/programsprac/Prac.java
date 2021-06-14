package programsprac;

public class Prac 
{

	public static void main(String[] args) 
	{
		int n = 1;
		String[] pass = {"abcd", "bdac"};
		String str = "";
		String s = "";
		String ss = "";
		
		for (int i = 0; i < pass[0].length()/2;i++)
		{
			
			str += pass[0].charAt(i);
			
		}
		
		
		for (int i = pass[0].length()/2; i < pass[0].length(); i++)
		{
			s += pass[0].charAt(i);
		}
		
		ss = s + str;
		System.out.println(ss);
		int count = 2;
		
		for (int j = 1; j <= n ; j++)
		{
			if (ss.equals(pass[1]))
			{
				count  = 1;
			}
		}
		System.out.println(count);
	}

}
