class Practise1 
{
	public static void main(String[] args) 
	{
       int a=34;
	   int b=780;
	  boolean d= addition(a,b);
	  int e=sub(a,b);
	  System.out.println(d);
	  System.out.println(e);
	}
	public static boolean addition(int a,int b)
	{
		int c=a+b;
		System.out.println("addition is="+c);
		return c==10?true:false;

	}
	public static int  sub(int a,int b)
	{
		if(a==b)
			return a-b;
		else
			return a*b;

	}

}
