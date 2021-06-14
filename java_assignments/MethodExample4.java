class MethodExample4 
{
	public static void main(String[] args) 
	{
		char ch1='k';
		char ch2='u';
		String s1="maximum";
		String s2="effort";
		double d1=343.79;
		double d2=7343.98;
		boolean b=method1(ch1,ch2,s1,s2,d1,d2);
		System.out.println("b="+b);
	}
	public static boolean method1(char ch1,char ch2,String s1,String s2,double d1,double d2)
	{
		System.out.println("ch1="+ch1);
		System.out.println("ch2="+ch2);
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);
		System.out.println("d1="+d1);
		System.out.println("d2="+d2);
		return true;
	}
}
