package programsprac;

public class StringReverse {

	public static void main(String[] args)
	{
		String s = "hello world";
		
		String str = "";
		int j = 0;
		for(;j < s.length(); j++)
		{
			if (s.charAt(j) != ' ')
			{
				str = str + s.charAt(j);
			}
			else
			{
				print(str);
				str = "";
			}
		}
		print(str);
		
		
	}
	
	public static void print(String s)
	{
		String ss = "";
		for (int i = s.length()-1;i >=0 ;i--)
		{
			ss = ss + s.charAt(i);
		}
		System.out.print(ss + " ");
	}

}
