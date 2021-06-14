class PrintStringCharactersOnce
{
	public static void main(String[] args) 
	{
		String s ="aasdvasvavda";

		toPrintOnce(s);
	}
	public static void toPrintOnce(String s)
	{
		char[] ch = s.toCharArray();

		String str = "";
		

		for (int i = 0;i < ch.length ;i++ )
		{
			int k;
			if (ch[i] != '0')
			{
					for (int j = i + 1;j < ch.length ;j++ )
					{
					
							if (ch[i] == ch [j] && ch[i] != '0')
							{
								str = str+ch[i];
								ch[i] = '0';
								k = j;
								while (k < ch.length)
								{
									if (ch[k] == ch[j])
									{
										ch[k] = '0';
									}
									k++;
								}
							  }
					 }
			}
		}
		System.out.println(str);
	}
}
