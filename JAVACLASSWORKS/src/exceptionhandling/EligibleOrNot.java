package exceptionhandling;

public class EligibleOrNot 
{
	public void validateAge(int age,char ch) throws NotEligibleForMarriageException
	{
		if (ch == 'm' && age > 21 || ch == 'f' && age > 18) 
		{
			System.out.println("congractulations you are eligible for marriage");
		}
		else
		{
			throw new NotEligibleForMarriageException("sorry you had to wait for your turn");
		}
	}
}
