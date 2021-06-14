package arraylistss;

import java.util.*;

import java.util.Scanner;

public class IsPrimeArrayList {

	public static void main(String[] args)
	{
		List<Integer> l = addObjectOfList();
		
		countPrimeNumbers(l);
	}
	
	public static List<Integer> addObjectOfList()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> l = new ArrayList<Integer>();
		
		System.out.println("enter how many numbers to add to list");
		int size = sc.nextInt();
		
		System.out.println("enter " + size + " numbers into list");
		for (int i = 1 ; i <= size ; i++)
		{
			int num = sc.nextInt();
			l.add(num);
			
		}
		return l;
	}
	
	public static void countPrimeNumbers(List<Integer> l)
	{
		int count = 0;
		for (int i = 0;i < l.size();i++)
		{
			if (isPrime(l.get(i)))
			{
				count++;
			}
		}
		
		System.out.println("prime numbers count=" + count);
	}
	
	public static boolean isPrime(int num)
	{
		if (num == 0 || num == 1)
		{
			return false;
		}
		else
		{
			for (int i = 2;i < num ; i++)
			{
				
				if (num % i == 0)
				{
					return false;
				}
			}
		}
		
		return true;
	}
}
