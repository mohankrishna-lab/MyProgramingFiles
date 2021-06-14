package car.pac;

import java.util.Scanner;

public class GetCarObject
{
	public Car[] getObjects()
	{
		Car[] c = new Car[1];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < c.length; i++)
		{
			System.out.println("enter price");
			Double price = sc.nextDouble();
			
			System.out.println("enter color");
			String color = sc.next();
			
			System.out.println("enter manfucture year");
			int mfy = sc.nextInt();
			
			c[i] = new Car(price,color,mfy);
		}
		
		return c;
	}
	
	public void displayC(Car[] c)
	{
		double priceRed = 0.0;
		System.out.println("price\t\t\tcolor\t\t\tmanfacture date");
		System.out.println("---------------------------------------------------------------");
		
		for (int i = 0; i < c.length; i++) 
		{
			if (c[i].getPrice() >= 1500000)
			{
				System.out.println(c[i]);
			}
		}
		
		for (Car cr : c) 
		{
			if (cr.getColor().equals("red"))
			{
				System.out.println(cr);
			}
		}
		
		double highest = 0.0;
		for (Car cr : c)
		{
			if (highest == 0.0)
			{
				highest = cr.getPrice();
			}
			else if (highest < cr.getPrice())
			{
				highest = cr.getPrice();
			}
		}
		
		/*for (Car cr : c) 
		{
			if (cr.getPrice() == highest)
			{
				System.out.println(cr);
			}
		}*/
		
		
		for (Car cr : c) 
		{
			if (cr.getColor().equals("white") && cr.getMfd() == 2020 && cr.getPrice() < 1500000)
			{
				System.out.println(cr);
			}
		}
		
		for (Car cr : c)
		{
			if (priceRed == 0.0 && cr.getColor().equals("red"))
			{
				priceRed = cr.getPrice();
			}
			else if (priceRed < cr.getPrice()  && cr.getColor().equals("red"))
			{
				priceRed = cr.getPrice();
			}
		}
		
		System.out.println("highest red color car price = " + priceRed);
		System.out.println("highest price = "+highest);
	}
}
