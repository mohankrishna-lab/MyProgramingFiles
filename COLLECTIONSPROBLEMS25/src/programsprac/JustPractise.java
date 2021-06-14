package programsprac;

import java.util.Scanner;
public class JustPractise
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter any number");
		int num = sc.nextInt();
		
		System.out.println("enter any text");
		
		String s = sc.next();
		
		if (s.contains("@gmail.com"))
		{
			System.out.println("success");
		}
		else
		{
			System.out.println("fail");
		}
		
		if (num >= 100 && num <= 199)
		{
			System.out.println("number is valid");
		}
		else 
		{
			System.out.println("number is invalid");
		}
	}

}
