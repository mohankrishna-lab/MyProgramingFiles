//Program to read series of sorted numbers & print difference between the two

class PrintDifferenceBtwTwoNum
{
	public static void main(String[] args) 
	{
		String s = "34 56 67 76 87 97";

		printDiffTwoNum(s);
	}

	public static void printDiffTwoNum(String s)
	{
		String[] str = s.split(" ");

		int first;
		int sec;
		int diff;

		for (int i = 0;i < str.length - 1; i++)
		{
			first = Integer.parseInt(str[i]);
			sec = Integer.parseInt(str[i + 1]);

			System.out.println((sec - first));
		}
	}
}
