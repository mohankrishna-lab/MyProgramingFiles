class Practise 
{
	public static void main(String[] args) 
	{
		A s1,s2,s3;
		s1=new A();
		s2=s1;
		s3=s1;
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s3.a);
		System.out.println(s3.b);
		s3.a=100;
		s3.b=2000;
		System.out.println("--------------------------------");
		System.out.println(s1.a);
		System.out.println(s1.b);
		System.out.println(s2.a);
		System.out.println(s2.b);
		System.out.println(s3.a);
		System.out.println(s3.b);
		
	}
}

class A
{
	int a=10;
	int b=20;
}