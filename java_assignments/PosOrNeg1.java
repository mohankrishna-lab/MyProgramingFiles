class PosOrNeg1 
{
	public static void main(String[] args) 
	{
		int a=50;
		if (a>=0)
		{
			if (a%2==0 && a%5!=0)
			{
				System.out.println("The Answer is:  "+(a+10));
			}
			else if (a%5==0)
			{
                System.out.println("The Answer is:  "+(a-10));  
			}
			else if (a%2!=0 && a%5!=0)
			{
				System.out.println( "the answer is: "+a );
			}
		}
		else
		{
			System.out.println(a+ " is a Negative Number");
		}
	}
}