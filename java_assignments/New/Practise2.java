class Practise2
{
	public static void main(String[] args) 
	{
		int a[];
		a=new int[6];
		a[0]=32;
		a[1]=54;
		a[2]=67;
		a[3]=89;
		a[4]=78;
		a[5]=89;
		
		for (int i=0;i<a.length ;i++ )
		{
			System.out.println(a[i]);
		}
		for (int i=0;i<a.length ;i++ )
		{
			m1(a[i]);
		}
		

		
	}
	public static void m1(int a)
	{
		
		if(a%2==0)
		{
			System.out.println(a+ " are even");
		}
		
		
		
	}
}
