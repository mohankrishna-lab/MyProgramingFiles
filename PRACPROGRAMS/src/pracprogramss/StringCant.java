package pracprogramss;

public class StringCant 
{
	public static void main(String[] args)
	{
		String s = "helloworld";
		
		int x = 20;
		
		cantChangeString(s);  
		
		intCanChange(x);
		
	}
	
	public static void cantChangeString(String s)
	{
		System.out.println(s.charAt(0));
		
		//s.charAt(0) = '1';
		
		System.out.println(s);
		
		s = s + "maybe";
		
		System.out.println(s);
		
		s = "world";
		
		System.out.println(s);
		
		s = "can re-initialize";
		
		System.out.println(s);
	}
	
	public static void intCanChange(int x)
	{
		System.out.println(x);
		
		x = 30;
		
		System.out.println(x);
	}
}
