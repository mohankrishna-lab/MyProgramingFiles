package animals;

public class Dog extends Animals
{

	@Override
	public void animalName()
	{
		System.out.print("i am dog ");
	}
	
	@Override
	public void animalFood()
	{
		System.out.print("i eat pedigree ");
	}
	
	public void animalSound()
	{
		System.out.println("i make bow bow sound");
	}
}
