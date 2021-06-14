package pracprogramss;

public class SirProgram 
{

	public static void main(String[] args)
	{
		String s = "aabbcdd";
		
		print(s);
	}
	
	public static void print(String s)
	{
		char[] ch = s.toCharArray();
		
		for (int i = 0; i < ch.length; i++) 
		{

			
			if (ch[i] != '1') 
			{
				if (ch[i] != 'a' )
				{
					System.out.print(ch[i]);
				}
					for (int j = i + 1; j < ch.length; j++)
					{
							if (ch[i] == ch[j]) 
							{
								ch[i] = '1';
								int k = j;
								
								while(k < ch.length)
								{
									if (ch[k] == ch[j])
									{
										ch[k] = '1';
									}
									k++;
								}
							}
						}
				}
			}
		}
	}


