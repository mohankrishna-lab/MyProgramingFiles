package doublelinkedlist;

import java.util.Scanner;
public class MainDouble 
{
	public static void main(String[] args) 
	{
		DoubleMethods d = new DoubleMethods();
	
		Scanner sc = new Scanner(System.in);
		
		
		while (true)
		{

			System.out.println("1.insertFront\n2.insertRear\n3.deleteFront\n4.deleteRear\n5.display\n6.exit");
			System.out.println("enter your option");
			int option = sc.nextInt();
			
				switch (option)
				{
				case 1: d.insertFront();
						break;
				case 2: d.insertRear();
						break;
				case 3: d.deleteFront();;
						break;
				case 4: d.deleteRear();
						break;
				case 5: System.out.println(d);
						break;
				case 6: System.exit(0);
				}
		}
	}
}
