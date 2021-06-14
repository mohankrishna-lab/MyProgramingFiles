class Looping3 
{
	public static void main(String[] args) 
	{
		int i=1;
		
		for (  i=1;i<=5 ;i++ )
		{
			System.out.println(i);
		}
		System.out.println("---------------------------");
		
         
			 while(i<=10)
		{
			 System.out.println(i);
			 i++;
			
		}
		System.out.println("----------------------------");
		
		while(i<=15)
			System.out.println(i++);


		 System.out.println("--------------------------------");


		i=1;
		while(i<=5)
			 System.out.println(++i);


		 System.out.println("------------------------------------");


		 i=1;
		 while(i++<=5)
			  System.out.println(i);


		  System.out.println("-----------------------------------");
		  i=1;
		  while(i++<=5);
		   System.out.println(i);



		    System.out.println("----------------------------------");
			

			i=1;
			while(++i<=5);
			 System.out.println(i);



			  System.out.println("--------------------------------");
			  i=1;
			  while(i++<=5)
				  break;

			   System.out.println(i);

	}
}
