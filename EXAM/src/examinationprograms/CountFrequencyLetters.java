package examinationprograms;

import java.util.*;

public class CountFrequencyLetters 
{

	public static void main(String[] args) 
	{
		String s = "hello";
		
		Map<Character, Integer> m = new LinkedHashMap<Character, Integer>();
		
		for (int i = 0;i < s.length(); i++)
		{
			if (m.isEmpty())
			{
				m.put(s.charAt(0), 0);
			}
			else if(m.containsKey("h"))
			{
				
			}
		}
	}

}
