class MainLaptop 
{
	public static void main(String[] args) 
	{
		Laptop l1 = new Laptop("dell" , 77777.99, "2 gb" , "i7");
		Laptop l2 = new Laptop("acer" , 45665.9, "4 gb" , "i5");
		Laptop l3 = new Laptop("hp" , 54333.99, "8 gb" , "i7");
		Laptop l4 = new Laptop("asus" , 66666.66, "16 gb" , "i9");

		System.out.println(l1.name);
		System.out.println(l1.price);
		System.out.println(l1.ram);
		System.out.println(l1.processor);

		System.out.println(l2.name);
		System.out.println(l2.price);
		System.out.println(l2.ram);
		System.out.println(l2.processor);

		System.out.println(l3.name);
		System.out.println(l3.price);
		System.out.println(l3.ram);
		System.out.println(l3.processor);

		System.out.println(l4.name);
		System.out.println(l4.price);
		System.out.println(l4.ram);
		System.out.println(l4.processor);
	}
}

class Laptop
{
	String name;
	double price;
	String ram;
	String processor;

	public Laptop(String name , double price , String ram , String processor)
	{
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.processor = processor;
	}

}
