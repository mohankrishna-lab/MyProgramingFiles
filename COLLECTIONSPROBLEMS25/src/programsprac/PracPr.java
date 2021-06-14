package programsprac;

public class PracPr {

	public static void main(String[] args) 
	{
		String smallest = "";
		String largest = "";
		String s = "welcometojava";
		   for (int i  = 0; i < s.length() - 2; i++)
	        {
	            if (smallest.equals(""))
	            {
	                smallest = s.substring(0, 3);
	            }
	            else if (smallest.compareTo(s.substring(i, i + 3)) > 0)
	            {
	                smallest = s.substring(i, i + 3);
	            }
	        }
	        
	         for (int i  = 0; i < s.length() - 2; i++)
	        {
	            if (largest.equals(""))
	            {
	                largest = s.substring(0, 3);
	            }
	            else if (largest.compareTo(s.substring(i, i + 3)) < 0)
	            {
	                largest = s.substring(i, i + 3);
	            }
	        }
	         
	         System.out.println(smallest);
	         System.out.println(largest);

	}

}
