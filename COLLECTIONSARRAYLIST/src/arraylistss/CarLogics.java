package arraylistss;

import java.util.*;
public class CarLogics
{
	List<Car> l = new ArrayList<Car>();
	Scanner sc = new Scanner(System.in);
	
	public void add()
	{
		l.add(addCar());
	}
	
	public Car addCar()
	{
		System.out.println("enter the name");
		String name = sc.next();
		
		System.out.println("enter price of car");
		double price = sc.nextDouble();
		
		System.out.println("enter the color");
		String color = sc.next();
		
		System.out.println("enter the year of manufacture");
		int yOM = sc.nextInt();
		
		System.out.println("enter the car model");
		String model = sc.next();
		
		return new Car(name,price,color,yOM,model);
	}
	
	public void display()
	{
		System.out.println("name\t\tprice\t\tcolor\t\tyOM\t\tmodel");
		if (!l.isEmpty())
		{
			for (Car c : l)
			{
				System.out.println(c);
			}
		}
	}
}
