package programsprac;

import java.util.Scanner;

public class Prac1 {

	public static void main(String[] args)
	{
		 Scanner in = new Scanner(System.in);
		   int n = in .nextInt();
		   in.close();
		  
		   String s = "";
		   String str = "";
		   int temp = 0;
		   if (n < 0)
		   {
			   temp = -(n);
		   }
		   else
		   {
			  temp = n;
		   }
		   	System.out.println("temp"+temp);
		   	if (temp == 0)
		   	{
		   		str = "0";
		   	}
		   	else
		   	{
			    while (temp > 0)
			    {
			        int rem = temp % 10;
			        str += rem;
			       temp = temp/10;
			    }
		   	}
		    System.out.println(str);
		    if (n < 0)
		    {
		    	s = s + "-";
		    }
		    for (int i = str.length()-1; i>=0; i--)
		    {
		        s += str.charAt(i);
		    }
		    System.out.println(s);
		    if (n == Integer.parseInt(s))
		    {
		    	System.out.println("yes");
		    }
		    else
		    {
		    	System.out.println("no");
		    }
	}

}
