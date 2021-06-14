//Program to read series of numbers & print the biggest of them

class PrintBiggestNumSeriesString
{
	public static void main(String[] args) 
	{
		String s = "4 65 34 213 76 78";

		printBiggestNum(s);
	}

	public static void printBiggestNum(String s)
	{
		String[] ss = s.split(" ");

		int biggest = 0;

		for (String str : ss)
		{
			int num = Integer.parseInt(str);
			if (biggest == 0)
			{
				biggest = num;
			}
			else if (biggest < num)
			{
				biggest = num;
			}
		}

		System.out.println(biggest);
	}
}
