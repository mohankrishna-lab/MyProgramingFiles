package orderingmeals;

import java.util.Scanner;

public class CashCounter
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		MealBuilder m = new MealBuilder();
		
		while (true)
		{
			System.out.println("your order menu are:");
			System.out.println("1.Veg Burger\n2.Chicken Burger\n3.cost\n4.order list\n5.exit");
			
			int choice = sc.nextInt();
			
			switch (choice)
			{
			case 1:m.prepareVegMeal().addItem(new VegBurger());
				break;
				
			case 2:m.prepareNonVegMeal().addItem(new ChickenBurger());
				break;
				
			case 3:System.out.println(m.prepareNonVegMeal().getCost());
				break;
				
			case 4:m.prepareNonVegMeal().showItems();
				break;
				
			case 5:System.exit(0);
				break;
			}
		}
	}

}
