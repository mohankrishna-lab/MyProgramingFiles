class PerfectNumber 
{
	public static boolean check(int num) 
	{
		int sum=0;
		for (int i=1;i<num ;i++ )
		{
			if (num%i==0)
		{
             sum=sum+i;
		}
		}
		if(num==sum)
		{
			return true;
		}
			else
		{
				return false;
		}
		
	}
}


class CheckPerfectNumber
{
	public static void main(String[] args)
	{
		int num=28;
		boolean b=PerfectNumber.check(num);
			if(b)
		{
			System.out.println(num + " is a perfect number");
		}
		else
		{
			System.out.println(num+ " is not a perfect number");
		}
	}
}
