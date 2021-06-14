package programsprac;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.*;

public class LambdaExpressionsUsingArrayList {

	public static void main(String[] args)
	{
		ArrayList<String> a = new ArrayList<String>();
		
		a.add("hi");
		a.add("hello");
		a.add("bye");
		a.add("maybe");
		a.add("see me");
		
		/*a.forEach((n) -> {System.out.println(n);
							String b = n+1;
							System.out.println(b);
							if (true)
							{
								System.out.println("bye");
							}
							});*/
		
		
		/*Consumer<String> l = (n) -> {System.out.println(n);};
		a.forEach(l);*/
		System.out.println(a);
	}

}
