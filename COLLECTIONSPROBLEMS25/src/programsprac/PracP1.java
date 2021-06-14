package programsprac;

import java.util.Arrays;

public class PracP1 {

	public static void main(String[] args)
	{
		String a = "anagram";
		String b = "margana";
		
		 String s1 = a.toLowerCase();
	        String s2 = b.toLowerCase();
	        
	        String str1 = "";
	        String str2 = ""; 
	        
	        char ch1[] = s1.toCharArray();
	        char ch2[] = s2.toCharArray();
	        
	        Arrays.sort(ch1);
	        Arrays.sort(ch2);
	        for (int i = 0; i < ch1.length; i++)
	        {
	            str1 += ch1[i];
	        }
	        
	        for (int i = 0; i < ch2.length; i++)
	        {
	            str2 += ch2[i];
	        }
	        
	        if (str1.equals(str2))
	        {
	        	System.out.println("yes");
	        }
	        else
	        {
	        	System.out.println("no");
	        }
	        
	        char ch[] = {'a','n','g','r','a','m'};
	        
	        for (int i = 0; i < ch.length - 1; i++)
	        {
	             for (int j = i; j < ch.length; j++)
	            {
	                if (ch[i] > ch[j])
	                {
	                    char temp = ch[i];
	                    ch[i] = ch[j];
	                    ch[j] = temp;
	                }
	            }
	        }
	        for(int i = 0; i < ch.length;i++)
	        System.out.print(ch[i]);
	}

}
