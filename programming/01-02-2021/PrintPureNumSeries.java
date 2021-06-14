//Program to read series of numbers & print only pure numbers

import java.util.Scanner;
class PrintPureNumSeries
{
	public static void main(String[] args) 
	{
		String s = readSeries();

		printPureNum(s);
	}

	public static String readSeries()
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("enter series of alphanumerics in string");

		String s = sc.nextLine();

		return s;
	}

	public static void printPureNum(String s)
	{
		String[] ss = s.split(" ");

		

		for (int i = 0;i < ss.length ;i++ )
		{
			int count = 0;
			char[] ch = ss[i].toCharArray();
			for (int j = 0;j < ch.length;j++)
			{
				if (ch[j] >= 'a' && ch[j] <= 'z' || ch[j] >= 'A' && ch[j] <= 'Z')
				{
					count++;
				}
			}
			if (count == 0)
			{
				System.out.println(ss[i]);
			}
		}
	}
}
