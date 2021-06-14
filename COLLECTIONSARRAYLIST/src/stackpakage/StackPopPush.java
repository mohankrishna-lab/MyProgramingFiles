package stackpakage;

import java.util.*;

public class StackPopPush
{

	public static void main(String[] args) 
	{
		//char ch[] = {'[',']'};
		
		Stack<Character> s = new Stack<Character>();
		
	
		String input="[]";
   
        for (int i = 0 ; i < input.length();i++)
        {
            if (input.charAt(i) == '(' || input.charAt(i) == '[' || input.charAt(i) == '{')
            {
                s.push(input.charAt(i));
            }
            else if (!s.isEmpty())
            {      
                     s.pop();      
            }
        }
        
        if (s.isEmpty())
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
	}

}
