package programsprac;

import java.util.Scanner;

public class Prac4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your size of an array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("enter numbers");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println(print(a));
		//30 20 30 50 80
	}
	
	public static int print(int[] a)
	{
		int j = a.length - 1;
		int i = 0;
		int count = 1;
		int first = 0;
		int last = 0;
		for (;i < a.length;) {
			if (i == a.length - 1 || j == 0)
			{
				count = 0;
				break;
			}
			if (i == 0 && j == a.length - 1) {
				first = a[i];
				last = a[j];
				if (a[i] > a[j]) {
					j--;
				}
				else {
					i++;
				}
			}
			else if (first < last) {
				first = first + a[i++];
				count++;
			}
			else if (first > last) {
				last = last + a[j--];
			}
			else if (first == last) {
				break;
			}
			
			
		}
		return count;
	}
}
		



























