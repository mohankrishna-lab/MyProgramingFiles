class MainOfPen 
{
	public static void main(String[] args) 
	{
		Pen p1 = new Pen("cello" , 10.0 , "red" , 6.0);
		Pen p2 = new Pen("bitco" , 3.0 , "white-blue" , 5.5);
		Pen p3 = new Pen("max" , 15.0 , "blue" , 6.6);
		Pen p4 = new Pen("paper soft" , 20.0 , "green" , 7.7);
		Pen p5 = new Pen("rorito" , 50.0 , "blue-green" ,7.6 );

		System.out.println("name\t\tprice\t\tcolor\t\tlength");
		System.out.print(p1.name);
		System.out.print("\t\t" + p1.price);
		System.out.print("\t\t" + p1.color);
		System.out.println("\t\t" + p1.length);
		System.out.println(" ");

		System.out.print(p2.name);
		System.out.print("\t\t" + p2.price);
		System.out.print("\t\t" + p2.color);
		System.out.println("\t" + p2.length);
		System.out.println(" ");

		System.out.print(p3.name);
		System.out.print("\t\t" + p3.price);
		System.out.print("\t\t" + p3.color);
		System.out.println("\t\t" + p3.length);
		System.out.println(" ");

		System.out.print(p4.name);
		System.out.print("\t" + p4.price);
		System.out.print("\t\t" + p4.color);
		System.out.println("\t\t" + p4.length);
		System.out.println(" ");

		System.out.print(p5.name);
		System.out.print("\t\t" + p5.price);
		System.out.print("\t\t" + p5.color);
		System.out.println("\t" + p5.length);

	}
}

class Pen
{
	String name;
	double price;
	String color;
	double length;

	public Pen(String a , double b , String c , double d)
	{
		name = a;
		price = b;
		color = c;
		length = d;
	}
}