package orderingmeals;

import java.util.*;

public class Meal
{
	private List<Item> l;
	
	public Meal(ArrayList<Item> l)
	{
		this.l = l;
	}
	
	
	
	public List<Item> getL() 
	{
		return l;
	}



	public void setL(List<Item> l) {
		this.l = l;
	}
	
	public void addItem(Item item)
	{
		l.add(item);
	}
	
	public float getCost()
	{
		float cost = 0.0F;
		
		if (!l.isEmpty())
		{
			for (int i = 0 ; i < l.size() ; i++)
			{
				cost = cost + l.get(i).price();
			}
		}
		else
		{
			System.out.println("please order");
		}
		return cost;
	}
	
	public void showItems()
	{
		System.out.println("items are:");
		System.out.println("_____________________");
		
		if (!l.isEmpty())
		{
			for (Item i : l)
			{
				System.out.println(i.name());
			}
		}
		else
		{
			System.out.println("you didn't order anything");
		}
	}	
}
