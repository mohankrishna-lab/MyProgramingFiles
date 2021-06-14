class MainPhone 
{
	public static void main(String[] args) 
	{
		Phone p1 = new Phone("redmi",999.99 , "blue" , "42mp");
		Phone p2 = new Phone("oneplus",978.98 , "black" , "48");
		Phone p3 = new Phone("samsung",9899.99 , "yellow" , "52mp");
		Phone p4 = new Phone("nokia",6666.66 , "green" , "66mp");

		System.out.println(p1.name);
		System.out.println(p1.price);
		System.out.println(p1.color);
		System.out.println(p1.megaPixel);

		System.out.println(p2.name);
		System.out.println(p2.price);
		System.out.println(p2.color);
		System.out.println(p2.megaPixel);

		System.out.println(p3.name);
		System.out.println(p3.price);
		System.out.println(p3.color);
		System.out.println(p3.megaPixel);

		System.out.println(p4.name);
		System.out.println(p4.price);
		System.out.println(p4.color);
		System.out.println(p4.megaPixel);
	}
}

class Phone
{
	String name;
	double price;
	String color;
	String megaPixel;

	public Phone(String name, double price , String color , String megaPixel)
	{
		this.name = name;
		this.price = price;
		this.color = color;
		this.megaPixel = megaPixel;
	}
}
