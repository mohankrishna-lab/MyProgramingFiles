class MethodExample2 
{
	public static void main(String[] args) 
	{
		char ch1='m';
		char ch2='M';
		float f=332.232F;
		boolean b=method1(ch1,ch2,f);
		System.out.println("b is "+b);
	}
	public static boolean method1(char ch1,char ch2,float f)
	{
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("f="+f);
		return true;
	}
}
