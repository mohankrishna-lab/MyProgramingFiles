import java.util.Scanner;

class Flames 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		char[] sarr = {'F','L','A','M','E','S'};

		System.out.println("enter lover boy name first");

		String s1 = sc.nextLine();

		System.out.println("enter lover girl name now");

		String s2 = sc.nextLine();

		System.out.println("====== here are your results fellows ======");

		flames(sarr,s1,s2);
	}

	public static void flames(char[] sarr,String str1,String str2)
	{
		int count1 = count(str1);
		int count2 = count(str2);

		char[] ch1 = removeSpaces(str1,count1);
		char[] ch2 = removeSpaces(str2,count2);

		int i = 0;
		int k = 0;
		
		for (;i < ch1.length;i++ )
		{
			if (ch1[i] != '0')
			{
				for (int j = 0;j < ch2.length ;j++ )
				{
					if (ch1[i] == ch2[j] && ch1[i] != '0' && ch2[j] != '0')
					{
						ch1[i] = '0';
						ch2[j] = '0';
					}
				}
			}
		}
		
		int sum1 = sumCount(ch1);
		int sum2 = sumCount(ch2);

		int sum = sum1 + sum2;

		isFlames(sum);
	}

	public static char[] removeSpaces(String s , int count)
	{
		char[] ch = new char[count];
		int j = 0;

		for (int i = 0;i < ch.length ;i++ )
		{
			if (s.charAt(i) != ' ')
			{
				ch[j++] = s.charAt(i);
			}
		}

		return ch;
	}

	public static int count(String s)
	{
		int count = 0;

		for (int i = 0;i < s.length() ;i++ )
		{
			if (s.charAt(i) != ' ')
			{
				count++;
			}
		}

		return count;
	}

	public static int sumCount(char[] ch)
	{
		int count = 0;
		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != '0')
			{
				count++;
			}
		}

		return count;
	}

	public static void isFlames(int sum)
	{
		char[] ch = {'f','l','a','m','e','s'};
		int count = 1;
		char c;
		for (; ; )
		{
			int end = 0;
			int k = 0;
			for (int j = 0;j < ch.length ;j++ )
			{
				if (count == sum && ch[j] != '0')
				{
					ch[j] = '0';
					count = 1;
				}
				if (ch[j] != '0')
				{
					count++;
				}
			}
			while(k<ch.length)
			{
				if (ch[k] != '0')
				{
					end++;
				}
				k++;
			}
			if (end == 1)
			{
				break;
			}
		}

		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != '0')
			{
				c = ch[i];
				switch (c)
				{
				case 'f':System.out.println("you guys are friends forever !! can't believe it right");
				         break;
				case 'l':System.out.println("congrats!! you are guys are lovers");
				         break;
				case 'a':System.out.println("dont worry its just an affection");
				         break;
				case 'm':System.out.println("call me to your reception when you marry");
				         break;
				case 'e':System.out.println("you guys are enemys? common dont be like that");
				         break;
				case 's':System.out.println("haaaaaa here we go again !! bad luck bro-sis relation in flames hahhahahaa LOL !!");
				         break;
				
				}
			}
		}
	}

	/*int count3 = countZeros(ch1);
		int count4 = countZeros(ch2);

		char[] ch = new char[count3+count4];

		for (int j = 0;j < ch1.length ;j++ )
		{
			if (ch1[j] != '0')
			{
				ch[k++] = ch1[j];
			}	
		}

		for (int j = 0;j < ch2.length ;j++ )
		{
			if (ch2[j] != '0')
			{
				ch[k++] = ch2[j];
			}	
		}

		for (int j = 0;j < ch.length ;j++ )
		{
			System.out.println(ch[j]);
		}


		public static int countZeros(char[] ch)
	{
		int count = 0;
		for (int i = 0;i < ch.length ;i++ )
		{
			if (ch[i] != '0')
			{
				count++;
			}
		}
		return count;
	}
*/

}
