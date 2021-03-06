//Program to print all the amrstrong numbers of an array

class PrintingArmStrongNum
{
	public static void main(String[] args) 
	{
		int[] num = {0 , 1 , 10 , 98 , 130 , 145 , 153 , 300 , 350 , 370 , 371 , 407};

		printArmStrongNum(num);
	}
		
	public static void printArmStrongNum(int[] num)
	{
		for (int i : num )
		{
			int count = getCount(i);

			if (isArmStrong(i , count))
			{
				System.out.println(i);
			}
		}
		
	}
	
	public static int getCount(int num)
	{
		int count = 0;
			while (num > 0)
			{
				count++;
				num /= 10;
			}
			return count;
			
	}

	public static boolean isArmStrong(int num , int count)
	{
		int sum = 0;
		int temp = num;
		while (num > 0)
		{
			int rem = num % 10;
			sum += (int)Math.pow(rem , count);
			num /= 10;
		}
		return sum == temp ? true : false;
	}
}
