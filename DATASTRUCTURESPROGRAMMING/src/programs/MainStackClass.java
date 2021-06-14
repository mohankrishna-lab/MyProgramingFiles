package programs;

import java.util.Scanner;

public class MainStackClass 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the stack size");
		
		int size = sc.nextInt();
		
		StackClass s1 = new StackClass(size);
		
		s1.push(10);
		s1.push(20);
		s1.push(30);
		s1.push(40);
		s1.push(50);
		
		s1.display();
		
		System.out.println("pop " + s1.pop());
		System.out.println("=========");
		
		s1.display();
	}
}
