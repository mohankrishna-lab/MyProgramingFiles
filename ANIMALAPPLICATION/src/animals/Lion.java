package animals;

public class Lion extends Animals
{
	@Override
	public void animalName()
	{
		System.out.print("i am Lion ");
	}
	
	@Override
	public void animalFood()
	{
		System.out.print("i eat flesh ");
	}
	
	public void animalSound()
	{
		System.out.println("i make roar");
	}
}
