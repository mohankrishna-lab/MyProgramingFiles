class MainOfActress 
{
	public static void main(String[] args) 
	{
		Actress a1 = new Actress("Adams" , 35 , 45);
		Actress a2 = new Actress("meryl" , 66 , 56);
		Actress a3 = new Actress("Alexandra" , 30 , 26);
		
		System.out.println(a1.name);
		System.out.println(a1.age);
		System.out.println(a1.nOM);

		System.out.println(a2.name);
		System.out.println(a2.age);
		System.out.println(a2.nOM);

		System.out.println(a3.name);
		System.out.println(a3.age);
		System.out.println(a3.nOM);
	}
}

class Actress
{
	String name;
	int age;
	int nOM;

	public Actress(String name , int age , int nOM)
	{
		this.name = name;
		this.age = age;
		this.nOM = nOM;
	}
}
