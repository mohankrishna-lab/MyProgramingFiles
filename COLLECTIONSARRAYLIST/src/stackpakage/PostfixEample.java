package stackpakage;

import java.util.Stack;

public class PostfixEample 
{

	public static void main(String[] args) 
	{
		Stack<Integer> s = new Stack<Integer>();
		
		String ss = "362/3*+";
		
		postfix(s,ss);
	}
	
	public static void postfix(Stack<Integer> s,String ss)
	{
		char[] ch = ss.toCharArray();
		for (int i = 0 ; i < ch.length;i++)
		{
			if (ch[i] == '/' || ch[i] == '*' || ch[i] == '+' || ch[i] == '-' )
			{
				
			}
		}
	}

}
