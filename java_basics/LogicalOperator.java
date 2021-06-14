class LogicalOperator 
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		int c=30;
		int d=10;
		System.out.println(a>b && b>c);
		System.out.println(a==d && d==a);
		System.out.println(a<b || b>c);
		System.out.println(b>a || b<c);
		System.out.println(a==b && b!=c);
		System.out.println(a>b || b>c);
	}
}
