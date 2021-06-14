package arraylistss;

import java.util.*;
public class Fruits {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		List<String> l = FruitsListService.addFruitsToList();
		
		System.out.println(l);
		
		System.out.println("for case-sensitive search enter a fruit name to search");
		
		String s = sc.next();
		System.out.println(FruitsListService.searchFruitInList(l, s));
		
		System.out.println("for case-insensitive search enter a fruit name to search");
		
		String ss = sc.next();
		System.out.println(FruitsListService.searchFruitInListIgnoreCase(l, ss));	
	}

}
