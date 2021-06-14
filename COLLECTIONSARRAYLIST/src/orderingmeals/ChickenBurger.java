package orderingmeals;

public class ChickenBurger extends Burger
{
	private static String chickenBurger = "chickenBurger";
	
	private static float price = 199.99F;	

	public ChickenBurger()
	{
		super(chickenBurger,price,new Wrapping());
	}
}
