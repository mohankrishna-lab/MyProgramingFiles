class AtmMachine 
{
	public static void main(String[] args) 
	{
		int dbpin=1436;
		int dbamt=4000;
		int pin=1436;
		  

		  if(dbpin==pin)
		{
			  int amt=2000;
			  

			  if(amt<=dbamt)
			{
				  System.out.println("take your money");
				  System.out.println("thank you");
			}
			else{
				System.out.println("insuficient amount");
			}
		}
		else{
			System.out.println("invalid pin");
		}




	}
}
