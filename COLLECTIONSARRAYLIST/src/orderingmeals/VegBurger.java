package orderingmeals;

public class VegBurger extends Burger
{
	private static  String vegBurger = "vegBurger";
	
	private static float price = 129.99F;
	
	public VegBurger()
	{
		super(vegBurger,price,new Wrapping());
	}
}
