package reguralgeoshapes;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Artist 
{

	public static void main(String[] args) 
	{
		
		
		Scanner sc = new Scanner(System.in);
		ShapeFactory sf = new ShapeFactory();
		
		while (true)
		{
			System.out.println("1.circle\n2.square\n3.rectangle\n4.exit");
			System.out.println("choose your option");
			
			int option = sc.nextInt();
			
			switch (option)
			{
			case 1:
				System.out.println("1.red\n2.green\n3.blue");
				System.out.println("choose color option to drawn circle");
				int colorOption = sc.nextInt();
				FactoryProducer.getFactory("Shape").getShape("circle").drawn();
				switch (colorOption)
				{
					case 1 : FactoryProducer.getFactory("Color").getColor("Red").fill();
					break;
					
					case 2: FactoryProducer.getFactory("Color").getColor("Green").fill();
					break;
					
					case 3: FactoryProducer.getFactory("Color").getColor("Blue").fill();
					break;
				}
				break;
				
			case 2:
					System.out.println("1.red\n2.green\n3.blue");
					System.out.println("choose color option to drawn circle");
					int colorOption1 = sc.nextInt();
					FactoryProducer.getFactory("Shape").getShape("Square").drawn();
					switch (colorOption1)
					{
						case 1 : FactoryProducer.getFactory("Color").getColor("Red").fill();
						break;
						
						case 2: FactoryProducer.getFactory("Color").getColor("Green").fill();
						break;
						
						case 3: FactoryProducer.getFactory("Color").getColor("Blue").fill();
						break;
					}
				
				
			break;
			
			case 3:
				
				System.out.println("1.red\n2.green\n3.blue");
				System.out.println("choose color option to drawn circle");
				int colorOption2 = sc.nextInt();
				FactoryProducer.getFactory("Shape").getShape("Rectangle").drawn();
				switch (colorOption2)
				{
					case 1 : FactoryProducer.getFactory("Color").getColor("Red").fill();
					break;
					
					case 2: FactoryProducer.getFactory("Color").getColor("Green").fill();
					break;
					
					case 3: FactoryProducer.getFactory("Color").getColor("Blue").fill();
					break;
				}
	
			break;
			
			case 4: System.exit(0);

			default:System.out.println("check your option");
				break;
			}
		}
	}	
}


