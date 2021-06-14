// Print Sum Of Each Digit Of Given Number

import java.util.Scanner;

class  PrintingSumOfDigits
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("enter any number");
		int num = sc.nextInt();
		int a = printSumOfDigits(num);
		System.out.println("sum of digits of " + num + " is:" + a);
	}
	public static int printSumOfDigits(int num)
	{
		int sum = 0;
		while (num > 0)
		{
			rem = num % 10;
			sum += rem;
		}
		return sum;
	}
}
