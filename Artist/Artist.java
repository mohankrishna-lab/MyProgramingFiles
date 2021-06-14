package reguralgeoshapes;

import java.util.Scanner;

public class Artist 
{

	public static void main(String[] args) 
	{
		FactoryProducer.getFactory("Shape").getShape("circle").drawn();
		FactoryProducer.getFactory("color").getColor("Green").fill();
		/*Scanner sc = new Scanner(System.in);
		ShapeFactory sf = new ShapeFactory();
		
		while (true)
		{
			System.out.println("1.circle\n2.square\n3.rectangle\n4.exit");
			System.out.println("choose your option");
			
			int option = sc.nextInt();
			
			switch (option)
			{
			case 1:sf.getShape("circle").drawn();;
				break;
				
			case 2:sf.getShape("Square").drawn();
			break;
			
			case 3:sf.getShape("rectangle").drawn();
			break;
			
			case 4: System.exit(0);

			default:System.out.println("check your option");
				break;
			}
		}*/
	}

}
