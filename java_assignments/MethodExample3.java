class MethodExample3 
{
	public static void main(String[] args) 
	{
		String s1="method practise";
		String s2="method execute";
		double d1=432.76;
		double d2=533.98;
		float f=method1(s1,s2,d1,d2);
		System.out.println("f="+f);
	}
	public static float method1(String s1,String s2,double d1,double d2)
	{
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);

		return 323.45f;
	}
}
