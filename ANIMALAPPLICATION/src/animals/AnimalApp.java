package animals;

public class AnimalApp
{
	public static void main(String[] args)
	{
		Zoo z = new Zoo();
		z.animals(new Dog());
		z.animals(new Lion());
		z.animals(new Monkey());
	}

}
