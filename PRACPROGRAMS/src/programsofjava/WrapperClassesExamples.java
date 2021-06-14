package programsofjava;

public class WrapperClassesExamples
{
	public static void main(String[] args)
	{
		Integer i1 = 10;
		System.out.println(i1);
		Integer i2 = 10;
		System.out.println(i2);
		System.out.println(i1 == i2);
		System.out.println(i1.equals(i2));
		int x = i1;
		System.out.println(x);
	}
}
