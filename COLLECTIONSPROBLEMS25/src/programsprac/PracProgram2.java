package programsprac;

public class PracProgram2 {

	public static void main(String[] args) 
	{
		String s = "llllltmmammmj";
		
		String str = "";
		char ch[] = s.toCharArray();
		
		for (int i = 0; i < ch.length - 1; i++)
		{
			boolean flag = true;
			int count = 1;
			if (ch[i] != '0')
			{
				
				for (int j = i + 1; j < ch.length; j++)
				{
					if (ch[i] == ch[j])
					{
						flag = false;
						count++;
						ch[j] = '0';
					}
				}
				str = str + ch[i];
				str += count;
			}
			
		}
		
		int count = 1;
		for (int i = 0; i < ch.length-1; i++)
		{
			
			if (ch[ch.length-1] == ch[i])
			{
				count++;
			}
		}
		if (ch[ch.length-1] != '0')
		{
			str = str + ch[ch.length-1];
			str += count;
		}
		
		System.out.println(str);
	}

}
