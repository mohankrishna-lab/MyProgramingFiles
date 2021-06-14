package programsofjava;

public class MainCustomImmutableClass
{
	public static void main(String[] args) 
	{
		CustomImmutableClass c = new CustomImmutableClass(10);
		System.out.println(c.modify(100).x);
		CustomImmutableClass c1 = c.modify(100);
		System.out.println(c1 == c);
	}
	
	
}
