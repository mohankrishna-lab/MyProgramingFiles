class  GreatestOfThreeNum
{
	public static void main(String[] args) 
	{
		int num1=40;
		int num2=125;
		int num3=-10;
		if (num1>num2 && num1>num3)
		{
			System.out.println(num1+ " is greatest number");

		}

		else if (num2>num3 && num2>num1)
		{
			System.out.println(num2+ " is greatest number");
		}
		else
		{
		     System.out.println(num3+ " is greatest number");
		}
		 		
	}
}
