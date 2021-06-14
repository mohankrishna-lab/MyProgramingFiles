class MethodExample1 
{
	public static void main(String[] args) 
	{
		int num1=20;
		int num2=30;
		int num3=method1(num1,num2);

		System.out.println("num3="+num3);
	}
	public static int method1(int a,int b)
	{
		System.out.println("num1="+a);
		System.out.println("num2="+b);
		return 100;
	}
}
