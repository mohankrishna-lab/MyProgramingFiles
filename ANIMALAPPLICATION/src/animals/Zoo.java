package animals;

public class Zoo
{
	public void animals(Animals a)
	{
		a.animalName();
		a.animalFood();
		a.animalType();
		
		if (a instanceof Dog)
		{
			((Dog)a).animalSound();
		}
		
		else if (a instanceof Lion)
		{
			((Lion)a).animalSound();
		}
		
		else if (a instanceof Monkey)
		{
			((Monkey)a).animalSound();
		}
	}
}
