package orderingmeals;

import java.util.ArrayList;
public class MealBuilder 
{
	public Meal prepareVegMeal()
	{
		//Meal m = new Meal();
		//m.print();
		
		return new Meal(new ArrayList());
	}
	
	public Meal prepareNonVegMeal()
	{
		//Meal m = new Meal();
		
		//Burger b = new ChickenBurger();
		//m.addItem(b);
		
		return new Meal(new ArrayList());
	}
}
