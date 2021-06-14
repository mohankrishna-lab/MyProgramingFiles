

import java.util.Scanner;

class ArmStrong 
{
	public static void main(String[] args) 
	{
		int num = readNum();
		int count = getCount(num);
		if (isArmStrong(num , count))
		{
			System.out.println(num + " is armstrong number");
		}
		else
		{
			System.out.println(num + " is not a armstrong number" );
		}
	}

	public static int readNum()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		return sc.nextInt();

	}


	public static int getCount(int num)
	{
		int count = 0;
		if (num > 9)
		{
			while (num > 0)
			{
				count++;
				num /= 10;
			}
			return count;
			
		}
		else
		{
			return 1;
		}
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
